/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author william
 */
public class ConnectionFactory {
    public static Connection getConnection() throws ClassNotFoundException, SQLException{
        Class.forName("com.mysql.jdbc.Driver");
        //return DriverManager.getConnection("jdbc:mysql://localhost:3306/zoo","root","aluno");
        //return DriverManager.getConnection("jdbc:mysql://localhost:3306/zoo","root","160400");
        return DriverManager.getConnection("jdbc:mysql://localhost:3306/zoo","root","senha123");
    }    
}
