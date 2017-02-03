/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.MasterClub.Persistencia;

import br.edu.ifnmg.MasterClub.Entidades.Modalidade_Clube;
import br.edu.ifnmg.MasterClub.Entidades.Participa;
import br.edu.ifnmg.MasterClub.Entidades.ParticipaRepositorio;
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
public class ParticipaDAO extends DAOGenerico<Participa> implements ParticipaRepositorio{
    private ModalidadeDAO modalidade;
    private ClubeDAO clube;

    public ParticipaDAO() {
        setConsultaAbrir("select id,modalidade,valorpagoamodalidade from partcipa where id = ?");
        setConsultaApagar("delete from participa where id = ? ");
        setConsultaInserir("insert into participa(modalidade,valorpagoamodalidade) values(?,?)");
        setConsultaAlterar("update participa set modalidade = ?, valorpagoamodalidade = ? where id = ?");
        setConsultaBusca("select id,modalidade,valorpagoamodalidade from participa ");
        modalidade = new ModalidadeDAO();
        clube = new ClubeDAO();
    }
    

    @Override
    protected Participa preencheObjeto(ResultSet resultado) {
        try {
            Participa tmp = new Participa();
            tmp.setId( resultado.getInt(1) );                       
            tmp.setValorPagoaModalidade(resultado.getBigDecimal(2) );            
            tmp.setModalidades(carregaItens(tmp)  );
            
            return tmp;
            
        } catch (SQLException ex) {
            Logger.getLogger(ParticipaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    @Override
    protected void preencheConsulta(PreparedStatement sql, Participa obj) {
        try {
            sql.setInt(1, obj.getModalidade().getId());
            sql.setBigDecimal(2, obj.getValorPagoaModalidade());
            if(obj.getId() > 0) sql.setInt(3, obj.getId());
        } catch (SQLException ex) {
            Logger.getLogger(ParticipaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    protected void preencheFiltros(Participa filtro) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected void preencheParametros(PreparedStatement sql, Participa filtro) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    private List<Modalidade_Clube> carregaItens(Participa obj){
        List<Modalidade_Clube> ret = new ArrayList<>();
        String consulta = "select id, participa, clube, qtdclubes from modalidade_clube where participa = ?";
        try {            
            PreparedStatement sql = conn.prepareStatement(consulta);
            sql.setInt(1, obj.getId());
            ResultSet resultado = sql.executeQuery();                        
            while(resultado.next()){
                Modalidade_Clube modalidade = new Modalidade_Clube();
                
                modalidade.setId(resultado.getInt(1));
                modalidade.setQuantidadeClubes(resultado.getInt(3)  );
                ret.add(modalidade);
            }            
            
        
        } catch(SQLException ex){
            System.out.println(ex);
        }
        
        return ret;
    }
}
