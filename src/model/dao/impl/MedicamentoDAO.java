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
import model.Medicamento;
import model.dao.IGenericDAO;

/**
 *
 * @author william
 */
public class MedicamentoDAO implements IGenericDAO<Medicamento, Integer>{

    @Override
    public void inserir(Medicamento obj) throws ClassNotFoundException, SQLException {
        Connection c = ConnectionFactory.getConnection();
        
        String sql = "INSERT INTO medicamento (nome) VALUES (?);";
        
        PreparedStatement pst = c.prepareStatement(sql);
        pst.setString(1, obj.getNome());
        
        pst.executeUpdate();
    }

    @Override
    public void apagar(Medicamento obj) throws ClassNotFoundException, SQLException {
        Connection c = ConnectionFactory.getConnection();
        
        String sql = "DELETE FROM medicamento WHERE idmedicamento = ?;";
        
        PreparedStatement pst = c.prepareStatement(sql);
        pst.setInt(1,obj.getId());
        
        pst.executeUpdate();
    }

    @Override
    public void alterar(Medicamento obj) throws ClassNotFoundException, SQLException {
        Connection c = ConnectionFactory.getConnection();
        
        String sql = "UPDATE medicamento SET nome = ? WHERE idmedicamento = ?;";
        
        PreparedStatement pst = c.prepareStatement(sql);
        pst.setString(1,obj.getNome());
        pst.setInt(2,obj.getId());
        
        pst.executeUpdate();
    }

    @Override
    public Medicamento buscarUm(Integer id) throws ClassNotFoundException, SQLException {
        Connection c = ConnectionFactory.getConnection();
        
        String sql = "SELECT * FROM medicamento WHERE idmedicamento = ?;";
        
        PreparedStatement pst = c.prepareStatement(sql);
        pst.setInt(1, id);
        
        ResultSet rs = pst.executeQuery();  
        Medicamento r = null;
        if(rs.next()){
            r = new Medicamento(rs.getInt("idmedicamento"), rs.getString("nome"));
        }   
        
        return r;
    }

    @Override
    public List<Medicamento> buscarTodos() throws ClassNotFoundException, SQLException {
        Connection c = ConnectionFactory.getConnection();
        
        String sql = "SELECT * FROM medicamento;";
        
        PreparedStatement pst = c.prepareStatement(sql);
        
        ResultSet rs = pst.executeQuery(); 
        
        List<Medicamento> medicamentos = new ArrayList<>();
        
        while(rs.next()){
            Medicamento m = new Medicamento(rs.getInt("idmedicamento"), rs.getString("nome"));
            medicamentos.add(m);
        }   
        
        return medicamentos;
    }

    @Override
    public long quantidade() throws ClassNotFoundException, SQLException {
        Connection c = ConnectionFactory.getConnection();
        
        String sql = "SELECT count(*) FROM medicamento;";
        
        PreparedStatement pst = c.prepareStatement(sql);
        
        ResultSet rs = pst.executeQuery(); 
        
        rs.next();
        
        return rs.getLong(1);
    }
    
    public List<Medicamento> buscarPeloNome(String nome) throws ClassNotFoundException, SQLException {
        Connection c = ConnectionFactory.getConnection();
        
        String sql = "SELECT * FROM medicamento WHERE nome LIKE ?;";
        
        PreparedStatement pst = c.prepareStatement(sql);
        pst.setString(1, "%"+nome+"%");
        ResultSet rs = pst.executeQuery(); 
        
        
        List<Medicamento> medicamentos = new ArrayList<>();
        
        while(rs.next()){
            Medicamento m = new Medicamento(rs.getInt("idmedicamento"), rs.getString("nome"));
            medicamentos.add(m);
        }   
        
        return medicamentos;
    }

    public int buscarMaiorID() throws ClassNotFoundException, SQLException {
        Connection c = ConnectionFactory.getConnection();
        
        String sql = "SELECT max(idmedicamento) FROM medicamento;";
        
        PreparedStatement pst = c.prepareStatement(sql);
        
        ResultSet rs = pst.executeQuery(); 
        
        if(rs.next()){
            return rs.getInt(1);
        }else{
            return 0;
        }  
    }
}
