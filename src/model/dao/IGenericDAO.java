/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao;

import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author william
 */
public interface IGenericDAO<C, K> {
    public void inserir(C obj) throws ClassNotFoundException, SQLException;
    public void apagar(C obj)throws ClassNotFoundException, SQLException;
    public void alterar(C obj)throws ClassNotFoundException, SQLException;
    public C buscarUm(K id)throws ClassNotFoundException, SQLException;
    public List<C> buscarTodos()throws ClassNotFoundException, SQLException;
    public long quantidade()throws ClassNotFoundException, SQLException;
    
}
