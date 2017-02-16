/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.MasterClub.Persistencia;

import br.edu.ifnmg.MasterClub.Entidades.Dependencia;
import br.edu.ifnmg.MasterClub.Entidades.DependenciaRepositorio;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Igor
 */
public class DependenciaDAO extends DAOGenerico<Dependencia> implements DependenciaRepositorio{
    
    public DependenciaDAO() {
        setConsultaAbrir("select id, nome, capacidade from dependencia where id = ?");
        setConsultaApagar("delete from dependencia where id = ?");
        setConsultaInserir("insert into dependencia(nome,capacidade) values(?,?)");
        setConsultaAlterar("update dependencia set nome = ?, capacidade = ? where id = ?");
        setConsultaBusca("select id, nome, capacidade from dependencia ");        
    }

    @Override
    protected Dependencia preencheObjeto(ResultSet resultado) {
        try {
            Dependencia tmp = new Dependencia();
            tmp.setId(resultado.getInt(1));
            tmp.setNome(resultado.getString(2));
            tmp.setCapacidade(resultado.getBigDecimal(3));
            
            return tmp;
        } catch (SQLException ex) {
            Logger.getLogger(DependenciaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    @Override
    protected void preencheConsulta(PreparedStatement sql, Dependencia obj) {
        try {
            sql.setString(1, obj.getNome());
            sql.setBigDecimal(2, obj.getCapacidade());
            if(obj.getId() > 0) sql.setInt(3, obj.getId());
        } catch (SQLException ex) {
            Logger.getLogger(DependenciaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    protected void preencheFiltros(Dependencia filtro) {
        if(filtro.getId() > 0 ) adicionarFiltro("id", "=");
        if(filtro.getNome() != null) adicionarFiltro("nome", " like ");
        if(filtro.getCapacidade()!= null) adicionarFiltro("capacidade", " = ");
    }

    @Override
    protected void preencheParametros(PreparedStatement sql, Dependencia filtro) {
        try  {
        int cont = 1;
        if(filtro.getId() > 0 ) { sql.setInt(cont, filtro.getId()); cont++; }
        if(filtro.getNome() != null) { sql.setString(cont, filtro.getNome()); cont++;  }
        if(filtro.getCapacidade()!= null) { sql.setBigDecimal(cont, filtro.getCapacidade()); cont++;  }
        }
        catch(Exception ex) {}
    }
    
}
