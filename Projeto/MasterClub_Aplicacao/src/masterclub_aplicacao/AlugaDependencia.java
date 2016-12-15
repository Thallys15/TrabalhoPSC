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
public class AlugaDependencia {
    public int clube;
    private int dependencia;
    private Date TempoAluguel;

    public int getClube() {
        return clube;
    }

    public void setClube(int clube) {
        this.clube = clube;
    }

    public int getDependencia() {
        return dependencia;
    }

    public void setDependencia(int dependencia) {
        this.dependencia = dependencia;
    }

    public Date getTempoAluguel() {
        return TempoAluguel;
    }

    public void setTempoAluguel(Date TempoAluguel) {
        this.TempoAluguel = TempoAluguel;
    }

    public AlugaDependencia() {
    }

    public AlugaDependencia(int clube, int dependencia, Date TempoAluguel) {
        this.clube = clube;
        this.dependencia = dependencia;
        this.TempoAluguel = TempoAluguel;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 13 * hash + this.clube;
        hash = 13 * hash + this.dependencia;
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
        final AlugaDependencia other = (AlugaDependencia) obj;
        if (this.clube != other.clube) {
            return false;
        }
        if (this.dependencia != other.dependencia) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "AlugaDependencia{" + "clube=" + clube + ", dependencia=" + dependencia + ", TempoAluguel=" + TempoAluguel + '}';
    }
    
    
    
}
