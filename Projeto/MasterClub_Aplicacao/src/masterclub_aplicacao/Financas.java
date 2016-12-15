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
public class Financas {
    private int codigo;
    private String contratacoes;
    private String vendas;
    private String emprestimos;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getContratacoes() {
        return contratacoes;
    }

    public void setContratacoes(String contratacoes) {
        this.contratacoes = contratacoes;
    }

    public String getVendas() {
        return vendas;
    }

    public void setVendas(String vendas) {
        this.vendas = vendas;
    }

    public String getEmprestimos() {
        return emprestimos;
    }

    public void setEmprestimos(String emprestimos) {
        this.emprestimos = emprestimos;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 47 * hash + this.codigo;
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
        final Financas other = (Financas) obj;
        if (this.codigo != other.codigo) {
            return false;
        }
        return true;
    }

    public Financas() {
    }

    public Financas(int codigo, String contratacoes, String vendas, String emprestimos) {
        this.codigo = codigo;
        this.contratacoes = contratacoes;
        this.vendas = vendas;
        this.emprestimos = emprestimos;
    }

    @Override
    public String toString() {
        return "Financas{" + "codigo=" + codigo + ", contratacoes=" + contratacoes + ", vendas=" + vendas + ", emprestimos=" + emprestimos + '}';
    }
    
    
}
