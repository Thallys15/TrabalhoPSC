/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.MasterClub.Entidades;

/**
 *
 * @author Igor Pereira
 */
public interface UsuarioRepositorio extends Repositorio<Usuario>{
    public Usuario Abrir(String login, String senha);
    public boolean VerificaLogin(String login, String senha);
    
}
