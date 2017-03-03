/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.MasterClub.Entidades;

import java.util.Date;
import java.util.Objects;

/**
 *
 * @author tls15
 */
public class Titulos implements Entidade {
    private int id;
    private String nomeTorneio;
    private Date datainicio;
    private Date dataTermino;
  
    public Titulos() {
    }

    public Titulos(int id, String nomeTorneio, Date datainicio, Date dataTermino) {
        this.id = id;
        this.nomeTorneio = nomeTorneio;
        this.datainicio = datainicio;
        this.dataTermino = dataTermino;
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
    
    public Date getDatainicio() {
        return datainicio;
    }

    public void setDatainicio(Date datainicio) {
        this.datainicio = datainicio;
    }

    public Date getDataTermino() {
        return dataTermino;
    }

    public void setDataTermino(Date dataTermino) {
        this.dataTermino = dataTermino;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 23 * hash + this.id;
        hash = 23 * hash + Objects.hashCode(this.nomeTorneio);
        hash = 23 * hash + Objects.hashCode(this.datainicio);
        hash = 23 * hash + Objects.hashCode(this.dataTermino);
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
        if (!Objects.equals(this.nomeTorneio, other.nomeTorneio)) {
            return false;
        }
        if (!Objects.equals(this.datainicio, other.datainicio)) {
            return false;
        }
        if (!Objects.equals(this.dataTermino, other.dataTermino)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Titulos{" + "id=" + id + ", nomeTorneio=" + nomeTorneio + ", datainicio=" + datainicio + ", dataTermino=" + dataTermino + '}';
    }

   
}
