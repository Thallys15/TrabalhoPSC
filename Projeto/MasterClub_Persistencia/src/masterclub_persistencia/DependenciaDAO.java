/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package masterclub_persistencia;
import connection.ConnectionFactory;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import br.edu.ifnmg.MasterClub.Entidades.Dependencia;

/**
 *
 * @author tls15
 */
public class DependenciaDAO extends Dependencia{
    ConnectionFactory conn;
    public DependenciaDAO() {
            ConnectionFactory.getConnection();
    }
    
    public DependenciaDAO Abrir(String cpf) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    public boolean Salvar(DependenciaDAO obj) {
        try {
            if(obj.getcodigo() == 0){
                // Objeto não está no BD, inserir

                // Cria a consulta sql
                PreparedStatement sql = conn.preparedStatement("INSERT INTO AlugaDependenciaDAO(clube,dependencia,tempo) "
                        + "VALUES(?,?,?)");
                
                
                // Passa os parâmetros para a consulta SQL
                sql.setInt(1, obj.getcodigo());
                sql.setString(2, obj.getnome());
                sql.setInt(3, obj.getcapacidade());
              
               
              
                
                
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

    private String getnome() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private int getcapacidade() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
  

    
    
}
