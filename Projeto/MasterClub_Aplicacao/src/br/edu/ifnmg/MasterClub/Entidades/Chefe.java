/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.MasterClub.Entidades;

import java.util.Objects;

/**
 *
 * @author tls15
 */
public class Chefe {
    private String administracao;

    public String getAdministracao() {
        return administracao;
    }

    public void setAdministracao(String administracao) {
        this.administracao = administracao;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 67 * hash + Objects.hashCode(this.administracao);
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
        final Chefe other = (Chefe) obj;
        if (!Objects.equals(this.administracao, other.administracao)) {
            return false;
        }
        return true;
    }

    
    public Chefe() {
    }

    @Override
    public String toString() {
        return "Chefe{" + "administracao=" + administracao + '}';
    }
    
}
