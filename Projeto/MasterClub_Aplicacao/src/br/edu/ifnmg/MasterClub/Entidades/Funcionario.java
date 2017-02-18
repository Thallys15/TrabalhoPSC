/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.MasterClub.Entidades;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author tls15
 */
public class Funcionario implements Entidade{
    private int idfuncionario;
    private String cpf;
    private String rg;
    private String cargo;
    private String nome;
    private int idade;
    private BigDecimal qtdmodalidades;
    private List<ResponsavelModalidade>modalidades;

    public Funcionario() {
        modalidades = new ArrayList<>();
    }

    public Funcionario(int idfuncionario, String cpf, String rg, String cargo, String nome, int idade) {
        this.idfuncionario = idfuncionario;
        this.cpf = cpf;
        this.rg = rg;
        this.cargo = cargo;
        this.idade = idade;
        this.nome = nome;
        this.qtdmodalidades = qtdmodalidades;
        modalidades = new ArrayList<>();
    }
     public void addItem(ResponsavelModalidade modalidade){
        if(!modalidades.contains(modalidade)) {
            modalidades.add(modalidade);
            this.qtdmodalidades = this.qtdmodalidades.add( 
                    modalidade.getModalidade().getValorPagoModalidade().multiply
                        (  new BigDecimal( modalidade.getQtdModalidades())   )  );
        }
    }
    
     public void removeItem(ResponsavelModalidade modalidade){
        if(modalidades.contains(modalidade)){
            modalidades.remove(modalidade);
        this.qtdmodalidades = this.qtdmodalidades.subtract(
                    modalidade.getModalidade().getValorPagoModalidade().multiply
                        (  new BigDecimal( modalidade.getQtdModalidades())   )  );
        }
    }

    public BigDecimal getQtdmodalidades() {
        return qtdmodalidades;
    }

    public void setQtdmodalidades(BigDecimal qtdmodalidades) {
        this.qtdmodalidades = qtdmodalidades;
    }

    public List<ResponsavelModalidade> getModalidades() {
        return modalidades;
    }

    public void setModalidades(List<ResponsavelModalidade> modalidades) {
        this.modalidades = modalidades;
    }

    public int getIdfuncionario() {
        return idfuncionario;
    }

    public void setIdfuncionario(int idfuncionario) {
        this.idfuncionario = idfuncionario;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public int getId() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setId(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 59 * hash + this.idfuncionario;
        hash = 59 * hash + Objects.hashCode(this.cpf);
        hash = 59 * hash + Objects.hashCode(this.rg);
        hash = 59 * hash + Objects.hashCode(this.cargo);
        hash = 59 * hash + Objects.hashCode(this.nome);
        hash = 59 * hash + this.idade;
        hash = 59 * hash + Objects.hashCode(this.qtdmodalidades);
        hash = 59 * hash + Objects.hashCode(this.modalidades);
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
        final Funcionario other = (Funcionario) obj;
        if (this.idfuncionario != other.idfuncionario) {
            return false;
        }
        if (this.idade != other.idade) {
            return false;
        }
        if (!Objects.equals(this.cpf, other.cpf)) {
            return false;
        }
        if (!Objects.equals(this.rg, other.rg)) {
            return false;
        }
        if (!Objects.equals(this.cargo, other.cargo)) {
            return false;
        }
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        if (!Objects.equals(this.qtdmodalidades, other.qtdmodalidades)) {
            return false;
        }
        if (!Objects.equals(this.modalidades, other.modalidades)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Funcionario{" + "idfuncionario=" + idfuncionario + ", cpf=" + cpf + ", rg=" + rg + ", cargo=" + cargo + ", nome=" + nome + ", idade=" + idade + ", qtdmodalidades=" + qtdmodalidades + ", modalidades=" + modalidades + '}';
    }
    
}
