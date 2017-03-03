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
       setConsultaInserir("insert into titulos(nome, data_inicio, data_termino)values(?,?,?)");
       setConsultaAlterar("update titulos set nome = ?,data_inicio = ?, data_termino = ? where id = ?");
       setConsultaApagar("delete from titulos where id = ?");
       setConsultaAbrir("select id, nome, data_inicio, data_termino from titulos where id = ?");
       setConsultaBusca("select id, nome, data_inicio, data_termino from titulos ");
    } 

    @Override
    protected Titulos preencheObjeto(ResultSet resultado) {
        try{
            Titulos tmp = new Titulos();
            tmp.setId(resultado.getInt(1));
            tmp.setNomeTorneio(resultado.getString(2));
            tmp.setDatainicio(resultado.getDate(3));
            tmp.setDataTermino(resultado.getDate(4));
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
            sql.setDate(2, new java.sql.Date(obj.getDatainicio().getTime()));
            sql.setDate(3, new java.sql.Date(obj.getDataTermino().getTime()));
            
            if(obj.getId() > 0) sql.setInt(4,obj.getId());
            
        } catch (SQLException ex) {
            Logger.getLogger(TitulosDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    protected void preencheFiltros(Titulos filtro) {
        if(filtro.getId() > 0) adicionarFiltro("id", "=");
        if(filtro.getNomeTorneio() != null) adicionarFiltro("nome", " like ");
        if(filtro.getDatainicio()!= null) adicionarFiltro("data_inicio", "=");
        if(filtro.getDataTermino()!= null) adicionarFiltro("data_termino", "=");
    }

    @Override
    protected void preencheParametros(PreparedStatement sql, Titulos filtro) {
         try {
            int cont = 1;
            if(filtro.getId() > 0){ sql.setInt(cont, filtro.getId()); cont++; }
            if(filtro.getNomeTorneio() != null){ sql.setString(cont, filtro.getNomeTorneio()); cont++; }            
            if(filtro.getDatainicio()!= null) { sql.setDate(cont, (Date) filtro.getDatainicio()); cont++;  }
            if(filtro.getDataTermino()!= null) { sql.setDate(cont, (Date) filtro.getDataTermino()); cont++;  }
        
        } catch (SQLException ex) {
            Logger.getLogger(TitulosDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
