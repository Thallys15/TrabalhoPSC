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
    private Clube clube;
    private Patrocinio patrocinio;

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
        hash = 17 * hash + Objects.hashCode(this.clube);
        hash = 17 * hash + Objects.hashCode(this.patrocinio);
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
        return "PatrocinaClube{" + "clube=" + clube + ", patrocinio=" + patrocinio + '}';
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
