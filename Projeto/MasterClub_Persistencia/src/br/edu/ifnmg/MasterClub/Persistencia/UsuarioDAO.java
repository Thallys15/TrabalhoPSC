/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.MasterClub.Persistencia;

import br.edu.ifnmg.MasterClub.Entidades.ErroValidacao;
import br.edu.ifnmg.MasterClub.Entidades.Usuario;
import br.edu.ifnmg.MasterClub.Entidades.UsuarioRepositorio;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Igor Pereira
 */
public class UsuarioDAO extends DAOGenerico<Usuario> implements UsuarioRepositorio{
    
    public UsuarioDAO(){
        setConsultaAbrir("select id,login,senha from usuario where id = ?");
        setConsultaApagar("delete from usuario where id = ? ");
        setConsultaInserir("insert into usuario(login,senha) values(?,?)");
        setConsultaAlterar("update clientes set login = ?, senha = ? WHERE id = ?");
        setConsultaBusca("select id,login,senha from usuario ");
    
    }

    @Override
    protected Usuario preencheObjeto(ResultSet resultado) {
        Usuario tmp = new Usuario();
        try {
            tmp.setId(resultado.getInt(1));
        
                tmp.setLogin(resultado.getString(2));
                tmp.setSenha(resultado.getString(3));
         } catch (SQLException ex) {     
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
                return tmp;
    }

    @Override
    protected void preencheConsulta(PreparedStatement sql, Usuario obj) {
        try {
            // Passa os parâmetros para a consulta SQL
            sql.setString(1, obj.getLogin());
            sql.setString(2, obj.getSenha());
            if(obj.getId() > 0) sql.setInt(3,obj.getId());
            
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    protected void preencheFiltros(Usuario filtro) {
         if(filtro.getId() > 0) adicionarFiltro("id", "=");
        if(filtro.getLogin()!= null) adicionarFiltro("login", " like ");
        if(filtro.getSenha()!= null) adicionarFiltro("senha", "=");
    }

    @Override
    protected void preencheParametros(PreparedStatement sql, Usuario filtro) {
        try {
            int cont = 1;
            if(filtro.getId() > 0){ sql.setInt(cont, filtro.getId()); cont++; }
            if(filtro.getLogin()!= null ){ sql.setString(cont, filtro.getLogin()+"%"); cont++; }
            if(filtro.getSenha()!= null){ 
                sql.setString(cont, filtro.getSenha()); 
                cont++; 
            }
            
        
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public Usuario Abrir(String login, String senha) {
        try {            
            PreparedStatement sql = conn.prepareStatement("select id,login,senha, "
                    + "from  where senha = ?");
            sql.setString(1, senha);
            ResultSet resultado = sql.executeQuery();
            if(resultado.next()){
                
                return preencheObjeto(resultado);
            }            
        }  catch(SQLException ex){
            System.out.println(ex);
        }
        
        return null;
    }

    @Override
    public boolean VerificaLogin(String login, String senha) {
     try {
            PreparedStatement sql = conn.prepareStatement("SELECT ID FROM usuario WHERE LOGIN = ? AND SENHA = ?");
            sql.setString(1, login);
            sql.setString(2, senha);
            ResultSet resultado = sql.executeQuery();
            if(resultado.next()){
                return true ;
            }else
                return false;
        } catch (SQLException ex) {
           System.out.println(ex);
        }
        return false;
    }
    
}
