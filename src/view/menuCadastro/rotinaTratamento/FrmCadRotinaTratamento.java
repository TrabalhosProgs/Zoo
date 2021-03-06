/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.menuCadastro.rotinaTratamento;

import view.menuCadastro.rotinaTratamento.rotinaTarefa.FrmRotinaTarefa;
import java.awt.HeadlessException;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Medicacao;
import model.RotinaTratamento;
import model.Tarefa;
import model.dao.impl.MedicacaoDAO;
import model.dao.impl.RotinaTratamentoDAO;

import model.dao.impl.RotinaTratamentoDAO;
import model.dao.impl.TarefaDAO;
import view.menuCadastro.rotinaTratamento.receita.FrmRotinaReceita;
import view.menuCadastro.tarefa.FrmListaTarefa;

/**
 *
 * @author william
 */
public class FrmCadRotinaTratamento extends javax.swing.JDialog {

    /**
     * Creates new form FrmCadFrequencia
     */
    public FrmCadRotinaTratamento(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
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

        jPanelCabecalho = new javax.swing.JPanel();
        ljTituloCabecalho = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabelCodigo = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabelCodigoTexto = new javax.swing.JLabel();
        jftfData = new javax.swing.JFormattedTextField();
        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtListaTarefa = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jLabelReceita = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtListaMedicamentos = new javax.swing.JTable();
        jButton3 = new javax.swing.JButton();
        jbGravar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Rotina de Tratamento");
        setPreferredSize(new java.awt.Dimension(680, 400));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                aoAbrir(evt);
            }
        });

        jPanelCabecalho.setBackground(new java.awt.Color(246, 243, 224));

        ljTituloCabecalho.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        ljTituloCabecalho.setForeground(new java.awt.Color(235, 161, 91));
        ljTituloCabecalho.setText("Cadastro de Rotina de Tratamento");

        javax.swing.GroupLayout jPanelCabecalhoLayout = new javax.swing.GroupLayout(jPanelCabecalho);
        jPanelCabecalho.setLayout(jPanelCabecalhoLayout);
        jPanelCabecalhoLayout.setHorizontalGroup(
            jPanelCabecalhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelCabecalhoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ljTituloCabecalho)
                .addGap(35, 35, 35))
        );
        jPanelCabecalhoLayout.setVerticalGroup(
            jPanelCabecalhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelCabecalhoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ljTituloCabecalho)
                .addGap(399, 399, 399))
        );

        jLabelCodigo.setText("Código");

        jLabel2.setText("Data");

        jLabelCodigoTexto.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelCodigoTexto.setText("xxx");

        jftfData.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter()));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Tarefas Vinculadas"));

        jButton1.setText("Incluir Tarefa");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inserirTarefa(evt);
            }
        });

        jButton2.setText("Excluir Tarefa");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                excluirTarefa(evt);
            }
        });

        jtListaTarefa.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Código", "Descricao"
            }
        ));
        jScrollPane1.setViewportView(jtListaTarefa);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addGap(7, 7, 7)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Receita Vinculada"));

        jLabelReceita.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        jLabel1.setText("Receita");

        jtListaMedicamentos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Medicamento", "Dose", "Frequencia"
            }
        ));
        jScrollPane2.setViewportView(jtListaMedicamentos);

        jButton3.setText("Selecionar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aoSelecionarReceita(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 285, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelReceita, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jButton3)
                    .addComponent(jLabelReceita, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jbGravar.setText("Gravar");
        jbGravar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbGravarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jbGravar))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabelCodigo)
                                .addGap(18, 18, 18)
                                .addComponent(jLabelCodigoTexto, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(38, 38, 38)
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(jftfData, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel2)
                    .addComponent(jftfData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelCodigo)
                    .addComponent(jLabelCodigoTexto, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbGravar))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelCabecalho, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanelCabecalho, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jbGravarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGravarActionPerformed

        Date dt = null;
        try {
            dt = sdf.parse(jftfData.getText());
            try {
                if (selecionado == null) {
                    incluirSelecionado.setDataValidade(dt);
                    new RotinaTratamentoDAO().inserir(incluirSelecionado);
                    incluirSelecionado.setId(new RotinaTratamentoDAO().buscarMaiorID());
                    gravaTarefas(incluirSelecionado);
                } else {
                    selecionado.setDataValidade(dt);
                    new RotinaTratamentoDAO().alterar(selecionado);
                }
                JOptionPane.showMessageDialog(null, "Salvo com sucesso ...");
                setVisible(false);
            } catch (HeadlessException | ClassNotFoundException | SQLException ex) {
                JOptionPane.showMessageDialog(null, "Erro ao gravar Rotina Tratamento ..." + ex.getMessage());
            }
        } catch (ParseException ex) {
            JOptionPane.showMessageDialog(null, "Digite uma data em formato válido (dd/MM/aaaa)!");
        }


    }//GEN-LAST:event_jbGravarActionPerformed

    private void aoAbrir(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_aoAbrir
        if (selecionado == null) {
            jLabelCodigo.setVisible(false);
            jLabelCodigoTexto.setVisible(false);
        } else {
            jLabelCodigo.setVisible(true);
            jLabelCodigoTexto.setVisible(true);
            preencheTabelaTarefa(selecionado.getId());
            preencheTabelaMedicacoes(selecionado.getReceita().getId());
        }
    }//GEN-LAST:event_aoAbrir

    private void inserirTarefa(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inserirTarefa
        FrmRotinaTarefa frt = new FrmRotinaTarefa(null, true);

        if (selecionado == null) {
            frt.vincularTarefaRotinaInclusao(incluirSelecionado);
            frt.setVisible(true);
            preencheTabelaTarefa(incluirSelecionado);
        } else {
            frt.vincularTarefaRotina(selecionado);
            frt.setVisible(true);
            preencheTabelaTarefa(selecionado.getId());
        }
    }//GEN-LAST:event_inserirTarefa

    private void excluirTarefa(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_excluirTarefa
        if (jtListaTarefa.getSelectedRowCount() == 1) {
            String nomeTarefa = (String) jtListaTarefa.getValueAt(jtListaTarefa.getSelectedRow(), 1);
            if (JOptionPane.showConfirmDialog(this, "Deseja retirar a tarefa " + nomeTarefa + "?", "Atenção",
                    JOptionPane.YES_NO_OPTION + JOptionPane.ERROR_MESSAGE) == JOptionPane.YES_OPTION) {

                int idTarefa = (int) jtListaTarefa.getValueAt(jtListaTarefa.getSelectedRow(), 0);

                if (selecionado == null) {
                    incluirSelecionado.removeTarefa(jtListaTarefa.getSelectedRow());
                    preencheTabelaTarefa(incluirSelecionado);
                } else {
                    try {
                        new RotinaTratamentoDAO().excluirTarefa(selecionado.getId(), idTarefa);
                        preencheTabelaTarefa(selecionado.getId());
                    } catch (HeadlessException | ClassNotFoundException | SQLException ex) {
                        JOptionPane.showMessageDialog(null, "Erro ao desvincular a tarefa " + ex);
                    }
                }
            }

        } else {
            JOptionPane.showMessageDialog(null, "Selecione apenas uma tarefa");
        }
    }//GEN-LAST:event_excluirTarefa

    private void aoSelecionarReceita(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aoSelecionarReceita
        FrmRotinaReceita frr = new FrmRotinaReceita(null, true);
        if (selecionado == null) {
            frr.vincularReceitaRotinaInclusao(incluirSelecionado);
            frr.setVisible(true);
            preencheTabelaMedicacoes(incluirSelecionado);
        } else {
            frr.vincularReceitaRotina(selecionado);
            frr.setVisible(true);
            preencheTabelaMedicacoes(selecionado.getReceita().getId());
        }
    }//GEN-LAST:event_aoSelecionarReceita

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
            java.util.logging.Logger.getLogger(FrmCadRotinaTratamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmCadRotinaTratamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmCadRotinaTratamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmCadRotinaTratamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                FrmCadRotinaTratamento dialog = new FrmCadRotinaTratamento(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    private void preencheTabelaTarefa(int id) throws HeadlessException {
        try {
            listaTarefa = new TarefaDAO().buscarPorRotina(id);

            DefaultTableModel dtm = (DefaultTableModel) jtListaTarefa.getModel();
            int idx = dtm.getRowCount();
            for (int i = 0; i < idx; i++) {
                dtm.removeRow(0);
            }

            for (Tarefa tarefa : listaTarefa) {
                Object[] row = {tarefa.getId(), tarefa.getDescricao()};
                dtm.addRow(row);
            }
        } catch (ClassNotFoundException | SQLException ex) {
            JOptionPane.showMessageDialog(null, "Não conseguiu buscar as Tarefas cadastradas para a Rotina de Tratamento ..." + ex);
        }
    }

    private void preencheTabelaTarefa(RotinaTratamento rt) throws HeadlessException {

        listaTarefa = rt.getTarefas();

        DefaultTableModel dtm = (DefaultTableModel) jtListaTarefa.getModel();
        int idx = dtm.getRowCount();
        for (int i = 0; i < idx; i++) {
            dtm.removeRow(0);
        }

        for (Tarefa tarefa : listaTarefa) {
            Object[] row = {tarefa.getId(), tarefa.getDescricao()};
            dtm.addRow(row);
        }
    }

    private void preencheTabelaMedicacoes(int id) {
        listaMedicacoes = selecionado.getReceita().getMedicacoes();
        DefaultTableModel dtm = (DefaultTableModel) jtListaMedicamentos.getModel();
        int idx = dtm.getRowCount();
        for (int i = 0; i < idx; i++) {
            dtm.removeRow(0);
        }

        for (Medicacao m : listaMedicacoes) {
            //medicamento, dose, frequencia
            Object[] row = {m.getMedicamento().getNome(), m.getDose(), m.getFrequencia().getDescricao()};
            dtm.addRow(row);
        }
        jLabelReceita.setText(selecionado.getReceita().getId() + "");
    }

    private void preencheTabelaMedicacoes(RotinaTratamento rt) {

        listaMedicacoes = rt.getReceita().getMedicacoes();

        DefaultTableModel dtm = (DefaultTableModel) jtListaMedicamentos.getModel();
        int idx = dtm.getRowCount();
        for (int i = 0; i < idx; i++) {
            dtm.removeRow(0);
        }

        for (Medicacao m : listaMedicacoes) {
            //medicamento, dose, frequencia
            Object[] row = {m.getMedicamento().getNome(), m.getDose(), m.getFrequencia().getDescricao()};
            dtm.addRow(row);
        }
        jLabelReceita.setText(incluirSelecionado.getReceita().getId() + "");

    }

    public void preparaEdit(RotinaTratamento rotinaTratamento) {
        selecionado = rotinaTratamento;

        jftfData.setText(sdf.format(rotinaTratamento.getDataValidade()));
        jLabelCodigoTexto.setText(rotinaTratamento.getId() + "");
    }

    public void preparaInclusao(RotinaTratamento rotinaTratamento) {
        incluirSelecionado = rotinaTratamento;
        try {
            incluirSelecionado.setId(new RotinaTratamentoDAO().buscarMaiorID() + 1);
        } catch (ClassNotFoundException | SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao buscar maior id..." + ex);
        }

        jLabelCodigoTexto.setText(incluirSelecionado.getId() + "");
    }

    private void gravaTarefas(RotinaTratamento incluirSelecionado) {
        for (Tarefa t : incluirSelecionado.getTarefas()) {
            try {
                new RotinaTratamentoDAO().inserirTarefa(incluirSelecionado.getId(), t.getId());
            } catch (ClassNotFoundException | SQLException ex) {
                JOptionPane.showMessageDialog(null, "Não foi possivel gravar tarefas..." + ex);
            }
        }
    }

    //Variaveis criadas manualmente
    private RotinaTratamento selecionado = null;
    private RotinaTratamento incluirSelecionado = null;
    private SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    private List<Tarefa> listaTarefa;
    private List<Medicacao> listaMedicacoes;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelCodigo;
    private javax.swing.JLabel jLabelCodigoTexto;
    private javax.swing.JLabel jLabelReceita;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanelCabecalho;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton jbGravar;
    private javax.swing.JFormattedTextField jftfData;
    private javax.swing.JTable jtListaMedicamentos;
    private javax.swing.JTable jtListaTarefa;
    private javax.swing.JLabel ljTituloCabecalho;
    // End of variables declaration//GEN-END:variables

}
