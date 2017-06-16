package connection;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import connection.ConnectionFactory;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.RotinaTratamento;
import model.dao.impl.RotinaTratamentoDAO;

/**
 *
 * @author william
 */
public class Zoo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        /*Testar a conexao
        try {
        Connection c = ConnectionFactory.getConnection();
        System.out.println("Conexão funfou!!");
        } catch (ClassNotFoundException ex) {
        Logger.getLogger(Zoo.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
        Logger.getLogger(Zoo.class.getName()).log(Level.SEVERE, null, ex);
        }*/
        
        //teste classe RotinaDAO
        /*
        try {    
            List<RotinaTratamento> lista = new RotinaTratamentoDAO().buscarTodos();
            System.out.println("Conexão funfou!!");
        } catch (ClassNotFoundException ex) {
            
            Logger.getLogger(Zoo.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Zoo.class.getName()).log(Level.SEVERE, null, ex);
        }*/
        
    }
    
}
