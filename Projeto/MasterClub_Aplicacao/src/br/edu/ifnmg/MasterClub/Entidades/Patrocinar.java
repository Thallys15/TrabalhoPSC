/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.MasterClub.Entidades;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Igor Pereira
 */
public class Patrocinar implements Entidade{
    private int codigo;
    private Patrocinio patrocinio;
    private String nome;
    private List<PatrocinaClube>patrocinios;
    private BigDecimal valorPatrocinio;
    
    public Patrocinar(){
    patrocinios = new ArrayList<>();
    
    }

    public Patrocinar(int codigo, String nome, BigDecimal valorPatrocinio) {
        this.codigo = codigo;
        this.nome = nome;
        this.valorPatrocinio = valorPatrocinio;
        patrocinios = new ArrayList<>();
    }
    
    public void addPatrocinador(PatrocinaClube patrocinio){
        if(!patrocinios.contains(patrocinio)) {
            patrocinios.add(patrocinio);
            this.valorPatrocinio = this.valorPatrocinio.add( 
                    patrocinio.getPatrocinio().getValorPatrocinio().multiply
                        (  new BigDecimal( patrocinio.getQtdpatrocinadores())   )  );
        }
    }
    
    public void removePatrocinador(PatrocinaClube patrocinio){
        if(patrocinios.contains(patrocinio)){
            patrocinios.remove(patrocinio);
        this.valorPatrocinio = this.valorPatrocinio.subtract(
                    patrocinio.getPatrocinio().getValorPatrocinio().multiply
                        (  new BigDecimal( patrocinio.getQtdpatrocinadores())   )  );
        }
    }

    public Patrocinio getPatrocinio() {
        return patrocinio;
    }

    public void setPatrocinio(Patrocinio patrocinio) {
        this.patrocinio = patrocinio;
    }
    
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<PatrocinaClube> getPatrocinios() {
        return patrocinios;
    }

    public void setPatrocinios(List<PatrocinaClube> patrocinios) {
        this.patrocinios = patrocinios;
    }

    public BigDecimal getValorPatrocinio() {
        return valorPatrocinio;
    }

    public void setValorPatrocinio(BigDecimal valorPatrocinio) {
        this.valorPatrocinio = valorPatrocinio;
    }
    
    @Override
    public int getId() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setId(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
