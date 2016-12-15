/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package masterclub_aplicacao;

import java.util.Date;

/**
 *
 * @author tls15
 */
public class Titulos {
    private int codigotitulo;
    private Date datatitulo;

    public Titulos() {
    }

    public int getCodigotitulo() {
        return codigotitulo;
    }

    public void setCodigotitulo(int codigotitulo) {
        this.codigotitulo = codigotitulo;
    }

    public Date getDatatitulo() {
        return datatitulo;
    }

    public void setDatatitulo(Date datatitulo) {
        this.datatitulo = datatitulo;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 37 * hash + this.codigotitulo;
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
        final Titulos other = (Titulos) obj;
        if (this.codigotitulo != other.codigotitulo) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Titulos{" + "codigotitulo=" + codigotitulo + ", datatitulo=" + datatitulo + '}';
    }
    
    
}
