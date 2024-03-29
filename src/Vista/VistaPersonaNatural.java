/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

/**
 *
 * @author MarcoVi
 */
public class VistaPersonaNatural extends javax.swing.JFrame {

    /**
     * Creates new form VistaPersonaNatural
     */
    public VistaPersonaNatural() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
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
            java.util.logging.Logger.getLogger(VistaPersonaJuridica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaPersonaJuridica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaPersonaJuridica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaPersonaJuridica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaPersonaNatural().setVisible(true);
            }
        });
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Dialogo_Natural = new javax.swing.JDialog();
        txtcodigo_act = new javax.swing.JTextField();
        txtruc_act = new javax.swing.JTextField();
        txtNombres_act = new javax.swing.JTextField();
        txtApellidos_act = new javax.swing.JTextField();
        txtdireccion_act = new javax.swing.JTextField();
        txtcorreo_act = new javax.swing.JTextField();
        txtTelefono_act = new javax.swing.JTextField();
        txtCelular_act = new javax.swing.JTextField();
        txtUsuario_act = new javax.swing.JTextField();
        txtClave_act = new javax.swing.JTextField();
        btn_actualizar_act = new javax.swing.JButton();
        jblFoto_act = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        txtRuc = new javax.swing.JTextField();
        txtNombres = new javax.swing.JTextField();
        txtApellidos = new javax.swing.JTextField();
        txtDireccion = new javax.swing.JTextField();
        txtCorreo = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        txtCelular = new javax.swing.JTextField();
        txtUsuario = new javax.swing.JTextField();
        txtClave = new javax.swing.JTextField();
        btnExaminar = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        txtBuscar = new javax.swing.JTextField();
        btnActualizar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaPerNaturall = new javax.swing.JTable();
        jblFoto = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        Dialogo_Natural.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        Dialogo_Natural.getContentPane().add(txtcodigo_act, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 60, 160, 20));
        Dialogo_Natural.getContentPane().add(txtruc_act, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 100, 160, -1));
        Dialogo_Natural.getContentPane().add(txtNombres_act, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 140, 160, -1));
        Dialogo_Natural.getContentPane().add(txtApellidos_act, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 180, 160, -1));
        Dialogo_Natural.getContentPane().add(txtdireccion_act, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 220, 160, -1));
        Dialogo_Natural.getContentPane().add(txtcorreo_act, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 260, 160, -1));
        Dialogo_Natural.getContentPane().add(txtTelefono_act, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 300, 160, -1));
        Dialogo_Natural.getContentPane().add(txtCelular_act, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 340, 160, -1));
        Dialogo_Natural.getContentPane().add(txtUsuario_act, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 380, 160, -1));
        Dialogo_Natural.getContentPane().add(txtClave_act, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 420, 160, -1));

        btn_actualizar_act.setText("jButton1");
        Dialogo_Natural.getContentPane().add(btn_actualizar_act, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 470, 150, -1));
        Dialogo_Natural.getContentPane().add(jblFoto_act, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 70, 150, 190));

        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtCodigo.setBorder(null);
        txtCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigoActionPerformed(evt);
            }
        });
        getContentPane().add(txtCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 108, 80, 20));

        txtRuc.setBorder(null);
        txtRuc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRucActionPerformed(evt);
            }
        });
        getContentPane().add(txtRuc, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 150, 210, 20));

        txtNombres.setBorder(null);
        getContentPane().add(txtNombres, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 190, 220, 20));

        txtApellidos.setBorder(null);
        getContentPane().add(txtApellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 230, 220, 20));

        txtDireccion.setBorder(null);
        getContentPane().add(txtDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 270, 230, 20));

        txtCorreo.setBorder(null);
        getContentPane().add(txtCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 310, 230, 20));

        txtTelefono.setBorder(null);
        getContentPane().add(txtTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 350, 230, 20));

        txtCelular.setBorder(null);
        getContentPane().add(txtCelular, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 390, 220, 20));

        txtUsuario.setBorder(null);
        getContentPane().add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 430, 230, 20));

        txtClave.setBorder(null);
        getContentPane().add(txtClave, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 470, 230, 20));

        btnExaminar.setBackground(new java.awt.Color(255, 255, 255));
        btnExaminar.setText("EXAMINAR");
        getContentPane().add(btnExaminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 515, 130, -1));

        btnGuardar.setBackground(new java.awt.Color(47, 85, 151));
        btnGuardar.setText("GUARDAR");
        getContentPane().add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 560, 130, 30));

        btnLimpiar.setBackground(new java.awt.Color(47, 85, 151));
        btnLimpiar.setText("LIMPIAR");
        getContentPane().add(btnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 560, 130, 30));

        txtBuscar.setBorder(null);
        getContentPane().add(txtBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 120, 220, 20));

        btnActualizar.setText("ACTUALIZAR");
        getContentPane().add(btnActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 173, 140, 30));

        btnEliminar.setBackground(new java.awt.Color(47, 85, 151));
        btnEliminar.setText("ELIMINAR");
        getContentPane().add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 173, 130, 30));

        TablaPerNaturall.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Codigo", "RUC", "Nombres", "Apelllidos", "Direccion", "Correo", "Telefono", "Celular", "Usuario", "Clave", "Foto"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, true, true, true, true, true, true, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(TablaPerNaturall);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 240, 690, 310));

        jblFoto.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        getContentPane().add(jblFoto, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 100, 90, 120));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Recursos/CRUD PERSONA_NATURAL.jpeg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodigoActionPerformed

    private void txtRucActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRucActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRucActionPerformed

    public JLabel getJblFoto() {
        return jblFoto;
    }

    public void setJblFoto(JLabel jblFoto) {
        this.jblFoto = jblFoto;
    }

    public JTable getTablaPerNaturall() {
        return TablaPerNaturall;
    }

    public void setTablaPerNaturall(JTable TablaPerNaturall) {
        this.TablaPerNaturall = TablaPerNaturall;
    }

    public JButton getBtnActualizar() {
        return btnActualizar;
    }

    public void setBtnActualizar(JButton btnActualizar) {
        this.btnActualizar = btnActualizar;
    }

    public JButton getBtnEliminar() {
        return btnEliminar;
    }

    public void setBtnEliminar(JButton btnEliminar) {
        this.btnEliminar = btnEliminar;
    }

    public JButton getBtnExaminar() {
        return btnExaminar;
    }

    public void setBtnExaminar(JButton btnExaminar) {
        this.btnExaminar = btnExaminar;
    }

    public JButton getBtnGuardar() {
        return btnGuardar;
    }

    public void setBtnGuardar(JButton btnGuardar) {
        this.btnGuardar = btnGuardar;
    }

    public JButton getBtnLimpiar() {
        return btnLimpiar;
    }

    public void setBtnLimpiar(JButton btnLimpiar) {
        this.btnLimpiar = btnLimpiar;
    }

    public JLabel getjLabel1() {
        return jLabel1;
    }

    public void setjLabel1(JLabel jLabel1) {
        this.jLabel1 = jLabel1;
    }

    public JScrollPane getjScrollPane1() {
        return jScrollPane1;
    }

    public void setjScrollPane1(JScrollPane jScrollPane1) {
        this.jScrollPane1 = jScrollPane1;
    }

    public JTextField getTxtApellidos() {
        return txtApellidos;
    }

    public void setTxtApellidos(JTextField txtApellidos) {
        this.txtApellidos = txtApellidos;
    }

    public JTextField getTxtBuscar() {
        return txtBuscar;
    }

    public void setTxtBuscar(JTextField txtBuscar) {
        this.txtBuscar = txtBuscar;
    }

    public JTextField getTxtCelular() {
        return txtCelular;
    }

    public void setTxtCelular(JTextField txtCelular) {
        this.txtCelular = txtCelular;
    }

    public JTextField getTxtClave() {
        return txtClave;
    }

    public void setTxtClave(JTextField txtClave) {
        this.txtClave = txtClave;
    }

    public JTextField getTxtCodigo() {
        return txtCodigo;
    }

    public void setTxtCodigo(JTextField txtCodigo) {
        this.txtCodigo = txtCodigo;
    }

    public JTextField getTxtCorreo() {
        return txtCorreo;
    }

    public void setTxtCorreo(JTextField txtCorreo) {
        this.txtCorreo = txtCorreo;
    }

    public JTextField getTxtDireccion() {
        return txtDireccion;
    }

    public void setTxtDireccion(JTextField txtDireccion) {
        this.txtDireccion = txtDireccion;
    }

    public JTextField getTxtNombres() {
        return txtNombres;
    }

    public void setTxtNombres(JTextField txtNombres) {
        this.txtNombres = txtNombres;
    }

    public JTextField getTxtRuc() {
        return txtRuc;
    }

    public void setTxtRuc(JTextField txtRuc) {
        this.txtRuc = txtRuc;
    }

    public JTextField getTxtTelefono() {
        return txtTelefono;
    }

    public void setTxtTelefono(JTextField txtTelefono) {
        this.txtTelefono = txtTelefono;
    }

    public JTextField getTxtUsuario() {
        return txtUsuario;
    }

    public void setTxtUsuario(JTextField txtUsuario) {
        this.txtUsuario = txtUsuario;
    }

    
    //COMPONENTES DIALOGO
    
    public JDialog getDialogo_Natural() {
        return Dialogo_Natural;
    }

    public void setDialogo_Natural(JDialog Dialogo_Natural) {
        this.Dialogo_Natural = Dialogo_Natural;
    }

    public JButton getBtn_actualizar_act() {
        return btn_actualizar_act;
    }

    public void setBtn_actualizar_act(JButton btn_actualizar_act) {
        this.btn_actualizar_act = btn_actualizar_act;
    }

    public JLabel getJblFoto_act() {
        return jblFoto_act;
    }

    public void setJblFoto_act(JLabel jblFoto_act) {
        this.jblFoto_act = jblFoto_act;
    }

    public JTextField getTxtApellidos_act() {
        return txtApellidos_act;
    }

    public void setTxtApellidos_act(JTextField txtApellidos_act) {
        this.txtApellidos_act = txtApellidos_act;
    }

    public JTextField getTxtCelular_act() {
        return txtCelular_act;
    }

    public void setTxtCelular_act(JTextField txtCelular_act) {
        this.txtCelular_act = txtCelular_act;
    }

    public JTextField getTxtClave_act() {
        return txtClave_act;
    }

    public void setTxtClave_act(JTextField txtClave_act) {
        this.txtClave_act = txtClave_act;
    }

    public JTextField getTxtNombres_act() {
        return txtNombres_act;
    }

    public void setTxtNombres_act(JTextField txtNombres_act) {
        this.txtNombres_act = txtNombres_act;
    }

    public JTextField getTxtTelefono_act() {
        return txtTelefono_act;
    }

    public void setTxtTelefono_act(JTextField txtTelefono_act) {
        this.txtTelefono_act = txtTelefono_act;
    }

    public JTextField getTxtUsuario_act() {
        return txtUsuario_act;
    }

    public void setTxtUsuario_act(JTextField txtUsuario_act) {
        this.txtUsuario_act = txtUsuario_act;
    }

    public JTextField getTxtcodigo_act() {
        return txtcodigo_act;
    }

    public void setTxtcodigo_act(JTextField txtcodigo_act) {
        this.txtcodigo_act = txtcodigo_act;
    }

    public JTextField getTxtcorreo_act() {
        return txtcorreo_act;
    }

    public void setTxtcorreo_act(JTextField txtcorreo_act) {
        this.txtcorreo_act = txtcorreo_act;
    }

    public JTextField getTxtdireccion_act() {
        return txtdireccion_act;
    }

    public void setTxtdireccion_act(JTextField txtdireccion_act) {
        this.txtdireccion_act = txtdireccion_act;
    }

    public JTextField getTxtruc_act() {
        return txtruc_act;
    }

    //COMPONENTES DIALOGO
    public void setTxtruc_act(JTextField txtruc_act) {
        this.txtruc_act = txtruc_act;
    }    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDialog Dialogo_Natural;
    private javax.swing.JTable TablaPerNaturall;
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnExaminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btn_actualizar_act;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel jblFoto;
    private javax.swing.JLabel jblFoto_act;
    private javax.swing.JTextField txtApellidos;
    private javax.swing.JTextField txtApellidos_act;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JTextField txtCelular;
    private javax.swing.JTextField txtCelular_act;
    private javax.swing.JTextField txtClave;
    private javax.swing.JTextField txtClave_act;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtNombres;
    private javax.swing.JTextField txtNombres_act;
    private javax.swing.JTextField txtRuc;
    private javax.swing.JTextField txtTelefono;
    private javax.swing.JTextField txtTelefono_act;
    private javax.swing.JTextField txtUsuario;
    private javax.swing.JTextField txtUsuario_act;
    private javax.swing.JTextField txtcodigo_act;
    private javax.swing.JTextField txtcorreo_act;
    private javax.swing.JTextField txtdireccion_act;
    private javax.swing.JTextField txtruc_act;
    // End of variables declaration//GEN-END:variables
}
