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
import model.Funcionario;
import model.dao.IGenericDAO;

/**
 *
 * @author pc
 */
public class FuncionarioDAO implements IGenericDAO <Funcionario, Integer>{

    @Override
    public void inserir(Funcionario obj) throws ClassNotFoundException, SQLException {
        Connection c = ConnectionFactory.getConnection();

        String sql = "INSERT INTO "
                + "empregado (nome,endereco,telefone) "
                + "VALUES (?,?,?);";

        PreparedStatement pst = c.prepareStatement(sql); 
        //pst.setString(1, Funcionario.getNome());
        //pst.setString(2, Funcionario.getEndereco());
        //pst.setString(3, Funcionario.getTelefone());

        pst.executeUpdate();
    }

    @Override
    public void apagar(Funcionario obj) throws ClassNotFoundException, SQLException {
        Connection c = ConnectionFactory.getConnection();
        
        String sql = "DELETE FROM empregado WHERE idempregado = ?;";
        
        PreparedStatement pst = c.prepareStatement(sql);
        pst.setInt(1,obj.getId());
        
        pst.executeUpdate();}

    @Override
    public void alterar(Funcionario obj) throws ClassNotFoundException, SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Funcionario buscarUm(Integer id) throws ClassNotFoundException, SQLException {
        Connection c = ConnectionFactory.getConnection();
        
        String sql = "SELECT * FROM empregado WHERE idempregado = ?;";
        
        PreparedStatement pst = c.prepareStatement(sql);
        pst.setInt(1, id);
        
        ResultSet rs = pst.executeQuery();  
        Funcionario e = null;
        if(rs.next()){
            e = new Funcionario(rs.getInt("idempregado"), 
                    rs.getString("nome"),
                    rs.getString("endereco"),
                    rs.getString("telefone"));
        }   
        
        return e;}

    @Override
    public List<Funcionario> buscarTodos() throws ClassNotFoundException, SQLException {
        Connection c = ConnectionFactory.getConnection();
        
        String sql = "SELECT * FROM empregado;";
        
        PreparedStatement pst = c.prepareStatement(sql);
        
        ResultSet rs = pst.executeQuery(); 
        
        List<Funcionario> empregados = new ArrayList<>();
        
        while(rs.next()){
            Funcionario  e;
            
            e = new Funcionario(rs.getInt("idempregado"), 
            rs.getString("nome"),
            rs.getString("endereco"),
            rs.getString("telefone"));
            
            empregados.add(e);
        } 
        
        return empregados;
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
    
    public List<Funcionario> buscarPeloNome(String nome) throws ClassNotFoundException, SQLException {
        Connection c = ConnectionFactory.getConnection();
        
        String sql = "SELECT * FROM empregado WHERE nome LIKE ?;";
        
        PreparedStatement pst = c.prepareStatement(sql);
        pst.setString(1, "%"+nome+"%");
        ResultSet rs = pst.executeQuery(); 
        
        
        List<Funcionario> empregado = new ArrayList<>();
        
        while(rs.next()){
            Funcionario  e;
            
            e = new Funcionario(rs.getInt("idempregado"), 
            rs.getString("nome"),
            rs.getString("endereco"),
            rs.getString("telefone"));
            
            empregado.add(e);
        }  
        
        return empregado;
    }
    
}
