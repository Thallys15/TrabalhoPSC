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
        setConsultaAbrir("select id, cpf, rg, cargo, idade, nome from funcionario where id = ?");
        setConsultaApagar("delete from funcionario where id = ?");
        setConsultaInserir("insert into funcionario(cpf, rg, cargo, idade,nome) values(?,?,?,?,?)");
        setConsultaAlterar("update funcionario set cpf = ?, rg = ?, cargo = ?, idade = ?, nome = ? where id = ?");
        setConsultaBusca("select id, cpf, rg, cargo, idade, nome from funcionario ");
    
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
            sql.setString(1, obj.getCpf());
            sql.setString(2, obj.getRg());
            sql.setString(3, obj.getCargo());
            sql.setInt(4, obj.getIdade());
            sql.setString(5, obj.getNome());
            if(obj.getId() > 0) sql.setInt(6, obj.getId());
        } catch (SQLException ex) {
            Logger.getLogger(FuncionarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    protected void preencheFiltros(Funcionario filtro) {
        if(filtro.getCpf()!= null) adicionarFiltro("cpf", " like ");
        if(filtro.getRg()!= null) adicionarFiltro("rg", " like ");
        if(filtro.getCargo()!= null) adicionarFiltro("cargo", " like ");
        if(filtro.getIdade() > 0) adicionarFiltro("idade", " = ");
        if(filtro.getNome() != null) adicionarFiltro("nome", "=");
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
    public Funcionario Abrir(String cpf) {
        try{
          PreparedStatement sql = conn.prepareStatement("SELECT id, cpf, rg, cargo, idade FROM Funcionario WHERE cpf = ?");
          sql.setString(1, cpf);
          ResultSet resultado = sql.executeQuery();
          if(resultado.next()) return preencheObjeto(resultado);
        } catch (SQLException ex){
            System.out.println(ex);
        }
        return null;
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
                        String consulta = "update vendasitens set modalidade = ?, funcionario = ?,coordenador = ? where id = ?";
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
    
    
    
}
