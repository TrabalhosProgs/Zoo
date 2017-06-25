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
import model.Tratador;
import model.dao.IGenericDAO;

/**
 *
 * @author pc
 */
public class TratadorDAO implements IGenericDAO <Tratador, Integer>{

    @Override
    public void inserir(Tratador obj) throws ClassNotFoundException, SQLException {
        Connection c = ConnectionFactory.getConnection();

        String sql = "INSERT INTO empregado (nome,endereco,telefone,funcao) VALUES (?,?,?,?);";

        PreparedStatement pst = c.prepareStatement(sql); 
        pst.setString(1, obj.getNome());
        pst.setString(2, obj.getEndereco());
        pst.setString(3, obj.getTelefone());
        pst.setString(4, "TRATADOR");

        pst.executeUpdate();
    }

    @Override
    public void apagar(Tratador obj) throws ClassNotFoundException, SQLException {
        Connection c = ConnectionFactory.getConnection();
        
        String sql = "DELETE FROM empregado WHERE idempregado = ?;";
        
        PreparedStatement pst = c.prepareStatement(sql);
        pst.setInt(1,obj.getId());
        
        pst.executeUpdate();}

    @Override
    public void alterar(Tratador obj) throws ClassNotFoundException, SQLException {
        Connection c = ConnectionFactory.getConnection();
        
        String sql = "UPDATE empregado SET "
                + " nome = ?,"
                + " endereco = ?,"
                + " telefone = ?,"
                + " funcao = ?,"
                + " WHERE idempregado = ?;";
        
        PreparedStatement pst = c.prepareStatement(sql);
        pst.setString(1,obj.getNome());
        pst.setString(2, obj.getEndereco());
        pst.setString(3, obj.getTelefone());
        pst.setString(4, "TRATADOR");
        pst.setInt(5,obj.getId());
        
        pst.executeUpdate();
    }

    @Override
    public Tratador buscarUm(Integer id) throws ClassNotFoundException, SQLException {
        Connection c = ConnectionFactory.getConnection();
        
        String sql = "SELECT * FROM empregado WHERE idempregado = ?;";
        
        PreparedStatement pst = c.prepareStatement(sql);
        pst.setInt(1, id);
        
        ResultSet rs = pst.executeQuery();  
        Tratador tratador = null;
        if(rs.next()){
            tratador = new Tratador(rs.getInt("idempregado"), 
                    rs.getString("nome"),
                    rs.getString("endereco"),
                    rs.getString("telefone"));
                    // implemenar lista de tarefas
        }   
        
        return tratador;}

    @Override
    public List<Tratador> buscarTodos() throws ClassNotFoundException, SQLException {
        Connection c = ConnectionFactory.getConnection();
        
        String sql = "SELECT * FROM empregado;";
        
        PreparedStatement pst = c.prepareStatement(sql);
        
        ResultSet rs = pst.executeQuery(); 
        
        List<Tratador> tratadores = new ArrayList<>();
        
        while(rs.next()){
            Tratador  e = new Tratador(rs.getInt("idempregado"), 
            rs.getString("nome"),
            rs.getString("endereco"),
            rs.getString("telefone"));
            
            tratadores.add(e);
        } 
        
        return tratadores;
    }

    @Override
    public long quantidade() throws ClassNotFoundException, SQLException {
        Connection c = ConnectionFactory.getConnection();
        
        String sql = "SELECT count(*) FROM empregado;";
        
        PreparedStatement pst = c.prepareStatement(sql);
        
        ResultSet rs = pst.executeQuery(); 
        
        rs.next();
        
        return rs.getLong(1);  
    }
    
    public List<Tratador> buscarPeloNome(String nome) throws ClassNotFoundException, SQLException {
        Connection c = ConnectionFactory.getConnection();
        
        String sql = "SELECT * FROM empregado WHERE nome LIKE ?;";
        
        PreparedStatement pst = c.prepareStatement(sql);
        pst.setString(1, "%"+nome+"%");
        ResultSet rs = pst.executeQuery(); 
        
        
        List<Tratador> tratadores = new ArrayList<>();
        
        while(rs.next()){
            Tratador t = new Tratador(rs.getInt("idempregado"), 
            rs.getString("nome"),
            rs.getString("endereco"),
            rs.getString("telefone"));
            
            tratadores.add(t);
        }  
        
        return tratadores;
    }
    
}
