/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prototipotela;

import br.edu.ifnmg.MasterClub.Entidades.Patrocinio;
import br.edu.ifnmg.MasterClub.Entidades.PatrocinioRepositorio;
import java.math.BigDecimal;
import java.math.BigInteger;
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
public class TelaCadastroPatrocinador extends javax.swing.JFrame {
    Patrocinio patrocinio = new Patrocinio();
    MasterClub_Apresentacao master = new MasterClub_Apresentacao();
    PatrocinioRepositorio bd = new GerenciarFuncionamento().getPatrocinio();
    ListarPatrocinadores listarPatrocinio = new ListarPatrocinadores();
    /**
     * Creates new form TelaCadastroPatrocinador
     */
    public TelaCadastroPatrocinador() {
        initComponents();
        btnEditar.setEnabled(false);
    }

    TelaCadastroPatrocinador(Patrocinio patrocinio, ListarPatrocinadores listarPatrocinio) {
        initComponents();
        preencherCampos(patrocinio);
        this.listarPatrocinio = listarPatrocinio;
        btnSalvar.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        btnSalvar = new javax.swing.JButton();
        BotaoSairCadPat = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        BotaoLimparFunc = new javax.swing.JButton();
        txtValorPatrocinio = new javax.swing.JFormattedTextField();
        btnEditar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(254, 254, 254));

        jLabel1.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/prototipotela/icone/1474366345_Football_2-46.png"))); // NOI18N
        jLabel1.setText("Cadastro de Patrocinador");

        jLabel2.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel2.setText("Nome");

        jLabel3.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel3.setText("Valor");

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/prototipotela/img/CBF_patrocinadores.jpg"))); // NOI18N

        btnSalvar.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        btnSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/prototipotela/icone/1474360786_floppy.png"))); // NOI18N
        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        BotaoSairCadPat.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        BotaoSairCadPat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/prototipotela/icone/1474360844_Exit.png"))); // NOI18N
        BotaoSairCadPat.setText("Sair");
        BotaoSairCadPat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoSairCadPatActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Arial Narrow", 1, 16)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/prototipotela/icone/Listar.png"))); // NOI18N
        jButton3.setText("Listar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        BotaoLimparFunc.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        BotaoLimparFunc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/prototipotela/icone/limpar.png"))); // NOI18N
        BotaoLimparFunc.setText("Limpar");
        BotaoLimparFunc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoLimparFuncActionPerformed(evt);
            }
        });

        btnEditar.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        btnEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/prototipotela/icone/edit.png"))); // NOI18N
        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2))
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtNome, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE)
                    .addComponent(txtValorPatrocinio))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 563, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(BotaoLimparFunc, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BotaoSairCadPat, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(228, 228, 228)
                        .addComponent(jLabel1)))
                .addContainerGap(118, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(180, 180, 180)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtValorPatrocinio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)
                        .addGap(36, 36, 36)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalvar)
                    .addComponent(BotaoSairCadPat)
                    .addComponent(BotaoLimparFunc, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3)
                    .addComponent(btnEditar))
                .addGap(57, 57, 57))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 22, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotaoSairCadPatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoSairCadPatActionPerformed

        dispose();
    }//GEN-LAST:event_BotaoSairCadPatActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
         ListarPatrocinadores abrir = new ListarPatrocinadores();
         abrir.setVisible(true);
         abrir.setLocationRelativeTo(null);
         this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void BotaoLimparFuncActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoLimparFuncActionPerformed
        limparCampos();
    }//GEN-LAST:event_BotaoLimparFuncActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        if(this.validarCampos()){
            JOptionPane.showMessageDialog(null, "Campos obrigátorios não preenchidos","Aviso",JOptionPane.WARNING_MESSAGE);
        }else{    
            try {
                try{
                    this.recuperarCampos();
                    int codigo = patrocinio.getId();
                    if (codigo==0) {
                    master.criarPatrocinio(patrocinio);
                    this.limparCampos();
                    JOptionPane.showMessageDialog(this, "patrocinador Cadastrado com sucesso");
                    }
                }catch(NumberFormatException e){
                    JOptionPane.showMessageDialog(rootPane, "Dados invalidos. Impossivel converter letras para números.","erro",JOptionPane.ERROR_MESSAGE);
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Cadastro não realizado! Verifique sua conexão com o banco de dados " + e.getMessage(), "erro!", JOptionPane.ERROR_MESSAGE);
                Logger.getLogger(TelaCadastroDependencias.class.getName()).log(Level.SEVERE, null, e);
                this.limparCampos();
            }
        }
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        if(this.validarCampos()){
            JOptionPane.showMessageDialog(null, "Campos obrigátorios não preenchidos","Aviso",JOptionPane.WARNING_MESSAGE);
        }else{
            try {
                try{
                    this.recuperarCampos();
                    int codigo = patrocinio.getId();
                    if (codigo != 0) {
                        bd.Alterar(patrocinio);
                        JOptionPane.showMessageDialog(this, "Sucesso!!! O patrocinador foi editado", "Mensagem de confirmação", JOptionPane.INFORMATION_MESSAGE);
                    }
                }catch(NumberFormatException e){
                        JOptionPane.showMessageDialog(rootPane, "Dados invalidos. Impossivel converter letras para números.","erro",JOptionPane.ERROR_MESSAGE);    
                    }

            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Patrocinador não editado, informe o administrador da rede" + e.getMessage(), "erro!", JOptionPane.ERROR_MESSAGE);
                Logger.getLogger(TelaCadastroDependencias.class.getName()).log(Level.SEVERE, null, e);
                this.limparCampos();
            }
        }
    }//GEN-LAST:event_btnEditarActionPerformed

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
            java.util.logging.Logger.getLogger(TelaCadastroPatrocinador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroPatrocinador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroPatrocinador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroPatrocinador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCadastroPatrocinador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotaoLimparFunc;
    private javax.swing.JButton BotaoSairCadPat;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtNome;
    private javax.swing.JFormattedTextField txtValorPatrocinio;
    // End of variables declaration//GEN-END:variables
    public boolean validarCampos(){
        if(txtNome.getText().equals("")||txtValorPatrocinio.getText().equals("")){            
            return true;
        }
        return false;
    }
    private void limparCampos() {
        
        txtNome.setText("");        
        txtValorPatrocinio.setText("");
        
    }
    private void recuperarCampos() throws ParseException {


        String nome = txtNome.getText().trim();
        if(!nome.equals("")){
            patrocinio.setNome(nome);
        }
        
        double valor = Double.parseDouble(txtValorPatrocinio.getText().trim());
        if (valor != 0) {
            patrocinio.setValorPatrocinio(BigDecimal.valueOf(valor));
        }
    }
    private void preencherCampos(Patrocinio patrocinio1) {
        patrocinio = patrocinio1;
        String valor = String.valueOf(patrocinio1.getValorPatrocinio());
        txtNome.setText(patrocinio1.getNome());
        txtValorPatrocinio.setText(valor);
        
    }
}
