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
        setConsultaAbrir("select id, nome, valor from patrocinio where id = ?");
        setConsultaApagar("delete from patrocinio where id = ?");
        setConsultaInserir("insert into patrocinio(nome,valor) values(?,?)");
        setConsultaAlterar("update patrocinio set nome = ?, valor = ? where id = ?");
        setConsultaBusca("select id, nome, valor from patrocinio ");
    
    
    }

    @Override
    protected Patrocinio preencheObjeto(ResultSet resultado) {
        try {
            Patrocinio tmp = new Patrocinio();
            tmp.setId(resultado.getInt(1));
            tmp.setNome(resultado.getString(2));
            tmp.setValorPatrocinio(resultado.getBigDecimal(3));
            return tmp;
        } catch (SQLException ex) {
            Logger.getLogger(PatrocinioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    @Override
    protected void preencheConsulta(PreparedStatement sql, Patrocinio obj) {
        try {
            sql.setString(1, obj.getNome());
            sql.setBigDecimal(2, obj.getValorPatrocinio());
            if(obj.getId() > 0) sql.setInt(3, obj.getId());
        } catch (SQLException ex) {
            Logger.getLogger(PatrocinioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    protected void preencheFiltros(Patrocinio filtro) {
        if(filtro.getId()> 0 ) adicionarFiltro("id", "=");
        if(filtro.getNome()!= null) adicionarFiltro("nome", " like ");
        if(filtro.getValorPatrocinio() != null) adicionarFiltro("valor", " like ");
    }

    @Override
    protected void preencheParametros(PreparedStatement sql, Patrocinio filtro) {
        try {
            int cont = 1;
            if(filtro.getId()> 0){ sql.setInt(cont, filtro.getId()); cont++; }
            if(filtro.getNome()!= null ){ sql.setString(cont, filtro.getNome()); cont++; }
            if(filtro.getValorPatrocinio() != null ){ sql.setBigDecimal(cont, filtro.getValorPatrocinio()); cont++; }
                 
        } catch (SQLException ex) {
            Logger.getLogger(PatrocinioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
