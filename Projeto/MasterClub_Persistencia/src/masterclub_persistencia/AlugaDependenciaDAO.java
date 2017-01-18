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
import br.edu.ifnmg.MasterClub.Entidades.AlugaDependencia;

/**
 *
 * @author tls15
 */
public class AlugaDependenciaDAO extends AlugaDependencia {
            ConnectionFactory conn;
    public AlugaDependenciaDAO() {
            ConnectionFactory.getConnection();
    }
    
    public AlugaDependenciaDAO Abrir(String cpf) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    public boolean Salvar(AlugaDependenciaDAO obj) {
        try {
            if(obj.getClube() == 0){
                // Objeto não está no BD, inserir

                // Cria a consulta sql
                PreparedStatement sql = conn.preparedStatement("INSERT INTO AlugaDependenciaDAO(clube,dependencia,tempo) "
                        + "VALUES(?,?,?)");
                
                
                // Passa os parâmetros para a consulta SQL
                sql.setInt(1, obj.getClube());
                sql.setInt(2, obj.getDependencia());
                sql.setDate(3, new java.sql.Date(obj.getTempoAluguel().getTime()));
                
                
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
    
    
    public boolean Apagar(AlugaDependencia obj) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
    
    public AlugaDependencia Abrir(int id) {
        try {
            
            // Crio a consulta sql
            PreparedStatement sql = conn.prepareStatement("select clube,dependencia,TempoAluguel "
                    + "from clientes where id = ?");
            
            // Passo os parâmentros para a consulta sql
            sql.setInt(1, clube);
            
            // Executo a consulta sql e pego os resultados
            ResultSet resultado = sql.executeQuery();
            
            // Verifica se algum registro foi retornado na consulta
            if(resultado.next()){
                
                // Passo os dados do resultado para o objeto
                AlugaDependencia tmp = new AlugaDependencia();
                tmp.setClube(resultado.getInt(1));
                tmp.setDependencia(resultado.getInt(2));
                tmp.setTempoAluguel(resultado.getDate(3));
                //tmp.setDataNascimento(resultado.getString(2));
                
                // Retorna o objeto
                return tmp;
            }            
            
        } catch(SQLException ex){
            System.out.println(ex);
        }
        
        return null;
    }

    private static class ErroValidacao {

        public ErroValidacao() {
        }
    }

}
