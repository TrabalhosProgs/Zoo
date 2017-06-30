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
import java.util.Date;
import java.util.List;
import model.Medicacao;
import model.Receita;
import model.dao.IGenericDAO;

/**
 *
 * @author william
 */
public class ReceitaDAO implements IGenericDAO<Receita, Integer>{

    @Override
    public void inserir(Receita obj) throws ClassNotFoundException, SQLException {
        Connection c = ConnectionFactory.getConnection();

        String sql = "INSERT INTO empregado (data,observacao,idveterinario) "
                + "VALUES (?,?,?);";
        
        PreparedStatement pst = c.prepareStatement(sql);
               
        pst.setDate(1,new java.sql.Date(obj.getData().getTime()));
        pst.setString(2, obj.getObservacao());
        pst.setInt(3, obj.getVeterinario().getId());
        
        pst.executeUpdate();
    }

    @Override
    public void apagar(Receita obj) throws ClassNotFoundException, SQLException {
    Connection c = ConnectionFactory.getConnection();
        
        String sql = "DELETE FROM receita WHERE idreceita = ?;";
        
        PreparedStatement pst = c.prepareStatement(sql);
        pst.setInt(1,obj.getId());
        
        pst.executeUpdate();
    }

    @Override
    public void alterar(Receita obj) throws ClassNotFoundException, SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Receita buscarUm(Integer id) throws ClassNotFoundException, SQLException {
         Connection c = ConnectionFactory.getConnection();
        
        String sql = "SELECT * FROM receita WHERE idreceita = ?;";
        
        PreparedStatement pst = c.prepareStatement(sql);
        pst.setInt(1, id);
        
        ResultSet rs = pst.executeQuery();  
        Receita r = null;
        if(rs.next()){
            r = new Receita(rs.getInt("idreceita"), 
                    (Date) rs.getDate("data"), 
                    rs.getString("observacao"), 
                    (ArrayList<Medicacao>) new MedicacaoDAO().buscarTudoPorReceita(rs.getInt("idreceita")), 
                    new VeterinarioDAO().buscarUm(rs.getInt("idveterinario")));
        }   
        
        return r;
    }

    @Override
    public List<Receita> buscarTodos() throws ClassNotFoundException, SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public long quantidade() throws ClassNotFoundException, SQLException {
        Connection c = ConnectionFactory.getConnection();
        
        String sql = "SELECT count(*) FROM receita;";
        
        PreparedStatement pst = c.prepareStatement(sql);
        
        ResultSet rs = pst.executeQuery(); 
        
        rs.next();
        
        return rs.getLong(1);
    }
    
        public int buscarMaiorID() throws ClassNotFoundException, SQLException {
        Connection c = ConnectionFactory.getConnection();
        
        String sql = "SELECT max(idreceita) FROM receita;";
        
        PreparedStatement pst = c.prepareStatement(sql);
        
        ResultSet rs = pst.executeQuery(); 
        
        if(rs.next()){
            return rs.getInt(1);
        }else{
            return 0;
        }  
    }
    
    
}
