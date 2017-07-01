/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.menuCadastro.empregado;

import java.sql.Date;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.FXCollections;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.UnsupportedLookAndFeelException;
import model.Empregado;
import model.Veterinario;
import model.dao.impl.EmpregadoDAO;
import model.dao.impl.VeterinarioDAO;
import model.enu.EnumFuncao;

/**
 *
 * @author pc
 */
public class FrmCadEmpregado extends javax.swing.JDialog {

    public FrmCadEmpregado(java.awt.Frame parent, boolean modal) {
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
        jPanelDados = new javax.swing.JPanel();
        jlNome = new javax.swing.JLabel();
        jTFNome = new javax.swing.JTextField();
        jlTelefone = new javax.swing.JLabel();
        jTFTelefone = new javax.swing.JTextField();
        jlEndereco = new javax.swing.JLabel();
        jTFEndereco = new javax.swing.JTextField();
        jlFuncao = new javax.swing.JLabel();
        jlMatricula = new javax.swing.JLabel();
        jPDadosVet = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTFRegistroCRMV = new javax.swing.JTextField();
        jTFDataRegistroCRMV = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jlMatriculaAuto = new javax.swing.JLabel();
        jComboBoxFuncao = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                aoAbrir(evt);
            }
        });

        jPanelCabecalho1.setBackground(new java.awt.Color(246, 243, 224));

        ljTituloCabecalho1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        ljTituloCabecalho1.setForeground(new java.awt.Color(235, 161, 91));
        ljTituloCabecalho1.setText("Cadastro de Empregado");

        javax.swing.GroupLayout jPanelCabecalho1Layout = new javax.swing.GroupLayout(jPanelCabecalho1);
        jPanelCabecalho1.setLayout(jPanelCabecalho1Layout);
        jPanelCabecalho1Layout.setHorizontalGroup(
            jPanelCabecalho1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCabecalho1Layout.createSequentialGroup()
                .addGap(131, 131, 131)
                .addComponent(ljTituloCabecalho1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelCabecalho1Layout.setVerticalGroup(
            jPanelCabecalho1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelCabecalho1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ljTituloCabecalho1)
                .addContainerGap())
        );

        jlNome.setText("Nome");

        jlTelefone.setText("Telefone");

        jlEndereco.setText("Endereço");

        jlFuncao.setText("Função");

        jlMatricula.setText("Matrícula");

        jPDadosVet.setToolTipText("");

        jLabel1.setText("Registro CRMV");

        jTFRegistroCRMV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFRegistroCRMVActionPerformed(evt);
            }
        });

        jLabel2.setText("Data de Registro");

        javax.swing.GroupLayout jPDadosVetLayout = new javax.swing.GroupLayout(jPDadosVet);
        jPDadosVet.setLayout(jPDadosVetLayout);
        jPDadosVetLayout.setHorizontalGroup(
            jPDadosVetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPDadosVetLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPDadosVetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPDadosVetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTFRegistroCRMV, javax.swing.GroupLayout.DEFAULT_SIZE, 235, Short.MAX_VALUE)
                    .addComponent(jTFDataRegistroCRMV))
                .addContainerGap())
        );
        jPDadosVetLayout.setVerticalGroup(
            jPDadosVetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPDadosVetLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPDadosVetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFRegistroCRMV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPDadosVetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFDataRegistroCRMV)
                    .addComponent(jLabel2))
                .addContainerGap())
        );

        jButton1.setText("Gravar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aoGravar(evt);
            }
        });

        jComboBoxFuncao.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBoxFuncao.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                Verificar(evt);
            }
        });

        javax.swing.GroupLayout jPanelDadosLayout = new javax.swing.GroupLayout(jPanelDados);
        jPanelDados.setLayout(jPanelDadosLayout);
        jPanelDadosLayout.setHorizontalGroup(
            jPanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPDadosVet, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanelDadosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelDadosLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton1))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelDadosLayout.createSequentialGroup()
                        .addGroup(jPanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelDadosLayout.createSequentialGroup()
                                .addGroup(jPanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jlEndereco, javax.swing.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE)
                                    .addComponent(jlNome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(jPanelDadosLayout.createSequentialGroup()
                                        .addGroup(jPanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jlTelefone)
                                            .addComponent(jlFuncao))
                                        .addGap(0, 0, Short.MAX_VALUE)))
                                .addGap(18, 18, 18))
                            .addGroup(jPanelDadosLayout.createSequentialGroup()
                                .addComponent(jlMatricula)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(jPanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlMatriculaAuto, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jTFNome, javax.swing.GroupLayout.DEFAULT_SIZE, 235, Short.MAX_VALUE)
                                .addComponent(jTFEndereco, javax.swing.GroupLayout.DEFAULT_SIZE, 235, Short.MAX_VALUE)
                                .addComponent(jTFTelefone, javax.swing.GroupLayout.DEFAULT_SIZE, 235, Short.MAX_VALUE)
                                .addComponent(jComboBoxFuncao, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        jPanelDadosLayout.setVerticalGroup(
            jPanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDadosLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlMatricula)
                    .addComponent(jlMatriculaAuto, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlNome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTFNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlEndereco))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jComboBoxFuncao, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlFuncao, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTFTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPDadosVet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelCabecalho1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanelDados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanelCabecalho1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanelDados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
        
    private void GravarVet() {
        java.util.Date dt = null;
        try {
            dt = sdf.parse(jTFDataRegistroCRMV.getText());

            Veterinario e = new Veterinario(jTFRegistroCRMV.getText(), dt, 0, jTFNome.getText(), jTFEndereco.getText(), jTFTelefone.getText());
            try {
                if (selecionado == null) {
                    new VeterinarioDAO().inserirVet(e);
                    e.setId(new VeterinarioDAO().buscarMaiorID());
                } else {
                    e.setId(selecionado.getId());
                    new VeterinarioDAO().alterar(e);
                }
                setVisible(false);
                JOptionPane.showMessageDialog(null, "Salvo com sucesso ...");
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Erro ao gravar Veterinario ..." + ex.getMessage());
            }
        } catch (ParseException ex) {
            JOptionPane.showMessageDialog(null, "Digite uma data em formato válido (dd/MM/aaaa)!");
        }
    }

    private void GravarTratador() {
        Empregado e = new Empregado(0, jTFNome.getText(), jTFEndereco.getText(), jTFTelefone.getText(), EnumFuncao.TRATADOR);
        try {
            if (selecionado == null) {
                new EmpregadoDAO().inserir(e);
                e.setId(new EmpregadoDAO().buscarMaiorID());
                setVisible(false);
                JOptionPane.showMessageDialog(null, "Salvo com sucesso ...");
            } else {
                e.setId(selecionado.getId());
                new EmpregadoDAO().alterar(e);
                setVisible(false);
                JOptionPane.showMessageDialog(null, "Salvo com sucesso ...");
            }

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Erro ao gravar Empregado ..." + ex.getMessage());
        }
    }


    private void aoAbrir(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_aoAbrir
        preencheCombo();
        jPDadosVet.setVisible(false);

        if (selecionado == null) {
            jlMatricula.setVisible(false);
            jlMatriculaAuto.setVisible(false);
        } else {
            jlMatriculaAuto.setVisible(true);
            jlMatricula.setVisible(true);
        }
    }//GEN-LAST:event_aoAbrir

    private void Verificar(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_Verificar
        if (jComboBoxFuncao.getSelectedItem().toString().equalsIgnoreCase("Veterinario")) {
            jPDadosVet.setVisible(true);
        } else {
            jPDadosVet.setVisible(false);
        }
    }//GEN-LAST:event_Verificar

    private void aoGravar(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aoGravar

        if (jComboBoxFuncao.getSelectedItem().toString().equalsIgnoreCase("VETERINARIO")) {
            GravarVet();
        } else if (jComboBoxFuncao.getSelectedItem().toString().equalsIgnoreCase("TRATADOR")) {
            GravarTratador();
        } else {
            JOptionPane.showMessageDialog(null, "Selecione uma função");
        }
    }//GEN-LAST:event_aoGravar

    private void jTFRegistroCRMVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFRegistroCRMVActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFRegistroCRMVActionPerformed

    private void preencheCombo() {
        preencheCombo("Selecione uma função...","Veterinario","Tratador");
    }
    
    private void preencheCombo(String a, String b, String c) {
        DefaultComboBoxModel<String> dcm = (DefaultComboBoxModel<String>) jComboBoxFuncao.getModel();
        dcm.removeAllElements();
        dcm.addElement(a);
        dcm.addElement(b);
        dcm.addElement(c);
    }

    public void preparaEditTratador(Empregado e) {
        selecionado = e;

        jlMatriculaAuto.setText(e.getId() + "");
        jTFNome.setText(e.getNome());
        jTFEndereco.setText(e.getEndereco());
        jTFTelefone.setText(e.getTelefone());
        preencheCombo("Tratador","Veterinario","Selecione uma função...");
        
    }
    
    public void preparaEditVet(Veterinario e) {
        selecionadoVet = e;
        jPDadosVet.setVisible(true);
        jlMatriculaAuto.setText(e.getId() + "");
        jTFNome.setText(e.getNome());
        jTFEndereco.setText(e.getEndereco());
        jTFTelefone.setText(e.getTelefone());
        preencheCombo("Veterinario","Tratador","Selecione uma função...");
        jTFRegistroCRMV.setText(e.getNumeroCRMV());
        jTFDataRegistroCRMV.setText(e.getDataCRMV().toString());
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) throws UnsupportedLookAndFeelException {
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
            java.util.logging.Logger.getLogger(FrmCadEmpregado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmCadEmpregado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmCadEmpregado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                FrmCadEmpregado dialog = new FrmCadEmpregado(new javax.swing.JFrame(), true);
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
    private javax.swing.JComboBox<String> jComboBoxFuncao;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPDadosVet;
    private javax.swing.JPanel jPanelCabecalho1;
    private javax.swing.JPanel jPanelDados;
    private javax.swing.JTextField jTFDataRegistroCRMV;
    private javax.swing.JTextField jTFEndereco;
    private javax.swing.JTextField jTFNome;
    private javax.swing.JTextField jTFRegistroCRMV;
    private javax.swing.JTextField jTFTelefone;
    private javax.swing.JLabel jlEndereco;
    private javax.swing.JLabel jlFuncao;
    private javax.swing.JLabel jlMatricula;
    private javax.swing.JLabel jlMatriculaAuto;
    private javax.swing.JLabel jlNome;
    private javax.swing.JLabel jlTelefone;
    private javax.swing.JLabel ljTituloCabecalho1;
    // End of variables declaration//GEN-END:variables

    private Veterinario selecionadoVet = null;
    private Empregado selecionado = null;
    private SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    private List<Empregado> listaEmpregado;
}
