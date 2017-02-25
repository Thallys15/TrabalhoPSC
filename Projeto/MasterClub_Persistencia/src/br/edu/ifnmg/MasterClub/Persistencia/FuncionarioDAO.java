/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.MasterClub.Persistencia;

import br.edu.ifnmg.MasterClub.Entidades.Funcionario;
import br.edu.ifnmg.MasterClub.Entidades.FuncionarioRepositorio;
import java.math.BigDecimal;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Igor Pereira
 */
public class FuncionarioDAO extends DAOGenerico<Funcionario> implements FuncionarioRepositorio{
    
    public FuncionarioDAO(){
        setConsultaAbrir("select id, nome, cpf, rg, cargo, idade,salario from funcionario where id = ?");
        setConsultaApagar("delete from funcionario where id = ?");
        setConsultaInserir("insert into funcionario(nome, cpf, rg, cargo, idade,salario) values(?,?,?,?,?,?)");
        setConsultaAlterar("update funcionario set nome = ?, cpf = ?, rg = ?, cargo = ?, idade = ?, salario = ? where id = ?");
        setConsultaBusca("select nome, cpf, rg, cargo, idade, salario from funcionario ");
    
    }

    @Override
    protected Funcionario preencheObjeto(ResultSet resultado) {
        try {
            Funcionario tmp = new Funcionario();
            tmp.setNome(resultado.getString(1));
            tmp.setCpf(resultado.getString(2));
            tmp.setRg(resultado.getString(3));
            tmp.setCargo(resultado.getString(4));
            tmp.setIdade(resultado.getInt(5));
            tmp.setSalario(resultado.getBigDecimal(6));
            
            return tmp;
        } catch (SQLException ex) {
            Logger.getLogger(FuncionarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    @Override
    protected void preencheConsulta(PreparedStatement sql, Funcionario obj) {
        try {
            sql.setString(1, obj.getNome());
            sql.setString(2, obj.getCpf());
            sql.setString(3, obj.getRg());
            sql.setString(4, obj.getCargo());
            sql.setInt(5, obj.getIdade());   
            sql.setBigDecimal(6, obj.getSalario());
            if(obj.getId() > 0) sql.setInt(7, obj.getId());
        } catch (SQLException ex) {
            Logger.getLogger(FuncionarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    protected void preencheFiltros(Funcionario filtro) {
        if(filtro.getNome() != null) adicionarFiltro("nome", "=");
        if(filtro.getCpf()!= null) adicionarFiltro("cpf", " like ");
        if(filtro.getRg()!= null) adicionarFiltro("rg", " like ");
        if(filtro.getCargo()!= null) adicionarFiltro("cargo", " like ");
        if(filtro.getIdade() > 0) adicionarFiltro("idade", " = ");
        if(filtro.getSalario() != null) adicionarFiltro("salario", "like");
    }

    @Override
    protected void preencheParametros(PreparedStatement sql, Funcionario filtro) {
        try {
            int cont = 1;
            if(filtro.getNome() != null){ sql.setString(cont, filtro.getNome()); cont++; }
            if(filtro.getCpf()!= null ){ sql.setString(cont, filtro.getCpf()); cont++; }
            if(filtro.getRg()!= null ){ sql.setString(cont, filtro.getRg()); cont++; }
            if(filtro.getCargo()!= null ){ sql.setString(cont, filtro.getCargo()); cont++; }
            if(filtro.getIdade()  > 0 ){ sql.setInt(cont, filtro.getIdade()); cont++; }
            if(filtro.getSalario() != null){sql.setBigDecimal(cont, filtro.getSalario());cont++;}
                 
        } catch (SQLException ex) {
            Logger.getLogger(FuncionarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public Funcionario Abrir(String nome, String cpf) throws SQLException {
        try{
          PreparedStatement sql = conn.prepareStatement("SELECT * FROM funcionarios WHERE cpf = ?");
          sql.setString(1, nome);
          sql.setString(2, cpf);       
          ResultSet resultado = sql.executeQuery();
          if(resultado.next()) return preencheObjeto(resultado);
        } catch (SQLException ex){
            System.out.println(ex);
        }
        return null;
    }

    @Override
    public boolean validarFuncionario(int id, String nome) {
         try {
            PreparedStatement sql = conn.prepareStatement("SELECT id FROM funcionario WHERE id = ? AND nome = ?");
            sql.setInt(1,id);
            sql.setString(2, nome);
            ResultSet resultado = sql.executeQuery();
            if(resultado.next()){
                return true ;
            }else
                return false;
        } catch (SQLException ex) {
            System.out.println(ex+" funcionario validado!");
        }
        return false;
    }
    
    
    
}
