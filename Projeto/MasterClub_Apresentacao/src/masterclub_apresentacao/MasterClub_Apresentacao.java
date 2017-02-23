/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package masterclub_apresentacao;

import br.edu.ifnmg.MasterClub.Entidades.Aluguel;
import br.edu.ifnmg.MasterClub.Entidades.AluguelRepositorio;
import br.edu.ifnmg.MasterClub.Entidades.Atleta;
import br.edu.ifnmg.MasterClub.Entidades.AtletaRepositorio;
import br.edu.ifnmg.MasterClub.Entidades.Chefe;
import br.edu.ifnmg.MasterClub.Entidades.ChefeRepositorio;
import br.edu.ifnmg.MasterClub.Entidades.Clube;
import br.edu.ifnmg.MasterClub.Entidades.ClubeRepositorio;
import br.edu.ifnmg.MasterClub.Entidades.Contrato;
import br.edu.ifnmg.MasterClub.Entidades.ContratoRepositorio;
import br.edu.ifnmg.MasterClub.Entidades.Dependencia;
import br.edu.ifnmg.MasterClub.Entidades.DependenciaRepositorio;
import br.edu.ifnmg.MasterClub.Entidades.Funcionario;
import br.edu.ifnmg.MasterClub.Entidades.FuncionarioRepositorio;
import br.edu.ifnmg.MasterClub.Entidades.Modalidade;
import br.edu.ifnmg.MasterClub.Entidades.ModalidadeRepositorio;
import br.edu.ifnmg.MasterClub.Entidades.Patrocinio;
import br.edu.ifnmg.MasterClub.Entidades.PatrocinioRepositorio;
import br.edu.ifnmg.MasterClub.Entidades.Pessoa;
import br.edu.ifnmg.MasterClub.Entidades.PessoaRepositorio;
import br.edu.ifnmg.MasterClub.Persistencia.AluguelDAO;
import br.edu.ifnmg.MasterClub.Persistencia.AtletaDAO;
import br.edu.ifnmg.MasterClub.Persistencia.ChefeDAO;
import br.edu.ifnmg.MasterClub.Persistencia.ClubeDAO;
import br.edu.ifnmg.MasterClub.Persistencia.ContratoDAO;
import br.edu.ifnmg.MasterClub.Persistencia.DependenciaDAO;
import br.edu.ifnmg.MasterClub.Persistencia.FuncionarioDAO;
import br.edu.ifnmg.MasterClub.Persistencia.ModalidadeDAO;
import br.edu.ifnmg.MasterClub.Persistencia.PatrocinioDAO;
import br.edu.ifnmg.MasterClub.Persistencia.PessoaDAO;
import java.sql.SQLException;

/**
 *
 * @author Igor
 */
public class MasterClub_Apresentacao {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        // TODO code application logic here
    }
    public static void criarDependencia(Dependencia dependencia) throws SQLException{
        
        DependenciaRepositorio bd_dependencia = new DependenciaDAO();
        bd_dependencia.Salvar(dependencia);
        
    }
    
    public static void criarAluguel(Aluguel aluguel) throws SQLException{
        
        AluguelRepositorio bd_Aluguel = new AluguelDAO();
        bd_Aluguel.Salvar(aluguel);
        
    }
    
    public static void criarAtleta(Atleta atleta) throws SQLException{
        
        AtletaRepositorio bd_Atleta = new AtletaDAO();
        bd_Atleta.Salvar(atleta);
        
    }
    
    public static void criarChefe(Chefe chefe) throws SQLException{
        
        ChefeRepositorio bd_Chefe = new ChefeDAO();
        bd_Chefe.Salvar(chefe);
        
    }
    
    public static void criarClube(Clube clube) throws SQLException{
        
        ClubeRepositorio bd_Clube = new ClubeDAO();
        bd_Clube.Salvar(clube);
        
    }
    
    public static void criarModalidade(Modalidade modalidade) throws SQLException{
        
        ModalidadeRepositorio bd_Modalidade = new ModalidadeDAO();
        bd_Modalidade.Salvar(modalidade);
        
    }
    
    public static void criarContrato(Contrato contrato) throws SQLException{
        
        ContratoRepositorio bd_Contrato = new ContratoDAO();
        bd_Contrato.Salvar(contrato);
        
    }
    
    public static void criarFuncionario(Funcionario funcionario) throws SQLException, ClassNotFoundException {
        
        FuncionarioRepositorio bd_funcionario = new FuncionarioDAO();
        bd_funcionario.Salvar(funcionario);
        
    }
    
    public static void criarPatrocinio(Patrocinio patrocinio) throws SQLException, ClassNotFoundException {
        
        PatrocinioRepositorio bd_patrocinio = new PatrocinioDAO();
        bd_patrocinio.Salvar(patrocinio);
        
    }
    
}
