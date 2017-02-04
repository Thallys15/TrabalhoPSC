/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.MasterClub.Persistencia;

import br.edu.ifnmg.MasterClub.Entidades.Clube;
import br.edu.ifnmg.MasterClub.Entidades.Patrocinio;
import br.edu.ifnmg.MasterClub.Entidades.PatrocinioRepositorio;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Igor Pereira
 */
public class PatrocinioDAO extends DAOGenerico<Patrocinio> implements PatrocinioRepositorio{
    
    public PatrocinioDAO(){
        setConsultaAbrir("select id, codigo, nome from patrocinio where id = ?");
        setConsultaApagar("delete from patrocinio where id = ?");
        setConsultaInserir("insert into patrocinio(codigo, nome) values(?,?)");
        setConsultaAlterar("update patrocinio set codigo = ?, nome = ? where id = ?");
        setConsultaBusca("select id, codigo, nome from patrocinio ");
    
    
    }

    @Override
    protected Patrocinio preencheObjeto(ResultSet resultado) {
        try {
            Patrocinio tmp = new Patrocinio();
            tmp.setId(resultado.getInt(1));
            tmp.setCodigo(resultado.getInt(2));
            tmp.setNome(resultado.getString(3));
            
            return tmp;
        } catch (SQLException ex) {
            Logger.getLogger(PatrocinioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    @Override
    protected void preencheConsulta(PreparedStatement sql, Patrocinio obj) {
        try {
            sql.setInt(1, obj.getCodigo());
            sql.setString(2, obj.getNome());
            if(obj.getId() > 0) sql.setInt(3, obj.getId());
        } catch (SQLException ex) {
            Logger.getLogger(PatrocinioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    protected void preencheFiltros(Patrocinio filtro) {
        if(filtro.getId()> 0 ) adicionarFiltro("id", "=");
        if(filtro.getCodigo()> 0) adicionarFiltro("codigo", " like ");
        if(filtro.getNome()!= null) adicionarFiltro("nome", " like ");
    }

    @Override
    protected void preencheParametros(PreparedStatement sql, Patrocinio filtro) {
        try {
            int cont = 1;
            if(filtro.getId()> 0){ sql.setInt(cont, filtro.getId()); cont++; }
            if(filtro.getCodigo()> 0 ){ sql.setInt(cont, filtro.getCodigo()); cont++; }
            if(filtro.getNome()!= null ){ sql.setString(cont, filtro.getNome()); cont++; }
                 
        } catch (SQLException ex) {
            Logger.getLogger(PatrocinioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
