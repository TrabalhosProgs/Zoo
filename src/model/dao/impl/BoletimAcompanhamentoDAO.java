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
import java.util.Date;
import java.util.List;
import model.Animal;
import model.BoletimAcompanhamento;
import model.Tratador;
import model.dao.IGenericDAO;
import model.enu.EnumParecer;

/**
 *
 * @author william
 */
public class BoletimAcompanhamentoDAO implements IGenericDAO<BoletimAcompanhamento, Integer>{

    @Override
    public void inserir(BoletimAcompanhamento obj) throws ClassNotFoundException, SQLException {
        Connection c = ConnectionFactory.getConnection();
        
        String sql = "INSERT INTO boletimacompanhamento (data, observacao, parecer, idanimal, idtratador) "
                + " VALUES(?,?,?,?,?);";
        
        PreparedStatement pst = c.prepareStatement(sql);
        
        pst.setDate(1, new java.sql.Date(obj.getDataBoletim().getTime()));
        pst.setString(2, obj.getObservacao());
        pst.setString(3, obj.getTipo().toString());
        pst.setInt(4, obj.getAnimal().getId());
        pst.setInt(5, obj.getTratador().getId());
        
        pst.executeUpdate();
    }

    @Override
    public void apagar(BoletimAcompanhamento obj) throws ClassNotFoundException, SQLException {
        Connection c = ConnectionFactory.getConnection();
        
        String sql = "DELETE FROM boletimacompanhamento WHERE id = ?;";
        
        PreparedStatement pst = c.prepareStatement(sql);
        pst.setInt(1,obj.getId());
        
        pst.executeUpdate();
    }

    @Override
    public void alterar(BoletimAcompanhamento obj) throws ClassNotFoundException, SQLException {
        Connection c = ConnectionFactory.getConnection();
        
        String sql = "UPDATE boletimacompanhamento SET "
                + " data = ?, "
                + " observacao = ?, "
                + " parecer = ?, "
                + " idanimal = ?, "
                + " idtratador = ? "
                + "WHERE idboletimacompanhamento = ?;";
        
        PreparedStatement pst = c.prepareStatement(sql);
        pst.setDate(1, new java.sql.Date(obj.getDataBoletim().getTime()));
        pst.setString(2, obj.getObservacao());
        pst.setString(3, obj.getTipo().toString());
        pst.setInt(4, obj.getAnimal().getId());
        pst.setInt(5, obj.getTratador().getId());
        pst.setInt(6, obj.getId());
        
        pst.executeUpdate();
    }

    @Override
    public BoletimAcompanhamento buscarUm(Integer id) throws ClassNotFoundException, SQLException {
        Connection c = ConnectionFactory.getConnection();
        
        String sql = "SELECT * FROM boletimacompanhamento WHERE idboletimacompanhamento = ?;";
        
        PreparedStatement pst = c.prepareStatement(sql);
        pst.setInt(1, id);
        
        ResultSet rs = pst.executeQuery();  
        BoletimAcompanhamento ba = null;
        if(rs.next()){
            ba = new BoletimAcompanhamento(rs.getInt("idboletimacompanhamento"), 
                    (Date)rs.getDate("data"), 
                    (Tratador) new EmpregadoDAO().buscarUm(rs.getInt("idtratador")),
                    rs.getString("observacao"),
                    null,
                    new AnimalDAO().buscarUm(rs.getInt("idanimal")));
            
                    if(rs.getString("parecer") == "SAUDAVEL")
                        ba.setTipo(EnumParecer.SAUDAVEL);
                    else if(rs.getString("parecer") == "ESTADO_ALERTA")
                        ba.setTipo(EnumParecer.ESTADO_ALERTA);
                    else
                        ba.setTipo(EnumParecer.DOENTE);

            //BoletimAcompanhamento( Tratador tratador, Animal animal)
        }   
        
        return ba;
    }

    @Override
    public List<BoletimAcompanhamento> buscarTodos() throws ClassNotFoundException, SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public long quantidade() throws ClassNotFoundException, SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
