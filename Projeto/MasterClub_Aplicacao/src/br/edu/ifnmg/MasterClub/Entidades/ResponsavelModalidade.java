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
public class ResponsavelModalidade implements Entidade{
    private int modalidade;
    private Funcionario funcionario;
    private String coordenador;

    public ResponsavelModalidade() {
    }

    public ResponsavelModalidade(int modalidade, Funcionario funcionario, String coordenador) {
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

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
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
        int hash = 7;
        hash = 29 * hash + this.modalidade;
        hash = 29 * hash + Objects.hashCode(this.funcionario);
        hash = 29 * hash + Objects.hashCode(this.coordenador);
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
        if (!Objects.equals(this.coordenador, other.coordenador)) {
            return false;
        }
        if (!Objects.equals(this.funcionario, other.funcionario)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ResponsavelModalidade{" + "modalidade=" + modalidade + ", funcionario=" + funcionario + ", coordenador=" + coordenador + '}';
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
