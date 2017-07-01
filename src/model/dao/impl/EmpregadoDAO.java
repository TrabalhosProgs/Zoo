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
public class EmpregadoDAO implements IGenericDAO<Empregado, Integer> {

    @Override
    public void inserir(Empregado obj) throws ClassNotFoundException, SQLException {
        Connection c = ConnectionFactory.getConnection();

        String sql = "INSERT INTO empregado (nome,endereco,telefone, funcao) "
                + "VALUES (?,?,?,?);";

        PreparedStatement pst = c.prepareStatement(sql);

        pst.setString(1, obj.getNome());
        pst.setString(2, obj.getEndereco());
        pst.setString(3, obj.getTelefone());
        pst.setString(4, obj.getFuncao().toString());
        pst.executeUpdate();
    }

    @Override
    public void apagar(Empregado obj) throws ClassNotFoundException, SQLException {
        Connection c = ConnectionFactory.getConnection();

        String sql = "DELETE FROM empregado WHERE idempregado = ?;";

        PreparedStatement pst = c.prepareStatement(sql);
        pst.setInt(1, obj.getId());

        pst.executeUpdate();
    }

    @Override
    public void alterar(Empregado obj) throws ClassNotFoundException, SQLException {
        Connection c = ConnectionFactory.getConnection();

        //String sql = "UPDATE empregado SET nome = ?, endereco = ?, telefone = ?, funcao = ?, numeroCRMV, = ? dataCRMV WHERE idempregado = ?;";
        String sql = "UPDATE empregado SET nome = ?, endereco = ?, telefone = ?, funcao = ? WHERE idempregado = ?;";

        PreparedStatement pst = c.prepareStatement(sql);

        pst.setString(1, obj.getNome());
        pst.setString(2, obj.getEndereco());
        pst.setString(3, obj.getTelefone());
        pst.setString(4, obj.getFuncao().toString());
        //if(obj.getFuncao().toString().equalsIgnoreCase("tratador")){
        //    pst.setString(5, obj.get());
        //    pst.setString(6, obj.getTelefone());
        //}
        //CONTRUTOR IMCOMPLETO, FALTA NUMEROCRMV E DATA
        //pst.setInt(5, );
        //pst.setDate(6,new java.sql.Date(obj.getData().getTime()));
        pst.setInt(5, obj.getId());
        pst.executeUpdate();
    }

    @Override
    public Empregado buscarUm(Integer idempregado) throws ClassNotFoundException, SQLException {
        Connection c = ConnectionFactory.getConnection();

        String sql = "SELECT * FROM empregado WHERE idempregado = ?;";

        PreparedStatement pst = c.prepareStatement(sql);
        pst.setInt(1, idempregado);

        ResultSet rs = pst.executeQuery();
        Empregado e = null;
        if (rs.next()) {
            e = new Empregado(rs.getInt("idempregado"), rs.getString("nome"),
                    rs.getString("endereco"), rs.getString("telefone"), null);
            if (rs.getString("funcao").toString().equalsIgnoreCase("Veterinario")) {
                e.setFuncao(EnumFuncao.VETERINARIO);
            } else {
                e.setFuncao(EnumFuncao.TRATADOR);
            }
        }
        return e;
    }

    @Override
    public List<Empregado> buscarTodos() throws ClassNotFoundException, SQLException {
        Connection c = ConnectionFactory.getConnection();

        String sql = "SELECT * FROM empregado;";

        PreparedStatement pst = c.prepareStatement(sql);

        ResultSet rs = pst.executeQuery();

        List<Empregado> empregados = new ArrayList<>();

        while (rs.next()) {
            Empregado e;

            e = new Empregado(rs.getInt("idempregado"), rs.getString("nome"),
                    rs.getString("endereco"), rs.getString("telefone"), null);

            if (rs.getString("funcao").toString().equals("VETERINARIO")) {
                e.setFuncao(EnumFuncao.VETERINARIO);
            } else {
                e.setFuncao(EnumFuncao.TRATADOR);
            }

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

    public List<Empregado> buscarPeloNome(String nome) throws ClassNotFoundException, SQLException {
        Connection c = ConnectionFactory.getConnection();

        String sql = "SELECT * FROM empregado WHERE nome LIKE ?;";

        PreparedStatement pst = c.prepareStatement(sql);
        pst.setString(1, "%" + nome + "%");
        ResultSet rs = pst.executeQuery();

        List<Empregado> empregado = new ArrayList<>();

        while (rs.next()) {
            Empregado e;

            e = new Empregado(rs.getInt("idempregado"), rs.getString("nome"),
                    rs.getString("endereco"), rs.getString("telefone"), null);
            if (rs.getString("funcao").toString().equalsIgnoreCase("Veterinario")) {
                e.setFuncao(EnumFuncao.VETERINARIO);
            } else {
                e.setFuncao(EnumFuncao.TRATADOR);
            }

            empregado.add(e);
        }

        return empregado;
    }

    public List<Empregado> buscarVeterinarios() throws ClassNotFoundException, SQLException {
        Connection c = ConnectionFactory.getConnection();

        String sql = "SELECT * FROM empregado where funcao = 'VETERINARIO';";

        PreparedStatement pst = c.prepareStatement(sql);

        ResultSet rs = pst.executeQuery();

        List<Empregado> empregados = new ArrayList<>();

        while (rs.next()) {
            Empregado e;

            e = new Empregado(rs.getInt("idempregado"), rs.getString("nome"),
                    rs.getString("endereco"), rs.getString("telefone"), EnumFuncao.VETERINARIO);

            empregados.add(e);
        }

        return empregados;
    }

    public int buscarMaiorID() throws ClassNotFoundException, SQLException {
        Connection c = ConnectionFactory.getConnection();

        String sql = "SELECT max(idempregado) FROM empregado;";

        PreparedStatement pst = c.prepareStatement(sql);

        ResultSet rs = pst.executeQuery();

        if (rs.next()) {
            return rs.getInt(1);
        } else {
            return 0;
        }
    }

}
