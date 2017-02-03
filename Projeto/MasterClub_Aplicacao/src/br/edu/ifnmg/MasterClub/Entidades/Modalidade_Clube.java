/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.MasterClub.Entidades;

import java.util.Objects;

/**
 *
 * @author Igor Pereira
 */
public class Modalidade_Clube implements Entidade{
    private int id;
    private Clube clube;
    private Modalidade modalidade;
    private int quantidadeClubes;
    
    public Modalidade_Clube(){
    }

    public Modalidade_Clube(int id, Clube clube, Modalidade modalidade, int quantidadeClubes) {
        this.id = id;
        this.clube = clube;
        this.modalidade = modalidade;
        this.quantidadeClubes = quantidadeClubes;
    }

    public Modalidade_Clube(Clube clube, Modalidade modalidade, int quantidadeClubes) {
        this.clube = clube;
        this.modalidade = modalidade;
        this.quantidadeClubes = quantidadeClubes;
    }

    public Clube getClube() {
        return clube;
    }

    public void setClube(Clube clube) {
        this.clube = clube;
    }

    public Modalidade getModalidade() {
        return modalidade;
    }

    public void setModalidade(Modalidade modalidade) {
        this.modalidade = modalidade;
    }

    public int getQuantidadeClubes() {
        return quantidadeClubes;
    }

    public void setQuantidadeClubes(int quantidadeClubes) {
        this.quantidadeClubes = quantidadeClubes;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 19 * hash + this.id;
        hash = 19 * hash + Objects.hashCode(this.clube);
        hash = 19 * hash + Objects.hashCode(this.modalidade);
        hash = 19 * hash + this.quantidadeClubes;
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
        final Modalidade_Clube other = (Modalidade_Clube) obj;
        if (this.id != other.id) {
            return false;
        }
        if (this.quantidadeClubes != other.quantidadeClubes) {
            return false;
        }
        if (!Objects.equals(this.clube, other.clube)) {
            return false;
        }
        if (!Objects.equals(this.modalidade, other.modalidade)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Modalidade_Clube{" + "id=" + id + ", clube=" + clube + ", modalidade=" + modalidade + ", quantidadeClubes=" + quantidadeClubes + '}';
    }

    @Override
    public int getId() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setId(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setClube(Participa obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
