/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.MasterClub.Persistencia;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


/**
 *
 * @author tls15
 */
public class ConnectionFactory {
    private static final String DRIVER ="com.mysql.jdbc.Driver";
    private static final String URL="jdbc:mysql://localhost:3306/masterclub";
    private static final String USER ="root";
    private static final String PASS ="maromba";

    public static Connection getConnection(){
        try {
            
            Class.forName(DRIVER);
            return DriverManager.getConnection(URL, USER, PASS);
            
        } catch (ClassNotFoundException | SQLException ex) {
            throw new RuntimeException("Erro na conexão!", ex);
        }

    } 
    public static void closeConnection(Connection con){
      if (con != null){
          try {
              con.close();
          } catch (SQLException ex) {
              System.err.println("Erro: "+ex);
          }
      }
    }
    
    public static void closeConnection(Connection con, PreparedStatement stmt){
        if (stmt != null){
             try {
                    stmt.close();
            } catch (SQLException ex) {
              System.err.println("Erro: "+ex);
        }
            closeConnection(con);
      }
    }
    
    public static void closeConnection(Connection con, PreparedStatement stmt, ResultSet rs){
        if (rs != null){
             try {
                    rs.close();
            } catch (SQLException ex) {
              System.err.println("Erro: "+ex);
        }
            closeConnection(con,stmt);
      }
    }

    public PreparedStatement preparedStatement(String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public PreparedStatement prepareStatement(String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
}