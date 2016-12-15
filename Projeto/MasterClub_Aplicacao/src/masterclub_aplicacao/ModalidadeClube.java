/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package masterclub_aplicacao;

/**
 *
 * @author tls15
 */
public class ModalidadeClube {
    private int clube;
    private int modalidade;

    public ModalidadeClube(int clube, int modalidade) {
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

    public int getModalidade() {
        return modalidade;
    }

    public void setModalidade(int modalidade) {
        this.modalidade = modalidade;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + this.clube;
        hash = 29 * hash + this.modalidade;
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
        if (this.modalidade != other.modalidade) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ModalidadeClube{" + "clube=" + clube + ", modalidade=" + modalidade + '}';
    }
    
    
    
}
