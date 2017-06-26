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
import model.Empregado;
import model.Veterinario;
import model.dao.IGenericDAO;
import model.enu.EnumFuncao;

/**
 *
 * @author pc
 */
public class EmpregadoDAO implements IGenericDAO <Empregado, Integer>{

    @Override
    public void inserir(Empregado obj) throws ClassNotFoundException, SQLException {
        Connection c = ConnectionFactory.getConnection();

        String sql = "INSERT INTO empregado (idempregado,nome,endereco,telefone,funcao,numeroCRMV,dataCRMV) "
                + "VALUES (?,?,?,?,?,?,?);";

        PreparedStatement pst = c.prepareStatement(sql);
        
        //--> ERRO: NON-STATIC <--//
        
//        pst.setInt(1, Empregado.getId());
//        pst.setString(2, Empregado.getNome());
//        pst.setString(3, Empregado.getEndereco());
//        pst.setString(4, Empregado.getTelefone());
//        pst.setString(5, Empregado.getFuncao());
//        pst.setString(6, Veterinario.getNumeroCRMV());
          pst.setDate(7,new java.sql.Date(obj.getData().getTime()));

        pst.executeUpdate();
    }

    @Override
    public void apagar(Empregado obj) throws ClassNotFoundException, SQLException {
        Connection c = ConnectionFactory.getConnection();
        
        String sql = "DELETE FROM empregado WHERE idempregado = ?;";
        
        PreparedStatement pst = c.prepareStatement(sql);
        pst.setInt(1,obj.getId());
        
        pst.executeUpdate();}

    @Override
    public void alterar(Empregado obj) throws ClassNotFoundException, SQLException {
        Connection c = ConnectionFactory.getConnection();
        
        String sql = "UPDATE empregado SET nome = ?, endereco = ?, telefone = ?, funcao = ?, numeroCRMV, = ? dataCRMV WHERE idempregado = ?;";
        
        PreparedStatement pst = c.prepareStatement(sql);
        
        //--> ERRO: NON-STATIC <--//
        
//        pst.setInt(1, Empregado.getId());
//        pst.setString(2, Empregado.getNome());
//        pst.setString(3, Empregado.getEndereco());
//        pst.setString(4, Empregado.getTelefone());
//        pst.setString(5, Empregado.getFuncao());
//        pst.setString(6, Veterinario.getNumeroCRMV());
          pst.setDate(7,new java.sql.Date(obj.getData().getTime()));
    }

    @Override
    public Empregado buscarUm(Integer idempregado) throws ClassNotFoundException, SQLException {
        Connection c = ConnectionFactory.getConnection();
        
        String sql = "SELECT * FROM empregado WHERE idempregado = ?;";
        
        PreparedStatement pst = c.prepareStatement(sql);
        pst.setInt(1, idempregado);
        
        ResultSet rs = pst.executeQuery();  
        Empregado e = null;
        if(rs.next()){
            //Adicionar Construtor Do Empregado
            e = new Empregado(rs.getInt("idempregado"), rs.getString("nome"),
                    rs.getString("endereco"), rs.getString("telefone"), null);
                    if(rs.getString("funcao") == "TRATADOR")
                        e.setFuncao(EnumFuncao.TRATADOR);
                    else
                        e.setFuncao(EnumFuncao.VETERINARIO);
        }
        return e;}
    

    @Override
    public List<Empregado> buscarTodos() throws ClassNotFoundException, SQLException {
        Connection c = ConnectionFactory.getConnection();
        
        String sql = "SELECT * FROM empregado;";
        
        PreparedStatement pst = c.prepareStatement(sql);
        
        ResultSet rs = pst.executeQuery(); 
        
        List<Empregado> empregados = new ArrayList<>();
        
        while(rs.next()){
            Empregado  e;

            //Adicionar Construtor Do Empregado
            
            //empregados.add(e);
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
    
    public List<Empregado> buscarPeloNome(String nome) throws ClassNotFoundException, SQLException {
        Connection c = ConnectionFactory.getConnection();
        
        String sql = "SELECT * FROM empregado WHERE nome LIKE ?;";
        
        PreparedStatement pst = c.prepareStatement(sql);
        pst.setString(1, "%"+nome+"%");
        ResultSet rs = pst.executeQuery(); 
        
        
        List<Empregado> empregado = new ArrayList<>();
        
        while(rs.next()){
            Empregado  e;
            
        //Adicionar Construtor Do Empregado
            
            //empregado.add(e);
        }  
        
        return empregado;
    }
    
    public List<Empregado> buscarVeterinarios( ) throws ClassNotFoundException, SQLException {
        Connection c = ConnectionFactory.getConnection();
        
        String sql = "SELECT * FROM empregado where funcao = 'VETERINARIO';";
        
        PreparedStatement pst = c.prepareStatement(sql);
        
        ResultSet rs = pst.executeQuery(); 
        
        List<Empregado> empregados = new ArrayList<>();
        
        while(rs.next()){
            Empregado  e;
            
            //Adicionar Construtor Do Empregado
            
            //empregados.add(e);
        } 
        
        return empregados;
    }
    
}
