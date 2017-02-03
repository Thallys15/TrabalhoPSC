/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.MasterClub.Persistencia;

import br.edu.ifnmg.MasterClub.Entidades.Clube;
import br.edu.ifnmg.MasterClub.Entidades.ClubeRepositorio;
import br.edu.ifnmg.MasterClub.Entidades.Funcionario;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Igor Pereira
 */
public class ClubeDAO extends DAOGenerico<Clube> implements ClubeRepositorio{

    public ClubeDAO(){
        setConsultaAbrir("select id, cnpj, nome, quantidade from clube where id = ?");
        setConsultaApagar("delete from clube where id = ?");
        setConsultaInserir("insert into clube(cnpj, nome, quantidade) values(?,?,?)");
        setConsultaAlterar("update clube set cnpj = ?, nome = ?, quantidade = ? where id = ?");
        setConsultaBusca("select id, cnpj, nome, quantidade from clube ");
    
    
    }
    @Override
    protected Clube preencheObjeto(ResultSet resultado) {
        try {
            Clube tmp = new Clube();
            tmp.setId(resultado.getInt(1));
            tmp.setCnpj(resultado.getInt(2));
            tmp.setNome(resultado.getString(3));
            tmp.setQuantidade(resultado.getInt(4));
            
            return tmp;
        } catch (SQLException ex) {
            Logger.getLogger(ClubeDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    @Override
    protected void preencheConsulta(PreparedStatement sql, Clube obj) {
        try {
            sql.setInt(1, obj.getCnpj());
            sql.setString(2, obj.getNome());
            sql.setInt(3, obj.getQuantidade());
            if(obj.getId() > 0) sql.setInt(4, obj.getId());
        } catch (SQLException ex) {
            Logger.getLogger(ClubeDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    protected void preencheFiltros(Clube filtro) {
        if(filtro.getId()> 0 ) adicionarFiltro("id", "=");
        if(filtro.getCnpj() > 0) adicionarFiltro("cnpj", " like ");
        if(filtro.getNome()!= null) adicionarFiltro("nome", " like ");
        if(filtro.getQuantidade()> 0) adicionarFiltro("quantidade", " = ");
    }

    @Override
    protected void preencheParametros(PreparedStatement sql, Clube filtro) {
        try {
            int cont = 1;
            if(filtro.getId()> 0){ sql.setInt(cont, filtro.getId()); cont++; }
            if(filtro.getCnpj()> 0 ){ sql.setInt(cont, filtro.getCnpj()); cont++; }
            if(filtro.getNome()!= null ){ sql.setString(cont, filtro.getNome()); cont++; }
            if(filtro.getQuantidade()> 0 ){ sql.setInt(cont, filtro.getQuantidade()); cont++; }
                 
        } catch (SQLException ex) {
            Logger.getLogger(ClubeDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
