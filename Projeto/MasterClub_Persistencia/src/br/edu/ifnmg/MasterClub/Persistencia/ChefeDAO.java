/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.MasterClub.Persistencia;

import br.edu.ifnmg.MasterClub.Entidades.Chefe;
import br.edu.ifnmg.MasterClub.Entidades.ChefeRepositorio;
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
public class ChefeDAO extends DAOGenerico<Chefe> implements ChefeRepositorio{
    public ChefeDAO(){
        setConsultaAbrir("select id, administracao from chefe where id = ?");
        setConsultaApagar("delete from chefe where id = ?");
        setConsultaInserir("insert into chefe(administracao) values(?)");
        setConsultaAlterar("update chefe set administracao = ? where id = ?");
        setConsultaBusca("select id, administracao from chefe ");
    
    }

    @Override
    protected Chefe preencheObjeto(ResultSet resultado) {
          try {
            Chefe tmp = new Chefe();
            tmp.setId(resultado.getInt(1));
            tmp.setAdministracao(resultado.getString(2));
            return tmp;
        } catch (SQLException ex) {
            Logger.getLogger(FuncionarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    @Override
    protected void preencheConsulta(PreparedStatement sql, Chefe obj) {
        try {
            sql.setString(1, obj.getAdministracao());
            if(obj.getId() > 0) sql.setInt(2, obj.getId());
        } catch (SQLException ex) {
            Logger.getLogger(FuncionarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    protected void preencheFiltros(Chefe filtro) {
        if(filtro.getId()> 0 ) adicionarFiltro("id", "=");
        if(filtro.getAdministracao()!= null) adicionarFiltro("nome", " like ");
    }

    @Override
    protected void preencheParametros(PreparedStatement sql, Chefe filtro) {
        try {
            int cont = 1;
            if(filtro.getId()> 0){ sql.setInt(cont, filtro.getId()); cont++; }
            if(filtro.getAdministracao()!= null ){ sql.setString(cont, filtro.getAdministracao()); cont++; }
                 
        } catch (SQLException ex) {
            Logger.getLogger(FuncionarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    
}
