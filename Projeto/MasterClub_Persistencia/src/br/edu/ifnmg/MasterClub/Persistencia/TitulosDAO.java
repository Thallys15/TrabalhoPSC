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
       setConsultaInserir("insert into titulos(codigo, data_titulo)values(?,?)");
       setConsultaAlterar("update titulos set codigo = ?,data_titulo = ? where codigo = ?");
       setConsultaApagar("delete from titulos where codigo = ?");
       setConsultaAbrir("select codigo, data_titulo from titulos where codigo = ?");
    } 

    @Override
    protected Titulos preencheObjeto(ResultSet resultado) {
        try{
            Titulos tmp = new Titulos();
            tmp.setId(resultado.getInt(1));
            tmp.setCodigotitulo(resultado.getInt(2));
            tmp.setDatatitulo(resultado.getDate(2));
            return tmp;
        } catch(SQLException ex){
            System.out.println(ex);
        }
        return null;
    }

    @Override
    protected void preencheConsulta(PreparedStatement sql, Titulos obj) {
        try {
            sql.setInt(1, obj.getCodigotitulo());
            sql.setDate(2, new java.sql.Date(obj.getDatatitulo().getTime()));
            
            if(obj.getId() > 0) sql.setInt(3,obj.getId());
            
        } catch (SQLException ex) {
            Logger.getLogger(TitulosDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    protected void preencheFiltros(Titulos filtro) {
        if(filtro.getId() > 0) adicionarFiltro("id", "=");
        if(filtro.getCodigotitulo() > 0) adicionarFiltro("codigo_titulo", " like ");
        if(filtro.getDatatitulo()!= null) adicionarFiltro("data_titulo", "=");
    }

    @Override
    protected void preencheParametros(PreparedStatement sql, Titulos filtro) {
         try {
            int cont = 1;
            if(filtro.getId() > 0){ sql.setInt(cont, filtro.getId()); cont++; }
            if(filtro.getCodigotitulo() > 0 ){ sql.setInt(cont, filtro.getCodigotitulo()); cont++; }            
            if(filtro.getDatatitulo()!= null) { sql.setDate(cont, (Date) filtro.getDatatitulo()); cont++;  }
        
        } catch (SQLException ex) {
            Logger.getLogger(TitulosDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
