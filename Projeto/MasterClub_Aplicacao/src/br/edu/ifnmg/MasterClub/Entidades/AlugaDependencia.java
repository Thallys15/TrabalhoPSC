/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.MasterClub.Entidades;

import java.util.Date;
import java.util.Objects;

/**
 *
 * @author tls15
 */
public class AlugaDependencia implements Entidade{
    public Clube clube;
    private Dependencia dependencia;
    private Date TempoAluguel;
    private int qtdDependencias;
    private int id;

    public AlugaDependencia() {
    }

    public AlugaDependencia(int id,Clube clube, Dependencia dependencia, Date TempoAluguel, int qtdDependencias) {
        this.id=id;
        this.clube = clube;
        this.dependencia = dependencia;
        this.TempoAluguel = TempoAluguel;
        this.qtdDependencias = qtdDependencias;
    }

    public AlugaDependencia(Clube clube, Dependencia dependencia, Date TempoAluguel, int qtdDependencias) {
        this.clube = clube;
        this.dependencia = dependencia;
        this.TempoAluguel = TempoAluguel;
        this.qtdDependencias = qtdDependencias;
    }

    public Clube getClube() {
        return clube;
    }

    public void setClube(Clube clube) {
        this.clube = clube;
    }

    public Dependencia getDependencia() {
        return dependencia;
    }

    public void setDependencia(Dependencia dependencia) {
        this.dependencia = dependencia;
    }

    public int getQtdDependencias() {
        return qtdDependencias;
    }

    public void setQtdDependencias(int qtdDependencias) {
        this.qtdDependencias = qtdDependencias;
    }
    

    public Date getTempoAluguel() {
        return TempoAluguel;
    }

    public void setTempoAluguel(Date TempoAluguel) {
        this.TempoAluguel = TempoAluguel;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 79 * hash + Objects.hashCode(this.clube);
        hash = 79 * hash + Objects.hashCode(this.dependencia);
        hash = 79 * hash + Objects.hashCode(this.TempoAluguel);
        hash = 79 * hash + this.qtdDependencias;
        hash = 79 * hash + this.id;
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
        if (this.qtdDependencias != other.qtdDependencias) {
            return false;
        }
        if (this.id != other.id) {
            return false;
        }
        if (!Objects.equals(this.clube, other.clube)) {
            return false;
        }
        if (!Objects.equals(this.dependencia, other.dependencia)) {
            return false;
        }
        if (!Objects.equals(this.TempoAluguel, other.TempoAluguel)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "AlugaDependencia{" + "clube=" + clube + ", dependencia=" + dependencia + ", TempoAluguel=" + TempoAluguel + ", qtdDependencias=" + qtdDependencias + ", id=" + id + '}';
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
