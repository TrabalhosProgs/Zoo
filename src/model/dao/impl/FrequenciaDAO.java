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
import model.Frequencia;
import model.dao.IGenericDAO;

/**
 *
 * @author william
 */
public class FrequenciaDAO implements IGenericDAO<Frequencia, Integer>{

    @Override
    public void inserir(Frequencia obj) throws ClassNotFoundException, SQLException {
        Connection c = ConnectionFactory.getConnection();
        
        String sql = "INSERT INTO frequenciamedicacao (descricao) VALUES (?);";
        
        PreparedStatement pst = c.prepareStatement(sql);
        pst.setString(1, obj.getDescricao());
        
        pst.executeUpdate();
    }

    @Override
    public void apagar(Frequencia obj) throws ClassNotFoundException, SQLException {
        Connection c = ConnectionFactory.getConnection();
        
        String sql = "DELETE FROM frequenciamedicacao WHERE idfrequenciamedicacao = ?;";
        
        PreparedStatement pst = c.prepareStatement(sql);
        pst.setInt(1,obj.getId());
        
        pst.executeUpdate();
    }

    @Override
    public void alterar(Frequencia obj) throws ClassNotFoundException, SQLException {
         Connection c = ConnectionFactory.getConnection();
        
        String sql = "UPDATE frequenciamedicacao SET descricao = ? WHERE idfrequenciamedicacao = ?;";
        
        PreparedStatement pst = c.prepareStatement(sql);
        pst.setString(1,obj.getDescricao());
        pst.setInt(2,obj.getId());
        
        pst.executeUpdate();
    }

    @Override
    public Frequencia buscarUm(Integer id) throws ClassNotFoundException, SQLException {
         Connection c = ConnectionFactory.getConnection();
        
        String sql = "SELECT * FROM frequenciamedicacao WHERE idfrequenciamedicacao = ?;";
        
        PreparedStatement pst = c.prepareStatement(sql);
        pst.setInt(1, id);
        
        ResultSet rs = pst.executeQuery();  
        Frequencia f = null;
        if(rs.next()){
            f = new Frequencia(rs.getInt("idfrequenciamedicacao"), rs.getString("descricao"));
        }   
        
        return f;
    }

    @Override
    public List<Frequencia> buscarTodos() throws ClassNotFoundException, SQLException {
        Connection c = ConnectionFactory.getConnection();
        
        String sql = "SELECT * FROM frequenciamedicacao;";
        
        PreparedStatement pst = c.prepareStatement(sql);
        
        ResultSet rs = pst.executeQuery(); 
        
        List<Frequencia> frequenciasmedicacao = new ArrayList<>();
        
        while(rs.next()){
            Frequencia f = new Frequencia(rs.getInt("idfrequenciamedicacao"), rs.getString("descricao"));
            frequenciasmedicacao.add(f);
        }   
        
        return frequenciasmedicacao;
    }

    @Override
    public long quantidade() throws ClassNotFoundException, SQLException {
        Connection c = ConnectionFactory.getConnection();
        
        String sql = "SELECT count(*) FROM frequenciamedicacao;";
        
        PreparedStatement pst = c.prepareStatement(sql);
        
        ResultSet rs = pst.executeQuery(); 
        
        rs.next();
        
        return rs.getLong(1);
    }

    public List<Frequencia> buscarPeloNome(String nome) throws ClassNotFoundException, SQLException {
        Connection c = ConnectionFactory.getConnection();
        
        String sql = "SELECT * FROM frequenciamedicacao WHERE descricao LIKE ?;";
        
        PreparedStatement pst = c.prepareStatement(sql);
        pst.setString(1, "%"+nome+"%");
        ResultSet rs = pst.executeQuery(); 
        
        
        List<Frequencia> frequenciasmedicacao = new ArrayList<>();
        
        while(rs.next()){
            Frequencia f = new Frequencia(rs.getInt("idfrequenciamedicacao"), rs.getString("descricao"));
            frequenciasmedicacao.add(f);
        }   
        
        return frequenciasmedicacao;
    }
    
    public int buscarMaiorID() throws ClassNotFoundException, SQLException {
        Connection c = ConnectionFactory.getConnection();
        
        String sql = "SELECT max(idfrequenciamedicacao) FROM frequenciamedicacao;";
        
        PreparedStatement pst = c.prepareStatement(sql);
        
        ResultSet rs = pst.executeQuery(); 
        
        if(rs.next()){
            return rs.getInt(1);
        }else{
            return 0;
        }  
    }
}
