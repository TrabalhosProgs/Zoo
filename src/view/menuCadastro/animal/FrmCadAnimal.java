/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.menuCadastro.animal;

import java.awt.HeadlessException;
import javax.swing.table.DefaultTableModel;
import java.awt.HeadlessException;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Empregado;
import model.Animal;
import model.Tratador;
import model.Veterinario;
import model.dao.impl.AnimalDAO;
import model.dao.impl.EmpregadoDAO;
import model.dao.impl.TratadorDAO;
import model.dao.impl.VeterinarioDAO;
import view.menuCadastro.empregado.FrmCadEmpregado;

/**
 *
 * @author pc
 */
public class FrmCadAnimal extends javax.swing.JDialog {

    /**
     * Creates new form FrmCadAnimal
     */
    public FrmCadAnimal(java.awt.Frame parent, boolean modal) {
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

        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTVet = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        jTFNome = new javax.swing.JTextField();
        jlNome = new javax.swing.JLabel();
        jlEndereco = new javax.swing.JLabel();
        jTFRegiaoOrigem = new javax.swing.JTextField();
        jlTelefone = new javax.swing.JLabel();
        jTFPeso = new javax.swing.JTextField();
        jTFDataNasc = new javax.swing.JTextField();
        jlTelefone1 = new javax.swing.JLabel();
        jlMatricula = new javax.swing.JLabel();
        jlMatriculaAuto = new javax.swing.JLabel();
        jTFEspecie = new javax.swing.JTextField();
        jlTelefone2 = new javax.swing.JLabel();
        jComboBoxTratador = new javax.swing.JComboBox<>();
        jlFuncao = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                AoAbrir(evt);
            }
        });

        jButton1.setText("Gravar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(246, 243, 224));
        jPanel1.setToolTipText("");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(235, 161, 91));
        jLabel1.setText("Cadastro de Animal");

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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap())
        );

        jTVet.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTVet);

        jLabel8.setText("Tratador Responsável:");

        jlNome.setText("Nome");

        jlEndereco.setText("Região de Origem");

        jTFRegiaoOrigem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFRegiaoOrigemActionPerformed(evt);
            }
        });

        jlTelefone.setText("Especie");

        jlTelefone1.setText("Data de Nascimento");

        jlMatricula.setText("Matrícula");

        jlTelefone2.setText("Peso");

        jComboBoxTratador.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jlFuncao.setText("Tratador Responsável");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlEndereco)
                            .addComponent(jlNome)
                            .addComponent(jlTelefone1)
                            .addComponent(jlMatricula)
                            .addComponent(jlTelefone2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jTFNome)
                                .addComponent(jTFRegiaoOrigem)
                                .addComponent(jTFPeso, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jTFDataNasc, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlMatriculaAuto, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlTelefone)
                            .addComponent(jlFuncao))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTFEspecie, javax.swing.GroupLayout.DEFAULT_SIZE, 235, Short.MAX_VALUE)
                            .addComponent(jComboBoxTratador, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlMatriculaAuto, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlMatricula))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlNome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTFNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFRegiaoOrigem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlEndereco))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFDataNasc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlTelefone1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFPeso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlTelefone2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFEspecie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBoxTratador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlFuncao))
                .addGap(18, 18, 18)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(95, 95, 95)
                .addComponent(jButton1)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        java.util.Date dt = null;
        try {
            dt = sdf.parse(jTFDataNasc.getText());
            try {
                Double peso = Double.parseDouble(jTFPeso.getText());
                
                //Veterinario vet = VeterinarioDAO().buscarUm(0);
                
                
                Animal x = new Animal(0, jTFNome.getText(), jTFRegiaoOrigem.getText(), dt, peso, jTFEspecie.getText(), null, null, null);
                setVisible(false);
                JOptionPane.showMessageDialog(null, "Salvo com sucesso ...");
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "Digite um peso em formato válido (0.0)!");
            }
        } catch (ParseException ex) {
            JOptionPane.showMessageDialog(null, "Digite uma data em formato válido (dd/MM/aaaa)!");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    public void preparaEdit(Animal e) {
        selecionado = e;
        pesoAnimal = Double.valueOf(e.getPeso()).toString();

        jlMatriculaAuto.setText(e.getId() + "");
        jTFNome.setText(e.getNome());
        jTFRegiaoOrigem.setText(e.getRegiaoOrigem());
        jTFDataNasc.setText(e.getDataNasc().toString());
        jTFEspecie.setText(e.getEspecie());
        jTFPeso.setText(pesoAnimal);

    }


    private void AoAbrir(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_AoAbrir
        preencheTabelaVet();
        preencheComboVetResponsavel();

        if (selecionado == null) {
            jlMatricula.setVisible(false);
            jlMatriculaAuto.setVisible(false);
        } else {
            jlMatriculaAuto.setVisible(true);
            jlMatricula.setVisible(true);
        }
    }//GEN-LAST:event_AoAbrir

    private void jTFRegiaoOrigemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFRegiaoOrigemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFRegiaoOrigemActionPerformed

    private void preencheTabelaVet() throws HeadlessException {
        try {

            lista = new EmpregadoDAO().buscarVeterinarios();

            DefaultTableModel dtm = (DefaultTableModel) jTVet.getModel();
            int idx = dtm.getRowCount();
            for (int i = 0; i < idx; i++) {
                dtm.removeRow(0);
            }

            for (Empregado funcionarios : lista) {
                Object[] row = {funcionarios.getId(), funcionarios.getNome(), funcionarios.getTelefone()};
                dtm.addRow(row);

            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Não conseguiu buscar os veterinarios ...");
        }
    }

    public void preencheComboVetResponsavel() throws HeadlessException {
        preencheComboVetResponsavel(null);
    }

    private void preencheComboVetResponsavel(Veterinario vet) {
        try {
            listaVet = new VeterinarioDAO().buscarTodosVet();

            DefaultComboBoxModel<String> dcm = (DefaultComboBoxModel<String>) jComboBoxTratador.getModel();

            dcm.removeAllElements();
            dcm.addElement("Selecione...");

            for (Veterinario t : listaVet) {
                dcm.addElement(t.getNome());
            }
            if (vet != null) {
                jComboBoxTratador.setSelectedItem(vet.getNome());
            }
        } catch (ClassNotFoundException | SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao preencher a lista de tratadores" + ex);
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
            java.util.logging.Logger.getLogger(FrmCadAnimal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmCadAnimal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmCadAnimal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmCadAnimal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                FrmCadAnimal dialog = new FrmCadAnimal(new javax.swing.JFrame(), true);
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
    private javax.swing.JComboBox<String> jComboBoxTratador;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTFDataNasc;
    private javax.swing.JTextField jTFEspecie;
    private javax.swing.JTextField jTFNome;
    private javax.swing.JTextField jTFPeso;
    private javax.swing.JTextField jTFRegiaoOrigem;
    private javax.swing.JTable jTVet;
    private javax.swing.JLabel jlEndereco;
    private javax.swing.JLabel jlFuncao;
    private javax.swing.JLabel jlMatricula;
    private javax.swing.JLabel jlMatriculaAuto;
    private javax.swing.JLabel jlNome;
    private javax.swing.JLabel jlTelefone;
    private javax.swing.JLabel jlTelefone1;
    private javax.swing.JLabel jlTelefone2;
    // End of variables declaration//GEN-END:variables
    private List<Empregado> lista;
    private List<Veterinario> listaVet;
    private List<Tratador> listaTratadores;
    private SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    private Animal selecionado = null;
    String pesoAnimal;

    private Object VeterinarioDAO() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
