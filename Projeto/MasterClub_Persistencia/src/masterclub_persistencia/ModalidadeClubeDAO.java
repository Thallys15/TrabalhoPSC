/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package masterclub_persistencia;
import connection.ConnectionFactory;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import br.edu.ifnmg.MasterClub.Entidades.ModalidadeClube;

/**
 *
 * @author tls15
 */
public class ModalidadeClubeDAO extends ModalidadeClube{
    ConnectionFactory conn;
    public ModalidadeClubeDAO() {
            ConnectionFactory.getConnection();
    }
    
    public EnderecoDAO Abrir(int clube) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    public boolean Salvar(ModalidadeClubeDAO obj) {
        try {
            if(obj.getclube() == 0){
                // Objeto não está no BD, inserir

                // Cria a consulta sql
                PreparedStatement sql = conn.preparedStatement("INSERT INTO AlugaDependenciaDAO(clube,dependencia,tempo) "
                        + "VALUES(?,?,?)");
                
                
                // Passa os parâmetros para a consulta SQL
                sql.setInt(1, obj.getclube());
                sql.setInt(1, obj.getmodalidade());
                
              
               
              
                
                
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

    private int getclube() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private int getmodalidade() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    

    
  

    
    
}