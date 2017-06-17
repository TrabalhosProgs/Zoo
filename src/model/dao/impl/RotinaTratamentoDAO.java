/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao.impl;

import connection.ConnectionFactory;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.Frequencia;
import model.Receita;
import model.RotinaTratamento;
import model.dao.IGenericDAO;

/**
 *
 * @author william
 */
public class RotinaTratamentoDAO implements IGenericDAO<RotinaTratamento, Integer>{

    @Override
    public void inserir(RotinaTratamento obj) throws ClassNotFoundException, SQLException {
        Connection c = ConnectionFactory.getConnection();
        
        String sql = "INSERT INTO rotinatratamento (dataValidade) VALUES (?);";
        
        PreparedStatement pst = c.prepareStatement(sql);
        pst.setDate(1, (java.sql.Date) obj.getDataValidade());
        pst.executeUpdate();
    }

    @Override
    public void apagar(RotinaTratamento obj) throws ClassNotFoundException, SQLException {
        Connection c = ConnectionFactory.getConnection();
        
        String sql = "DELETE FROM rotinatratamento WHERE idrotinatratamento = ?;";
        
        PreparedStatement pst = c.prepareStatement(sql);
        pst.setInt(1,obj.getId());
        
        pst.executeUpdate();
    }

    @Override
    public void alterar(RotinaTratamento obj) throws ClassNotFoundException, SQLException {
         Connection c = ConnectionFactory.getConnection();
        
        String sql = "UPDATE rotinatratamento SET dataValidade = ? , idreceita = ? WHERE idrotinatratamento = ?;";
        
        PreparedStatement pst = c.prepareStatement(sql);
        pst.setDate(1, (Date) obj.getDataValidade());
        pst.setInt(2, obj.getReceita().getId());
        pst.setInt(3, obj.getId());
        
        pst.executeUpdate();
    }

    @Override
    public RotinaTratamento buscarUm(Integer id) throws ClassNotFoundException, SQLException {
         Connection c = ConnectionFactory.getConnection();
        
        String sql = "SELECT * FROM rotinatratamento WHERE idrotinatratamento = ?;";
        
        PreparedStatement pst = c.prepareStatement(sql);
        pst.setInt(1, id);
        
        ResultSet rs = pst.executeQuery();  
        RotinaTratamento rt = null;
        if(rs.next()){
            rt = new RotinaTratamento(rs.getInt("idrotinatratamento"), 
                    (Date)rs.getDate("dataValidade"),
                    new  Receita(rs.getInt("idreceita"),null, "", null, null, null),
                    null);
        }   
        
        return rt;
    }

    @Override
    public List<RotinaTratamento> buscarTodos() throws ClassNotFoundException, SQLException {
        Connection c = ConnectionFactory.getConnection();
        
        String sql = "SELECT * FROM rotinatratamento;";
        
        PreparedStatement pst = c.prepareStatement(sql);
        
        ResultSet rs = pst.executeQuery(); 
        
        List<RotinaTratamento> rotinasTratamento = new ArrayList<>();
        
        while(rs.next()){
            RotinaTratamento  rt = new RotinaTratamento(rs.getInt("idrotinatratamento"), 
                    (Date)rs.getDate("dataValidade"),
                    new  Receita(rs.getInt("idreceita"),null, "", null, null, null),
                    null);
            rotinasTratamento.add(rt);
        }   
        
        return rotinasTratamento;
    }

    @Override
    public long quantidade() throws ClassNotFoundException, SQLException {
        Connection c = ConnectionFactory.getConnection();
        
        String sql = "SELECT count(*) FROM rotinatratamento;";
        
        PreparedStatement pst = c.prepareStatement(sql);
        
        ResultSet rs = pst.executeQuery(); 
        
        rs.next();
        
        return rs.getLong(1);
    }

     public List<RotinaTratamento> buscarPelaData(Date data) throws ClassNotFoundException, SQLException {
        Connection c = ConnectionFactory.getConnection();
        
        String sql = "SELECT * FROM rotinatratamento WHERE dataValidade = ?;";
        
        PreparedStatement pst = c.prepareStatement(sql);
        pst.setDate(1, data);
        
        ResultSet rs = pst.executeQuery(); 
        
        List<RotinaTratamento> rotinasTratamento = new ArrayList<>();
        
        while(rs.next()){
            RotinaTratamento  rt = new RotinaTratamento(rs.getInt("idrotinatratamento"), 
                    (Date)rs.getDate("dataValidade"),
                    new  Receita(rs.getInt("idreceita"),null, "", null, null, null),
                    null);
            rotinasTratamento.add(rt);
        }   
        
        return rotinasTratamento;
    }
     
    public int buscarMaiorID() throws ClassNotFoundException, SQLException {
        Connection c = ConnectionFactory.getConnection();
        
        String sql = "SELECT max(idrotinatratamento) FROM rotinatratamento;";
        
        PreparedStatement pst = c.prepareStatement(sql);
        
        ResultSet rs = pst.executeQuery(); 
        
        if(rs.next()){
            return rs.getInt(1);
        }else{
            return 0;
        }  
    }

    public void inserirTarefa(Integer idrotina, Integer idtarefa) throws ClassNotFoundException, SQLException {
        Connection c = ConnectionFactory.getConnection();
        
        String sql = "INSERT INTO tarefa_rotina (idtarefa, idrotinatratamento) VALUES (?, ?);";
        
        PreparedStatement pst = c.prepareStatement(sql);
        pst.setInt(1, idtarefa);
        pst.setInt(2, idrotina);
        
        pst.executeUpdate();
    }
    public void excluirTarefa(Integer idrotina, Integer idtarefa) throws ClassNotFoundException, SQLException {
        Connection c = ConnectionFactory.getConnection();
        
        String sql = "DELETE FROM tarefa_rotina WHERE idtarefa = ? AND idrotinatratamento = ?;";
        
        PreparedStatement pst = c.prepareStatement(sql);
        pst.setInt(1, idtarefa);
        pst.setInt(2, idrotina);
        
        pst.executeUpdate();
    }
}
