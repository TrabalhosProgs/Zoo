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
import model.Animal;
import model.Tratador;
import model.dao.IGenericDAO;

/**
 *
 * @author pc
 */
public class AnimalDAO implements IGenericDAO<Animal, Integer>{

    @Override
    public void inserir(Animal obj) throws ClassNotFoundException, SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void apagar(Animal obj) throws ClassNotFoundException, SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void alterar(Animal obj) throws ClassNotFoundException, SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Animal buscarUm(Integer id) throws ClassNotFoundException, SQLException {
        Connection c = ConnectionFactory.getConnection();
        
        String sql = "SELECT * FROM animal WHERE idanimal = ?;";
        
        PreparedStatement pst = c.prepareStatement(sql);
        pst.setInt(1, id);
        
        ResultSet rs = pst.executeQuery();  
        Animal a = null;
        if(rs.next()){
            a = new Animal(rs.getInt("idanimal"), rs.getString("nome"), 
                    rs.getString("regiaoOrigem"), 
                    (Date)rs.getDate("dataNasc"), 
                    rs.getDouble("peso"), 
                    rs.getString("especie"), 
                    new TratadorDAO().buscarUm(rs.getInt("idtratador")),
                    null,  // Equipe de tratadores   -> Falta implementar
                    null,  // RotinaTratamento       -> Falta implementar
                    null); // BoletimSaude           -> Falta implementar 
        }   
        
        return a;
    }

    @Override
    public List<Animal> buscarTodos() throws ClassNotFoundException, SQLException {
        Connection c = ConnectionFactory.getConnection();
        
        String sql = "SELECT * FROM animal;";
        
        PreparedStatement pst = c.prepareStatement(sql);
        
        ResultSet rs = pst.executeQuery(); 
        
        List<Animal> animais = new ArrayList<>();
        
        while(rs.next()){
            Animal a = new Animal(rs.getInt("idanimal"), rs.getString("nome"), 
                    rs.getString("regiaoOrigem"), 
                    (Date)rs.getDate("dataNasc"), 
                    rs.getDouble("peso"), 
                    rs.getString("especie"), 
                    new TratadorDAO().buscarUm(rs.getInt("idtratador")),
                    null,  // Equipe de tratadores   -> Falta implementar
                    null,  // RotinaTratamento       -> Falta implementar
                    null); // BoletimSaude           -> Falta implementar 
                    
            animais.add(a);
        }
        
        return animais;
    }

    @Override
    public long quantidade() throws ClassNotFoundException, SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
