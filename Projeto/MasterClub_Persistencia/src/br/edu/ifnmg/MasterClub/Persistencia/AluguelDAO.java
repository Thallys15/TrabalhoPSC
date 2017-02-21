/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.MasterClub.Persistencia;

import br.edu.ifnmg.MasterClub.Entidades.AlugaDependencia;
import br.edu.ifnmg.MasterClub.Entidades.Aluguel;
import br.edu.ifnmg.MasterClub.Entidades.AluguelRepositorio;
import br.edu.ifnmg.MasterClub.Entidades.Clube;
import br.edu.ifnmg.MasterClub.Entidades.Dependencia;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Igor
 */
public class AluguelDAO extends DAOGenerico<Aluguel> implements AluguelRepositorio{
    private DependenciaDAO dependencia;
    private ClubeDAO clube;
    
    public AluguelDAO() {
        setConsultaAbrir("select id,clube ,dataaluguel,valorTotalAluguel from aluguel where id = ?");
        setConsultaApagar("delete from aluguel where id = ? ");
        setConsultaInserir("insert into aluguel(clube,dataaluguel,valorTotalAluguel) values(?,?,?)");
        setConsultaAlterar("update aluguel set clube = ?, dataaluguel = ?, valorTotalAluguel = ? where id = ?");
        setConsultaBusca("select id,clube,dataaluguel,valorTotalAluguel from aluguel ");
        dependencia = new DependenciaDAO();
        clube = new ClubeDAO();
    }

    @Override
    protected Aluguel preencheObjeto(ResultSet resultado) {
        try {
            Aluguel tmp = new Aluguel();
            tmp.setId( resultado.getInt(1) );            
            tmp.setDataAluguel(resultado.getDate(3)  );
            tmp.setValorTotalAluguel(resultado.getBigDecimal(4) );
            
            tmp.setDependencias(carregaItens(tmp)  );
            
            return tmp;
            
        } catch (SQLException ex) {
            Logger.getLogger(AluguelDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    @Override
    protected void preencheConsulta(PreparedStatement sql, Aluguel obj) {
        try {
            sql.setInt(1, obj.getClube().getId());
            sql.setDate(2, new java.sql.Date( obj.getDataAluguel().getTime() ) );
            sql.setBigDecimal(3, obj.getValorTotalAluguel());
            if(obj.getId() > 0) sql.setInt(4, obj.getId());
        } catch (SQLException ex) {
            Logger.getLogger(AluguelDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    

    @Override
    protected void preencheFiltros(Aluguel filtro) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected void preencheParametros(PreparedStatement sql, Aluguel filtro) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    private List<AlugaDependencia> carregaItens(Aluguel obj){
        List<AlugaDependencia> ret = new ArrayList<>();
        String consulta = "select id, aluguel, dependencia, qtdDependencias from vendasitens where aluguel = ?";
        try {
            PreparedStatement sql = conn.prepareStatement(consulta);
            sql.setInt(1, obj.getId());
            ResultSet resultado = sql.executeQuery();                        
            while(resultado.next()){
                AlugaDependencia item = new AlugaDependencia();                
                item.setId(resultado.getInt(1));
                item.setQtdDependencias(resultado.getInt(2)  );
                ret.add(item);
            }            
            
        
        } catch(SQLException ex){
            System.out.println(ex);
        }
        
        return ret;
    }

}
