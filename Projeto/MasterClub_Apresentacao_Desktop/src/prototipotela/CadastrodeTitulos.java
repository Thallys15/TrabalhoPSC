/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prototipotela;

/**
 *
 * @author thallys
 */
public class CadastrodeTitulos extends javax.swing.JFrame {

    /**
     * Creates new form CadastrodeTitulos
     */
    public CadastrodeTitulos() {
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
        CaixaNomeTorneio = new javax.swing.JTextField();
        NomeModalidadeLabel = new javax.swing.JLabel();
        CaixaNomeModalidade = new javax.swing.JTextField();
        AnoLabel = new javax.swing.JLabel();
        CaixaAno = new javax.swing.JTextField();
        TextoExplicacao = new javax.swing.JLabel();
        BotaoBuscarTemporada = new javax.swing.JButton();
        BotaoLimparTemporada = new javax.swing.JButton();
        BotaoDeletarTemporada = new javax.swing.JButton();
        BotaoSairTemporada = new javax.swing.JButton();
        TabelaTemporadaListar = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        FunndoCadastroTitulos.setBackground(new java.awt.Color(254, 254, 254));

        LogoTemporada.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        LogoTemporada.setIcon(new javax.swing.ImageIcon(getClass().getResource("/prototipotela/icone/1474479197_trophy.png"))); // NOI18N
        LogoTemporada.setText("Temporada");

        NomeTorneioLabel.setText("Nome Torneio");

        NomeModalidadeLabel.setText("Modalidade");

        AnoLabel.setText("Ano");

        TextoExplicacao.setText("Realizar a busca preenchendo qualquer campo desejado!!");

        BotaoBuscarTemporada.setIcon(new javax.swing.ImageIcon(getClass().getResource("/prototipotela/icone/1474448538_magnifyingglass.png"))); // NOI18N
        BotaoBuscarTemporada.setText("Buscar");

        BotaoLimparTemporada.setIcon(new javax.swing.ImageIcon(getClass().getResource("/prototipotela/icone/1474449106_leaf_cleaning_stick.png"))); // NOI18N
        BotaoLimparTemporada.setText("Limpar");

        BotaoDeletarTemporada.setIcon(new javax.swing.ImageIcon(getClass().getResource("/prototipotela/icone/1474449279_DeleteRed.png"))); // NOI18N
        BotaoDeletarTemporada.setText("Deletar");

        BotaoSairTemporada.setIcon(new javax.swing.ImageIcon(getClass().getResource("/prototipotela/icone/1474061346_Shutdown_Box_Red.png"))); // NOI18N
        BotaoSairTemporada.setText("Sair");
        BotaoSairTemporada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoSairTemporadaActionPerformed(evt);
            }
        });

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5"
            }
        ));
        TabelaTemporadaListar.setViewportView(jTable2);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/prototipotela/img/guardiola-trofeus.jpg"))); // NOI18N
        jLabel6.setText("jLabel6");

        javax.swing.GroupLayout FunndoCadastroTitulosLayout = new javax.swing.GroupLayout(FunndoCadastroTitulos);
        FunndoCadastroTitulos.setLayout(FunndoCadastroTitulosLayout);
        FunndoCadastroTitulosLayout.setHorizontalGroup(
            FunndoCadastroTitulosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FunndoCadastroTitulosLayout.createSequentialGroup()
                .addGroup(FunndoCadastroTitulosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(FunndoCadastroTitulosLayout.createSequentialGroup()
                        .addGap(324, 324, 324)
                        .addComponent(LogoTemporada))
                    .addGroup(FunndoCadastroTitulosLayout.createSequentialGroup()
                        .addGap(220, 220, 220)
                        .addComponent(TextoExplicacao))
                    .addGroup(FunndoCadastroTitulosLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(TabelaTemporadaListar, javax.swing.GroupLayout.PREFERRED_SIZE, 652, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(FunndoCadastroTitulosLayout.createSequentialGroup()
                        .addGroup(FunndoCadastroTitulosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(FunndoCadastroTitulosLayout.createSequentialGroup()
                                .addComponent(NomeTorneioLabel)
                                .addGap(3, 3, 3))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FunndoCadastroTitulosLayout.createSequentialGroup()
                                .addGroup(FunndoCadastroTitulosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(AnoLabel)
                                    .addComponent(NomeModalidadeLabel))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(FunndoCadastroTitulosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(FunndoCadastroTitulosLayout.createSequentialGroup()
                                .addComponent(BotaoBuscarTemporada, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BotaoLimparTemporada, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(BotaoDeletarTemporada, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BotaoSairTemporada, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(FunndoCadastroTitulosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(CaixaNomeTorneio)
                                .addComponent(CaixaNomeModalidade)
                                .addComponent(CaixaAno, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        FunndoCadastroTitulosLayout.setVerticalGroup(
            FunndoCadastroTitulosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FunndoCadastroTitulosLayout.createSequentialGroup()
                .addComponent(LogoTemporada)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TextoExplicacao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(FunndoCadastroTitulosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NomeTorneioLabel)
                    .addComponent(CaixaNomeTorneio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(FunndoCadastroTitulosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CaixaNomeModalidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NomeModalidadeLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(FunndoCadastroTitulosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(AnoLabel)
                    .addComponent(CaixaAno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addGroup(FunndoCadastroTitulosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotaoBuscarTemporada)
                    .addComponent(BotaoLimparTemporada)
                    .addComponent(BotaoDeletarTemporada)
                    .addComponent(BotaoSairTemporada))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(TabelaTemporadaListar, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48))
            .addGroup(FunndoCadastroTitulosLayout.createSequentialGroup()
                .addComponent(jLabel6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(FunndoCadastroTitulos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(FunndoCadastroTitulos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotaoSairTemporadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoSairTemporadaActionPerformed
        TelaPrincipal entrar = new TelaPrincipal();
        entrar.setVisible(true);
        dispose();
    }//GEN-LAST:event_BotaoSairTemporadaActionPerformed

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
            java.util.logging.Logger.getLogger(CadastrodeTitulos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastrodeTitulos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastrodeTitulos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastrodeTitulos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastrodeTitulos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AnoLabel;
    private javax.swing.JButton BotaoBuscarTemporada;
    private javax.swing.JButton BotaoDeletarTemporada;
    private javax.swing.JButton BotaoLimparTemporada;
    private javax.swing.JButton BotaoSairTemporada;
    private javax.swing.JTextField CaixaAno;
    private javax.swing.JTextField CaixaNomeModalidade;
    private javax.swing.JTextField CaixaNomeTorneio;
    private javax.swing.JPanel FunndoCadastroTitulos;
    private javax.swing.JLabel LogoTemporada;
    private javax.swing.JLabel NomeModalidadeLabel;
    private javax.swing.JLabel NomeTorneioLabel;
    private javax.swing.JScrollPane TabelaTemporadaListar;
    private javax.swing.JLabel TextoExplicacao;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTable jTable2;
    // End of variables declaration//GEN-END:variables
}
