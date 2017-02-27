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
public class Patrocinio implements Entidade{
    private int id;
    private String nome;
    private BigDecimal valorPatrocinio;

    public Patrocinio(int id, String nome, BigDecimal valorPatrocinio) {
        this.id = id;
        this.nome = nome;
        this.valorPatrocinio = valorPatrocinio;
    }

    public BigDecimal getValorPatrocinio() {
        return valorPatrocinio;
    }

    public void setValorPatrocinio(BigDecimal valorPatrocinio) {
        this.valorPatrocinio = valorPatrocinio;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Patrocinio() {
    }

    public Patrocinio(int id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 19 * hash + this.id;
        hash = 19 * hash + Objects.hashCode(this.nome);
        hash = 19 * hash + Objects.hashCode(this.valorPatrocinio);
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
        final Patrocinio other = (Patrocinio) obj;
        if (this.id != other.id) {
            return false;
        }
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        if (!Objects.equals(this.valorPatrocinio, other.valorPatrocinio)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Patrocinio{" + "id=" + id + ", nome=" + nome + ", valorPatrocinio=" + valorPatrocinio + '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }      
    
    
}
