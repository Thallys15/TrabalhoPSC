/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.MasterClub.Persistencia;

import br.edu.ifnmg.MasterClub.Entidades.Entidade;
import br.edu.ifnmg.MasterClub.Entidades.Repositorio;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Igor Pereira
 * @param <T>
 */
public abstract class DAOGenerico<T extends Entidade> implements Repositorio<T> {
    
    protected Connection conn;
    
    private String consultaAbrir;
    private String consultaApagar;
    private String consultaInserir;
    private String consultaAlterar;
    private String consultaBusca;
    private String consultaUltimoId;
    
    private String where ="";
    
     public DAOGenerico() {
        try {
            DB.Iniciar();
            conn = ConnectionFactory.getConnection();
        } catch (ClassNotFoundException ex) {
            System.out.println("Driver não encontrado!");
        
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }
    protected abstract T preencheObjeto(ResultSet resultado);

    protected abstract void preencheConsulta(PreparedStatement sql, T obj);

    protected abstract void preencheFiltros(T filtro);

    protected abstract void preencheParametros(PreparedStatement sql, T filtro);
    
    @Override
    public boolean Salvar(T obj) {
        try {
            if (obj.getId() == 0) {
                
                PreparedStatement sql = conn.prepareStatement(getConsultaInserir());
                preencheConsulta(sql, obj);
                sql.executeUpdate();
                PreparedStatement sql2 = conn.prepareStatement(getConsultaUltimoId());
                preencheConsulta(sql2, obj);
                ResultSet resultado = sql2.executeQuery();
                
                if (resultado.next()) {
                    
                    obj.setId( resultado.getInt(1) );
                    
                }

            } else {
                PreparedStatement sql = conn.prepareStatement(getConsultaAlterar());
                preencheConsulta(sql, obj);
                sql.executeUpdate();

            }
            return true;

        } catch (SQLException e) {
            
            System.out.print(e);

        }
        return false;
    }
    
    @Override
    public boolean Apagar(T obj) {
        try {
            if (obj.getId() > 0) {
     
                PreparedStatement sql = conn.prepareStatement(consultaApagar);
                sql.setInt(1, obj.getId());
                sql.executeUpdate();

            }

            return true;

        } catch (SQLException e) {
            
            System.out.print(e);

        }
        return false;
    }
    
    @Override
    public boolean Alterar(T obj) {
        try {
            PreparedStatement sql = conn.prepareStatement(consultaAlterar);
            preencheConsulta(sql, obj);
            sql.executeUpdate();
            return true;
        } catch (SQLException ex) {
            System.out.println(ex + "erro ao alterar");
        }
        return false;
    }
    
    @Override
    public List<T> Abrir() {
         List<T> tudo = new ArrayList<>();
        try {
            PreparedStatement sql = conn.prepareStatement(getConsultaAbrir());
            ResultSet resultado = sql.executeQuery();
            
            while(resultado.next()){
                T tmp = preencheObjeto(resultado);
                tudo.add(tmp); 
            }
          
        } catch (SQLException ex) {
            System.out.println(ex + "Abrir");
        }
        return tudo;
    }

    @Override
    public List<T> Buscar(T filtro) {
        List<T> ret = new ArrayList<>();

        if(filtro != null){
            preencheFiltros(filtro);

            if (where.length() > 0) {
                where = "WHERE " + where;
            }
        }

        try {
            PreparedStatement sql = conn.prepareStatement(getConsultaBusca() + where);

            if(filtro != null)
                preencheParametros(sql, filtro);
            ResultSet resultado = sql.executeQuery();
            while (resultado.next()) {

                T tmp = preencheObjeto(resultado);
                ret.add(tmp);
            }

        } catch (SQLException ex) {
            System.out.println(ex);
        }
        where = "";
        return ret;
    }
    protected void adicionarFiltro(String campo, String operador) {
        if (where.length() > 0) {
            where = where + " and ";
        }

        where = where + campo + " " + operador + " ?";
    }

    public String getConsultaAbrir() {
        return consultaAbrir;
    }

    public void setConsultaAbrir(String consultaAbrir) {
        this.consultaAbrir = consultaAbrir;
    }

    public String getConsultaApagar() {
        return consultaApagar;
    }

    public void setConsultaApagar(String consultaApagar) {
        this.consultaApagar = consultaApagar;
    }

    public String getConsultaInserir() {
        return consultaInserir;
    }

    public void setConsultaInserir(String consultaInserir) {
        this.consultaInserir = consultaInserir;
    }

    public String getConsultaAlterar() {
        return consultaAlterar;
    }

    public void setConsultaAlterar(String consultaAlterar) {
        this.consultaAlterar = consultaAlterar;
    }

    public String getConsultaBusca() {
        return consultaBusca;
    }

    public void setConsultaBusca(String consultaBusca) {
        this.consultaBusca = consultaBusca;
    }

    public String getConsultaUltimoId() {
        return consultaUltimoId;
    }

    public void setConsultaUltimoId(String consultaUltimoId) {
        this.consultaUltimoId = consultaUltimoId;
    }
    
}
