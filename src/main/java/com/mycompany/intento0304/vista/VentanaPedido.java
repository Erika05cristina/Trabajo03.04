/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.intento0304.vista;

import com.mycompany.intento0304.Controladores.ControladorPedido;
import com.mycompany.intento0304.Controladores.ControladorProducto;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Jonna
 */
public class VentanaPedido extends javax.swing.JInternalFrame {

    public ControladorPedido controladorPedido = new ControladorPedido();
    public ControladorProducto controladorProducto = new ControladorProducto();


    /**
     * Creates new form VentanaProveedor
     */
    public VentanaPedido() {
        initComponents();

        this.setIconifiable(true);
        this.setIgnoreRepaint(true);
        this.setClosable(true);
        this.setResizable(true);
        this.setVisible(true);
        this.setDefaultCloseOperation(JInternalFrame.DISPOSE_ON_CLOSE);
        actualizarCombosP();
    }

    public void actualizarCombosP() {
        var data = new String[this.controladorProducto.mostrarInfo().size()];
        for (var i = 0; i < this.controladorProducto.mostrarInfo().size(); i++) {
            data[i] = String.valueOf(this.controladorProducto.mostrarInfo().get(i).getCodigo());
        }
        this.cbProductos.setModel(new javax.swing.DefaultComboBoxModel<>(data));

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
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        cbPedidos = new javax.swing.JComboBox<>();
        txtCodigo = new javax.swing.JTextField();
        txtComprador = new javax.swing.JTextField();
        txtTotal = new javax.swing.JTextField();
        btGuardar = new javax.swing.JButton();
        btModificar = new javax.swing.JButton();
        btBorrar = new javax.swing.JButton();
        cbMercaderia = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtObservaciones = new javax.swing.JTextField();
        cbProductos = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbPedido = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        btGuardarModif = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Pedido");

        jLabel1.setText("Código");

        jLabel2.setText("Comprador");

        jLabel3.setText("Total sin Iva");

        jLabel4.setText("Tipos de mercaderia");

        jLabel6.setText("Seleccionar Pedidos");

        cbPedidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbPedidosActionPerformed(evt);
            }
        });

        btGuardar.setText("Guardar");
        btGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btGuardarActionPerformed(evt);
            }
        });

        btModificar.setText("Modificar");
        btModificar.setEnabled(false);
        btModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btModificarActionPerformed(evt);
            }
        });

        btBorrar.setText("Borrar");
        btBorrar.setEnabled(false);
        btBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBorrarActionPerformed(evt);
            }
        });

        cbMercaderia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Alimenticio", "Electrodoméstocos", "Muebles", "Juguetes", "Otros" }));

        jLabel5.setText("Observaciones");

        jLabel7.setText("Código Producto");

        tbPedido.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tbPedido);

        jButton1.setText("Actualizar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        btGuardarModif.setText("Guardar Modificaciones");
        btGuardarModif.setEnabled(false);
        btGuardarModif.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btGuardarModifActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(166, 166, 166)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtObservaciones, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbMercaderia, javax.swing.GroupLayout.Alignment.LEADING, 0, 161, Short.MAX_VALUE)
                            .addComponent(cbProductos, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel1))
                                .addGap(60, 60, 60)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtComprador, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel2)
                                .addComponent(jLabel3)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addComponent(btGuardarModif)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton1)
                                    .addComponent(btGuardar))
                                .addGap(38, 38, 38)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(53, 53, 53)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(cbPedidos, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(95, 95, 95))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(btModificar)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btBorrar)
                                        .addGap(76, 76, 76))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(122, 122, 122))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel6)
                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtComprador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbPedidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btGuardar))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btBorrar)
                        .addComponent(btModificar)
                        .addComponent(btGuardarModif))
                    .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cbMercaderia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtObservaciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(cbProductos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(61, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbPedidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbPedidosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbPedidosActionPerformed

    private void actualizarTabla() {
        var datosTabla = new Object[this.controladorPedido.mostrarInfo().size()][6];

        for (int x = 0; x < this.controladorPedido.mostrarInfo().size(); x++) {

            datosTabla[x][0] = this.controladorPedido.mostrarInfo().get(x).getCodigoPedido();
            datosTabla[x][1] = this.controladorPedido.mostrarInfo().get(x).getNombreComprador();
            datosTabla[x][2] = this.controladorPedido.mostrarInfo().get(x).getTotalSinIva();
            datosTabla[x][3] = this.controladorPedido.mostrarInfo().get(x).getTipoDeMercaderia();
            datosTabla[x][4] = this.controladorPedido.mostrarInfo().get(x).getObservaciones();
            datosTabla[x][5] = this.controladorPedido.mostrarInfo().get(x).getProducto().getCodigo();

        }

        var encabezado = new String[6];
        encabezado[0] = "Código";
        encabezado[1] = "Comprador";
        encabezado[2] = "SubTotal";
        encabezado[3] = "Mercaderia";
        encabezado[4] = "Observaciones";
        encabezado[5] = "Código Producto";

        //jTable1.setModel(new javax.swing.table.DefaultTableModel(data, encabezado));
        this.tbPedido.setModel(new javax.swing.table.DefaultTableModel(datosTabla, encabezado));

    }

    private void actualizarCombos() {
        //var data = new String[this.controladorProducto.moo]
        var data = new String[this.controladorPedido.mostrarInfo().size()];

        for (int i = 0; i < controladorPedido.mostrarInfo().size(); i++) {
            //data[i] = controladorProducto.mostrarInfo().get(i).getCodigo();
            data[i] = String.valueOf(controladorPedido.mostrarInfo().get(i).getCodigoPedido());

        }

        this.cbPedidos.setModel(new javax.swing.DefaultComboBoxModel<>(data));

//this.cbProductos.setModel(new javax.swing.DefaultComboBoxModel<>(data));
    }
    private void btGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btGuardarActionPerformed
        // TODO add your handling code here:
        String[] datos = new String[6];
        datos[0] = txtCodigo.getText();
        datos[1] = txtComprador.getText();
        datos[2] = txtTotal.getText();
        datos[3] = cbMercaderia.getSelectedItem().toString();
        datos[4] = txtObservaciones.getText();
        datos[5] = cbProductos.getSelectedItem().toString();
        
        controladorPedido.validarDatos(datos);
        actualizarTabla();
        actualizarCombos();
        btModificar.setEnabled(true);
        btBorrar.setEnabled(true);
    }//GEN-LAST:event_btGuardarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        actualizarCombosP();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btModificarActionPerformed
        // TODO add your handling code here:
        int codigoPedido = Integer.valueOf(this.cbPedidos.getSelectedItem().toString());
        this.btGuardarModif.setEnabled(true);
        this.btGuardar.setEnabled(false);

        for (int x = 0; x < controladorPedido.mostrarInfo().size(); x++) {
            if (codigoPedido == controladorPedido.mostrarInfo().get(x).getCodigoPedido()) {
                this.txtCodigo.setText(String.valueOf(codigoPedido));
                this.txtComprador.setText(controladorPedido.mostrarInfo().get(x).getNombreComprador());
                this.txtTotal.setText(String.valueOf(controladorPedido.mostrarInfo().get(x).getTotalSinIva()));
                this.cbMercaderia.setSelectedItem(controladorPedido.mostrarInfo().get(x).getTipoDeMercaderia());
                this.txtObservaciones.setText(controladorPedido.mostrarInfo().get(x).getObservaciones());
                this.cbProductos.setSelectedItem(controladorPedido.mostrarInfo().get(x).getProducto());
                break;
            }
        }
    }//GEN-LAST:event_btModificarActionPerformed

    private void btBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBorrarActionPerformed
        // TODO add your handling code here:
        int codigoProducto = Integer.valueOf(this.cbPedidos.getSelectedItem().toString());

        for (int x = 0; x < controladorPedido.mostrarInfo().size(); x++) {
            if (codigoProducto == controladorPedido.mostrarInfo().get(x).getCodigoPedido()) {
                controladorPedido.eliminarPedido(x);
                JOptionPane.showMessageDialog(null, "Se ha eliminado un pedido");
                actualizarCombos();
                actualizarTabla();
                break;

            }

        }
    }//GEN-LAST:event_btBorrarActionPerformed

    private void btGuardarModifActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btGuardarModifActionPerformed
        int codigoProducto = Integer.valueOf(this.cbPedidos.getSelectedItem().toString());
        this.btGuardar.setEnabled(true);
        this.btGuardarModif.setEnabled(false);

        for (int x = 0; x < controladorPedido.mostrarInfo().size(); x++) {
            if (codigoProducto == controladorPedido.mostrarInfo().get(x).getCodigoPedido()) {

                String[] datos = new String[6];
                datos[0] = String.valueOf(codigoProducto);
                datos[1] = txtComprador.getText();
                datos[2] = txtTotal.getText();
                datos[3] = cbMercaderia.getSelectedItem().toString();
                datos[4] = txtObservaciones.getText();
                datos[5] = cbProductos.getSelectedItem().toString();

                controladorPedido.eliminarPedido(x);
                controladorPedido.validarDatos(datos);
                actualizarTabla();
                break;
            }

        }
    }//GEN-LAST:event_btGuardarModifActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaPedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPedido().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btBorrar;
    private javax.swing.JButton btGuardar;
    private javax.swing.JButton btGuardarModif;
    private javax.swing.JButton btModificar;
    private javax.swing.JComboBox<String> cbMercaderia;
    private javax.swing.JComboBox<String> cbPedidos;
    private javax.swing.JComboBox<String> cbProductos;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbPedido;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtComprador;
    private javax.swing.JTextField txtObservaciones;
    private javax.swing.JTextField txtTotal;
    // End of variables declaration//GEN-END:variables
}
