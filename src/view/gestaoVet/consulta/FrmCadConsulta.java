/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.gestaoVet.consulta;

import java.awt.HeadlessException;
import java.sql.SQLException;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import model.Animal;
import model.Consulta;
import model.Tratador;
import model.Veterinario;
import model.dao.impl.AnimalDAO;
import model.dao.impl.TratadorDAO;
import model.dao.impl.VeterinarioDAO;

/**
 *
 * @author pc
 */
public class FrmCadConsulta extends javax.swing.JDialog {

    /**
     * Creates new form FrmCadConsulta
     */
    public FrmCadConsulta(java.awt.Frame parent, boolean modal) {
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

        jPanelCabecalho1 = new javax.swing.JPanel();
        ljTituloCabecalho1 = new javax.swing.JLabel();
        jlAtendimento = new javax.swing.JLabel();
        jComboBoxAnimal = new javax.swing.JComboBox<>();
        jlAtendimento1 = new javax.swing.JLabel();
        jComboBoxVeterinario = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jLCodigo = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTConsultaPrevista = new javax.swing.JTextField();
        jTConsultaRealizada = new javax.swing.JTextField();
        jLCodigoAuto = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                AoAbrir(evt);
            }
        });

        jPanelCabecalho1.setBackground(new java.awt.Color(246, 243, 224));

        ljTituloCabecalho1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        ljTituloCabecalho1.setForeground(new java.awt.Color(235, 161, 91));
        ljTituloCabecalho1.setText("Cadastro de Consulta");

        javax.swing.GroupLayout jPanelCabecalho1Layout = new javax.swing.GroupLayout(jPanelCabecalho1);
        jPanelCabecalho1.setLayout(jPanelCabecalho1Layout);
        jPanelCabecalho1Layout.setHorizontalGroup(
            jPanelCabecalho1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCabecalho1Layout.createSequentialGroup()
                .addGap(147, 147, 147)
                .addComponent(ljTituloCabecalho1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelCabecalho1Layout.setVerticalGroup(
            jPanelCabecalho1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelCabecalho1Layout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addComponent(ljTituloCabecalho1)
                .addContainerGap())
        );

        jlAtendimento.setText("Animal");

        jComboBoxAnimal.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBoxAnimal.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jComboBoxAnimalVerificar(evt);
            }
        });
        jComboBoxAnimal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxAnimalActionPerformed(evt);
            }
        });

        jlAtendimento1.setText("Veterinario");

        jComboBoxVeterinario.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBoxVeterinario.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jComboBoxVeterinarioVerificar(evt);
            }
        });
        jComboBoxVeterinario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxVeterinarioActionPerformed(evt);
            }
        });

        jButton1.setText("Gravar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel3.setText(" Agenda Consulta (Data/Hora)");

        jLabel4.setText("Relização Consulta (Data/Hora)");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelCabecalho1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 169, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLCodigoAuto, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jTConsultaPrevista, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTConsultaRealizada)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jlAtendimento1, javax.swing.GroupLayout.DEFAULT_SIZE, 185, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBoxVeterinario, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton1))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jlAtendimento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBoxAnimal, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanelCabecalho1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLCodigo, javax.swing.GroupLayout.DEFAULT_SIZE, 14, Short.MAX_VALUE)
                    .addComponent(jLCodigoAuto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTConsultaPrevista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTConsultaRealizada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBoxAnimal, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlAtendimento, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlAtendimento1, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxVeterinario, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBoxAnimalVerificar(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jComboBoxAnimalVerificar

    }//GEN-LAST:event_jComboBoxAnimalVerificar

    private void jComboBoxAnimalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxAnimalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxAnimalActionPerformed

    private void jComboBoxVeterinarioVerificar(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jComboBoxVeterinarioVerificar
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxVeterinarioVerificar

    private void jComboBoxVeterinarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxVeterinarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxVeterinarioActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void AoAbrir(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_AoAbrir
        preencheComboVet();
        preencheAnimal();
    }//GEN-LAST:event_AoAbrir

    public void preencheAnimal() throws HeadlessException {
        preencheAnimal(null);
    }
    
    public void preparaEdit(Consulta t) {
        selecionado = t;

        jLCodigo.setText("Código");
        jLCodigoAuto.setText(t.getId() + "");
        
    }

    private void preencheAnimal(Animal v) {
        try {
            listaAnimais = new AnimalDAO().buscarTodos();

            DefaultComboBoxModel<String> dcm = (DefaultComboBoxModel<String>) jComboBoxAnimal.getModel();

            dcm.removeAllElements();
            dcm.addElement("Selecione...");

            for (Animal t : listaAnimais) {
                dcm.addElement(t.getNome());
            }
            if (v != null) {
                jComboBoxAnimal.setSelectedItem(v.getNome());
            }
        } catch (ClassNotFoundException | SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao preencher a lista de animais" + ex);
        }
        
    }
    
    public void preencheComboVet() throws HeadlessException {
        preencheComboVet(null);
    }

    private void preencheComboVet(Tratador v) {
        try {
            lista = new VeterinarioDAO().buscarTodosVet();

            DefaultComboBoxModel<String> dcm = (DefaultComboBoxModel<String>) jComboBoxVeterinario.getModel();

            dcm.removeAllElements();
            dcm.addElement("Selecione...");

            for (Veterinario t : lista) {
                dcm.addElement(t.getNome());
            }
            if (v != null) {
                jComboBoxVeterinario.setSelectedItem(v.getNome());
            }
        } catch (ClassNotFoundException | SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao preencher a lista de veterinarios" + ex);
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
            java.util.logging.Logger.getLogger(FrmCadConsulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmCadConsulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmCadConsulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmCadConsulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                FrmCadConsulta dialog = new FrmCadConsulta(new javax.swing.JFrame(), true);
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
    private javax.swing.JComboBox<String> jComboBoxAnimal;
    private javax.swing.JComboBox<String> jComboBoxVeterinario;
    private javax.swing.JLabel jLCodigo;
    private javax.swing.JLabel jLCodigoAuto;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanelCabecalho1;
    private javax.swing.JTextField jTConsultaPrevista;
    private javax.swing.JTextField jTConsultaRealizada;
    private javax.swing.JLabel jlAtendimento;
    private javax.swing.JLabel jlAtendimento1;
    private javax.swing.JLabel ljTituloCabecalho1;
    // End of variables declaration//GEN-END:variables

    private List<Tratador> listaTratadores;
    private List<Animal> listaAnimais;
    private List<Veterinario> lista;
    private Consulta selecionado = null;


}
