/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package masterclub_persistencia;
import connection.ConnectionFactory;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import br.edu.ifnmg.MasterClub.Entidades.Chefe;
/**
 *
 * @author tls15
 */
public class ChefeDAO extends Chefe{
    ConnectionFactory conn;
    public ChefeDAO() {
            ConnectionFactory.getConnection();
    }
    
    public ChefeDAO Abrir(String cpf) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    public boolean Salvar(ChefeDAO obj) {
        try {
            if(obj.getadministracao() == 0){
                // Objeto não está no BD, inserir

                // Cria a consulta sql
                PreparedStatement sql = conn.preparedStatement("INSERT INTO AlugaDependenciaDAO(clube,dependencia,tempo) "
                        + "VALUES(?,?,?)");
                
                
                // Passa os parâmetros para a consulta SQL
                //Verificar Conversão de inteiro para String para validar o sql
                sql.setInt(1, obj.getadministracao()); 
                
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

    private int getadministracao() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
