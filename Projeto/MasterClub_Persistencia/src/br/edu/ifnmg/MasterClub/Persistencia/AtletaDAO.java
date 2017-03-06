/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.MasterClub.Persistencia;

import br.edu.ifnmg.MasterClub.Entidades.Atleta;
import br.edu.ifnmg.MasterClub.Entidades.AtletaRepositorio;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Igor Pereira
 */
public class AtletaDAO extends DAOGenerico<Atleta> implements AtletaRepositorio{
    private ClubeDAO clube;
    public AtletaDAO(){
        setConsultaAbrir("select id, nome, posicao, lado, categoria, naturalidade, idade, altura, peso, cpf, rg, clube from atleta ");
        setConsultaApagar("delete from atleta where id = ?");
        setConsultaInserir("insert into atleta(nome,posicao, lado, categoria, naturalidade,idade, altura, peso, cpf, rg, clube)"
                + " values(?,?,?,?,?,?,?,?,?,?,?)");
        setConsultaAlterar("update  atleta set  nome = ?, posicao = ?, lado = ?, categoria = ?, naturalidade = ?, idade = ?, altura = ?, peso = ?, cpf = ?, rg = ?, clube = ? where id = ?");
        setConsultaBusca("select id, nome, posicao, lado, categoria, naturalidade, idade, altura, peso, cpf, rg, clube from atleta ");
        clube = new ClubeDAO();
    }

    @Override
    protected Atleta preencheObjeto(ResultSet resultado) {
        try {
            Atleta tmp = new Atleta();
            tmp.setId(resultado.getInt(1));
            tmp.setNome(resultado.getString(2));
            tmp.setPosicao(resultado.getString(3));
            tmp.setLado(resultado.getString(4));
            tmp.setCategoria(resultado.getString(5));
            tmp.setNaturalidade(resultado.getString(6));
            tmp.setIdade(resultado.getInt(7));
            tmp.setAltura(resultado.getDouble(8));
            tmp.setPeso(resultado.getDouble(9));
            tmp.setCpf(resultado.getString(10));
            tmp.setRg(resultado.getString(11));            
            tmp.setClube(resultado.getInt(12));
            return tmp;
        } catch (SQLException ex) {
            Logger.getLogger(AtletaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    @Override
    protected void preencheConsulta(PreparedStatement sql, Atleta obj) {
        try {
            sql.setString(1, obj.getNome());
            sql.setString(2, obj.getPosicao());
            sql.setString(3, obj.getLado());
            sql.setString(4, obj.getCategoria());
            sql.setString(5, obj.getNaturalidade());
            sql.setInt(6, obj.getIdade());
            sql.setDouble(7, obj.getAltura());
            sql.setDouble(8, obj.getPeso());
            sql.setString(9, obj.getCpf());
            sql.setString(10, obj.getRg());
            sql.setInt(11 , obj.getClube());
            if(obj.getId() > 0) sql.setInt(12, obj.getId());
        } catch (SQLException ex) {
            Logger.getLogger(AtletaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    protected void preencheFiltros(Atleta filtro) {
        if(filtro.getId() > 0 ) adicionarFiltro("id", "=");
        if(filtro.getNome()!= null) adicionarFiltro("nome", " = ");
        if(filtro.getPosicao()!= null) adicionarFiltro("posicao", " like ");
        if(filtro.getLado()!= null) adicionarFiltro("lado", " like ");
        if(filtro.getCategoria()!= null) adicionarFiltro("categoria", " like ");
        if(filtro.getNaturalidade()!= null) adicionarFiltro("naturalidade", " like ");
        if(filtro.getIdade() > 0) adicionarFiltro("categoria", " = ");
        if(filtro.getAltura() > 0) adicionarFiltro("altura", " = ");
        if(filtro.getPeso() > 0) adicionarFiltro("peso", " = ");
        if(filtro.getCpf()!= null) adicionarFiltro("cpf", " = ");
        if(filtro.getRg()!= null) adicionarFiltro("rg", " = ");        
        if(filtro.getClube() > 0) adicionarFiltro("clube", " = ");
    }

    @Override
    protected void preencheParametros(PreparedStatement sql, Atleta filtro) {
        try  {
        int cont = 1;
        if(filtro.getId() > 0 ) { sql.setInt(cont, filtro.getId()); cont++; }
        if(filtro.getNome()!= null) { sql.setString(cont, filtro.getNome()); cont++;  }
        if(filtro.getPosicao()!= null) { sql.setString(cont, filtro.getPosicao()); cont++;  }
        if(filtro.getLado()!= null) { sql.setString(cont, filtro.getLado()); cont++;  }
        if(filtro.getCategoria()!= null) { sql.setString(cont, filtro.getCategoria()); cont++;  }
        if(filtro.getNaturalidade()!= null) { sql.setString(cont, filtro.getNaturalidade()); cont++;  }
        if(filtro.getIdade()> 0) { sql.setInt(cont, filtro.getIdade()); cont++;  }
        if(filtro.getAltura() > 0) { sql.setDouble(cont, filtro.getAltura()); cont++;  }
        if(filtro.getPeso()> 0) { sql.setDouble(cont, filtro.getPeso()); cont++;  }
        if(filtro.getCpf()!= null) { sql.setString(cont, filtro.getCpf()); cont++;  }
        if(filtro.getRg()!= null) { sql.setString(cont, filtro.getRg()); cont++;  }        
        if(filtro.getClube()> 0) { sql.setInt(cont, filtro.getClube()); cont++;  }
        }
        catch(Exception ex) {}
    }

    
}
