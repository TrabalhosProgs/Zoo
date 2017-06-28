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
import model.Empregado;
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
    
}
