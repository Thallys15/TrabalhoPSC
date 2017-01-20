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
public class ModalidadeClube implements Entidade{
    private int clube;
    private Modalidade modalidade;

    public ModalidadeClube(int clube, Modalidade modalidade) {
        this.clube = clube;
        this.modalidade = modalidade;
    }

    public ModalidadeClube() {
    }

    public int getClube() {
        return clube;
    }

    public void setClube(int clube) {
        this.clube = clube;
    }

    public Modalidade getModalidade() {
        return modalidade;
    }

    

    public void setModalidade(Modalidade modalidade) {
        this.modalidade = modalidade;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 17 * hash + this.clube;
        hash = 17 * hash + Objects.hashCode(this.modalidade);
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
        final ModalidadeClube other = (ModalidadeClube) obj;
        if (this.clube != other.clube) {
            return false;
        }
        if (!Objects.equals(this.modalidade, other.modalidade)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ModalidadeClube{" + "clube=" + clube + ", modalidade=" + modalidade + '}';
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
