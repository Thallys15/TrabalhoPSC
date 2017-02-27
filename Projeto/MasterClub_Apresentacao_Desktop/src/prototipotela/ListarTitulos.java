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
public class ListarTitulos extends javax.swing.JFrame {

    /**
     * Creates new form TelaCampeonatos
     */
    public ListarTitulos() {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        PainelTabelaTit = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TabelaResultadoTit = new javax.swing.JTable();
        BotaoNovoTit = new javax.swing.JButton();
        BotaoEditarTit = new javax.swing.JButton();
        PainelFiltroTit = new javax.swing.JPanel();
        lblNomePatrocinador = new javax.swing.JLabel();
        CampoNomePesquisaDep = new javax.swing.JTextField();
        BotaoLimparDep = new javax.swing.JButton();
        BotaoBuscarDep = new javax.swing.JButton();
        BotaoSairDep = new javax.swing.JButton();
        lblimagem = new javax.swing.JLabel();
        BotaoExcluirTit = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        PainelTabelaTit.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Resultado", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial Narrow", 1, 18))); // NOI18N

        TabelaResultadoTit.setFont(new java.awt.Font("Arial Narrow", 1, 14)); // NOI18N
        TabelaResultadoTit.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Nome", "Temporada"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(TabelaResultadoTit);

        javax.swing.GroupLayout PainelTabelaTitLayout = new javax.swing.GroupLayout(PainelTabelaTit);
        PainelTabelaTit.setLayout(PainelTabelaTitLayout);
        PainelTabelaTitLayout.setHorizontalGroup(
            PainelTabelaTitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelTabelaTitLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
        );
        PainelTabelaTitLayout.setVerticalGroup(
            PainelTabelaTitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelTabelaTitLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        BotaoNovoTit.setFont(new java.awt.Font("Arial Narrow", 1, 16)); // NOI18N
        BotaoNovoTit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/prototipotela/icone/Novo.png"))); // NOI18N
        BotaoNovoTit.setText("Novo");
        BotaoNovoTit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoNovoTitActionPerformed(evt);
            }
        });

        BotaoEditarTit.setFont(new java.awt.Font("Arial Narrow", 1, 16)); // NOI18N
        BotaoEditarTit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/prototipotela/icone/edit.png"))); // NOI18N
        BotaoEditarTit.setText("Editar");
        BotaoEditarTit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoEditarTitActionPerformed(evt);
            }
        });

        PainelFiltroTit.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Pesquisar Títulos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial Narrow", 1, 18))); // NOI18N

        lblNomePatrocinador.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        lblNomePatrocinador.setText("Nome");

        BotaoLimparDep.setBackground(new java.awt.Color(255, 255, 255));
        BotaoLimparDep.setFont(new java.awt.Font("Arial Narrow", 1, 16)); // NOI18N
        BotaoLimparDep.setIcon(new javax.swing.ImageIcon(getClass().getResource("/prototipotela/icone/limpar.png"))); // NOI18N
        BotaoLimparDep.setText("Limpar");
        BotaoLimparDep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoLimparDepActionPerformed(evt);
            }
        });

        BotaoBuscarDep.setFont(new java.awt.Font("Arial Narrow", 1, 16)); // NOI18N
        BotaoBuscarDep.setIcon(new javax.swing.ImageIcon(getClass().getResource("/prototipotela/icone/1474448538_magnifyingglass.png"))); // NOI18N
        BotaoBuscarDep.setText("Buscar");

        BotaoSairDep.setFont(new java.awt.Font("Arial Narrow", 1, 14)); // NOI18N
        BotaoSairDep.setIcon(new javax.swing.ImageIcon(getClass().getResource("/prototipotela/icone/1473722394_No.png"))); // NOI18N
        BotaoSairDep.setText("Sair");
        BotaoSairDep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoSairDepActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PainelFiltroTitLayout = new javax.swing.GroupLayout(PainelFiltroTit);
        PainelFiltroTit.setLayout(PainelFiltroTitLayout);
        PainelFiltroTitLayout.setHorizontalGroup(
            PainelFiltroTitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelFiltroTitLayout.createSequentialGroup()
                .addGroup(PainelFiltroTitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PainelFiltroTitLayout.createSequentialGroup()
                        .addGap(105, 105, 105)
                        .addComponent(lblNomePatrocinador)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(CampoNomePesquisaDep, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PainelFiltroTitLayout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addComponent(BotaoLimparDep)
                        .addGap(18, 18, 18)
                        .addComponent(BotaoBuscarDep, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(BotaoSairDep, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        PainelFiltroTitLayout.setVerticalGroup(
            PainelFiltroTitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelFiltroTitLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(PainelFiltroTitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CampoNomePesquisaDep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNomePatrocinador))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addGroup(PainelFiltroTitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotaoLimparDep, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotaoBuscarDep, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotaoSairDep, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(63, 63, 63))
        );

        lblimagem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/prototipotela/img/0000000362021_img.png"))); // NOI18N

        BotaoExcluirTit.setFont(new java.awt.Font("Arial Narrow", 1, 16)); // NOI18N
        BotaoExcluirTit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/prototipotela/icone/delete.png"))); // NOI18N
        BotaoExcluirTit.setText("Excluir");
        BotaoExcluirTit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoExcluirTitActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/prototipotela/img/MUFCBR_Premier League.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(PainelFiltroTit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(BotaoNovoTit, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(BotaoEditarTit)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(BotaoExcluirTit))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(PainelTabelaTit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblimagem)))
                .addGap(16, 16, 16))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(PainelFiltroTit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 7, Short.MAX_VALUE))
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(PainelTabelaTit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BotaoEditarTit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(BotaoExcluirTit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(BotaoNovoTit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblimagem)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotaoNovoTitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoNovoTitActionPerformed
        TelaCadastrodeTitulos abrir = new TelaCadastrodeTitulos();
        abrir.setVisible(true);
        abrir.setLocationRelativeTo(null);
        dispose();
    }//GEN-LAST:event_BotaoNovoTitActionPerformed

    private void BotaoEditarTitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoEditarTitActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BotaoEditarTitActionPerformed

    private void BotaoLimparDepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoLimparDepActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BotaoLimparDepActionPerformed

    private void BotaoSairDepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoSairDepActionPerformed
        dispose();
    }//GEN-LAST:event_BotaoSairDepActionPerformed

    private void BotaoExcluirTitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoExcluirTitActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BotaoExcluirTitActionPerformed

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
            java.util.logging.Logger.getLogger(ListarTitulos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ListarTitulos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ListarTitulos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ListarTitulos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ListarTitulos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotaoBuscarDep;
    private javax.swing.JButton BotaoEditarTit;
    private javax.swing.JButton BotaoExcluirTit;
    private javax.swing.JButton BotaoLimparDep;
    private javax.swing.JButton BotaoNovoTit;
    private javax.swing.JButton BotaoSairDep;
    private javax.swing.JTextField CampoNomePesquisaDep;
    private javax.swing.JPanel PainelFiltroTit;
    private javax.swing.JPanel PainelTabelaTit;
    private javax.swing.JTable TabelaResultadoTit;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblNomePatrocinador;
    private javax.swing.JLabel lblimagem;
    // End of variables declaration//GEN-END:variables
}
