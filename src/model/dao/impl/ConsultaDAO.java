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
import model.Consulta;
import model.Veterinario;
import model.dao.IGenericDAO;

/**
 *
 * @author pc
 */
public class ConsultaDAO implements IGenericDAO<Consulta, Integer>{

    @Override
    public void inserir(Consulta obj) throws ClassNotFoundException, SQLException {
        Connection c = ConnectionFactory.getConnection();

        String sql = "INSERT INTO consulta (dataHoraPrevista, dataHoraRealizacao, idanimal, idveterinario) "
                + "VALUES (?,?,?,?);";
        
        PreparedStatement pst = c.prepareStatement(sql);
               
        pst.setDate(1,new java.sql.Date(obj.getDataHoraPrevista().getTime()));
        pst.setDate(2,new java.sql.Date(obj.getDataHoraRealizacao().getTime()));
        pst.setInt(3, obj.getAnimal().getId());
        pst.setInt(4, obj.getVeterinario().getId());
        pst.executeUpdate();
    }

    @Override
    public void apagar(Consulta obj) throws ClassNotFoundException, SQLException {
        Connection c = ConnectionFactory.getConnection();
        
        String sql = "DELETE FROM consulta WHERE idconsulta = ?;";
        
        PreparedStatement pst = c.prepareStatement(sql);
        pst.setInt(1,obj.getId());
        
        pst.executeUpdate();
    }

    @Override
    public void alterar(Consulta obj) throws ClassNotFoundException, SQLException {
        Connection c = ConnectionFactory.getConnection();
        
        String sql = "UPDATE consulta SET dataHoraPrevista = ?, "
                + " dataHoraRealizacao = ?, "
                + " idanimal = ?, "
                + " idveterinario = ? "
                + " WHERE idconsulta = ?;";
        
        PreparedStatement pst = c.prepareStatement(sql);
        
        pst.setDate(1,new java.sql.Date(obj.getDataHoraPrevista().getTime()));
        pst.setDate(2,new java.sql.Date(obj.getDataHoraRealizacao().getTime()));
        pst.setInt(3, obj.getAnimal().getId());
        pst.setInt(4, obj.getVeterinario().getId());
        pst.setInt(5, obj.getId());
        
        pst.executeUpdate();
    }

    @Override
    public Consulta buscarUm(Integer id) throws ClassNotFoundException, SQLException {
        Connection c = ConnectionFactory.getConnection();
        
        String sql = "SELECT * FROM consulta WHERE idconsulta = ?;";
        
        PreparedStatement pst = c.prepareStatement(sql);
        pst.setInt(1, id);
        
        ResultSet rs = pst.executeQuery();  
        Consulta cs = null;
        if(rs.next()){
                cs = new Consulta(rs.getInt("idconsulta"), (Date)rs.getDate("dataHoraPrevista"),
                    (Date)rs.getDate("dataHoraRealizacao"),                    
                    new VeterinarioDAO().buscarUm(rs.getInt("idveterinario")),
                    new AnimalDAO().buscarUm(rs.getInt("idanimal")));    
        }   
        
        return cs;    
    }

    @Override
    public List<Consulta> buscarTodos() throws ClassNotFoundException, SQLException {
        Connection c = ConnectionFactory.getConnection();
        
        String sql = "SELECT * FROM consulta;";
        
        PreparedStatement pst = c.prepareStatement(sql);
        
        ResultSet rs = pst.executeQuery(); 
        
        List<Consulta> consultas = new ArrayList<>();
        
        while(rs.next()){
            Consulta cs;
            cs = new Consulta(rs.getInt("idconsulta"),(Date) rs.getDate("dataHoraPrevista"),
                    rs.getDate("dataHoraRealizacao"),                    
                    new VeterinarioDAO().buscarUm(rs.getInt("idveterinario")),
                    new AnimalDAO().buscarUm(rs.getInt("idanimal")));
            consultas.add(cs);
        }   
        
        return consultas;
    }    

    @Override
    public long quantidade() throws ClassNotFoundException, SQLException {
        Connection c = ConnectionFactory.getConnection();
        
        String sql = "SELECT count(*) FROM consulta;";
        
        PreparedStatement pst = c.prepareStatement(sql);
        
        ResultSet rs = pst.executeQuery(); 
        
        rs.next();
        
        return rs.getLong(1);}
    
    public int buscarMaiorID() throws ClassNotFoundException, SQLException {
        Connection c = ConnectionFactory.getConnection();
        
        String sql = "SELECT max(idconsulta) FROM consulta;";
        
        PreparedStatement pst = c.prepareStatement(sql);
        
        ResultSet rs = pst.executeQuery(); 
        
        if(rs.next()){
            return rs.getInt(1);
        }else{
            return 0;
        }  
    }

    public List<Consulta> buscarNomeConsulta(String nome) throws ClassNotFoundException, SQLException {
        Connection c = ConnectionFactory.getConnection();
        
        String sql = "SELECT * FROM consulta WHERE nome LIKE ?;";
        
        PreparedStatement pst = c.prepareStatement(sql);
        pst.setString(1, "%"+nome+"%");
        
        ResultSet rs = pst.executeQuery(); 
        
        List<Consulta> consultas = new ArrayList<>();
        
        while(rs.next()){
            Consulta cs = new Consulta(rs.getInt("idconsulta"), (Date)rs.getDate("dataHoraPrevista"),
                    (Date)rs.getDate("dataHoraRealizacao"),                    
                    new VeterinarioDAO().buscarUm(rs.getInt("idveterinario")),
                    new AnimalDAO().buscarUm(rs.getInt("idanimal")));
            consultas.add(cs);
        }  
        
        return consultas;
    }    
}
