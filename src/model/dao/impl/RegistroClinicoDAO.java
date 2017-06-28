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
import model.Animal;
import model.RegistroClinico;
import model.Veterinario;
import model.dao.IGenericDAO;
import model.enu.EnumTipoAtendimento;

/**
 *
 * @author william
 */
public class RegistroClinicoDAO implements IGenericDAO<RegistroClinico, Integer>{

    @Override
    public void inserir(RegistroClinico obj) throws ClassNotFoundException, SQLException {
        Connection c = ConnectionFactory.getConnection();
        
        String sql = "INSERT INTO registroclinico (diagnostico, "
                + " observacoes, "
                + " tipoAtendimento, "
                + " idanimal, "
                + " idveterinario) "
                + " VALUES(?, ?, ?, ?, ?);";
        
        PreparedStatement pst = c.prepareStatement(sql);
        
        pst.setString(1, obj.getDiagnostico());
        pst.setString(2,obj.getObservacao());
        pst.setString(3, obj.getTipoAtendimento().toString());
        pst.setInt(4, obj.getAnimal().getId());
        pst.setInt(5, obj.getVeterinario().getId());
        
        pst.executeUpdate();
    }

    @Override
    public void apagar(RegistroClinico obj) throws ClassNotFoundException, SQLException {
        Connection c = ConnectionFactory.getConnection();
        
        String sql = "DELETE FROM registroclinico WHERE idregistroClinico = ?;";
        
        PreparedStatement pst = c.prepareStatement(sql);
        pst.setInt(1,obj.getId());
        
        pst.executeUpdate();        
    }

    @Override
    public void alterar(RegistroClinico obj) throws ClassNotFoundException, SQLException {
        Connection c = ConnectionFactory.getConnection();
        
        String sql = "UPDATE registroclinico "
                    + " SET diagnostico = ?, "
                    + " observacoes = ?, "
                    + " tipoAtendimento = ?, "
                    + " idanimal = ?, "
                    + " idveterinario = ? "
                    + " WHERE idregistroClinico = ?;";
        
        PreparedStatement pst = c.prepareStatement(sql);
        
        pst.setString(1, obj.getDiagnostico());
        pst.setString(2, obj.getObservacao());
        pst.setString(3, obj.getTipoAtendimento().toString());
        pst.setInt(4, obj.getAnimal().getId());
        pst.setInt(5, obj.getVeterinario().getId());
        pst.setInt(6, obj.getId());
        
        pst.executeUpdate();
    }

    @Override
    public RegistroClinico buscarUm(Integer id) throws ClassNotFoundException, SQLException {
        Connection c = ConnectionFactory.getConnection();
        
        String sql = "SELECT * FROM registroclinico WHERE idregistroClinico = ?;";
        
        PreparedStatement pst = c.prepareStatement(sql);
        pst.setInt(1, id);
        
        ResultSet rs = pst.executeQuery();  
        RegistroClinico rc = null;
        if(rs.next()){           
            rc = new RegistroClinico(rs.getInt("idregistroClinico"),
                    rs.getString("diagnostico"),
                    rs.getString("observacoes"),
                    new VeterinarioDAO().buscarUm(rs.getInt("idveterinario")), 
                    new AnimalDAO().buscarUm(rs.getInt("idanimal")), 
                    null,  //EnumTipoAtendimento
                    null); //ArrayList<Vacina>
            
                    if(rs.getString("tipoAtendimento").equals("PREVENTIVO"))
                        rc.setTipoAtendimento(EnumTipoAtendimento.PREVENTIVO);
                    else
                        rc.setTipoAtendimento(EnumTipoAtendimento.EMERGENCIA);
            }   
        
        return rc;
    }

    @Override
    public List<RegistroClinico> buscarTodos() throws ClassNotFoundException, SQLException {
        Connection c = ConnectionFactory.getConnection();
        
        String sql = "SELECT * FROM registroclinico;";
        
        PreparedStatement pst = c.prepareStatement(sql);
        
        ResultSet rs = pst.executeQuery();  
        List<RegistroClinico> listaRC = new ArrayList<>();
        
        while(rs.next()){           
            RegistroClinico rc = new RegistroClinico(rs.getInt("idregistroClinico"),
                    rs.getString("diagnostico"),
                    rs.getString("observacoes"),
                    new VeterinarioDAO().buscarUm(rs.getInt("idveterinario")), 
                    new AnimalDAO().buscarUm(rs.getInt("idanimal")), 
                    null,  //EnumTipoAtendimento
                    null); //ArrayList<Vacina>
            
                    if(rs.getString("tipoAtendimento").equals("PREVENTIVO"))
                        rc.setTipoAtendimento(EnumTipoAtendimento.PREVENTIVO);
                    else
                        rc.setTipoAtendimento(EnumTipoAtendimento.EMERGENCIA);
                    listaRC.add(rc);
            }   
        
        return listaRC;
    }

    @Override
    public long quantidade() throws ClassNotFoundException, SQLException {
        Connection c = ConnectionFactory.getConnection();
        
        String sql = "SELECT count(*) FROM registroclinico;";
        
        PreparedStatement pst = c.prepareStatement(sql);
        
        ResultSet rs = pst.executeQuery(); 
        
        rs.next();
        
        return rs.getLong(1);
    }
    
    public List<RegistroClinico> buscarTodosPorAnimal(Animal a) throws ClassNotFoundException, SQLException {
        Connection c = ConnectionFactory.getConnection();
        
        String sql = "SELECT * FROM registroclinico WHERE idanimal = ?;";
        
        PreparedStatement pst = c.prepareStatement(sql);
        pst.setInt(1, a.getId());
        
        ResultSet rs = pst.executeQuery();  
        
        List<RegistroClinico> listaRC = new ArrayList<>();
        
        while(rs.next()){           
            RegistroClinico rc = new RegistroClinico(rs.getInt("idregistroClinico"),
                    rs.getString("diagnostico"),
                    rs.getString("observacoes"),
                    new VeterinarioDAO().buscarUm(rs.getInt("idveterinario")), 
                    new AnimalDAO().buscarUm(rs.getInt("idanimal")), 
                    null,  //EnumTipoAtendimento
                    null); //ArrayList<Vacina>
            
                    if(rs.getString("tipoAtendimento").equals("PREVENTIVO"))
                        rc.setTipoAtendimento(EnumTipoAtendimento.PREVENTIVO);
                    else
                        rc.setTipoAtendimento(EnumTipoAtendimento.EMERGENCIA);
                    listaRC.add(rc);
            }   
        
        return listaRC;
    }
}
