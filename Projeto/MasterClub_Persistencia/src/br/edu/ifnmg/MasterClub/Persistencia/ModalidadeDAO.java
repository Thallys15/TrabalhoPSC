/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.MasterClub.Persistencia;

import br.edu.ifnmg.MasterClub.Entidades.ErroValidacao;
import br.edu.ifnmg.MasterClub.Entidades.Modalidade;
import br.edu.ifnmg.MasterClub.Entidades.ModalidadeRepositorio;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Igor Pereira
 */
public class ModalidadeDAO extends DAOGenerico<Modalidade> implements ModalidadeRepositorio{
      public ModalidadeDAO() {
        setConsultaAbrir("select codigo,nome,descricao from modalidade where codigo = ?");
        setConsultaApagar("delete from modalidade where codigo = ? ");
        setConsultaInserir("insert into modalidade(nome, descricao) values(?,?)");
        setConsultaAlterar("update modalidade set nome = ?, descricao = ? where codigo = ?");
        setConsultaBusca("select codigo,nome,descricao from modalidade ");
    }

    @Override
    protected Modalidade preencheObjeto(ResultSet resultado) {
               Modalidade tmp = new Modalidade();
        try {
            tmp.setCodigo(resultado.getInt(1));
        
                tmp.setNome(resultado.getString(2));
                tmp.setDescricao(resultado.getString(3));
         } catch (SQLException ex) {     
            Logger.getLogger(ModalidadeDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
                return tmp;
    }

    @Override
    protected void preencheConsulta(PreparedStatement sql, Modalidade obj) {
        try {
            sql.setString(1, obj.getNome());
            sql.setString(2, obj.getDescricao());            
            if(obj.getCodigo()> 0) sql.setInt(3,obj.getCodigo());
            
        } catch (SQLException ex) {
            Logger.getLogger(ModalidadeDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    protected void preencheFiltros(Modalidade filtro) {
         if(filtro.getCodigo()> 0) adicionarFiltro("codigo", "=");
        if(filtro.getNome() != null) adicionarFiltro("nome", " like ");
    }

    @Override
    protected void preencheParametros(PreparedStatement sql, Modalidade filtro) {
        try {
            int cont = 1;
            if(filtro.getDescricao() != null){ sql.setString(cont, filtro.getDescricao()); cont++; }
            if(filtro.getNome() != null ){ sql.setString(cont, filtro.getNome() +"%"); cont++; }
            if(filtro.getCodigo() > 0){ 
                sql.setInt(cont, filtro.getCodigo()); 
                cont++; 
            }
            
        
        } catch (SQLException ex) {
            Logger.getLogger(ModalidadeDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
