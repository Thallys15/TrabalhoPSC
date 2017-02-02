/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.MasterClub.Persistencia;

import br.edu.ifnmg.MasterClub.Entidades.Contrato;
import br.edu.ifnmg.MasterClub.Entidades.ContratoRepositorio;
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
public class ContratoDAO extends DAOGenerico<Contrato> implements ContratoRepositorio{

    public ContratoDAO() {
        setConsultaAbrir("select id, data_inicio, data_termino, recisao, renovacao, salario from contrato where id = ?");
        setConsultaApagar("delete from contrato where id = ?");
        setConsultaInserir("insert into contrato(data_inicio, data_termino, recisao, salario) values(?,?,?,?)");
        setConsultaBusca("select id, data_inicio, data_termino, recisao, salario from contrato ");
    }
    
    @Override
    protected Contrato preencheObjeto(ResultSet resultado) {
        try {
            Contrato tmp = new Contrato();
            tmp.setId(resultado.getInt(1));
            tmp.setDate_inicio(resultado.getDate(2));
            tmp.setDate_termino(resultado.getDate(3));
            tmp.setRenovacao(resultado.getInt(4));
            tmp.setRecisao(resultado.getString(5));
            tmp.setSalario(resultado.getDouble(6));
            
            return tmp;
        } catch (SQLException ex) {
            Logger.getLogger(ContratoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    @Override
    protected void preencheConsulta(PreparedStatement sql, Contrato obj) {
        try {
            sql.setDate(1, (Date) obj.getDate_inicio());
            sql.setDate(2, (Date) obj.getDate_termino());
            sql.setInt(3, obj.getRenovacao());
            sql.setString(3, obj.getRecisao());
            sql.setDouble(3, obj.getSalario());
            if(obj.getId() > 0) sql.setInt(3, obj.getId());
        } catch (SQLException ex) {
            Logger.getLogger(ContratoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    protected void preencheFiltros(Contrato filtro) {
        if(filtro.getId() > 0 ) adicionarFiltro("id", "=");
        if(filtro.getDate_inicio()!= null) adicionarFiltro("data de inicio", " like ");
        if(filtro.getDate_termino()!= null) adicionarFiltro("data de termino", " = ");
        if(filtro.getRenovacao() > 0) adicionarFiltro("nº de anos de renovacao", " = ");
        if(filtro.getRecisao()!= null) adicionarFiltro("Recisao", " = ");
        if(filtro.getSalario() > 0) adicionarFiltro("salario", " = ");
    }

    @Override
    protected void preencheParametros(PreparedStatement sql, Contrato filtro) {
        try  {
        int cont = 1;
        if(filtro.getId() > 0 ) { sql.setInt(cont, filtro.getId()); cont++; }
        if(filtro.getDate_inicio()!= null) { sql.setDate(cont, (Date) filtro.getDate_inicio()); cont++;  }
        if(filtro.getDate_termino()!= null) { sql.setDate(cont, (Date) filtro.getDate_termino()); cont++;  }
        if(filtro.getRenovacao()> 0) { sql.setInt(cont, filtro.getRenovacao()); cont++;  }
        if(filtro.getRecisao()!=null) { sql.setString(cont, filtro.getRecisao()); cont++;  }
        if(filtro.getSalario()>0) { sql.setDouble(cont, filtro.getSalario()); cont++;  }
        }
        catch(Exception ex) {}
    }
    
}
