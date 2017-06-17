/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao.impl;

import connection.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.Tarefa;
import model.dao.IGenericDAO;

/**
 *
 * @author william
 */
public class TarefaDAO implements IGenericDAO<Tarefa, Integer>{

    @Override
    public void inserir(Tarefa obj) throws ClassNotFoundException, SQLException {
        Connection c = ConnectionFactory.getConnection();
        
        String sql = "INSERT INTO tarefa (descricao) VALUES (?);";
        
        PreparedStatement pst = c.prepareStatement(sql);
        pst.setString(1, obj.getDescricao());
        
        pst.executeUpdate();
    }

    @Override
    public void apagar(Tarefa obj) throws ClassNotFoundException, SQLException {
        Connection c = ConnectionFactory.getConnection();
        
        String sql = "DELETE FROM tarefa WHERE idtarefa = ?;";
        
        PreparedStatement pst = c.prepareStatement(sql);
        pst.setInt(1,obj.getId());
        
        pst.executeUpdate();
    }

    @Override
    public void alterar(Tarefa obj) throws ClassNotFoundException, SQLException {
         Connection c = ConnectionFactory.getConnection();
        
        String sql = "UPDATE tarefa SET descricao = ? WHERE idtarefa = ?;";
        
        PreparedStatement pst = c.prepareStatement(sql);
        pst.setString(1,obj.getDescricao());
        pst.setInt(2,obj.getId());
        
        pst.executeUpdate();
    }

    @Override
    public Tarefa buscarUm(Integer id) throws ClassNotFoundException, SQLException {
         Connection c = ConnectionFactory.getConnection();
        
        String sql = "SELECT * FROM tarefa WHERE idtarefa = ?;";
        
        PreparedStatement pst = c.prepareStatement(sql);
        pst.setInt(1, id);
        
        ResultSet rs = pst.executeQuery();  
        Tarefa t = null;
        if(rs.next()){
            t = new Tarefa(rs.getInt("idtarefa"), rs.getString("descricao"));
        }   
        
        return t;
    }

    @Override
    public List<Tarefa> buscarTodos() throws ClassNotFoundException, SQLException {
        Connection c = ConnectionFactory.getConnection();
        
        String sql = "SELECT * FROM tarefa;";
        
        PreparedStatement pst = c.prepareStatement(sql);
        
        ResultSet rs = pst.executeQuery(); 
        
        List<Tarefa> tarefas = new ArrayList<>();
        
        while(rs.next()){
            Tarefa t = new Tarefa(rs.getInt("idtarefa"), rs.getString("descricao"));
            tarefas.add(t);
        }   
        
        return tarefas;
    }

    @Override
    public long quantidade() throws ClassNotFoundException, SQLException {
        Connection c = ConnectionFactory.getConnection();
        
        String sql = "SELECT count(*) FROM tarefa;";
        
        PreparedStatement pst = c.prepareStatement(sql);
        
        ResultSet rs = pst.executeQuery(); 
        
        rs.next();
        
        return rs.getLong(1);
    }

    public List<Tarefa> buscarPeloNome(String nome) throws ClassNotFoundException, SQLException {
        Connection c = ConnectionFactory.getConnection();
        
        String sql = "SELECT * FROM tarefa WHERE descricao LIKE ?;";
        
        PreparedStatement pst = c.prepareStatement(sql);
        pst.setString(1, "%"+nome+"%");
        ResultSet rs = pst.executeQuery(); 
        
        
        List<Tarefa> tarefas = new ArrayList<>();
        
        while(rs.next()){
            Tarefa t = new Tarefa(rs.getInt("idtarefa"), rs.getString("descricao"));
            tarefas.add(t);
        }   
        
        return tarefas;
    }
    
    public int buscarMaiorID() throws ClassNotFoundException, SQLException {
        Connection c = ConnectionFactory.getConnection();
        
        String sql = "SELECT max(idtarefa) FROM tarefa;";
        
        PreparedStatement pst = c.prepareStatement(sql);
        
        ResultSet rs = pst.executeQuery(); 
        
        if(rs.next()){
            return rs.getInt(1);
        }else{
            return 0;
        }  
    }
    
    public List<Tarefa> buscarPorRotina(Integer id) throws ClassNotFoundException, SQLException {
        Connection c = ConnectionFactory.getConnection();
        
        String sql = "SELECT * FROM tarefa t INNER JOIN tarefa_rotina tr "
                + " on t.idtarefa = tr.idtarefa WHERE tr.idrotinatratamento = ?;";
        
        PreparedStatement pst = c.prepareStatement(sql);
        pst.setInt(1, id);
        ResultSet rs = pst.executeQuery(); 
        
        
        List<Tarefa> tarefas = new ArrayList<>();
        
        while(rs.next()){
            Tarefa t = new Tarefa(rs.getInt("t.idtarefa"), rs.getString("t.descricao"));
            tarefas.add(t);
        }   
        
        return tarefas;
    }

}
