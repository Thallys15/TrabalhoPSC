/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.MasterClub.Persistencia;

import br.edu.ifnmg.MasterClub.Entidades.Funcionario;
import br.edu.ifnmg.MasterClub.Entidades.FuncionarioRepositorio;
import br.edu.ifnmg.MasterClub.Entidades.Modalidade;
import br.edu.ifnmg.MasterClub.Entidades.ResponsavelModalidade;
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
        setConsultaAbrir("select id, nome, cpf, rg, cargo, idade from funcionario where id = ?");
        setConsultaApagar("delete from funcionario where id = ?");
        setConsultaInserir("insert into funcionario(nome, cpf, rg, cargo, idade) values(?,?,?,?,?)");
        setConsultaAlterar("update funcionario set nome = ?, cpf = ?, rg = ?, cargo = ?, idade = ? where id = ?");
        setConsultaBusca("select id, nome, cpf, rg, cargo, idade from funcionario ");
    
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
            if(obj.getId() > 0) sql.setInt(6, obj.getId());
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
                 
        } catch (SQLException ex) {
            Logger.getLogger(FuncionarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public boolean Salvar(Funcionario obj) {
         if(!super.Salvar(obj)) 
            return false;
        
        if(obj.getId() > 0 ){
            for(ResponsavelModalidade item : obj.getModalidades()){
                if(item.getId() == 0){
                    try {
                        String consulta = "insert into responsavel_modalidades(modalidade, funcionario, coordenador) values(?,?,?)";
                        PreparedStatement sql = conn.prepareStatement(consulta);
                        sql.setInt(1, obj.getId());
                        sql.setInt(2, item.getModalidade().getId());
                        sql.setString(3, item.getCoordenador());
                        sql.executeUpdate();
                    } catch (SQLException ex) {
                        Logger.getLogger(FuncionarioDAO.class.getName()).log(Level.SEVERE, null, ex);
                        return false;
                    }
                } else {
                    try {
                        String consulta = "update responsavel_modalidade set modalidade = ?, funcionario = ?,coordenador = ? where id = ?";
                        PreparedStatement sql = conn.prepareStatement(consulta);
                        sql.setInt(1, obj.getId());
                        sql.setInt(2, item.getModalidade().getId());
                        sql.setString(3, item.getCoordenador());
                        sql.setInt(4, item.getId());
                        sql.executeUpdate();
                    } catch (SQLException ex) {
                        Logger.getLogger(FuncionarioDAO.class.getName()).log(Level.SEVERE, null, ex);
                        return false;
                    }
                }
            }
        }
        
        return true;
    }

    @Override
    public Funcionario Abrir(String nome, String cpf) throws SQLException {
        try{
          PreparedStatement sql = conn.prepareStatement("SELECT id,nome,cpf,rg,cargo,idade FROM funcionarios WHERE cpf = ?");
          sql.setString(1, cpf);
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
            PreparedStatement sql = conn.prepareStatement("SELECT ID FROM funcionario WHERE id = ? AND nome = ?");
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
