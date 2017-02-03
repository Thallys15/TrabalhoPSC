/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.MasterClub.Persistencia;

import br.edu.ifnmg.MasterClub.Entidades.Clube;
import br.edu.ifnmg.MasterClub.Entidades.Financas;
import br.edu.ifnmg.MasterClub.Entidades.FinancasRepositorio;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Igor Pereira
 */
public class FinancasDAO extends DAOGenerico<Financas> implements FinancasRepositorio{
    
    public FinancasDAO(){
        setConsultaAbrir("select id, codigo, contratacoes, vendas, emprestimos from financas where id = ?");
        setConsultaApagar("delete from financas where id = ?");
        setConsultaInserir("insert into financas(contratacoes, vendas, emprestimos) values(?,?,?)");
        setConsultaAlterar("update financas set contratacoes = ?, vendas = ?, emprestimos = ? where id = ?");
        setConsultaBusca("select id, codigo, contratacoes, vendas, emprestimos from financas ");
    
    }

    @Override
    protected Financas preencheObjeto(ResultSet resultado) {
        try {
            Financas tmp = new Financas();
            tmp.setId(resultado.getInt(1));
            tmp.setContratacoes(resultado.getString(2));
            tmp.setVendas(resultado.getString(3));
            tmp.setEmprestimos(resultado.getString(4));
            
            return tmp;
        } catch (SQLException ex) {
            Logger.getLogger(FinancasDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    @Override
    protected void preencheConsulta(PreparedStatement sql, Financas obj) {
         try {
            sql.setInt(1, obj.getCodigo());
            sql.setString(2, obj.getContratacoes());
            sql.setString(3, obj.getVendas());
            sql.setString(4, obj.getEmprestimos());
            if(obj.getId() > 0) sql.setInt(5, obj.getId());
        } catch (SQLException ex) {
            Logger.getLogger(FinancasDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    protected void preencheFiltros(Financas filtro) {
        if(filtro.getId()> 0 ) adicionarFiltro("id", "=");
        if(filtro.getCodigo()> 0) adicionarFiltro("codigo", " like ");
        if(filtro.getContratacoes()!= null) adicionarFiltro("contratacoes", " like ");
        if(filtro.getVendas()!= null) adicionarFiltro("vendas", " like ");
        if(filtro.getEmprestimos()!= null) adicionarFiltro("emprestimos", " like ");
    }

    @Override
    protected void preencheParametros(PreparedStatement sql, Financas filtro) {
        try {
            int cont = 1;
            if(filtro.getId()> 0){ sql.setInt(cont, filtro.getId()); cont++; }
            if(filtro.getCodigo()> 0 ){ sql.setInt(cont, filtro.getCodigo()); cont++; }
            if(filtro.getContratacoes()!= null ){ sql.setString(cont, filtro.getContratacoes()); cont++; }
            if(filtro.getVendas()!= null ){ sql.setString(cont, filtro.getVendas()); cont++; }
            if(filtro.getEmprestimos()!= null ){ sql.setString(cont, filtro.getEmprestimos()); cont++; }
                 
        } catch (SQLException ex) {
            Logger.getLogger(FinancasDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
