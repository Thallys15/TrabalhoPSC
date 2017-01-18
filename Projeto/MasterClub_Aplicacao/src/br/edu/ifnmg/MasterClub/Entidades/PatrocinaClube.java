/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.MasterClub.Entidades;

/**
 *
 * @author tls15
 */
public class PatrocinaClube {
    private int clube;
    private int patrocinio;

    public int getClube() {
        return clube;
    }

    public void setClube(int clube) {
        this.clube = clube;
    }

    public int getPatrocinio() {
        return patrocinio;
    }

    public void setPatrocinio(int patrocinio) {
        this.patrocinio = patrocinio;
    }

    public PatrocinaClube() {
    
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 53 * hash + this.clube;
        hash = 53 * hash + this.patrocinio;
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
        if (this.clube != other.clube) {
            return false;
        }
        if (this.patrocinio != other.patrocinio) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "PatrocinaClube{" + "clube=" + clube + ", patrocinio=" + patrocinio + '}';
    }
    
    
    
}
