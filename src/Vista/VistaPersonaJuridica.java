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
public class VistaPersonaJuridica extends javax.swing.JFrame {

    /**
     * Creates new form VistaPersonaJuridica
     */
    public VistaPersonaJuridica() {
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
                new VistaPersonaJuridica().setVisible(true);
            }
        });
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Dialogo_Juridica = new javax.swing.JDialog();
        txtcodigo_act = new javax.swing.JTextField();
        txtruc_act = new javax.swing.JTextField();
        txtnombres_act = new javax.swing.JTextField();
        txtapellidos_act = new javax.swing.JTextField();
        txtrazon_act = new javax.swing.JTextField();
        txtdireccion_act = new javax.swing.JTextField();
        txtcorreo_act = new javax.swing.JTextField();
        txtTelefono_act = new javax.swing.JTextField();
        txtCelular_act = new javax.swing.JTextField();
        txtUsuario_act = new javax.swing.JTextField();
        txtClave_act = new javax.swing.JTextField();
        txtsocios_act = new javax.swing.JTextField();
        btnactualizar_act = new javax.swing.JButton();
        txtcodigo = new javax.swing.JTextField();
        txtruc = new javax.swing.JTextField();
        txtnombres = new javax.swing.JTextField();
        txtapellidos = new javax.swing.JTextField();
        txtrazon = new javax.swing.JTextField();
        txtdireccion = new javax.swing.JTextField();
        txtcorreo = new javax.swing.JTextField();
        txttelefono = new javax.swing.JTextField();
        txtcelular = new javax.swing.JTextField();
        txtusuario = new javax.swing.JTextField();
        txtclave = new javax.swing.JTextField();
        txtsocios = new javax.swing.JTextField();
        txtbuscar = new javax.swing.JTextField();
        btneliminar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_juridica = new javax.swing.JTable();
        btnGrabar = new javax.swing.JButton();
        jblUsuario = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        btnActualizar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        Dialogo_Juridica.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        Dialogo_Juridica.getContentPane().add(txtcodigo_act, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, 140, -1));
        Dialogo_Juridica.getContentPane().add(txtruc_act, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 60, 140, -1));
        Dialogo_Juridica.getContentPane().add(txtnombres_act, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 100, 140, -1));
        Dialogo_Juridica.getContentPane().add(txtapellidos_act, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 140, 140, -1));
        Dialogo_Juridica.getContentPane().add(txtrazon_act, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 190, 150, -1));
        Dialogo_Juridica.getContentPane().add(txtdireccion_act, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 230, 150, -1));
        Dialogo_Juridica.getContentPane().add(txtcorreo_act, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 270, 150, -1));
        Dialogo_Juridica.getContentPane().add(txtTelefono_act, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 310, 150, -1));
        Dialogo_Juridica.getContentPane().add(txtCelular_act, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 350, 150, -1));
        Dialogo_Juridica.getContentPane().add(txtUsuario_act, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 390, 150, -1));
        Dialogo_Juridica.getContentPane().add(txtClave_act, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 420, 160, -1));
        Dialogo_Juridica.getContentPane().add(txtsocios_act, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 20, 120, -1));

        btnactualizar_act.setText("jButton1");
        Dialogo_Juridica.getContentPane().add(btnactualizar_act, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 110, 130, -1));

        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtcodigo.setBorder(null);
        getContentPane().add(txtcodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 130, 80, 20));

        txtruc.setBorder(null);
        getContentPane().add(txtruc, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 170, 210, 20));

        txtnombres.setBorder(null);
        getContentPane().add(txtnombres, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 212, 220, 20));

        txtapellidos.setBorder(null);
        getContentPane().add(txtapellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 255, 230, 20));

        txtrazon.setBorder(null);
        getContentPane().add(txtrazon, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 295, 230, 20));

        txtdireccion.setBorder(null);
        getContentPane().add(txtdireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 333, 230, 20));

        txtcorreo.setBorder(null);
        getContentPane().add(txtcorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 368, 230, 20));

        txttelefono.setBorder(null);
        getContentPane().add(txttelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 407, 230, 20));

        txtcelular.setBorder(null);
        txtcelular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcelularActionPerformed(evt);
            }
        });
        getContentPane().add(txtcelular, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 445, 230, 20));

        txtusuario.setBorder(null);
        getContentPane().add(txtusuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 485, 230, 20));

        txtclave.setBorder(null);
        getContentPane().add(txtclave, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 530, 230, 20));

        txtsocios.setBorder(null);
        getContentPane().add(txtsocios, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 570, 230, 20));

        txtbuscar.setBorder(null);
        getContentPane().add(txtbuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 130, 220, 20));

        btneliminar.setBackground(new java.awt.Color(55, 52, 141));
        btneliminar.setForeground(new java.awt.Color(255, 255, 255));
        btneliminar.setText("ELIMINAR");
        getContentPane().add(btneliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 180, 130, 30));

        tabla_juridica.setBackground(new java.awt.Color(55, 52, 141));
        tabla_juridica.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        tabla_juridica.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Codigo", "Ruc", "Nombres", "Apellidos", "Razon S", "Direccion", "Correo", "Telefono", "Celular", "Usuario", "Clave", "Socios"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabla_juridica.setGridColor(new java.awt.Color(0, 0, 0));
        tabla_juridica.setSelectionBackground(new java.awt.Color(255, 255, 255));
        tabla_juridica.setSelectionForeground(new java.awt.Color(0, 0, 0));
        jScrollPane1.setViewportView(tabla_juridica);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 250, 680, 280));

        btnGrabar.setBackground(new java.awt.Color(55, 52, 141));
        btnGrabar.setForeground(new java.awt.Color(255, 255, 255));
        btnGrabar.setText("GRABAR");
        getContentPane().add(btnGrabar, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 613, 120, 30));
        getContentPane().add(jblUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 44, 180, 30));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 30, 20, 630));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1220, 30));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 655, 1190, 40));
        jPanel3.getAccessibleContext().setAccessibleName("");

        btnActualizar.setText("jButton1");
        getContentPane().add(btnActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 190, 110, -1));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1190, 30, 30, 660));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Recursos/CRUD_JURIDICA.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtcelularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcelularActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcelularActionPerformed

    public JButton getBtnActualizar() {
        return btnActualizar;
    }

    public void setBtnActualizar(JButton btnActualizar) {
        this.btnActualizar = btnActualizar;
    }

    public JButton getBtnGrabar() {
        return btnGrabar;
    }

    public void setBtnGrabar(JButton btnGrabar) {
        this.btnGrabar = btnGrabar;
    }

    public JButton getBtneliminar() {
        return btneliminar;
    }

    public void setBtneliminar(JButton btneliminar) {
        this.btneliminar = btneliminar;
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

    public JLabel getJblUsuario() {
        return jblUsuario;
    }

    public void setJblUsuario(JLabel jblUsuario) {
        this.jblUsuario = jblUsuario;
    }

    public JTable getTabla_juridica() {
        return tabla_juridica;
    }

    public void setTabla_juridica(JTable tabla_juridica) {
        this.tabla_juridica = tabla_juridica;
    }

    public JTextField getTxtapellidos() {
        return txtapellidos;
    }

    public void setTxtapellidos(JTextField txtapellidos) {
        this.txtapellidos = txtapellidos;
    }

    public JTextField getTxtbuscar() {
        return txtbuscar;
    }

    public void setTxtbuscar(JTextField txtbuscar) {
        this.txtbuscar = txtbuscar;
    }

    public JTextField getTxtcelular() {
        return txtcelular;
    }

    public void setTxtcelular(JTextField txtcelular) {
        this.txtcelular = txtcelular;
    }

    public JTextField getTxtclave() {
        return txtclave;
    }

    public void setTxtclave(JTextField txtclave) {
        this.txtclave = txtclave;
    }

    public JTextField getTxtcodigo() {
        return txtcodigo;
    }

    public void setTxtcodigo(JTextField txtcodigo) {
        this.txtcodigo = txtcodigo;
    }

    public JTextField getTxtcorreo() {
        return txtcorreo;
    }

    public void setTxtcorreo(JTextField txtcorreo) {
        this.txtcorreo = txtcorreo;
    }

    public JTextField getTxtdireccion() {
        return txtdireccion;
    }

    public void setTxtdireccion(JTextField txtdireccion) {
        this.txtdireccion = txtdireccion;
    }

    public JTextField getTxtnombres() {
        return txtnombres;
    }

    public void setTxtnombres(JTextField txtnombres) {
        this.txtnombres = txtnombres;
    }

    public JTextField getTxtrazon() {
        return txtrazon;
    }

    public void setTxtrazon(JTextField txtrazon) {
        this.txtrazon = txtrazon;
    }

    public JTextField getTxtruc() {
        return txtruc;
    }

    public void setTxtruc(JTextField txtruc) {
        this.txtruc = txtruc;
    }

    public JTextField getTxtsocios() {
        return txtsocios;
    }

    public void setTxtsocios(JTextField txtsocios) {
        this.txtsocios = txtsocios;
    }

    public JTextField getTxttelefono() {
        return txttelefono;
    }

    public void setTxttelefono(JTextField txttelefono) {
        this.txttelefono = txttelefono;
    }

    public JTextField getTxtusuario() {
        return txtusuario;
    }

    public void setTxtusuario(JTextField txtusuario) {
        this.txtusuario = txtusuario;
    }

    
    //COMPONENTES DIALOGO
    
    public JDialog getDialogo_Juridica() {
        return Dialogo_Juridica;
    }

    public void setDialogo_Juridica(JDialog Dialogo_Juridica) {
        this.Dialogo_Juridica = Dialogo_Juridica;
    }

    public JButton getBtnactualizar_act() {
        return btnactualizar_act;
    }

    public void setBtnactualizar_act(JButton btnactualizar_act) {
        this.btnactualizar_act = btnactualizar_act;
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

    public JTextField getTxtapellidos_act() {
        return txtapellidos_act;
    }

    public void setTxtapellidos_act(JTextField txtapellidos_act) {
        this.txtapellidos_act = txtapellidos_act;
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

    public JTextField getTxtnombres_act() {
        return txtnombres_act;
    }

    public void setTxtnombres_act(JTextField txtnombres_act) {
        this.txtnombres_act = txtnombres_act;
    }

    public JTextField getTxtrazon_act() {
        return txtrazon_act;
    }

    public void setTxtrazon_act(JTextField txtrazon_act) {
        this.txtrazon_act = txtrazon_act;
    }

    public JTextField getTxtruc_act() {
        return txtruc_act;
    }

    public void setTxtruc_act(JTextField txtruc_act) {
        this.txtruc_act = txtruc_act;
    }

    public JTextField getTxtsocios_act() {
        return txtsocios_act;
    }

    public void setTxtsocios_act(JTextField txtsocios_act) {
        this.txtsocios_act = txtsocios_act;
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDialog Dialogo_Juridica;
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnGrabar;
    private javax.swing.JButton btnactualizar_act;
    private javax.swing.JButton btneliminar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel jblUsuario;
    private javax.swing.JTable tabla_juridica;
    private javax.swing.JTextField txtCelular_act;
    private javax.swing.JTextField txtClave_act;
    private javax.swing.JTextField txtTelefono_act;
    private javax.swing.JTextField txtUsuario_act;
    private javax.swing.JTextField txtapellidos;
    private javax.swing.JTextField txtapellidos_act;
    private javax.swing.JTextField txtbuscar;
    private javax.swing.JTextField txtcelular;
    private javax.swing.JTextField txtclave;
    private javax.swing.JTextField txtcodigo;
    private javax.swing.JTextField txtcodigo_act;
    private javax.swing.JTextField txtcorreo;
    private javax.swing.JTextField txtcorreo_act;
    private javax.swing.JTextField txtdireccion;
    private javax.swing.JTextField txtdireccion_act;
    private javax.swing.JTextField txtnombres;
    private javax.swing.JTextField txtnombres_act;
    private javax.swing.JTextField txtrazon;
    private javax.swing.JTextField txtrazon_act;
    private javax.swing.JTextField txtruc;
    private javax.swing.JTextField txtruc_act;
    private javax.swing.JTextField txtsocios;
    private javax.swing.JTextField txtsocios_act;
    private javax.swing.JTextField txttelefono;
    private javax.swing.JTextField txtusuario;
    // End of variables declaration//GEN-END:variables
}
