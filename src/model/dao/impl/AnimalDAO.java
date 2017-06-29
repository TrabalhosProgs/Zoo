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
        Connection c = ConnectionFactory.getConnection();

        String sql = "INSERT INTO empregado (nome,regiaoOrigem,dataNasc, peso, especie, idtratador, idrotinatratamento) "
                + "VALUES (?,?,?,?,?,?,?);";
        
        PreparedStatement pst = c.prepareStatement(sql);
               
        pst.setString(1, obj.getNome());
        pst.setString(2, obj.getRegiaoOrigem());
        pst.setDate(3,new java.sql.Date(obj.getDataNasc().getTime()));
        pst.setDouble(4, obj.getPeso());
        pst.setString(5, obj.getEspecie());
        pst.setString(6, obj.getTratadorResponsavel().toString());
        pst.setInt(7, obj.getRotinaTrabamento().getId());
        
        pst.executeUpdate();
    }

    @Override
    public void apagar(Animal obj) throws ClassNotFoundException, SQLException {
        Connection c = ConnectionFactory.getConnection();
        
        String sql = "DELETE FROM animal WHERE idanimal = ?;";
        
        PreparedStatement pst = c.prepareStatement(sql);
        pst.setInt(1,obj.getId());
        
        pst.executeUpdate();}
    

    @Override
    public void alterar(Animal obj) throws ClassNotFoundException, SQLException {
        Connection c = ConnectionFactory.getConnection();
        
        String sql = "UPDATE empregado SET nome = ?, regiaoOrigem = ?, dataNasc = ?, peso = ?, especie=?, idtratador=?,idrotinatratamento=? WHERE idempregado = ?;";
        
        PreparedStatement pst = c.prepareStatement(sql);
        
        pst.setString(1, obj.getNome());
        pst.setString(2, obj.getRegiaoOrigem());
        pst.setDate(3,new java.sql.Date(obj.getDataNasc().getTime()));
        pst.setDouble(4, obj.getPeso());
        pst.setString(5, obj.getEspecie());
        pst.setString(6, obj.getTratadorResponsavel().toString());
        pst.setInt(7, obj.getRotinaTrabamento().getId());
        pst.setInt(8, obj.getId());
        
        pst.executeUpdate();
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
                    new RotinaTratamentoDAO().buscarUm(rs.getInt("idrotinatratamento"))); 
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
                    new RotinaTratamentoDAO().buscarUm(rs.getInt("idrotinatratamento")));
                    
            animais.add(a);
        }
        
        return animais;
    }

    @Override
    public long quantidade() throws ClassNotFoundException, SQLException {
        Connection c = ConnectionFactory.getConnection();
        
        String sql = "SELECT count(*) FROM animal;";
        
        PreparedStatement pst = c.prepareStatement(sql);
        
        ResultSet rs = pst.executeQuery(); 
        
        rs.next();
        
        return rs.getLong(1);
    }
    
    public List<Animal> buscarPeloNome(String nome) throws ClassNotFoundException, SQLException {
        Connection c = ConnectionFactory.getConnection();
        
        String sql = "SELECT * FROM animal WHERE nome LIKE ?;";
        
        PreparedStatement pst = c.prepareStatement(sql);
        pst.setString(1, "%"+nome+"%");
        ResultSet rs = pst.executeQuery(); 
        
        
        List<Animal> animal = new ArrayList<>();
        
        while(rs.next()){
            Animal a = new Animal(rs.getInt("idanimal"), rs.getString("nome"), 
                    rs.getString("regiaoOrigem"), 
                    (Date)rs.getDate("dataNasc"), 
                    rs.getDouble("peso"), 
                    rs.getString("especie"), 
                    new TratadorDAO().buscarUm(rs.getInt("idtratador")),
                    null,  // Equipe de tratadores   -> Falta implementar
                    new RotinaTratamentoDAO().buscarUm(rs.getInt("idrotinatratamento"))); 
                    
            animal.add(a);
        }  
        
        return animal;
    }

    public List<Animal> buscarTodosPorTratador(Tratador t) throws ClassNotFoundException, SQLException {
        Connection c = ConnectionFactory.getConnection();
        
        String sql = "SELECT a.* FROM animal a inner join empregado e "
                + " on a.idtratador = e.idempregado where e.idempregado = ? order by a.nome asc;";
        
        PreparedStatement pst = c.prepareStatement(sql);
        pst.setInt(1, t.getId());
        ResultSet rs = pst.executeQuery(); 
        
        
        List<Animal> animais = new ArrayList<>();
        
        while(rs.next()){
            Animal a = new Animal(rs.getInt("a.idanimal"), rs.getString("a.nome"), 
                    rs.getString("a.regiaoOrigem"), 
                    (Date)rs.getDate("a.dataNasc"), 
                    rs.getDouble("a.peso"), 
                    rs.getString("a.especie"), 
                    new TratadorDAO().buscarUm(rs.getInt("a.idtratador")),
                    null,  // Equipe de tratadores   -> Falta implementar
                    new RotinaTratamentoDAO().buscarUm(rs.getInt("a.idrotinatratamento")));
                    
            animais.add(a);
        }
        
        return animais;
    }
    
    public int buscarMaiorID() throws ClassNotFoundException, SQLException {
        Connection c = ConnectionFactory.getConnection();
        
        String sql = "SELECT max(idanimal) FROM animal;";
        
        PreparedStatement pst = c.prepareStatement(sql);
        
        ResultSet rs = pst.executeQuery(); 
        
        if(rs.next()){
            return rs.getInt(1);
        }else{
            return 0;
        }  
    }
}
