/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.MasterClub.Entidades;

import java.util.Date;

/**
 *
 * @author tls15
 */
public class Titulos implements Entidade {
    private int id;
    private String nomeTorneio;
    private Date datatitulo;
  
    public Titulos() {
    }

    public Titulos(int id, String nomeTorneio, Date datatitulo) {
        this.id = id;
        this.nomeTorneio = nomeTorneio;
        this.datatitulo = datatitulo;
    }    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomeTorneio() {
        return nomeTorneio;
    }

    public void setNomeTorneio(String nomeTorneio) {
        this.nomeTorneio = nomeTorneio;
    }
    
    public Date getDatatitulo() {
        return datatitulo;
    }

    public void setDatatitulo(Date datatitulo) {
        this.datatitulo = datatitulo;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 37 * hash + this.id;
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
        final Titulos other = (Titulos) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Titulos{" + "id=" + id + ", datatitulo=" + datatitulo + '}';
    }

    
}
