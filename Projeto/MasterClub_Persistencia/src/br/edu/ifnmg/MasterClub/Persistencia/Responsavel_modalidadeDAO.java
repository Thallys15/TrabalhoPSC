/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.MasterClub.Persistencia;

import br.edu.ifnmg.MasterClub.Entidades.Modalidade;
import br.edu.ifnmg.MasterClub.Entidades.Funcionario;
import br.edu.ifnmg.MasterClub.Entidades.ResponsavelModalidade;
import br.edu.ifnmg.MasterClub.Entidades.ResponsavelModalidadeRepositorio;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Igor Pereira
 */
public class Responsavel_modalidadeDAO extends DAOGenerico<ResponsavelModalidade> implements ResponsavelModalidadeRepositorio{

    private ModalidadeDAO modalidade;
    private FuncionarioDAO funcionario;
    public Responsavel_modalidadeDAO(){
        setConsultaAbrir("select id,cliente_id,dataVenda,valorTotal from vendas where id = ?");
        setConsultaApagar("DELETE FROM vendas WHERE id = ? ");
        setConsultaInserir("INSERT INTO vendas(cliente_id,dataVenda,valorTotal) VALUES(?,?,?)");
        setConsultaAlterar("UPDATE vendas SET cliente_id = ?, "
                        + "dataVenda = ?, valorTotal = ? "
                        + "WHERE id = ?");
        setConsultaBusca("select id,cliente_id,dataVenda,valorTotal from vendas ");
        setConsultaUltimoId("select max(id) from vendas where cliente_id = ? and dataVenda = ? and valorTotal = ?");
        funcionario = new FuncionarioDAO();
        modalidade = new ModalidadeDAO();
    
    }
    @Override
    protected ResponsavelModalidade preencheObjeto(ResultSet resultado) {
try {
            Funcionario tmp = new Funcionario();
            tmp.setCpf(resultado.getString(1) );
            tmp.setRg(resultado.getString(2)  );
            tmp.setCargo(resultado.getString(3)  );
            tmp.setIdade(resultado.getInt(5)  );
            tmp.setId(resultado.getInt(6)  );
            tmp.setQtdmodalidades( resultado.getBigDecimal(6) );
            
            tmp.setModalidades(carregaItens(tmp)  );            
            
        } catch (SQLException ex) {
            Logger.getLogger(Responsavel_modalidadeDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    @Override
    protected void preencheConsulta(PreparedStatement sql, ResponsavelModalidade obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected void preencheFiltros(ResponsavelModalidade filtro) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected void preencheParametros(PreparedStatement sql, ResponsavelModalidade filtro) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
     private List<ResponsavelModalidade> carregaItens(Funcionario obj){
        List<ResponsavelModalidade> ret = new ArrayList<>();
        String consulta = "select id, modalidade, funcionario, cordenador from responsavelmodalidade where modalidade = ?";
        try {
            PreparedStatement sql = conn.prepareStatement(consulta);
            
            sql.setInt(1, obj.getId());
            ResultSet resultado = sql.executeQuery();
            while(resultado.next()){
                ResponsavelModalidade item = new ResponsavelModalidade();
                
                item.setId(resultado.getInt(1));
                item.setFuncionario(2);
                item.setModalidade(modalidade.Abrir( resultado.getInt(3)  )   );
                item.setQtdModalidades(resultado.getInt(4)  );
                ret.add(item);
            }            
            
        
        } catch(SQLException ex){
            System.out.println(ex);
        }
        
        return ret;
    }
    
}
