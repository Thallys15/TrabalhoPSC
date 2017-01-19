/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package masterclub_persistencia;
import connection.ConnectionFactory;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import br.edu.ifnmg.MasterClub.Entidades.Financas;

/**
 *
 * @author tls15
 */
public class FinancasDAO extends Financas{
    ConnectionFactory conn;
    public FinancasDAO() {
            ConnectionFactory.getConnection();
    }
    
    public FinancasDAO Abrir(int codigo ) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    public boolean Salvar(FinancasDAO obj) {
        try {
            if(obj.getcodigo() == 0){
                // Objeto não está no BD, inserir

                // Cria a consulta sql
                PreparedStatement sql = conn.preparedStatement("INSERT INTO AlugaDependenciaDAO(clube,dependencia,tempo) "
                        + "VALUES(?,?,?)");
                
                
                // Passa os parâmetros para a consulta SQL
                sql.setInt(1, obj.getcodigo());
                sql.setString(2, obj.getcontratacoes());
                sql.setString(3, obj.getvendas());
                sql.setInt(4, obj.getnumero());
                sql.setString(5, obj.getcomplemento());
                sql.setString(6, obj.getcidade());
                sql.setString(7, obj.getestado());
              
               
              
                
                
                // Executa a consulta SQL
                sql.executeUpdate();
                
                
                
            } else {
                // Objeto já está no BD, atualizar
            }
            
            return true;
        
        } catch(SQLException e){
            System.out.print(e);
            
        }
        return false;
    }

    private int getcodigo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private int getnumero() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private String getcomplemento() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private String getcidade() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private String getestado() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private String getcontratacoes() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private String getvendas() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    

    
  

    
    
}