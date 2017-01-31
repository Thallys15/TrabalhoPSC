/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.MasterClub.Persistencia;

import br.edu.ifnmg.MasterClub.Entidades.Endereco;
import br.edu.ifnmg.MasterClub.Entidades.EnderecoRepositorio;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Igor Pereira
 */
public class EnderecoDAO extends DAOGenerico<Endereco> implements EnderecoRepositorio{
    
    public EnderecoDAO() {
        setConsultaAbrir("select codigo, rua, bairro, numero, complemento, cidade, estado "
                + "from endereco where codigo = ?");
        setConsultaApagar("delete from endereco where codigo = ?");
        setConsultaAlterar("update endereco set rua = ?, bairro = ?, numero = ?, complemento = ?"
                + " cidade = ?, estado = ? where codigo = ?");
        setConsultaBusca("select codigo, rua, bairro, numero, complemento, cidade, estado from endereco ");
    }

    @Override
    protected Endereco preencheObjeto(ResultSet resultado) {
        try {
            Endereco tmp = new Endereco();
            tmp.setCodigo(resultado.getInt(1));
            tmp.setRua(resultado.getString(2));
            tmp.setBairro(resultado.getString(3));
            tmp.setNumero(resultado.getInt(4));
            tmp.setComplemento(resultado.getString(5));
            tmp.setCidade(resultado.getString(6));
            tmp.setEstado(resultado.getString(7));
            
            return tmp;
        } catch (SQLException ex) {
            Logger.getLogger(EnderecoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    @Override
    protected void preencheConsulta(PreparedStatement sql, Endereco obj) {
        try {
            sql.setString(1, obj.getRua());
            sql.setString(2, obj.getBairro());
            sql.setInt(3, obj.getNumero());
            sql.setString(4, obj.getComplemento());
            sql.setString(5, obj.getCidade());
            sql.setString(2, obj.getEstado());
            if(obj.getId() > 0) sql.setInt(3, obj.getId());
        } catch (SQLException ex) {
            Logger.getLogger(EnderecoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    protected void preencheFiltros(Endereco filtro) {
        if(filtro.getCodigo()> 0 ) adicionarFiltro("Codigo", "=");
        if(filtro.getRua()!= null) adicionarFiltro("Rua", " = ");
        if(filtro.getBairro()!= null) adicionarFiltro("Bairro", " = ");
        if(filtro.getNumero() > 0) adicionarFiltro("Numero", " = ");
        if(filtro.getComplemento()!= null) adicionarFiltro("Complemento", " = ");
        if(filtro.getCidade()!= null) adicionarFiltro("Cidade", " = ");
        if(filtro.getEstado()!= null) adicionarFiltro("Estado", " = ");
    }

    @Override
    protected void preencheParametros(PreparedStatement sql, Endereco filtro) {
        try  {
        int cont = 1;
        if(filtro.getCodigo()> 0 ) { sql.setInt(cont, filtro.getCodigo()); cont++; }
        if(filtro.getRua()!= null) { sql.setString(cont, filtro.getRua()); cont++;  }
        if(filtro.getBairro()!= null) { sql.setString(cont, filtro.getBairro()); cont++;  }
        if(filtro.getNumero() > 0) { sql.setInt(cont, filtro.getNumero()); cont++;  }
        if(filtro.getComplemento()!= null) { sql.setString(cont, filtro.getComplemento()); cont++;  }
        if(filtro.getCidade()!= null) { sql.setString(cont, filtro.getCidade()); cont++;  }
        if(filtro.getEstado()!= null) { sql.setString(cont, filtro.getEstado()); cont++;  }
        }
        catch(Exception ex) {}
    }
    
    
}
