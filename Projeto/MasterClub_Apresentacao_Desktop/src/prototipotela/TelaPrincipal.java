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
public class TelaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form TelaPrincipal
     */
    public TelaPrincipal() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        BarraMenuTelaPrincipal = new javax.swing.JMenuBar();
        BarraMenuCadastro = new javax.swing.JMenu();
        ItemCadJogadores = new javax.swing.JMenuItem();
        ItemCadFuncionario = new javax.swing.JMenuItem();
        ItemCadPatrocinadores = new javax.swing.JMenuItem();
        BarraMenuDepartamentos = new javax.swing.JMenu();
        ItemDepartamentoFutebol = new javax.swing.JMenuItem();
        ItemDepartamentoMarketing = new javax.swing.JMenuItem();
        ItemDepMedico = new javax.swing.JMenuItem();
        ItemInfraestrutura = new javax.swing.JMenuItem();
        BarraMenuCampeonato = new javax.swing.JMenu();
        ItemInserirTorneio = new javax.swing.JMenuItem();
        ItemTemporada = new javax.swing.JMenuItem();
        ItemTitulos = new javax.swing.JMenuItem();
        BarraMenuFinanceiro = new javax.swing.JMenu();
        ItemContratacoes = new javax.swing.JMenuItem();
        ItemEmprestimos = new javax.swing.JMenuItem();
        ItemVendas = new javax.swing.JMenuItem();
        ItemPatrocinadores = new javax.swing.JMenuItem();
        BarraMenuSobre = new javax.swing.JMenu();
        BarraMenuSair = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setExtendedState(6);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/prototipotela/img/MasteClubLogo.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(607, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(593, 593, 593))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(171, 171, 171)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(299, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(-50, 0, 1500, 730);

        BarraMenuTelaPrincipal.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N

        BarraMenuCadastro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/prototipotela/icone/1474060543_school_events.png"))); // NOI18N
        BarraMenuCadastro.setText("Cadastro");
        BarraMenuCadastro.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N

        ItemCadJogadores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/prototipotela/icone/1474063085_football.png"))); // NOI18N
        ItemCadJogadores.setText("Jogadores");
        ItemCadJogadores.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
                ItemCadJogadoresAncestorMoved(evt);
            }
        });
        ItemCadJogadores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItemCadJogadoresActionPerformed(evt);
            }
        });
        BarraMenuCadastro.add(ItemCadJogadores);

        ItemCadFuncionario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/prototipotela/icone/1474063801_icon-person.png"))); // NOI18N
        ItemCadFuncionario.setText("Funcionários");
        ItemCadFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItemCadFuncionarioActionPerformed(evt);
            }
        });
        BarraMenuCadastro.add(ItemCadFuncionario);

        ItemCadPatrocinadores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/prototipotela/icone/1474063975_nike.png"))); // NOI18N
        ItemCadPatrocinadores.setText("Patrocinadores");
        ItemCadPatrocinadores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItemCadPatrocinadoresActionPerformed(evt);
            }
        });
        BarraMenuCadastro.add(ItemCadPatrocinadores);

        BarraMenuTelaPrincipal.add(BarraMenuCadastro);

        BarraMenuDepartamentos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/prototipotela/icone/1474061041_companies.png"))); // NOI18N
        BarraMenuDepartamentos.setText("Departamentos");
        BarraMenuDepartamentos.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N

        ItemDepartamentoFutebol.setIcon(new javax.swing.ImageIcon(getClass().getResource("/prototipotela/icone/1474066799_Football_2-09.png"))); // NOI18N
        ItemDepartamentoFutebol.setText("Departamento de Futebol");
        ItemDepartamentoFutebol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItemDepartamentoFutebolActionPerformed(evt);
            }
        });
        BarraMenuDepartamentos.add(ItemDepartamentoFutebol);

        ItemDepartamentoMarketing.setIcon(new javax.swing.ImageIcon(getClass().getResource("/prototipotela/icone/1474067021_vector_65_10.png"))); // NOI18N
        ItemDepartamentoMarketing.setText("Departamento de Marketing");
        BarraMenuDepartamentos.add(ItemDepartamentoMarketing);

        ItemDepMedico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/prototipotela/icone/1474066900_cross_1.png"))); // NOI18N
        ItemDepMedico.setText("Departamento Médico");
        ItemDepMedico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItemDepMedicoActionPerformed(evt);
            }
        });
        BarraMenuDepartamentos.add(ItemDepMedico);

        ItemInfraestrutura.setIcon(new javax.swing.ImageIcon(getClass().getResource("/prototipotela/icone/1474066748_Football_2-17.png"))); // NOI18N
        ItemInfraestrutura.setText("Dependencias");
        ItemInfraestrutura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItemInfraestruturaActionPerformed(evt);
            }
        });
        BarraMenuDepartamentos.add(ItemInfraestrutura);

        BarraMenuTelaPrincipal.add(BarraMenuDepartamentos);

        BarraMenuCampeonato.setIcon(new javax.swing.ImageIcon(getClass().getResource("/prototipotela/icone/1474061836_trophy.png"))); // NOI18N
        BarraMenuCampeonato.setText("Campeonatos");
        BarraMenuCampeonato.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N

        ItemInserirTorneio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/prototipotela/icone/1474067356_compose.png"))); // NOI18N
        ItemInserirTorneio.setText("Inserir Torneio");
        BarraMenuCampeonato.add(ItemInserirTorneio);

        ItemTemporada.setIcon(new javax.swing.ImageIcon(getClass().getResource("/prototipotela/icone/1474067408_calendar.png"))); // NOI18N
        ItemTemporada.setText("Temporada");
        BarraMenuCampeonato.add(ItemTemporada);

        ItemTitulos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/prototipotela/icone/1474067531_trophy.png"))); // NOI18N
        ItemTitulos.setText("Títulos");
        BarraMenuCampeonato.add(ItemTitulos);

        BarraMenuTelaPrincipal.add(BarraMenuCampeonato);

        BarraMenuFinanceiro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/prototipotela/icone/1474060852_03.png"))); // NOI18N
        BarraMenuFinanceiro.setText("Financeiro");
        BarraMenuFinanceiro.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N

        ItemContratacoes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/prototipotela/icone/1474067819_vector_65_12.png"))); // NOI18N
        ItemContratacoes.setText("Contratações");
        ItemContratacoes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItemContratacoesActionPerformed(evt);
            }
        });
        BarraMenuFinanceiro.add(ItemContratacoes);

        ItemEmprestimos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/prototipotela/icone/1474067951_finance-23.png"))); // NOI18N
        ItemEmprestimos.setText("Empréstimos");
        BarraMenuFinanceiro.add(ItemEmprestimos);

        ItemVendas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/prototipotela/icone/1474068036_Cart.png"))); // NOI18N
        ItemVendas.setText("Vendas");
        BarraMenuFinanceiro.add(ItemVendas);

        ItemPatrocinadores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/prototipotela/icone/1474067698_visa.png"))); // NOI18N
        ItemPatrocinadores.setText("Patrocinadores");
        BarraMenuFinanceiro.add(ItemPatrocinadores);

        BarraMenuTelaPrincipal.add(BarraMenuFinanceiro);

        BarraMenuSobre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/prototipotela/icone/1474061215_19.png"))); // NOI18N
        BarraMenuSobre.setText("Sobre");
        BarraMenuSobre.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        BarraMenuTelaPrincipal.add(BarraMenuSobre);

        BarraMenuSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/prototipotela/icone/1474061346_Shutdown_Box_Red.png"))); // NOI18N
        BarraMenuSair.setText("Sair");
        BarraMenuSair.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        BarraMenuSair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BarraMenuSairMouseClicked(evt);
            }
        });
        BarraMenuSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BarraMenuSairActionPerformed(evt);
            }
        });
        BarraMenuTelaPrincipal.add(BarraMenuSair);

        setJMenuBar(BarraMenuTelaPrincipal);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void ItemCadJogadoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemCadJogadoresActionPerformed
        TelaCadastroJogadores tela = new TelaCadastroJogadores();
        tela.setVisible(true);
        tela.setLocationRelativeTo(null);
    }//GEN-LAST:event_ItemCadJogadoresActionPerformed

    private void ItemCadJogadoresAncestorMoved(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_ItemCadJogadoresAncestorMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_ItemCadJogadoresAncestorMoved

    private void BarraMenuSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BarraMenuSairActionPerformed
        TelaLogin sair = new TelaLogin();
        sair.setVisible(true);
        dispose();
    }//GEN-LAST:event_BarraMenuSairActionPerformed

    private void BarraMenuSairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BarraMenuSairMouseClicked
      TelaLogin sair = new TelaLogin();
      sair.setVisible(true);
      dispose();
    }//GEN-LAST:event_BarraMenuSairMouseClicked

    private void ItemCadFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemCadFuncionarioActionPerformed
        TelaCadastroFuncionario tela = new TelaCadastroFuncionario();
        tela.setVisible(true);
        tela.setLocationRelativeTo(null);
        
    }//GEN-LAST:event_ItemCadFuncionarioActionPerformed

    private void ItemCadPatrocinadoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemCadPatrocinadoresActionPerformed
        TelaCadastroPatrocinador tela = new TelaCadastroPatrocinador();
        tela.setVisible(true);
        tela.setLocationRelativeTo(null);
    }//GEN-LAST:event_ItemCadPatrocinadoresActionPerformed

    private void ItemDepartamentoFutebolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemDepartamentoFutebolActionPerformed
        
    }//GEN-LAST:event_ItemDepartamentoFutebolActionPerformed

    private void ItemDepMedicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemDepMedicoActionPerformed
        
    }//GEN-LAST:event_ItemDepMedicoActionPerformed

    private void ItemInfraestruturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemInfraestruturaActionPerformed
        // TODO add your handling code here:
        TelaCadastroDependencias entrar = new TelaCadastroDependencias();
        entrar.setVisible(true);
        entrar.setLocationRelativeTo(null);
    }//GEN-LAST:event_ItemInfraestruturaActionPerformed

    private void ItemContratacoesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemContratacoesActionPerformed
        Contratacoes entrar = new Contratacoes();
        entrar.setVisible(true);
        entrar.setLocationRelativeTo(null);
   
    }//GEN-LAST:event_ItemContratacoesActionPerformed

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
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu BarraMenuCadastro;
    private javax.swing.JMenu BarraMenuCampeonato;
    private javax.swing.JMenu BarraMenuDepartamentos;
    private javax.swing.JMenu BarraMenuFinanceiro;
    private javax.swing.JMenu BarraMenuSair;
    private javax.swing.JMenu BarraMenuSobre;
    private javax.swing.JMenuBar BarraMenuTelaPrincipal;
    private javax.swing.JMenuItem ItemCadFuncionario;
    private javax.swing.JMenuItem ItemCadJogadores;
    private javax.swing.JMenuItem ItemCadPatrocinadores;
    private javax.swing.JMenuItem ItemContratacoes;
    private javax.swing.JMenuItem ItemDepMedico;
    private javax.swing.JMenuItem ItemDepartamentoFutebol;
    private javax.swing.JMenuItem ItemDepartamentoMarketing;
    private javax.swing.JMenuItem ItemEmprestimos;
    private javax.swing.JMenuItem ItemInfraestrutura;
    private javax.swing.JMenuItem ItemInserirTorneio;
    private javax.swing.JMenuItem ItemPatrocinadores;
    private javax.swing.JMenuItem ItemTemporada;
    private javax.swing.JMenuItem ItemTitulos;
    private javax.swing.JMenuItem ItemVendas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
