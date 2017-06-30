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
import model.Empregado;
import model.Tratador;
import model.Veterinario;
import model.enu.EnumFuncao;

/**
 *
 * @author william
 */
public class VeterinarioDAO extends EmpregadoDAO{
    @Override
    public Veterinario buscarUm(Integer id) throws ClassNotFoundException, SQLException {
        Connection c = ConnectionFactory.getConnection();
        
        String sql = "SELECT * FROM empregado WHERE idempregado = ? AND funcao = ?";
        
        PreparedStatement pst = c.prepareStatement(sql);
        pst.setInt(1, id);
        pst.setString(2, "VETERINARIO");
        
        ResultSet rs = pst.executeQuery();  
        Veterinario v = null;
        if(rs.next()){
            v = new Veterinario(rs.getString("numeroCRMV"),
                    (Date)rs.getDate("dataCRMV"), 
                    rs.getInt("idempregado"), 
                    rs.getString("nome"), 
                    rs.getString("endereco"), 
                    rs.getString("telefone"));
        }
        return v;
    }
    
    /**
     *
     * @return
     * @throws ClassNotFoundException
     * @throws SQLException
     */
    
    public List<Veterinario> buscarTodosVet() throws ClassNotFoundException, SQLException {
        Connection c = ConnectionFactory.getConnection();
        
        String sql = "SELECT * FROM empregado where funcao = 'VETERINARIO';";
        
        PreparedStatement pst = c.prepareStatement(sql);
        
        ResultSet rs = pst.executeQuery(); 
        
        List<Veterinario> empregados = new ArrayList<>();
        
        
            while(rs.next()){
            Veterinario  e;
            e = new Veterinario(rs.getString("numeroCRMV"),
                    rs.getDate("dataCRMV"),
                    rs.getInt("idempregado"), 
                    rs.getString("nome"),
                    rs.getString("endereco"), 
                    rs.getString("telefone"));
                    
            empregados.add(e);
        } 
         
        
        return empregados;
    }
    
    public List<Veterinario> buscarVetPeloNome(String nome) throws ClassNotFoundException, SQLException {
        Connection c = ConnectionFactory.getConnection();
        
        String sql = "SELECT * FROM empregado WHERE funcao = 'VETERINARIO' and nome LIKE ?;";
        
        PreparedStatement pst = c.prepareStatement(sql);
        pst.setString(1, "%"+nome+"%");
        ResultSet rs = pst.executeQuery(); 
        
        
        List<Veterinario> empregados = new ArrayList<>();
        
        
            while(rs.next()){
            Veterinario  e;
            e = new Veterinario(rs.getString("numeroCRMV"),
                    rs.getDate("dataCRMV"),
                    rs.getInt("idempregado"), 
                    rs.getString("nome"),
                    rs.getString("endereco"), 
                    rs.getString("telefone"));
                    
            empregados.add(e);
        } 
         
        
        return empregados;
    }
    
}
