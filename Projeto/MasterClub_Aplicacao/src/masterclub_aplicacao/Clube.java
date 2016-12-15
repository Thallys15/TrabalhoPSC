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
public class Clube {
    private int cnpj;
    private String nome;
    private int quantidade;

    public Clube() {
    }

    public Clube(int cnpj, String nome, int quantidade) {
        this.cnpj = cnpj;
        this.nome = nome;
        this.quantidade = quantidade;
    }

    public int getCnpj() {
        return cnpj;
    }

    public void setCnpj(int cnpj) {
        this.cnpj = cnpj;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + this.cnpj;
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
        final Clube other = (Clube) obj;
        if (this.cnpj != other.cnpj) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Clube{" + "cnpj=" + cnpj + ", nome=" + nome + ", quantidade=" + quantidade + '}';
    }
    
    
}
