/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.MasterClub.Entidades;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author tls15
 */
public class Participa implements Entidade{
    private Clube clube;
    private Modalidade modalidade;   
    private BigDecimal valorPagoaModalidade;
    private List<Modalidade_Clube> modalidades;

    public Participa() {
        modalidades=new ArrayList<>();
    }

    public Participa(Clube clube, Modalidade modalidade, BigDecimal valorPagoaModalidade, List<Modalidade_Clube> modalidades) {
        this.clube = clube;
        this.modalidade = modalidade;
        this.valorPagoaModalidade = valorPagoaModalidade;
        this.modalidades = modalidades;
    }
    
    
     public void addClubeaModalidade(Modalidade_Clube modalidade){
        if(!modalidades.contains(modalidade)) {
            modalidades.add(modalidade);
            this.valorPagoaModalidade = this.valorPagoaModalidade.add( 
                    modalidade.getClube().getSalarioAtletas().multiply
                        (  new BigDecimal( modalidade.getQuantidadeClubes())   )  );
        }
    }
    
    public void removeClubedaModalidade(Modalidade_Clube modalidade){
        if(modalidades.contains(modalidade)){
            modalidades.remove(modalidade);
        this.valorPagoaModalidade = this.valorPagoaModalidade.subtract(
                    modalidade.getClube().getSalarioAtletas().multiply
                        (  new BigDecimal( modalidade.getQuantidadeClubes()  )   )  );
        }
    }

    public Clube getClube() {
        return clube;
    }

    public void setClube(Clube clube) {
        this.clube = clube;
    }

    public Modalidade getModalidade() {
        return modalidade;
    }

    public BigDecimal getValorPagoaModalidade() {
        return valorPagoaModalidade;
    }

    public void setValorPagoaModalidade(BigDecimal valorPagoaModalidade) {
        this.valorPagoaModalidade = valorPagoaModalidade;
    }

    public List<Modalidade_Clube> getModalidades() {
        return modalidades;
    }

    public void setModalidades(List<Modalidade_Clube> modalidades) {
        this.modalidades = modalidades;
    }

    

    public void setModalidade(Modalidade modalidade) {
        this.modalidade = modalidade;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + Objects.hashCode(this.clube);
        hash = 59 * hash + Objects.hashCode(this.modalidade);
        hash = 59 * hash + Objects.hashCode(this.valorPagoaModalidade);
        hash = 59 * hash + Objects.hashCode(this.modalidades);
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
        final Participa other = (Participa) obj;
        if (!Objects.equals(this.clube, other.clube)) {
            return false;
        }
        if (!Objects.equals(this.modalidade, other.modalidade)) {
            return false;
        }
        if (!Objects.equals(this.valorPagoaModalidade, other.valorPagoaModalidade)) {
            return false;
        }
        if (!Objects.equals(this.modalidades, other.modalidades)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Participa{" + "clube=" + clube + ", modalidade=" + modalidade + ", valorPagoaModalidade=" + valorPagoaModalidade + ", modalidades=" + modalidades + '}';
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
