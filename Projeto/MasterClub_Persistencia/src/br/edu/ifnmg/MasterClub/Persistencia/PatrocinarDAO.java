/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.MasterClub.Persistencia;

import br.edu.ifnmg.MasterClub.Entidades.PatrocinaClube;
import br.edu.ifnmg.MasterClub.Entidades.Patrocinar;
import br.edu.ifnmg.MasterClub.Entidades.Patrocinio;
import br.edu.ifnmg.MasterClub.Entidades.PatrocinioRepositorio;
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
public class PatrocinarDAO extends DAOGenerico<Patrocinio> implements PatrocinioRepositorio{
    
    private PatrocinioDAO patrocinio;
    private ClubeDAO clube;
    
    public PatrocinarDAO() {
        setConsultaAbrir("select id, patrocinio, clube, valorpatrocinio from patrocinar where id = ?");
        setConsultaApagar("delete from patrocinar where id = ? ");
        setConsultaInserir("insert into participa(patrocinio,valorpatrocinio) values(?,?)");
        setConsultaAlterar("update patrocinar set patrocinio = ?, valorpatrocinio = ? where id = ?");
        setConsultaBusca("select id,patrocinio,valorpatrocinio from patrocinar ");
        patrocinio = new PatrocinioDAO();
        clube = new ClubeDAO();
    }
    
    @Override
    protected Patrocinio preencheObjeto(ResultSet resultado) {
          try {
            Patrocinar tmp = new Patrocinar();
            tmp.setId( resultado.getInt(1) );
            tmp.setValorPatrocinio(resultado.getBigDecimal(2) );
            tmp.setNome(resultado.getString(3) );
            tmp.setPatrocinios(carregaItens(tmp)  );            
            
        } catch (SQLException ex) {
            Logger.getLogger(PatrocinarDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    @Override
    protected void preencheConsulta(PreparedStatement sql, Patrocinio obj) {
        try {
            sql.setString(1, obj.getNome());
            sql.setBigDecimal(2, obj.getValorPatrocinio());
            if(obj.getId() > 0) sql.setInt(3, obj.getId());
        } catch (SQLException ex) {
            Logger.getLogger(PatrocinarDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    protected void preencheFiltros(Patrocinio filtro) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected void preencheParametros(PreparedStatement sql, Patrocinio filtro) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    private List<PatrocinaClube> carregaItens(Patrocinar obj){
        List<PatrocinaClube> ret = new ArrayList<>();
        String consulta = "select id, patrocinar, patrocinio from patrocina_clube where venda_id = ?";
        try {
            PreparedStatement sql = conn.prepareStatement(consulta);            
            sql.setInt(1, obj.getId());
            ResultSet resultado = sql.executeQuery();                        
            while(resultado.next()){
                PatrocinaClube item = new PatrocinaClube();
                
                item.setId(resultado.getInt(1));
                item.setQtdpatrocinadores(resultado.getInt(2)  );
                ret.add(item);
            }            
            
        
        } catch(SQLException ex){
            System.out.println(ex);
        }
        
        return ret;
    }
    
}
