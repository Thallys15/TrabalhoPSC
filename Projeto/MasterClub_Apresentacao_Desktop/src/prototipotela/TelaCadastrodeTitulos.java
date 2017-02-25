/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prototipotela;

import br.edu.ifnmg.MasterClub.Entidades.FuncionarioRepositorio;
import br.edu.ifnmg.MasterClub.Entidades.Titulos;
import br.edu.ifnmg.MasterClub.Entidades.TitulosRepositorio;
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import masterclub_apresentacao.MasterClub_Apresentacao;

/**
 *
 * @author thallys
 */
public class TelaCadastrodeTitulos extends javax.swing.JFrame {
    Titulos titulo = new Titulos();
    MasterClub_Apresentacao master = new MasterClub_Apresentacao();
    TitulosRepositorio bd = new GerenciarFuncionamento().getTitulo();

    /**
     * Creates new form CadastrodeTitulos
     */
    public TelaCadastrodeTitulos() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        FunndoCadastroTitulos = new javax.swing.JPanel();
        LogoTemporada = new javax.swing.JLabel();
        NomeTorneioLabel = new javax.swing.JLabel();
        txtNomeTorneio = new javax.swing.JTextField();
        AnoLabel = new javax.swing.JLabel();
        btnSalvar = new javax.swing.JButton();
        txtData = new javax.swing.JFormattedTextField();
        BotaoLimparFunc = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        FunndoCadastroTitulos.setBackground(new java.awt.Color(254, 254, 254));

        LogoTemporada.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        LogoTemporada.setIcon(new javax.swing.ImageIcon(getClass().getResource("/prototipotela/icone/1474479197_trophy.png"))); // NOI18N
        LogoTemporada.setText("Torneios");

        NomeTorneioLabel.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        NomeTorneioLabel.setText("Nome do Torneio");

        AnoLabel.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        AnoLabel.setText("Temporada");

        btnSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/prototipotela/icone/1474360786_floppy.png"))); // NOI18N
        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        txtData.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getDateInstance(java.text.DateFormat.MEDIUM))));

        BotaoLimparFunc.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        BotaoLimparFunc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/prototipotela/icone/limpar.png"))); // NOI18N
        BotaoLimparFunc.setText("Limpar");
        BotaoLimparFunc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoLimparFuncActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Arial Narrow", 1, 16)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/prototipotela/icone/Listar.png"))); // NOI18N
        jButton1.setText("Listar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Arial Narrow", 1, 16)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/prototipotela/icone/1474360844_Exit.png"))); // NOI18N
        jButton2.setText("Sair");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/prototipotela/img/LIBERTA.png"))); // NOI18N

        javax.swing.GroupLayout FunndoCadastroTitulosLayout = new javax.swing.GroupLayout(FunndoCadastroTitulos);
        FunndoCadastroTitulos.setLayout(FunndoCadastroTitulosLayout);
        FunndoCadastroTitulosLayout.setHorizontalGroup(
            FunndoCadastroTitulosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FunndoCadastroTitulosLayout.createSequentialGroup()
                .addGroup(FunndoCadastroTitulosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(FunndoCadastroTitulosLayout.createSequentialGroup()
                        .addGroup(FunndoCadastroTitulosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(FunndoCadastroTitulosLayout.createSequentialGroup()
                                .addGroup(FunndoCadastroTitulosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(FunndoCadastroTitulosLayout.createSequentialGroup()
                                        .addGap(209, 209, 209)
                                        .addComponent(LogoTemporada))
                                    .addGroup(FunndoCadastroTitulosLayout.createSequentialGroup()
                                        .addGap(42, 42, 42)
                                        .addComponent(AnoLabel)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtData, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FunndoCadastroTitulosLayout.createSequentialGroup()
                                .addComponent(NomeTorneioLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtNomeTorneio, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(54, 54, 54)))
                        .addComponent(jLabel1))
                    .addGroup(FunndoCadastroTitulosLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(BotaoLimparFunc, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        FunndoCadastroTitulosLayout.setVerticalGroup(
            FunndoCadastroTitulosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FunndoCadastroTitulosLayout.createSequentialGroup()
                .addGroup(FunndoCadastroTitulosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(FunndoCadastroTitulosLayout.createSequentialGroup()
                        .addComponent(LogoTemporada)
                        .addGap(55, 55, 55)
                        .addGroup(FunndoCadastroTitulosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNomeTorneio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(NomeTorneioLabel))
                        .addGap(18, 18, 18)
                        .addGroup(FunndoCadastroTitulosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(AnoLabel)
                            .addComponent(txtData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(FunndoCadastroTitulosLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)))
                .addGap(31, 31, 31)
                .addGroup(FunndoCadastroTitulosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotaoLimparFunc)
                    .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(34, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(FunndoCadastroTitulos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(FunndoCadastroTitulos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(3, 3, 3))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        try {
            
            this.recuperarCampos();
            int codigo = titulo.getId();            
            if (codigo==0) {
            master.criarTitulo(titulo);
            this.limparCampos();
            JOptionPane.showMessageDialog(this, "Titulo cadastrado!!!Parabéns pela conquista");
            } else {
                bd.Alterar(titulo);
                JOptionPane.showMessageDialog(this, "Sucesso!!! O título foi editado", "Mensagem de confirmação", JOptionPane.INFORMATION_MESSAGE);
            }
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Cadastro não realizado! Verifique sua conexão com o banco de dados " + e.getMessage(), "erro!", JOptionPane.ERROR_MESSAGE);
            Logger.getLogger(TelaCadastroDependencias.class.getName()).log(Level.SEVERE, null, e);
            this.limparCampos();
        }
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void BotaoLimparFuncActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoLimparFuncActionPerformed
        limparCampos();
    }//GEN-LAST:event_BotaoLimparFuncActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        ListarTitulos abrir = new ListarTitulos();
        abrir.setLocationRelativeTo(null);
        abrir.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaCadastrodeTitulos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCadastrodeTitulos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCadastrodeTitulos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCadastrodeTitulos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCadastrodeTitulos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AnoLabel;
    private javax.swing.JButton BotaoLimparFunc;
    private javax.swing.JPanel FunndoCadastroTitulos;
    private javax.swing.JLabel LogoTemporada;
    private javax.swing.JLabel NomeTorneioLabel;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JFormattedTextField txtData;
    private javax.swing.JTextField txtNomeTorneio;
    // End of variables declaration//GEN-END:variables
    private void limparCampos() {
        
        txtNomeTorneio.setText("");
        txtData.setText("");
        
    }
    public void recuperarCampos() throws ParseException{
        SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/yyyy");

        String nome = new String(txtNomeTorneio.getText().trim());
        if (!nome.equals("")){
            titulo.setNomeTorneio(nome);
        }
        Date temporada = new Date( formatador.parse(txtData.getText().trim()).getTime());
          /*String dia = txtData.getText().substring(0,2);
            String mes = txtData.getText().substring(3,5);
            String ano = txtData.getText().substring(6);
            String dataParaMysql = ano+""+mes+""+dia;   
            dataParaMysql =new String(txtData.getText().trim());*/
        if (!temporada.equals("")) {
            titulo.setDatatitulo(temporada);
        }

    }
    private void preencherCampos() {
        SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/yyyy");
        String temporada= formatador.format(titulo.getDatatitulo());
        txtNomeTorneio.setText(titulo.getNomeTorneio());
        txtData.setText(temporada);
        
    }
}
