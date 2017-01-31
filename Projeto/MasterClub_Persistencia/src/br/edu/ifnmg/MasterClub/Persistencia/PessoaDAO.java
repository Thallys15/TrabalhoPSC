/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.MasterClub.Persistencia;

import br.edu.ifnmg.MasterClub.Entidades.Pessoa;
import br.edu.ifnmg.MasterClub.Entidades.PessoaRepositorio;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Ior Pereira
 */
public class PessoaDAO extends DAOGenerico<Pessoa>implements PessoaRepositorio{
    public PessoaDAO(){
        setConsultaAbrir("select codigo,nome from pessoa where codigo = ?");
        setConsultaApagar("DELETE FROM pessoa WHERE codigo = ? ");
        setConsultaInserir("INSERT INTO clientes(nome) VALUES(?)");
        setConsultaAlterar("UPDATE pessoa SET nome = ?, "
                        + "WHERE codigo = ?");
    
    }

    @Override
    protected Pessoa preencheObjeto(ResultSet resultado) {
        Pessoa tmp = new Pessoa();
         try {
            tmp.setId(resultado.getInt(1));
        
                tmp.setNome(resultado.getString(2));
         } catch (SQLException ex) {
            Logger.getLogger(PessoaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
                // Retorna o objeto
                return tmp;
    }

    @Override
    protected void preencheConsulta(PreparedStatement sql, Pessoa obj) {
        try {
            // Passa os parâmetros para a consulta SQL
            sql.setString(1, obj.getNome());
            
            if(obj.getId() > 0) sql.setInt(4,obj.getId());
            
        } catch (SQLException ex) {
            Logger.getLogger(PessoaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    protected void preencheFiltros(Pessoa filtro) {
        if(filtro.getCodigo()> 0) adicionarFiltro("codigo", "=");
    }

    @Override
    protected void preencheParametros(PreparedStatement sql, Pessoa filtro) {
        try {
            int cont = 1;
            if(filtro.getCodigo()> 0){ sql.setInt(cont, filtro.getCodigo()); cont++; }
            if(filtro.getNome() != null ){ sql.setString(cont, filtro.getNome()+"%"); cont++; }
            } catch (SQLException e) {
            Logger.getLogger(PessoaDAO.class.getName()).log(Level.SEVERE, null, e);
        }
    }
    
}
