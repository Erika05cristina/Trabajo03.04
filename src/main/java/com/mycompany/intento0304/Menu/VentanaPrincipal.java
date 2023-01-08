/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.intento0304.Menu;

import com.mycompany.intento0304.Menu.Pedido.PedidoEliminar;
import com.mycompany.intento0304.Menu.Pedido.PedidoInsertar;
import com.mycompany.intento0304.Menu.Pedido.PedidoModificar;
import com.mycompany.intento0304.Menu.Producto.ProductoEliminar;
import com.mycompany.intento0304.Menu.Producto.ProductoInsertar;
import com.mycompany.intento0304.Menu.Producto.ProductoModificar;
import com.mycompany.intento0304.Menu.Proveedor.ProveedorEliminar;
import com.mycompany.intento0304.Menu.Proveedor.ProveedorInsertar;
import com.mycompany.intento0304.Menu.Proveedor.ProveedorModificar;
import com.mycompany.intento0304.vista.*;
import javax.swing.JFrame;

/**
 *
 * @author Kristina
 */
public class VentanaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form VentanaPrincipal
     */
    public VentanaPrincipal() {
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

        jMenu1 = new javax.swing.JMenu();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jMenuBar4 = new javax.swing.JMenuBar();
        jMenu7 = new javax.swing.JMenu();
        jMenu8 = new javax.swing.JMenu();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jMenuBar3 = new javax.swing.JMenuBar();
        jMenu10 = new javax.swing.JMenu();
        InsertarProducto = new javax.swing.JMenuItem();
        ModificarProducto = new javax.swing.JMenuItem();
        EliminarProducto = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        InsertarPedido = new javax.swing.JMenuItem();
        ModificarPedido = new javax.swing.JMenuItem();
        EliminarPedido = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        ProveedorInsertar = new javax.swing.JMenuItem();
        ProveedorModificar = new javax.swing.JMenuItem();
        ProveedorEliminar = new javax.swing.JMenuItem();

        jMenu1.setText("jMenu1");

        jMenu3.setText("File");
        jMenuBar2.add(jMenu3);

        jMenu4.setText("Edit");
        jMenuBar2.add(jMenu4);

        jMenu7.setText("File");
        jMenuBar4.add(jMenu7);

        jMenu8.setText("Edit");
        jMenuBar4.add(jMenu8);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 576, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 389, Short.MAX_VALUE)
        );

        jMenu10.setText("Producto");

        InsertarProducto.setText("Insertar Datos");
        InsertarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InsertarProductoActionPerformed(evt);
            }
        });
        jMenu10.add(InsertarProducto);

        ModificarProducto.setText("Modificar Datos");
        ModificarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModificarProductoActionPerformed(evt);
            }
        });
        jMenu10.add(ModificarProducto);

        EliminarProducto.setText("Eliminar Datos");
        EliminarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliminarProductoActionPerformed(evt);
            }
        });
        jMenu10.add(EliminarProducto);

        jMenuBar3.add(jMenu10);

        jMenu5.setText("Pedido");

        InsertarPedido.setText("Insertar Datos");
        InsertarPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InsertarPedidoActionPerformed(evt);
            }
        });
        jMenu5.add(InsertarPedido);

        ModificarPedido.setText("Modificar Datos");
        ModificarPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModificarPedidoActionPerformed(evt);
            }
        });
        jMenu5.add(ModificarPedido);

        EliminarPedido.setText("Eliminar Datos");
        EliminarPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliminarPedidoActionPerformed(evt);
            }
        });
        jMenu5.add(EliminarPedido);

        jMenuBar3.add(jMenu5);

        jMenu6.setText("Proveedor");

        ProveedorInsertar.setText("Insertar Datos");
        ProveedorInsertar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProveedorInsertarActionPerformed(evt);
            }
        });
        jMenu6.add(ProveedorInsertar);

        ProveedorModificar.setText("Modificar Datos");
        ProveedorModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProveedorModificarActionPerformed(evt);
            }
        });
        jMenu6.add(ProveedorModificar);

        ProveedorEliminar.setText("Eliminar Datos");
        ProveedorEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProveedorEliminarActionPerformed(evt);
            }
        });
        jMenu6.add(ProveedorEliminar);

        jMenuBar3.add(jMenu6);

        setJMenuBar(jMenuBar3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void InsertarPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InsertarPedidoActionPerformed
       var pedidoInsertar= new PedidoInsertar();
        pedidoInsertar.setClosable(true);
        pedidoInsertar.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        pedidoInsertar.setVisible(true);
        this.jDesktopPane1.add(pedidoInsertar); 
    }//GEN-LAST:event_InsertarPedidoActionPerformed

    private void ModificarPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModificarPedidoActionPerformed
         var pedidoModificar= new PedidoModificar();
        pedidoModificar.setClosable(true);
        pedidoModificar.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        pedidoModificar.setVisible(true);
        this.jDesktopPane1.add(pedidoModificar); 
    }//GEN-LAST:event_ModificarPedidoActionPerformed

    private void EliminarPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarPedidoActionPerformed
         var pedidoEliminar= new PedidoEliminar();
        pedidoEliminar.setClosable(true);
        pedidoEliminar.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        pedidoEliminar.setVisible(true);
        this.jDesktopPane1.add(pedidoEliminar); 
    }//GEN-LAST:event_EliminarPedidoActionPerformed

    private void InsertarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InsertarProductoActionPerformed
         var productoInsertar= new ProductoInsertar();
        productoInsertar.setClosable(true);
        productoInsertar.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        productoInsertar.setVisible(true);
        this.jDesktopPane1.add(productoInsertar); 
    }//GEN-LAST:event_InsertarProductoActionPerformed

    private void ModificarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModificarProductoActionPerformed
        // TODO add your handling code here:
        var productoModificar= new ProductoModificar();
        productoModificar.setClosable(true);
        productoModificar.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        productoModificar.setVisible(true);
        this.jDesktopPane1.add(productoModificar); 
    }//GEN-LAST:event_ModificarProductoActionPerformed

    private void EliminarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarProductoActionPerformed
        // TODO add your handling code here:
        var productoEliminar= new ProductoEliminar();
        productoEliminar.setClosable(true);
        productoEliminar.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        productoEliminar.setVisible(true);
        this.jDesktopPane1.add(productoEliminar); 
    }//GEN-LAST:event_EliminarProductoActionPerformed

    private void ProveedorInsertarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProveedorInsertarActionPerformed
        // TODO add your handling code here:
        var proveedorInsertar= new ProveedorInsertar();
        proveedorInsertar.setClosable(true);
        proveedorInsertar.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        proveedorInsertar.setVisible(true);
        this.jDesktopPane1.add(proveedorInsertar); 
    }//GEN-LAST:event_ProveedorInsertarActionPerformed

    private void ProveedorModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProveedorModificarActionPerformed
        // TODO add your handling code here:
        var proveedorModificar= new ProveedorModificar();
        proveedorModificar.setClosable(true);
        proveedorModificar.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        proveedorModificar.setVisible(true);
        this.jDesktopPane1.add(proveedorModificar); 
    }//GEN-LAST:event_ProveedorModificarActionPerformed

    private void ProveedorEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProveedorEliminarActionPerformed
        // TODO add your handling code here:
        var proveedorEliminar= new ProveedorEliminar();
        proveedorEliminar.setClosable(true);
        proveedorEliminar.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        proveedorEliminar.setVisible(true);
        this.jDesktopPane1.add(proveedorEliminar); 
        
    }//GEN-LAST:event_ProveedorEliminarActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem EliminarPedido;
    private javax.swing.JMenuItem EliminarProducto;
    private javax.swing.JMenuItem InsertarPedido;
    private javax.swing.JMenuItem InsertarProducto;
    private javax.swing.JMenuItem ModificarPedido;
    private javax.swing.JMenuItem ModificarProducto;
    private javax.swing.JMenuItem ProveedorEliminar;
    private javax.swing.JMenuItem ProveedorInsertar;
    private javax.swing.JMenuItem ProveedorModificar;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu10;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuBar jMenuBar3;
    private javax.swing.JMenuBar jMenuBar4;
    // End of variables declaration//GEN-END:variables
}
