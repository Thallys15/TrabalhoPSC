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
public class Dependencia {
    private int codigo;
    private String nome;
    private int capacidade;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + this.codigo;
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
        final Dependencia other = (Dependencia) obj;
        if (this.codigo != other.codigo) {
            return false;
        }
        return true;
    }

    public Dependencia() {
    }

    public Dependencia(int codigo, String nome, int capacidade) {
        this.codigo = codigo;
        this.nome = nome;
        this.capacidade = capacidade;
    }

    @Override
    public String toString() {
        return "Dependencia{" + "codigo=" + codigo + ", nome=" + nome + ", capacidade=" + capacidade + '}';
    }
    
    
}
