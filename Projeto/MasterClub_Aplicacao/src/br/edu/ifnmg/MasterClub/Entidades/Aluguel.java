/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.MasterClub.Entidades;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author Igor
 */
public class Aluguel implements Entidade{

    private int id;
    private Clube clube;
    private Date dataAluguel;
    private BigDecimal valorTotalAluguel;
    private List<AlugaDependencia> dependencias;
    
    public Aluguel() {
        dependencias = new ArrayList<>();
    }

    public Aluguel(int id, Clube clube, Date dataAluguel, BigDecimal valorTotalAluguel) {
        this.id = id;
        this.clube = clube;
        this.dataAluguel = dataAluguel;
        this.valorTotalAluguel = valorTotalAluguel;
        dependencias = new ArrayList<>();
    }
    
    public void addItem(AlugaDependencia dependencia){
        if(!dependencias.contains(dependencia)) {
            dependencias.add(dependencia);
            this.valorTotalAluguel = this.valorTotalAluguel.add( 
                    dependencia.getDependencia().getCapacidade().multiply(  new BigDecimal
                        ( dependencia.getQtdDependencias())   )  );
        }
    }

    public void removeItem(AlugaDependencia dependencia){
        if(dependencias.contains(dependencia)){
            dependencias.remove(dependencia);
        this.valorTotalAluguel = this.valorTotalAluguel.subtract(
                    dependencia.getDependencia().getCapacidade().multiply(  new BigDecimal( dependencia.getQtdDependencias())   )  );
        }
    }
    
    @Override
    public int getId() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setId(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Clube getClube() {
        return clube;
    }

    public void setClube(Clube clube) {
        this.clube = clube;
    }

    public Date getDataAluguel() {
        return dataAluguel;
    }

    public void setDataAluguel(Date dataAluguel) {
        this.dataAluguel = dataAluguel;
    }

    public BigDecimal getValorTotalAluguel() {
        return valorTotalAluguel;
    }

    public void setValorTotalAluguel(BigDecimal valorTotalAluguel) {
        this.valorTotalAluguel = valorTotalAluguel;
    }

    public List<AlugaDependencia> getDependencias() {
        return dependencias;
    }

    public void setDependencias(List<AlugaDependencia> dependencias) {
        this.dependencias = dependencias;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 67 * hash + this.id;
        hash = 67 * hash + Objects.hashCode(this.clube);
        hash = 67 * hash + Objects.hashCode(this.dataAluguel);
        hash = 67 * hash + Objects.hashCode(this.valorTotalAluguel);
        hash = 67 * hash + Objects.hashCode(this.dependencias);
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
        final Aluguel other = (Aluguel) obj;
        if (this.id != other.id) {
            return false;
        }
        if (!Objects.equals(this.clube, other.clube)) {
            return false;
        }
        if (!Objects.equals(this.dataAluguel, other.dataAluguel)) {
            return false;
        }
        if (!Objects.equals(this.valorTotalAluguel, other.valorTotalAluguel)) {
            return false;
        }
        if (!Objects.equals(this.dependencias, other.dependencias)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Aluguel{" + "id=" + id + ", clube=" + clube + ", dataAluguel=" + dataAluguel + ", valorTotalAluguel=" + valorTotalAluguel + ", dependencias=" + dependencias + '}';
    }
    
    
}
