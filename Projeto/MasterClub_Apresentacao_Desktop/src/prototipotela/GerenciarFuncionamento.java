package prototipotela;


import br.edu.ifnmg.MasterClub.Entidades.AluguelRepositorio;
import br.edu.ifnmg.MasterClub.Entidades.AtletaRepositorio;
import br.edu.ifnmg.MasterClub.Entidades.ChefeRepositorio;
import br.edu.ifnmg.MasterClub.Entidades.ClubeRepositorio;
import br.edu.ifnmg.MasterClub.Entidades.ContratoRepositorio;
import br.edu.ifnmg.MasterClub.Entidades.DependenciaRepositorio;
import br.edu.ifnmg.MasterClub.Entidades.FuncionarioRepositorio;
import br.edu.ifnmg.MasterClub.Entidades.ModalidadeRepositorio;
import br.edu.ifnmg.MasterClub.Persistencia.AluguelDAO;
import br.edu.ifnmg.MasterClub.Persistencia.AtletaDAO;
import br.edu.ifnmg.MasterClub.Persistencia.ChefeDAO;
import br.edu.ifnmg.MasterClub.Persistencia.ClubeDAO;
import br.edu.ifnmg.MasterClub.Persistencia.ContratoDAO;
import br.edu.ifnmg.MasterClub.Persistencia.DependenciaDAO;
import br.edu.ifnmg.MasterClub.Persistencia.FuncionarioDAO;
import br.edu.ifnmg.MasterClub.Persistencia.ModalidadeDAO;
import java.sql.SQLException;
import java.util.Locale;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Igor
 */
public class GerenciarFuncionamento {
    
    private static DependenciaRepositorio daoDependencia;
    private static AluguelRepositorio daoAluguel;
    private static AtletaRepositorio daoAtleta;
    private static ChefeRepositorio daoChefe;
    private static ClubeRepositorio daoClube;
    private static ModalidadeRepositorio daoModalidade;
    private static ContratoRepositorio daoContrato;
    private static FuncionarioRepositorio daoFuncionario;

    public static DependenciaRepositorio getDependencia() {
        if (daoDependencia == null) {
            daoDependencia = new DependenciaDAO();
        }
        return daoDependencia;
    }
    
    public static AluguelRepositorio getAluguel(){
        try {
            if(daoAluguel == null){
                daoAluguel = new AluguelDAO();
            }
            return daoAluguel;
        } catch (Exception e) {
            System.out.print(e);
        }
        return null;
    }
    
    public static AtletaRepositorio getAtleta() {
        try {
            if (daoAtleta == null) {
                daoAtleta = new AtletaDAO();
            }
            return daoAtleta;
        } catch (Exception e) {
            System.out.print(e);
        }
        return null;
    }
    
    public static ChefeRepositorio getChefe() {
        try {
            if (daoChefe == null) {
                daoChefe = new ChefeDAO();
            }
            return daoChefe;
        } catch (Exception e) {
            System.out.print(e);
        }
        return null;
    }
    
     public static ClubeRepositorio getClube() {
        try {
            if (daoClube == null) {
                daoClube = new ClubeDAO();
            }
            return daoClube;
        } catch (Exception e) {
            System.out.print(e);
        }
        return null;
    }
     
    public static ModalidadeRepositorio getModalidade() {
        try {
            if (daoModalidade == null) {
                daoModalidade = new ModalidadeDAO();
            }
            return daoModalidade;
        } catch (Exception e) {
            System.out.print(e);
        }
        return null;
    }
    
    public static ContratoRepositorio getContrato() {
        try {
            if (daoContrato == null) {
                daoContrato = new ContratoDAO();
            }
            return daoContrato;
        } catch (Exception e) {
            System.out.print(e);
        }
        return null;
    }
    public static FuncionarioRepositorio getFuncionario() {
        try {
            if (daoFuncionario == null) {
                daoFuncionario = new FuncionarioDAO();
            }
            return daoFuncionario;
        } catch (Exception e) {
            System.out.print(e);
        }
        return null;
    }
    
}
