/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prototipotela;

/**
 *
 * @author tls15
 */
public class TelaLogin extends javax.swing.JFrame {

    /**
     * Creates new form TelaLogin
     */
    public TelaLogin() {
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

        jInternalFrame1 = new javax.swing.JInternalFrame();
        jPanel1 = new javax.swing.JPanel();
        PlanodeFundo1 = new javax.swing.JPanel();
        LogoMaster = new javax.swing.JLabel();
        BotaoEntraLogin = new javax.swing.JButton();
        BotaoSairLogin = new javax.swing.JButton();
        UsuarioTextoNome = new javax.swing.JLabel();
        SenhaTextoNome = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        CampoInserirLogin = new javax.swing.JTextPane();
        CampoTextoSenha = new javax.swing.JScrollPane();
        CampoInserirSenha = new javax.swing.JTextPane();
        IconePessoaLogin = new javax.swing.JLabel();

        jInternalFrame1.setVisible(true);

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(1, 1, 1));
        getContentPane().setLayout(null);

        PlanodeFundo1.setBackground(new java.awt.Color(254, 254, 254));
        PlanodeFundo1.setName(""); // NOI18N

        LogoMaster.setBackground(new java.awt.Color(254, 13, 13));
        LogoMaster.setIcon(new javax.swing.ImageIcon(getClass().getResource("/prototipotela/img/MasteClubLogo.png"))); // NOI18N

        BotaoEntraLogin.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        BotaoEntraLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/prototipotela/icone/1473721990_Key.png"))); // NOI18N
        BotaoEntraLogin.setText("Entrar");
        BotaoEntraLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoEntraLoginActionPerformed(evt);
            }
        });

        BotaoSairLogin.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        BotaoSairLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/prototipotela/icone/1473722394_No.png"))); // NOI18N
        BotaoSairLogin.setText("Sair");
        BotaoSairLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotaoSairLoginMouseClicked(evt);
            }
        });

        UsuarioTextoNome.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        UsuarioTextoNome.setText("Usuário");

        SenhaTextoNome.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        SenhaTextoNome.setText("Senha");

        jScrollPane1.setViewportView(CampoInserirLogin);

        CampoTextoSenha.setViewportView(CampoInserirSenha);

        IconePessoaLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/prototipotela/icone/1473722844_group2.png"))); // NOI18N
        IconePessoaLogin.setText("jLabel1");

        javax.swing.GroupLayout PlanodeFundo1Layout = new javax.swing.GroupLayout(PlanodeFundo1);
        PlanodeFundo1.setLayout(PlanodeFundo1Layout);
        PlanodeFundo1Layout.setHorizontalGroup(
            PlanodeFundo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PlanodeFundo1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(LogoMaster, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PlanodeFundo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PlanodeFundo1Layout.createSequentialGroup()
                        .addComponent(BotaoEntraLogin)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BotaoSairLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PlanodeFundo1Layout.createSequentialGroup()
                        .addComponent(SenhaTextoNome)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(CampoTextoSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PlanodeFundo1Layout.createSequentialGroup()
                        .addComponent(UsuarioTextoNome)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                        .addGroup(PlanodeFundo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(IconePessoaLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(30, 30, 30))
        );
        PlanodeFundo1Layout.setVerticalGroup(
            PlanodeFundo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PlanodeFundo1Layout.createSequentialGroup()
                .addGroup(PlanodeFundo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, PlanodeFundo1Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(LogoMaster, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PlanodeFundo1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(IconePessoaLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(PlanodeFundo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(UsuarioTextoNome)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(PlanodeFundo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CampoTextoSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(SenhaTextoNome))
                        .addGap(26, 26, 26)
                        .addGroup(PlanodeFundo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BotaoEntraLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BotaoSairLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(42, Short.MAX_VALUE))
        );

        getContentPane().add(PlanodeFundo1);
        PlanodeFundo1.setBounds(-8, -5, 560, 310);

        setSize(new java.awt.Dimension(552, 328));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BotaoEntraLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoEntraLoginActionPerformed
        TelaPrincipal tela = new TelaPrincipal();
        tela.setVisible(true);
        dispose();
    }//GEN-LAST:event_BotaoEntraLoginActionPerformed

    private void BotaoSairLoginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotaoSairLoginMouseClicked
       System.exit(1);
    }//GEN-LAST:event_BotaoSairLoginMouseClicked

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
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotaoEntraLogin;
    private javax.swing.JButton BotaoSairLogin;
    private javax.swing.JTextPane CampoInserirLogin;
    private javax.swing.JTextPane CampoInserirSenha;
    private javax.swing.JScrollPane CampoTextoSenha;
    private javax.swing.JLabel IconePessoaLogin;
    private javax.swing.JLabel LogoMaster;
    private javax.swing.JPanel PlanodeFundo1;
    private javax.swing.JLabel SenhaTextoNome;
    private javax.swing.JLabel UsuarioTextoNome;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
