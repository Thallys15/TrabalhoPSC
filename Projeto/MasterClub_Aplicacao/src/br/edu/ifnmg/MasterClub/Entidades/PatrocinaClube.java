/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.MasterClub.Entidades;

import java.util.Objects;

/**
 *
 * @author tls15
 */
public class PatrocinaClube implements Entidade{
    private int id;
    private Clube clube;
    private Patrocinio patrocinio;
    private int qtdpatrocinadores;

    public PatrocinaClube() {
    }

    public PatrocinaClube(int id, Clube clube, Patrocinio patrocinio, int qtdpatrocinadores) {
        this.id = id;
        this.clube = clube;
        this.patrocinio = patrocinio;
        this.qtdpatrocinadores = qtdpatrocinadores;
    }

    public PatrocinaClube(Clube clube, Patrocinio patrocinio, int qtdpatrocinadores) {
        this.clube = clube;
        this.patrocinio = patrocinio;
        this.qtdpatrocinadores = qtdpatrocinadores;
    }

    public int getQtdpatrocinadores() {
        return qtdpatrocinadores;
    }

    public void setQtdpatrocinadores(int qtdpatrocinadores) {
        this.qtdpatrocinadores = qtdpatrocinadores;
    }

    public Clube getClube() {
        return clube;
    }

    public void setClube(Clube clube) {
        this.clube = clube;
    }

    public Patrocinio getPatrocinio() {
        return patrocinio;
    }

    public void setPatrocinio(Patrocinio patrocinio) {
        this.patrocinio = patrocinio;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 17 * hash + this.id;
        hash = 17 * hash + Objects.hashCode(this.clube);
        hash = 17 * hash + Objects.hashCode(this.patrocinio);
        hash = 17 * hash + this.qtdpatrocinadores;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final PatrocinaClube other = (PatrocinaClube) obj;
        if (this.id != other.id) {
            return false;
        }
        if (this.qtdpatrocinadores != other.qtdpatrocinadores) {
            return false;
        }
        if (!Objects.equals(this.clube, other.clube)) {
            return false;
        }
        if (!Objects.equals(this.patrocinio, other.patrocinio)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "PatrocinaClube{" + "id=" + id + ", clube=" + clube + ", patrocinio=" + patrocinio + ", qtdpatrocinadores=" + qtdpatrocinadores + '}';
    }

    @Override
    public int getId() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setId(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setPatrocinio(Patrocinar obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
