/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.menuCadastro.empregado;

import java.awt.HeadlessException;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Empregado;
import model.Tratador;
import model.Veterinario;
import model.dao.impl.EmpregadoDAO;
import model.dao.impl.TratadorDAO;
import model.dao.impl.VeterinarioDAO;

/**
 *
 * @author pc
 */
public class FrmListaEmpregado extends javax.swing.JDialog {

    /**
     * Creates new form FrmListaEmpregado
     */
    public FrmListaEmpregado(java.awt.Frame parent, boolean modal) {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jtfPesquisar = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtLista = new javax.swing.JTable();
        jbIncluir = new javax.swing.JButton();
        jbAlterar = new javax.swing.JButton();
        jbExcluir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(700, 330));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                AoAbrir(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(246, 243, 224));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(235, 161, 91));
        jLabel1.setText("Relação de Empregados");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(22, 22, 22))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(276, 276, 276))
        );

        jLabel2.setText("Nome:");

        jtfPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfPesquisarActionPerformed(evt);
            }
        });

        jButton1.setText("Pesquisar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AoPesquisar(evt);
            }
        });

        jtLista.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Código", "Endereço", "Nome", "Telefone", "Função"
            }
        ));
        jtLista.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane1.setViewportView(jtLista);

        jbIncluir.setText("Incluir");
        jbIncluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbIncluircallTelaIncluir(evt);
            }
        });

        jbAlterar.setText("Alterar");
        jbAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aoAlterar(evt);
            }
        });

        jbExcluir.setText("Excluir");
        jbExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbExcluiraoExcluir(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 713, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jbIncluir)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jbAlterar)
                .addGap(14, 14, 14)
                .addComponent(jbExcluir))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(5, 5, 5)
                    .addComponent(jLabel2)
                    .addGap(26, 26, 26)
                    .addComponent(jtfPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 251, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(5, 5, 5)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(48, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbExcluir)
                    .addComponent(jbAlterar)
                    .addComponent(jbIncluir)))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jtfPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton1)
                        .addComponent(jLabel2))
                    .addContainerGap(204, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jtfPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfPesquisarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfPesquisarActionPerformed

    private void AoPesquisar(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AoPesquisar
        preencheTabela(jtfPesquisar.getText());
    }//GEN-LAST:event_AoPesquisar

    private void jbIncluircallTelaIncluir(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbIncluircallTelaIncluir
        FrmCadEmpregado fcf = new FrmCadEmpregado(null, true);
        fcf.setVisible(true);
        preencheTabela(null); //após inserir, ele preenche a tabela atualizando-a
    }//GEN-LAST:event_jbIncluircallTelaIncluir

    private void aoAlterar(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aoAlterar
        if (jtLista.getSelectedRowCount() == 1) {
            FrmCadEmpregado fcf = new FrmCadEmpregado(null, true);

            if (lista.get(jtLista.getSelectedRow()).getFuncao().toString().equals("TRATADOR")) {
                try {
                    Tratador t = new TratadorDAO().buscarUm(lista.get(jtLista.getSelectedRow()).getId());
                    fcf.preparaEditTratador(t);
                    fcf.setVisible(true);
                } catch (ClassNotFoundException | SQLException ex) {
                    JOptionPane.showMessageDialog(null, "Erro ao buscar Tratador\n" + ex);
                }
            } else {
                try {
                    Veterinario v = new VeterinarioDAO().buscarUm(lista.get(jtLista.getSelectedRow()).getId());
                    fcf.preparaEditVet(v);
                    fcf.setVisible(true);
                } catch (ClassNotFoundException | SQLException ex) {
                    JOptionPane.showMessageDialog(null, "Erro ao buscar Veterinario\n" + ex);
                }
            }
//            fcf.preparaEditTratador(Tratador t = lista.get(jtLista.getSelectedRow()));
//            fcf.setVisible(true);
//            preencheTabela();
//           }else if(){
//               fcf.preparaEditVet(lista.get(jtLista.getSelectedRow()));
//                fcf.setVisible(true);
//                preencheTabela();
//           }
            preencheTabela();
        } else {
            JOptionPane.showMessageDialog(null, "Selecione apenas um empregado");
        }

    }//GEN-LAST:event_aoAlterar

    private void preencheTabela() throws HeadlessException {
        preencheTabela(null);
    }

    private void preencheTabela(String nome) throws HeadlessException {
        try {
            if (nome == null) {
                lista = new EmpregadoDAO().buscarTodos();
                //listaVet = new VeterinarioDAO().buscarTodosVet();
            } else {
                lista = new EmpregadoDAO().buscarPeloNome(nome);
                //listaVet = new VeterinarioDAO().buscarVetPeloNome(nome);
            }

            DefaultTableModel dtm = (DefaultTableModel) jtLista.getModel();
            int idx = dtm.getRowCount();
            for (int i = 0; i < idx; i++) {
                dtm.removeRow(0);
            }
            for (Empregado e : lista) {
                Object[] row = {e.getId(), e.getEndereco(), e.getNome(), e.getTelefone(), e.getFuncao().toString()};
                dtm.addRow(row);
            }
            /*for(Empregado funcionarios : lista){
                if(funcionarios.getFuncao().toString().equalsIgnoreCase("TRATADOR")){
                  Object[] row = {funcionarios.getId(),funcionarios.getEndereco(),funcionarios.getNome(), funcionarios.getTelefone(), funcionarios.getFuncao()};
                  
                  dtm.addRow(row);
                }
            }
            for(Veterinario veterinarios : listaVet){
                Object[] row = {veterinarios.getId(),veterinarios.getEndereco(),veterinarios.getNome(), veterinarios.getTelefone(), veterinarios.getFuncao(),veterinarios.getNumeroCRMV(),veterinarios.getDataCRMV()};
                dtm.addRow(row);
            }*/

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Não conseguiu buscar os funcionarios ...");
        }
    }

    private void jbExcluiraoExcluir(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbExcluiraoExcluir
        if (jtLista.getSelectedRowCount() == 1) {
            String nomeEmpregado = (String) jtLista.getValueAt(jtLista.getSelectedRow(), 2);
            if (JOptionPane.showConfirmDialog(this, "Deseja apagar o empregado " + nomeEmpregado + "?", "Atenção",
                    JOptionPane.YES_NO_OPTION + JOptionPane.ERROR_MESSAGE) == JOptionPane.YES_OPTION) {

                int idEmpregado = (int) jtLista.getValueAt(jtLista.getSelectedRow(), 0);
                Empregado e = new Empregado(idEmpregado, "", "", "", null);
                try {
                    new EmpregadoDAO().apagar(e);
                    preencheTabela();
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, "Erro ao apagar o funcionario " + ex);
                }
            }

        } else {
            JOptionPane.showMessageDialog(null, "Selecione apenas um funcionario");
        }
    }//GEN-LAST:event_jbExcluiraoExcluir

    private void AoAbrir(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_AoAbrir
        preencheTabela(null);
    }//GEN-LAST:event_AoAbrir

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
            java.util.logging.Logger.getLogger(FrmListaEmpregado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmListaEmpregado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmListaEmpregado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmListaEmpregado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                FrmListaEmpregado dialog = new FrmListaEmpregado(new javax.swing.JFrame(), true);
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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbAlterar;
    private javax.swing.JButton jbExcluir;
    private javax.swing.JButton jbIncluir;
    private javax.swing.JTable jtLista;
    private javax.swing.JTextField jtfPesquisar;
    // End of variables declaration//GEN-END:variables

    //Variaveis criadas manualmente
    private List<Empregado> lista;
    private List<Veterinario> listaVet;

}
