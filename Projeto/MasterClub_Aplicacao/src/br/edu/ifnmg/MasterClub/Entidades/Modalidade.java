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
public class Modalidade implements Entidade{
    private int codigo;
    private String nome;
    private String descricao;
    private BigDecimal valorPagoModalidade;
    
    
    public Modalidade() {
    }

    public BigDecimal getValorPagoModalidade() {
        return valorPagoModalidade;
    }

    public void setValorPagoModalidade(BigDecimal valorPagoModalidade) {
        this.valorPagoModalidade = valorPagoModalidade;
    }

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

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 17 * hash + this.codigo;
        hash = 17 * hash + Objects.hashCode(this.nome);
        hash = 17 * hash + Objects.hashCode(this.descricao);
        hash = 17 * hash + Objects.hashCode(this.valorPagoModalidade);
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
        final Modalidade other = (Modalidade) obj;
        if (this.codigo != other.codigo) {
            return false;
        }
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        if (!Objects.equals(this.descricao, other.descricao)) {
            return false;
        }
        if (!Objects.equals(this.valorPagoModalidade, other.valorPagoModalidade)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Modalidade{" + "codigo=" + codigo + ", nome=" + nome + ", descricao=" + descricao + ", valorPagoModalidade=" + valorPagoModalidade + '}';
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
