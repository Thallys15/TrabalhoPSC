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
import br.edu.ifnmg.MasterClub.Entidades.Atleta;
/**
 *
 * @author tls15
 */
public class AtletaDAO extends Atleta{
    ConnectionFactory conn;
    public AtletaDAO() {
            ConnectionFactory.getConnection();
    }
    
    public AtletaDAO Abrir(String cpf) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    public boolean Salvar(AtletaDAO obj) {
        try {
            if(obj.getid() == 0){
                // Objeto não está no BD, inserir

                // Cria a consulta sql
                PreparedStatement sql = conn.preparedStatement("INSERT INTO AlugaDependenciaDAO(clube,dependencia,tempo) "
                        + "VALUES(?,?,?)");
                
                
                // Passa os parâmetros para a consulta SQL
                sql.setInt(1, obj.getid());
                sql.setString(2, obj.getposicao());
                sql.setString(3, obj.getlado());
                sql.setString(4, obj.getcategoria());
                sql.setString(5, obj.getnaturalidade());
                sql.setInt(6, obj.getidade());
                sql.setDouble(7, obj.getaltura());
                sql.setDouble(8, obj.getpeso());
                sql.setString(9, obj.getcpf());
                sql.setString(10, obj.getrg());
              
                
                
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

    private int getid() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private String getposicao() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private String getlado() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private String getcategoria() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private String getnaturalidade() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private int getidade() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private double getaltura() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private double getpeso() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private String getcpf() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private String getrg() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
