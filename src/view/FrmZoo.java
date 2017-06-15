/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import view.tabela.FrmListaFrequencia;
import view.tabela.FrmListaMedicamento;
import view.tabela.FrmListaTarefa;
import view.tabela.FrmListaVacina;
/**
 *
 * @author william
 */
public class FrmZoo extends javax.swing.JFrame {

    /**
     * Creates new form FrmZoo
     */
    public FrmZoo() {
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
        jLabel2 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuCadastro = new javax.swing.JMenu();
        jmiAnimais = new javax.swing.JMenuItem();
        jmiEmpregado = new javax.swing.JMenuItem();
        jMenuGestaoTratador = new javax.swing.JMenu();
        jmiBoletimDiario = new javax.swing.JMenuItem();
        jmiRotinaTratamento = new javax.swing.JMenuItem();
        jMenuGestaoVeterinario = new javax.swing.JMenu();
        jmiAgendaConsultas = new javax.swing.JMenuItem();
        jmiBoletimSaude = new javax.swing.JMenuItem();
        jmiTabelas = new javax.swing.JMenu();
        jmiTarefa = new javax.swing.JMenuItem();
        jMenuMedicamento = new javax.swing.JMenu();
        jmiMedicamento = new javax.swing.JMenuItem();
        jmiFrequencia = new javax.swing.JMenuItem();
        jmiVacina = new javax.swing.JMenuItem();
        jMenuAjuda = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Zoo");
        setPreferredSize(new java.awt.Dimension(800, 600));

        jPanel1.setBackground(new java.awt.Color(246, 243, 224));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/telaIni.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 151, Short.MAX_VALUE)
                .addComponent(jLabel1))
        );

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(235, 161, 91));
        jLabel2.setText("Gestão Zoo");

        jMenuCadastro.setText("Cadastro");

        jmiAnimais.setText("Animais");
        jMenuCadastro.add(jmiAnimais);

        jmiEmpregado.setText("Empregado");
        jMenuCadastro.add(jmiEmpregado);

        jMenuBar1.add(jMenuCadastro);

        jMenuGestaoTratador.setText("Gestão Tratamento");

        jmiBoletimDiario.setText("Boletim Diario");
        jmiBoletimDiario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiBoletimDiarioActionPerformed(evt);
            }
        });
        jMenuGestaoTratador.add(jmiBoletimDiario);

        jmiRotinaTratamento.setText("Rotina Tratamento");
        jMenuGestaoTratador.add(jmiRotinaTratamento);

        jMenuBar1.add(jMenuGestaoTratador);

        jMenuGestaoVeterinario.setText("Gestão Veterinária");

        jmiAgendaConsultas.setText("Agenda Consultas");
        jMenuGestaoVeterinario.add(jmiAgendaConsultas);

        jmiBoletimSaude.setText("Boletim Saúde");
        jMenuGestaoVeterinario.add(jmiBoletimSaude);

        jMenuBar1.add(jMenuGestaoVeterinario);

        jmiTabelas.setText("Tabelas");

        jmiTarefa.setText("Tarefas");
        jmiTarefa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                callAbreTelaListaTarefa(evt);
            }
        });
        jmiTabelas.add(jmiTarefa);

        jMenuMedicamento.setText("Medicamentos");

        jmiMedicamento.setText("Medicamentos");
        jmiMedicamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                callAbreTelaListaMedicamento(evt);
            }
        });
        jMenuMedicamento.add(jmiMedicamento);

        jmiFrequencia.setText("Frequencia");
        jmiFrequencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                callAbreTelaListaFrequencia(evt);
            }
        });
        jMenuMedicamento.add(jmiFrequencia);

        jmiTabelas.add(jMenuMedicamento);

        jmiVacina.setText("Vacinas");
        jmiVacina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                callAbreTelaListaVacina(evt);
            }
        });
        jmiTabelas.add(jmiVacina);

        jMenuBar1.add(jmiTabelas);

        jMenuAjuda.setText("Ajuda");
        jMenuBar1.add(jMenuAjuda);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addComponent(jLabel2))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel2))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jmiBoletimDiarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiBoletimDiarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jmiBoletimDiarioActionPerformed

    private void callAbreTelaListaVacina(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_callAbreTelaListaVacina
        FrmListaVacina fListaVacina = new FrmListaVacina(this, true);
        fListaVacina.setVisible(true);
    }//GEN-LAST:event_callAbreTelaListaVacina

    private void callAbreTelaListaTarefa(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_callAbreTelaListaTarefa
        FrmListaTarefa fListaTarefa = new FrmListaTarefa(this, true);
        fListaTarefa.setVisible(true);
    }//GEN-LAST:event_callAbreTelaListaTarefa

    private void callAbreTelaListaMedicamento(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_callAbreTelaListaMedicamento
        FrmListaMedicamento fListaMedicamento = new FrmListaMedicamento(this, true);
        fListaMedicamento.setVisible(true);
    }//GEN-LAST:event_callAbreTelaListaMedicamento

    private void callAbreTelaListaFrequencia(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_callAbreTelaListaFrequencia
        FrmListaFrequencia fListaFrequencia = new FrmListaFrequencia(this, true);
        fListaFrequencia.setVisible(true);
    }//GEN-LAST:event_callAbreTelaListaFrequencia

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
            java.util.logging.Logger.getLogger(FrmZoo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmZoo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmZoo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmZoo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmZoo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenuAjuda;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenuCadastro;
    private javax.swing.JMenu jMenuGestaoTratador;
    private javax.swing.JMenu jMenuGestaoVeterinario;
    private javax.swing.JMenu jMenuMedicamento;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JMenuItem jmiAgendaConsultas;
    private javax.swing.JMenuItem jmiAnimais;
    private javax.swing.JMenuItem jmiBoletimDiario;
    private javax.swing.JMenuItem jmiBoletimSaude;
    private javax.swing.JMenuItem jmiEmpregado;
    private javax.swing.JMenuItem jmiFrequencia;
    private javax.swing.JMenuItem jmiMedicamento;
    private javax.swing.JMenuItem jmiRotinaTratamento;
    private javax.swing.JMenu jmiTabelas;
    private javax.swing.JMenuItem jmiTarefa;
    private javax.swing.JMenuItem jmiVacina;
    // End of variables declaration//GEN-END:variables
}
