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
public class Funcionario implements Entidade{
    private int idfuncionario;
    private String cpf;
    private String rg;
    private String cargo;
    private int idade;

    public Funcionario() {
    }

    public Funcionario(int idfuncionario, String cpf, String rg, String cargo, int idade) {
        this.idfuncionario = idfuncionario;
        this.cpf = cpf;
        this.rg = rg;
        this.cargo = cargo;
        this.idade = idade;
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

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + this.idfuncionario;
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
        return true;
    }

    @Override
    public String toString() {
        return "Funcionario{" + "idfuncionario=" + idfuncionario + ", cpf=" + cpf + ", rg=" + rg + ", cargo=" + cargo + ", idade=" + idade + '}';
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
