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
import model.Frequencia;
import model.Medicacao;
import model.Medicamento;
import model.dao.IGenericDAO;

/**
 *
 * @author william
 */
public class MedicacaoDAO implements IGenericDAO<Medicacao, Integer>{

    @Override
    public void inserir(Medicacao obj) throws ClassNotFoundException, SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void apagar(Medicacao obj) throws ClassNotFoundException, SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void alterar(Medicacao obj) throws ClassNotFoundException, SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Medicacao buscarUm(Integer id) throws ClassNotFoundException, SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Medicacao> buscarTodos() throws ClassNotFoundException, SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public long quantidade() throws ClassNotFoundException, SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public List<Medicacao> buscarTudoPorReceita(Integer id) throws ClassNotFoundException, SQLException {
        Connection c = ConnectionFactory.getConnection();
        
        String sql = "SELECT * FROM medicacao m "
                + " inner join frequenciamedicacao f on (m.idfrequenciamedicacao = f.idfrequenciamedicacao) "
                + " inner join medicamento me on (m.idmedicamento = me.idmedicamento) WHERE m.idreceita = ?;";
        
        PreparedStatement pst = c.prepareStatement(sql);
        pst.setInt(1, id);
        ResultSet rs = pst.executeQuery(); 
        
        
        List<Medicacao> medicacoes = new ArrayList<>();
        
        while(rs.next()){
            Medicacao m = new Medicacao(rs.getInt("m.idmedicacao"), (Date)rs.getDate("m.periodoIni"), (Date)rs.getDate("m.periodoFim"), rs.getString("m.dose"), 
                    new Medicamento(rs.getInt("me.idmedicamento"), rs.getString("me.nome")), 
                    new Frequencia(rs.getInt("f.idfrequenciamedicacao"), rs.getString("f.descricao"))
            );
                    
            medicacoes.add(m);
        }   
        
        return medicacoes;
    }
}
