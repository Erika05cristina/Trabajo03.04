/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.intento0304.Menu.Pedido;

import com.mycompany.intento0304.Controladores.ControladorPedido;
import com.mycompany.intento0304.Controladores.ControladorProducto;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Kristina
 */
public class PedidoEliminar extends javax.swing.JInternalFrame {

    public ControladorPedido controladorPedido = new ControladorPedido();
    public ControladorProducto controladorProducto = new ControladorProducto();

    /**
     * Creates new form PedidoEliminar
     */
    public PedidoEliminar() {
        initComponents();

        this.setIconifiable(true);
        this.setIgnoreRepaint(true);
        this.setClosable(true);
        this.setResizable(true);
        this.setDefaultCloseOperation(JInternalFrame.DISPOSE_ON_CLOSE);
        actualizarCombos();
        actualizarTabla();
    }
    
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

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cbPedidos = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbPedido = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        cbProductos = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        btBorrar = new javax.swing.JButton();

        cbPedidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbPedidosActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

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

        jLabel1.setText("Eliminar Pedidos");

        cbProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbProductosActionPerformed(evt);
            }
        });

        jLabel6.setText("Selecione el Pedido");

        btBorrar.setText("Eliminar");
        btBorrar.setEnabled(false);
        btBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBorrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 415, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(52, 52, 52)
                        .addComponent(cbProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                        .addComponent(btBorrar)
                        .addGap(31, 31, 31))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(177, 177, 177)
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addGap(28, 28, 28)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(cbProductos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btBorrar))
                .addContainerGap(58, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbPedidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbPedidosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbPedidosActionPerformed

    private void cbProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbProductosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbProductosActionPerformed

    private void btBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBorrarActionPerformed
        // TODO add your handling code here:
        int codigoProducto = Integer.valueOf(this.cbPedidos.getSelectedItem().toString());

        for (int x = 0; x < controladorPedido.mostrarInfo().size(); x++) {
            if (codigoProducto == controladorPedido.mostrarInfo().get(x).getCodigoPedido()) {
                controladorPedido.eliminarPedido(x);
                JOptionPane.showMessageDialog(null, "Se ha eliminado un pedido");
                actualizarTabla();
                actualizarCombos();
                
                break;

            }

        }
    }//GEN-LAST:event_btBorrarActionPerformed

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
            java.util.logging.Logger.getLogger(PedidoEliminar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PedidoEliminar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PedidoEliminar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PedidoEliminar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PedidoEliminar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btBorrar;
    private javax.swing.JComboBox<String> cbPedidos;
    private javax.swing.JComboBox<String> cbProductos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbPedido;
    // End of variables declaration//GEN-END:variables
}
