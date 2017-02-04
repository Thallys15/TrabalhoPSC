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

        try {
            jPanel2 =(javax.swing.JPanel)java.beans.Beans.instantiate(getClass().getClassLoader(), "prototipotela.TelaPrincipal_jPanel2");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (java.io.IOException e) {
            e.printStackTrace();
        }
        jLabel2 = new javax.swing.JLabel();
        BarraMenuTelaPrincipal = new javax.swing.JMenuBar();
        BarraMenuCadastro = new javax.swing.JMenu();
        ItemCadJogadores = new javax.swing.JMenuItem();
        ItemCadComTecnica = new javax.swing.JMenuItem();
        ItemCadFuncionario = new javax.swing.JMenuItem();
        ItemCadPatrocinadores = new javax.swing.JMenuItem();
        BarraMenuDepartamentos = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        ItemDepMedico = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        BarraMenuCampeonato = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        BarraMenuFinanceiro = new javax.swing.JMenu();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenuItem10 = new javax.swing.JMenuItem();
        BarraMenuSobre = new javax.swing.JMenu();
        BarraMenuSair = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/prototipotela/img/MasteClubLogo.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(369, 369, 369)
                .addComponent(jLabel2)
                .addContainerGap(419, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(107, 107, 107)
                .addComponent(jLabel2)
                .addContainerGap(233, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 0, 1010, 510);

        BarraMenuTelaPrincipal.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N

        BarraMenuCadastro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/prototipotela/icone/1474060543_school_events.png"))); // NOI18N
        BarraMenuCadastro.setText("Cadastro");
        BarraMenuCadastro.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N

        ItemCadJogadores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/prototipotela/icone/1474063085_football.png"))); // NOI18N
        ItemCadJogadores.setText("Jogadores");
        ItemCadJogadores.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
                ItemCadJogadoresAncestorMoved(evt);
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        ItemCadJogadores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItemCadJogadoresActionPerformed(evt);
            }
        });
        BarraMenuCadastro.add(ItemCadJogadores);

        ItemCadComTecnica.setIcon(new javax.swing.ImageIcon(getClass().getResource("/prototipotela/icone/1474063520_person_4.png"))); // NOI18N
        ItemCadComTecnica.setText("Comissão Técnica");
        BarraMenuCadastro.add(ItemCadComTecnica);

        ItemCadFuncionario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/prototipotela/icone/1474063801_icon-person.png"))); // NOI18N
        ItemCadFuncionario.setText("Funcionários");
        BarraMenuCadastro.add(ItemCadFuncionario);

        ItemCadPatrocinadores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/prototipotela/icone/1474063975_nike.png"))); // NOI18N
        ItemCadPatrocinadores.setText("Patrocinadores");
        BarraMenuCadastro.add(ItemCadPatrocinadores);

        BarraMenuTelaPrincipal.add(BarraMenuCadastro);

        BarraMenuDepartamentos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/prototipotela/icone/1474061041_companies.png"))); // NOI18N
        BarraMenuDepartamentos.setText("Departamentos");
        BarraMenuDepartamentos.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N

        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/prototipotela/icone/1474066799_Football_2-09.png"))); // NOI18N
        jMenuItem1.setText("Departamento de Futebol");
        BarraMenuDepartamentos.add(jMenuItem1);

        jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/prototipotela/icone/1474067021_vector_65_10.png"))); // NOI18N
        jMenuItem2.setText("Departamento de Marketing");
        BarraMenuDepartamentos.add(jMenuItem2);

        ItemDepMedico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/prototipotela/icone/1474066900_cross_1.png"))); // NOI18N
        ItemDepMedico.setText("Departamento Médico");
        BarraMenuDepartamentos.add(ItemDepMedico);

        jMenuItem3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/prototipotela/icone/1474066748_Football_2-17.png"))); // NOI18N
        jMenuItem3.setText("Infraestrutura");
        BarraMenuDepartamentos.add(jMenuItem3);

        BarraMenuTelaPrincipal.add(BarraMenuDepartamentos);

        BarraMenuCampeonato.setIcon(new javax.swing.ImageIcon(getClass().getResource("/prototipotela/icone/1474061836_trophy.png"))); // NOI18N
        BarraMenuCampeonato.setText("Campeonatos");
        BarraMenuCampeonato.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N

        jMenuItem4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/prototipotela/icone/1474067356_compose.png"))); // NOI18N
        jMenuItem4.setText("Inserir Torneio");
        BarraMenuCampeonato.add(jMenuItem4);

        jMenuItem5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/prototipotela/icone/1474067408_calendar.png"))); // NOI18N
        jMenuItem5.setText("Temporada");
        BarraMenuCampeonato.add(jMenuItem5);

        jMenuItem6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/prototipotela/icone/1474067531_trophy.png"))); // NOI18N
        jMenuItem6.setText("Títulos");
        BarraMenuCampeonato.add(jMenuItem6);

        BarraMenuTelaPrincipal.add(BarraMenuCampeonato);

        BarraMenuFinanceiro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/prototipotela/icone/1474060852_03.png"))); // NOI18N
        BarraMenuFinanceiro.setText("Financeiro");
        BarraMenuFinanceiro.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N

        jMenuItem7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/prototipotela/icone/1474067819_vector_65_12.png"))); // NOI18N
        jMenuItem7.setText("Contratações");
        BarraMenuFinanceiro.add(jMenuItem7);

        jMenuItem8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/prototipotela/icone/1474067951_finance-23.png"))); // NOI18N
        jMenuItem8.setText("Empréstimos");
        BarraMenuFinanceiro.add(jMenuItem8);

        jMenuItem9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/prototipotela/icone/1474068036_Cart.png"))); // NOI18N
        jMenuItem9.setText("Vendas");
        BarraMenuFinanceiro.add(jMenuItem9);

        jMenuItem10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/prototipotela/icone/1474067698_visa.png"))); // NOI18N
        jMenuItem10.setText("Patrocinadores");
        BarraMenuFinanceiro.add(jMenuItem10);

        BarraMenuTelaPrincipal.add(BarraMenuFinanceiro);

        BarraMenuSobre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/prototipotela/icone/1474061215_19.png"))); // NOI18N
        BarraMenuSobre.setText("Sobre");
        BarraMenuSobre.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        BarraMenuTelaPrincipal.add(BarraMenuSobre);

        BarraMenuSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/prototipotela/icone/1474061346_Shutdown_Box_Red.png"))); // NOI18N
        BarraMenuSair.setText("Sair");
        BarraMenuSair.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        BarraMenuTelaPrincipal.add(BarraMenuSair);

        setJMenuBar(BarraMenuTelaPrincipal);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void ItemCadJogadoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemCadJogadoresActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ItemCadJogadoresActionPerformed

    private void ItemCadJogadoresAncestorMoved(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_ItemCadJogadoresAncestorMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_ItemCadJogadoresAncestorMoved

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
    private javax.swing.JMenuItem ItemCadComTecnica;
    private javax.swing.JMenuItem ItemCadFuncionario;
    private javax.swing.JMenuItem ItemCadJogadores;
    private javax.swing.JMenuItem ItemCadPatrocinadores;
    private javax.swing.JMenuItem ItemDepMedico;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}