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
public class Contrato implements Entidade {
    private int id;
    private Date date_inicio;
    private Date date_termino;
    private String recisao;
    private int renovacao;
    private double salario;

    public Contrato() {
    }

    public Contrato(int id, Date date_inicio, Date date_termino, String recisao, int renovacao, double salario) {
        this.id = id;
        this.date_inicio = date_inicio;
        this.date_termino = date_termino;
        this.recisao = recisao;
        this.renovacao = renovacao;
        this.salario = salario;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDate_inicio() {
        return date_inicio;
    }

    public void setDate_inicio(Date date_inicio) {
        this.date_inicio = date_inicio;
    }

    public Date getDate_termino() {
        return date_termino;
    }

    public void setDate_termino(Date date_termino) {
        this.date_termino = date_termino;
    }

    public String getRecisao() {
        return recisao;
    }

    public void setRecisao(String recisao) {
        this.recisao = recisao;
    }

    public int getRenovacao() {
        return renovacao;
    }

    public void setRenovacao(int renovacao) {
        this.renovacao = renovacao;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 17 * hash + this.id;
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
        final Contrato other = (Contrato) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Contrato{" + "id=" + id + ", date_inicio=" + date_inicio + ", date_termino=" + date_termino + ", recisao=" + recisao + ", renovacao=" + renovacao + ", salario=" + salario + '}';
    }
    
    
   
}
