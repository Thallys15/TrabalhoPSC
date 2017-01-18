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
public class ResponsavelModalidade {
    private int modalidade;
    private int funcionario;
    private String coordenador;

    public ResponsavelModalidade() {
    }

    public ResponsavelModalidade(int modalidade, int funcionario, String coordenador) {
        this.modalidade = modalidade;
        this.funcionario = funcionario;
        this.coordenador = coordenador;
    }

    public int getModalidade() {
        return modalidade;
    }

    public void setModalidade(int modalidade) {
        this.modalidade = modalidade;
    }

    public int getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(int funcionario) {
        this.funcionario = funcionario;
    }

    public String getCoordenador() {
        return coordenador;
    }

    public void setCoordenador(String coordenador) {
        this.coordenador = coordenador;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 89 * hash + this.modalidade;
        hash = 89 * hash + this.funcionario;
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
        final ResponsavelModalidade other = (ResponsavelModalidade) obj;
        if (this.modalidade != other.modalidade) {
            return false;
        }
        if (this.funcionario != other.funcionario) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ResponsavelModalidade{" + "modalidade=" + modalidade + ", funcionario=" + funcionario + ", coordenador=" + coordenador + '}';
    }
    
    
    
}
