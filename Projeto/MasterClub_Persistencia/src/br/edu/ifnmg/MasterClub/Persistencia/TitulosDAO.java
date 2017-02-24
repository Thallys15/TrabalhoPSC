/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.MasterClub.Persistencia;

import br.edu.ifnmg.MasterClub.Entidades.Titulos;
import br.edu.ifnmg.MasterClub.Entidades.TitulosRepositorio;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Igor Pereira
 */
public class TitulosDAO extends DAOGenerico<Titulos> implements TitulosRepositorio{
    
    public TitulosDAO(){
       setConsultaInserir("insert into titulos(nome, data_titulo)values(?,?)");
       setConsultaAlterar("update titulos set id = ?, nome = ?,data_titulo = ? where id = ?");
       setConsultaApagar("delete from titulos where id = ?");
       setConsultaAbrir("select id, nome, data_titulo from titulos where id = ?");
    } 

    @Override
    protected Titulos preencheObjeto(ResultSet resultado) {
        try{
            Titulos tmp = new Titulos();
            tmp.setId(resultado.getInt(1));
            tmp.setNomeTorneio(resultado.getString(2));
            tmp.setDatatitulo(resultado.getDate(3));
            return tmp;
        } catch(SQLException ex){
            System.out.println(ex);
        }
        return null;
    }

    @Override
    protected void preencheConsulta(PreparedStatement sql, Titulos obj) {
        try {
            sql.setString(1, obj.getNomeTorneio());
            sql.setDate(2, new java.sql.Date(obj.getDatatitulo().getTime()));
            
            if(obj.getId() > 0) sql.setInt(3,obj.getId());
            
        } catch (SQLException ex) {
            Logger.getLogger(TitulosDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    protected void preencheFiltros(Titulos filtro) {
        if(filtro.getId() > 0) adicionarFiltro("id", "=");
        if(filtro.getNomeTorneio() != null) adicionarFiltro("nome", " like ");
        if(filtro.getDatatitulo()!= null) adicionarFiltro("data_titulo", "=");
    }

    @Override
    protected void preencheParametros(PreparedStatement sql, Titulos filtro) {
         try {
            int cont = 1;
            if(filtro.getId() > 0){ sql.setInt(cont, filtro.getId()); cont++; }
            if(filtro.getNomeTorneio() != null){ sql.setString(cont, filtro.getNomeTorneio()); cont++; }            
            if(filtro.getDatatitulo()!= null) { sql.setDate(cont, (Date) filtro.getDatatitulo()); cont++;  }
        
        } catch (SQLException ex) {
            Logger.getLogger(TitulosDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
