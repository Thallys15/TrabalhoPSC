/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.MasterClub.Entidades;

import java.math.BigDecimal;
import java.util.Objects;

/**
 *
 * @author tls15
 */
public class Clube implements Entidade{
    private String cnpj;
    private String nome;
    private BigDecimal salarioAtletas;
    private int quantidade;

    public Clube() {
    }

    public Clube(String cnpj, String nome, BigDecimal salarioAtletas, int quantidade) {
        this.cnpj = cnpj;
        this.nome = nome;
        this.salarioAtletas = salarioAtletas;
        this.quantidade = quantidade;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) throws ErroValidacao{
        if(cnpj.length() > 18)
            throw new ErroValidacao("O atributo cnpj deve ter no máximo 18 caracteres!");
        this.cnpj = cnpj.replace("-", "").replace(".", "").replace("/", "");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) throws ErroValidacao {
        if(nome.length() > 250)
            throw new ErroValidacao("O atributo nome deve ter no máximo 250 caracteres!");
        this.nome = nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public BigDecimal getSalarioAtletas() {
        return salarioAtletas;
    }

    public void setSalarioAtletas(BigDecimal salarioAtletas) {
        this.salarioAtletas = salarioAtletas;
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
        hash = 41 * hash + Objects.hashCode(this.cnpj);
        hash = 41 * hash + Objects.hashCode(this.nome);
        hash = 41 * hash + Objects.hashCode(this.salarioAtletas);
        hash = 41 * hash + this.quantidade;
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
        if (this.quantidade != other.quantidade) {
            return false;
        }
        if (!Objects.equals(this.cnpj, other.cnpj)) {
            return false;
        }
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        if (!Objects.equals(this.salarioAtletas, other.salarioAtletas)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Clube{" + "cnpj=" + cnpj + ", nome=" + nome + ", salarioAtletas=" + salarioAtletas + ", quantidade=" + quantidade + '}';
    }

    
}
