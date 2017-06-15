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
import model.Vacina;
import model.dao.IGenericDAO;

/**
 *
 * @author william
 */
public class VacinaDAO implements IGenericDAO<Vacina, Integer>{

    @Override
    public void inserir(Vacina obj) throws ClassNotFoundException, SQLException {
        Connection c = ConnectionFactory.getConnection();
        
        String sql = "INSERT INTO vacina (nomeVacina) VALUES (?);";
        
        PreparedStatement pst = c.prepareStatement(sql);
        pst.setString(1, obj.getNome());
        
        pst.executeUpdate();
    }

    @Override
    public void apagar(Vacina obj) throws ClassNotFoundException, SQLException {
        Connection c = ConnectionFactory.getConnection();
        
        String sql = "DELETE FROM vacina WHERE idvacina = ?;";
        
        PreparedStatement pst = c.prepareStatement(sql);
        pst.setInt(1,obj.getId());
        
        pst.executeUpdate();
    }

    @Override
    public void alterar(Vacina obj) throws ClassNotFoundException, SQLException {
        Connection c = ConnectionFactory.getConnection();
        
        String sql = "UPDATE vacina SET nomeVacina = ? WHERE idvacina = ?;";
        
        PreparedStatement pst = c.prepareStatement(sql);
        pst.setString(1,obj.getNome());
        pst.setInt(2,obj.getId());
        
        pst.executeUpdate();
    }

    @Override
    public Vacina buscarUm(Integer id) throws ClassNotFoundException, SQLException {
        Connection c = ConnectionFactory.getConnection();
        
        String sql = "SELECT * FROM vacina WHERE idvacina = ?;";
        
        PreparedStatement pst = c.prepareStatement(sql);
        pst.setInt(1, id);
        
        ResultSet rs = pst.executeQuery();  
        Vacina v = null;
        if(rs.next()){
            v = new Vacina(rs.getInt("idvacina"), rs.getString("nomeVacina"));
        }   
        
        return v;
    }

    @Override
    public List<Vacina> buscarTodos() throws ClassNotFoundException, SQLException {
        Connection c = ConnectionFactory.getConnection();
        
        String sql = "SELECT * FROM vacina;";
        
        PreparedStatement pst = c.prepareStatement(sql);
        
        ResultSet rs = pst.executeQuery(); 
        
        List<Vacina> vacinas = new ArrayList<>();
        
        while(rs.next()){
            Vacina v = new Vacina(rs.getInt("idvacina"), rs.getString("nomeVacina"));
            vacinas.add(v);
        }   
        
        return vacinas;
    }

    @Override
    public long quantidade() throws ClassNotFoundException, SQLException {
        Connection c = ConnectionFactory.getConnection();
        
        String sql = "SELECT count(*) FROM vacina;";
        
        PreparedStatement pst = c.prepareStatement(sql);
        
        ResultSet rs = pst.executeQuery(); 
        
        rs.next();
        
        return rs.getLong(1);
    }
    
    public List<Vacina> buscarPeloNome(String nome) throws ClassNotFoundException, SQLException {
        Connection c = ConnectionFactory.getConnection();
        
        String sql = "SELECT * FROM vacina WHERE nomeVacina LIKE ?;";
        
        PreparedStatement pst = c.prepareStatement(sql);
        pst.setString(1, "%"+nome+"%");
        ResultSet rs = pst.executeQuery(); 
        
        
        List<Vacina> vacinas = new ArrayList<>();
        
        while(rs.next()){
            Vacina v = new Vacina(rs.getInt("idvacina"), rs.getString("nomeVacina"));
            vacinas.add(v);
        }   
        
        return vacinas;
    }

    public int buscarMaiorID() throws ClassNotFoundException, SQLException {
        Connection c = ConnectionFactory.getConnection();
        
        String sql = "SELECT max(idvacina) FROM vacina;";
        
        PreparedStatement pst = c.prepareStatement(sql);
        
        ResultSet rs = pst.executeQuery(); 
        
        if(rs.next()){
            return rs.getInt(1);
        }else{
            return 0;
        }  
    }
}
