/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.MasterClub.Entidades;

import java.util.List;

/**
 *
 * @author Igor Pereira
 * @param <T>
 */
public interface Repositorio <T extends Entidade> {
    public boolean Salvar(T obj);
    public boolean Apagar(T obj);
    public boolean Alterar(T obj);
    public List<T> Abrir();
    public List<T> Buscar(T filtro);
    
}
