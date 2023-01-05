/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.intento0304.Menu;

import com.mycompany.intento0304.Menu.Pedido.PedidoEliminar;
import com.mycompany.intento0304.Menu.Pedido.PedidoInsertar;
import com.mycompany.intento0304.Menu.Pedido.PedidoModificar;
import com.mycompany.intento0304.Menu.Producto.ProductoInsertar;
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
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();

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
        jMenu10.add(ModificarProducto);

        EliminarProducto.setText("Eliminar Datos");
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

        jMenuItem7.setText("Insertar Datos");
        jMenu6.add(jMenuItem7);

        jMenuItem8.setText("Modificar Datos");
        jMenu6.add(jMenuItem8);

        jMenuItem9.setText("Eliminar Datos");
        jMenu6.add(jMenuItem9);

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
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    // End of variables declaration//GEN-END:variables
}
