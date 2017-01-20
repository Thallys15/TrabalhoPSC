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
public class Atleta implements Entidade{
    private int id;
    private String posicao;
    private String lado;
    private String categoria;
    private String naturalidade;
    private int idade;
    private double altura;
    private double peso;
    private String cpf;
    private String rg;

    public Atleta() {
    }

    public Atleta(int id, String posicao, String lado, String categoria, String naturalidade, int idade, double altura, double peso, String cpf, String rg) {
        this.id = id;
        this.posicao = posicao;
        this.lado = lado;
        this.categoria = categoria;
        this.naturalidade = naturalidade;
        this.idade = idade;
        this.altura = altura;
        this.peso = peso;
        this.cpf = cpf;
        this.rg = rg;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPosicao() {
        return posicao;
    }

    public void setPosicao(String posicao) {
        this.posicao = posicao;
    }

    public String getLado() {
        return lado;
    }

    public void setLado(String lado) {
        this.lado = lado;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getNaturalidade() {
        return naturalidade;
    }

    public void setNaturalidade(String naturalidade) {
        this.naturalidade = naturalidade;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
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

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + this.id;
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
        final Atleta other = (Atleta) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Atleta{" + "id=" + id + ", posicao=" + posicao + ", lado=" + lado + ", categoria=" + categoria + ", naturalidade=" + naturalidade + ", idade=" + idade + ", altura=" + altura + ", peso=" + peso + ", cpf=" + cpf + ", rg=" + rg + '}';
    }
    
    
}
