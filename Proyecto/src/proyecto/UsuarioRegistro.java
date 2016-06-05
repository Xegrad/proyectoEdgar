package proyecto;

import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Pxk
 */
public class UsuarioRegistro extends javax.swing.JFrame {
    /**
     * Creates new form UsuarioRegistro
     */
    public UsuarioRegistro() {
        initComponents();
        cargarDatos();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        table1 = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cmbTipo = new javax.swing.JComboBox();
        txtPassword = new javax.swing.JPasswordField();
        txtUserName = new javax.swing.JTextField();
        btSave = new javax.swing.JButton();
        btDel = new javax.swing.JButton();
        btBack = new javax.swing.JButton();
        lbCve = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        table1.setModel(new javax.swing.table.DefaultTableModel(
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
        table1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table1);

        jLabel5.setText("ID Usuario");

        jLabel2.setText("Nombre de usuario");

        jLabel3.setText("Contraseña");

        jLabel4.setText("Tipo de usuario");

        cmbTipo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Alumno", "Administrador" }));

        btSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/icons/edit.gif"))); // NOI18N
        btSave.setText("Guardar");
        btSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSaveActionPerformed(evt);
            }
        });

        btDel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/icons/delete.gif"))); // NOI18N
        btDel.setText("Borrar");
        btDel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDelActionPerformed(evt);
            }
        });

        btBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/icons/backm.png"))); // NOI18N
        btBack.setText("Regresar");
        btBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBackActionPerformed(evt);
            }
        });

        lbCve.setText("-----");

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbCve)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtUserName)
                                    .addComponent(txtPassword)
                                    .addComponent(cmbTipo, 0, 100, Short.MAX_VALUE))
                                .addGap(116, 116, 116)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btSave, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btDel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 112, Short.MAX_VALUE)
                                .addComponent(btBack)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(lbCve))
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtUserName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btSave))
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cmbTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btDel)
                    .addComponent(btBack))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btDelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDelActionPerformed
        UsuarioMetodo objBorrar = new UsuarioMetodo();
        objBorrar.borrarUsuario(Integer.valueOf(table1.getValueAt(table1.getSelectedRow(), 0).toString()));
        cargarDatos();
    }//GEN-LAST:event_btDelActionPerformed

    private void btSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSaveActionPerformed
        char tempPassword[] = txtPassword.getPassword();

        String strPassword = String.valueOf(tempPassword);

        Usuario us = new Usuario(Integer.valueOf(lbCve.getText()), txtUserName.getText(), strPassword, cmbTipo.getSelectedIndex());

        UsuarioMetodo guardarUsuario = new UsuarioMetodo();
        guardarUsuario.guardarUsuario(us);

        cargarDatos();
    }//GEN-LAST:event_btSaveActionPerformed

    private void btBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBackActionPerformed
        this.setVisible(false);
        new UsuarioFrame().setVisible(true);
    }//GEN-LAST:event_btBackActionPerformed

    private void table1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table1MouseClicked
        lbCve.setText(table1.getValueAt(table1.getSelectedRow(), 0).toString());
        txtUserName.setText(table1.getValueAt(table1.getSelectedRow(), 1).toString());
        cmbTipo.setSelectedIndex(Integer.valueOf(table1.getValueAt(table1.getSelectedRow(), 2).toString()));
    }//GEN-LAST:event_table1MouseClicked

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
            java.util.logging.Logger.getLogger(UsuarioRegistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UsuarioRegistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UsuarioRegistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UsuarioRegistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }


        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UsuarioRegistro().setVisible(true);
            }
        });
        //</editor-fold>
    }

    void cargarDatos() {

        DefaultTableModel modelo = new DefaultTableModel();
        String encabezado[] = {"Cve. Usuario", "Nom. Usuario", "Tipo Usuario"};

        modelo.setColumnIdentifiers(encabezado);
        table1.setModel(modelo);

        UsuarioMetodo act = new UsuarioMetodo();

        ArrayList<Usuario> arrUsuario = act.obtenUsuarios();

        while (!arrUsuario.isEmpty()) {
            Usuario us = arrUsuario.remove(0);
            modelo.addRow(us.getRow());
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btBack;
    private javax.swing.JButton btDel;
    private javax.swing.JButton btSave;
    private javax.swing.JComboBox cmbTipo;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbCve;
    private javax.swing.JTable table1;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUserName;
    // End of variables declaration//GEN-END:variables
}
