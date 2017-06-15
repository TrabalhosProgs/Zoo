/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.tabela;

import java.awt.HeadlessException;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Vacina;
import model.dao.impl.VacinaDAO;
import view.tabela.cad.FrmCadVacina;

/**
 *
 * @author william
 */
public class FrmListaVacina extends javax.swing.JDialog {

    /**
     * Creates new form FrmListaVacina
     */
    public FrmListaVacina(java.awt.Frame parent, boolean modal) {
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
        jPanelPesquisa = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtLista = new javax.swing.JTable();
        jLabelNomePesquisa = new javax.swing.JLabel();
        jtfPesquisar = new javax.swing.JTextField();
        jbPesquisar = new javax.swing.JButton();
        jbExcluir = new javax.swing.JButton();
        jbAlterar = new javax.swing.JButton();
        jbIncluir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Relação de Vacinas");
        setPreferredSize(new java.awt.Dimension(600, 400));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                aoAbrir(evt);
            }
        });

        jPanelCabecalho.setBackground(new java.awt.Color(246, 243, 224));

        ljTituloCabecalho.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        ljTituloCabecalho.setForeground(new java.awt.Color(235, 161, 91));
        ljTituloCabecalho.setText("Relação de Vacinas");

        javax.swing.GroupLayout jPanelCabecalhoLayout = new javax.swing.GroupLayout(jPanelCabecalho);
        jPanelCabecalho.setLayout(jPanelCabecalhoLayout);
        jPanelCabecalhoLayout.setHorizontalGroup(
            jPanelCabecalhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCabecalhoLayout.createSequentialGroup()
                .addGap(131, 131, 131)
                .addComponent(ljTituloCabecalho)
                .addContainerGap(139, Short.MAX_VALUE))
        );
        jPanelCabecalhoLayout.setVerticalGroup(
            jPanelCabecalhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelCabecalhoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ljTituloCabecalho)
                .addContainerGap())
        );

        jtLista.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Código", "Descricão"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jtLista);
        if (jtLista.getColumnModel().getColumnCount() > 0) {
            jtLista.getColumnModel().getColumn(0).setPreferredWidth(5);
        }

        jLabelNomePesquisa.setText("Nome:");

        jbPesquisar.setText("Pesquisar");
        jbPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aoPesquisar(evt);
            }
        });

        jbExcluir.setText("Excluir");
        jbExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aoExcluir(evt);
            }
        });

        jbAlterar.setText("Alterar");
        jbAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                callTelaIAlterar(evt);
            }
        });

        jbIncluir.setText("Incluir");
        jbIncluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                callTelaIncluir(evt);
            }
        });

        javax.swing.GroupLayout jPanelPesquisaLayout = new javax.swing.GroupLayout(jPanelPesquisa);
        jPanelPesquisa.setLayout(jPanelPesquisaLayout);
        jPanelPesquisaLayout.setHorizontalGroup(
            jPanelPesquisaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addGroup(jPanelPesquisaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelPesquisaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelPesquisaLayout.createSequentialGroup()
                        .addComponent(jLabelNomePesquisa)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jtfPesquisar)
                        .addGap(18, 18, 18)
                        .addComponent(jbPesquisar)
                        .addGap(21, 21, 21))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelPesquisaLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jbIncluir)
                        .addGap(18, 18, 18)
                        .addComponent(jbAlterar)
                        .addGap(18, 18, 18)
                        .addComponent(jbExcluir))))
        );
        jPanelPesquisaLayout.setVerticalGroup(
            jPanelPesquisaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelPesquisaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelPesquisaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNomePesquisa)
                    .addComponent(jtfPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbPesquisar))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE)
                .addGap(9, 9, 9)
                .addGroup(jPanelPesquisaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbExcluir)
                    .addComponent(jbAlterar)
                    .addComponent(jbIncluir))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelCabecalho, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanelPesquisa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanelCabecalho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelPesquisa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void callTelaIncluir(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_callTelaIncluir
        FrmCadVacina fcv = new FrmCadVacina(null, true);
        fcv.setVisible(true);
        
        preencheTabela(null); //após inserir, ele preenche a tabela atualizando-a
    }//GEN-LAST:event_callTelaIncluir

    private void callTelaIAlterar(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_callTelaIAlterar
        if(jtLista.getSelectedRowCount() == 1){
           FrmCadVacina fcv = new FrmCadVacina(null, true);
           fcv.preparaEdit(lista.get(jtLista.getSelectedRow()));
           fcv.setVisible(true);
           preencheTabela();
                           
        }else{
            JOptionPane.showMessageDialog(null, "Selecione apenas uma vacina"); 
        }        
    }//GEN-LAST:event_callTelaIAlterar

    private void aoAbrir(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_aoAbrir
        preencheTabela(null);
    }//GEN-LAST:event_aoAbrir

    private void aoPesquisar(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aoPesquisar
         preencheTabela(jtfPesquisar.getText());
    }//GEN-LAST:event_aoPesquisar

    // apagar nao funfou
    private void aoExcluir(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aoExcluir
        if(jtLista.getSelectedRowCount() == 1){
            String nomeVacina = (String) jtLista.getValueAt(jtLista.getSelectedRow(), 1);
            if (JOptionPane.showConfirmDialog(this,"Deseja apagar a vacina "+nomeVacina+"?","Atenção",
                JOptionPane.YES_NO_OPTION + JOptionPane.ERROR_MESSAGE) == JOptionPane.YES_OPTION){
                
                int idVacina =  (int) jtLista.getValueAt(jtLista.getSelectedRow(), 0);
                Vacina v  =  new Vacina(idVacina, "");
                try {
                    new VacinaDAO().apagar(v);
                    preencheTabela();
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, "Erro ao apagar a vacina "+ex); 
                }
            }            
                
        }else{
            JOptionPane.showMessageDialog(null, "Selecione apenas uma vacina"); 
        }
    }//GEN-LAST:event_aoExcluir

    private void preencheTabela() throws HeadlessException {
            preencheTabela(null);
    }
    private void preencheTabela(String nome) throws HeadlessException {
        try {
            
            if(nome == null){
                lista = new VacinaDAO().buscarTodos();
            }else{
                lista = new VacinaDAO().buscarPeloNome(nome);
            }
            DefaultTableModel dtm = (DefaultTableModel) jtLista.getModel();
            int idx = dtm.getRowCount();
            for (int i = 0; i < idx; i++) {
                dtm.removeRow(0);
            }
            
            for(Vacina vacina : lista){
                Object[] row = {vacina.getId(),vacina.getNome()};
                dtm.addRow(row);
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Não conseguiu buscar as vacinas ...");
        }
    }
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
            java.util.logging.Logger.getLogger(FrmListaVacina.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmListaVacina.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmListaVacina.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmListaVacina.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                FrmListaVacina dialog = new FrmListaVacina(new javax.swing.JFrame(), true);
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
    //Variaveis criadas manualmente
    private List<Vacina> lista;
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabelNomePesquisa;
    private javax.swing.JPanel jPanelCabecalho;
    private javax.swing.JPanel jPanelPesquisa;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbAlterar;
    private javax.swing.JButton jbExcluir;
    private javax.swing.JButton jbIncluir;
    private javax.swing.JButton jbPesquisar;
    private javax.swing.JTable jtLista;
    private javax.swing.JTextField jtfPesquisar;
    private javax.swing.JLabel ljTituloCabecalho;
    // End of variables declaration//GEN-END:variables
}
