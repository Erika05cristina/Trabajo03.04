/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.intento0304.Controladores;

import com.mycompany.intento0304.modelo.Pedido;
import com.mycompany.intento0304.modelo.Producto;
import com.mycompany.intento0304.service.PedidoServiceImpl;
import com.mycompany.intento0304.service.ProductoServiceImpl;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Jonna
 */
public class ControladorPedido {

    private PedidoServiceImpl pedidoServiceImpl = new PedidoServiceImpl();
    private ProductoServiceImpl productoServiceImpl = new ProductoServiceImpl();
    String ruta = "C:\\Users\\Kristina\\Desktop\\UPS\\POO\\Archivos/pedido.txt";

    public boolean validarCodigo(int numero) {
        String numCadena = String.valueOf(numero);
        String cadena = numCadena;

        char[] cadenaDiv = cadena.toCharArray();
        String n = "";

        for (int i = 0; i < cadenaDiv.length; i++) {
            if (Character.isDigit(cadenaDiv[i])) {
                n += cadenaDiv[i];
            } else {
                return false;
            }
        }
        if (numero > 0) {

            return true;
        } else {
            return false;
        }
    }

    public boolean validarTexto(String texto) {
        var retorno = true;
        String cadena = texto;
        char[] cadena_div = cadena.toCharArray();
        String n = "";
        for (int i = 0; i < cadena_div.length; i++) {
            if (Character.isDigit(cadena_div[i])) {
                n += cadena_div[i];
                retorno = false;

            }
        }

        return retorno;
    }

    public boolean codigoExiste(int codigoActual) {

        for (int x = 0; x < pedidoServiceImpl.mostrarInfo().size(); x++) {
            if (codigoActual == pedidoServiceImpl.mostrarInfo().get(x).getCodigoPedido()) {

                return true;
            }
        }
        return false;
    }

    public boolean compradorexiste(String nombreActual) {

        for (int x = 0; x < pedidoServiceImpl.mostrarInfo().size(); x++) {
            if (nombreActual.equals(pedidoServiceImpl.mostrarInfo().get(x).getNombreComprador())) {

                return true;
            }
        }
        return false;
    }

    public void validarDatos(String[] datos) {
        boolean valido = true;
        int posicion = Integer.valueOf(datos[6]);
        boolean modificar = Boolean.valueOf(datos[7]);

        try {
            int codigo = Integer.valueOf(datos[0]);
            String comprador = datos[1];
            double total = Double.valueOf(datos[2]);
            String tipoMercaderia = datos[3];
            String observaciones = datos[4];
            var productos = this.productoServiceImpl.buscarPorCodigo(Integer.valueOf(datos[5]));

            if (this.validarCodigo(codigo) == false) {
                valido = false;
            }
            if (this.validarTexto(comprador) == false) {
                valido = false;
                throw new RuntimeException("Ingrese solo letras en el comprador!");
            }

            if (this.validarTexto(observaciones) == false) {
                valido = false;
                throw new RuntimeException("Ingrese solo letras en las observaciones!");
            }

            if (modificar == false) {
                if (this.codigoExiste(codigo) == true) {
                    valido = false;
                    throw new RuntimeException("C??digo existente!");

                }
            }
            if (this.compradorexiste(comprador) == true) {

                valido = false;
                throw new RuntimeException("Comprador ya existe!");

            }

            if (valido == true) {

                if (modificar == true) {
                    var pedido = new Pedido(codigo, comprador, total, tipoMercaderia, observaciones, productos);
                    this.pedidoServiceImpl.crearPedido(pedido);
                    this.pedidoServiceImpl.eliminarPedido(posicion);
                } else {
                    var pedido = new Pedido(codigo, comprador, total, tipoMercaderia, observaciones, productos);
                    this.pedidoServiceImpl.crearPedido(pedido);
                    this.pedidoServiceImpl.crearArchivo(pedido, ruta);//Agrega archivo //4

                }

                JOptionPane.showMessageDialog(null, "Se ha creado un nuevo pedido");

            } else {
                JOptionPane.showMessageDialog(null, "No se creo el pedido!");
            }

        } catch (NumberFormatException e1) {

            JOptionPane.showMessageDialog(null, "No se puedo ingresar texto en el total o codigo!");

        } catch (NullPointerException e1) {
            JOptionPane.showMessageDialog(null, "No hay productos ingresados!");

            throw new RuntimeException("No hay productos ingresados!");
        } catch (Exception ex) {
            Logger.getLogger(PedidoServiceImpl.class.getName()).log(Level.SEVERE, null, ex);

        }

    }
    
   public List<Pedido> mostrarInfoArchivo() { //5
        return pedidoServiceImpl.leerArchivo( ruta);
    }

    public void recuperarTabla(List<Pedido> listaObtenida){
        pedidoServiceImpl.cargarDatos(listaObtenida);
    }

    public void eliminarPedido(int indice) {
        pedidoServiceImpl.eliminarPedido(indice);
    }

    public List<Pedido> mostrarInfo() {
        return pedidoServiceImpl.mostrarInfo();
    }
}
