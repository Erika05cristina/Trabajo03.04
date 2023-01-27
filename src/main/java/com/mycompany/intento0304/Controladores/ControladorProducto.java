/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.intento0304.Controladores;

import com.mycompany.intento0304.modelo.Producto;
import com.mycompany.intento0304.service.ProductoServiceImpl;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 *
 */
public class ControladorProducto {

    private ProductoServiceImpl productoServiceImpl = new ProductoServiceImpl();
//3
    String ruta = "C:\\Users\\Kristina\\Desktop\\UPS\\POO\\Archivos/producto.txt";

    public boolean validarNumeros(int numero) {
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

    public boolean validarPrecio(double numero) {
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
        //var cod = Integer.valueOf(numero).intValue();

        if (numero > 0) {

            return true;
        } else {

            return false;
        }

    }

    public boolean validarNombre(String nombre) {
        var retorno = true;
        String cadena = nombre;
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

        for (int x = 0; x < productoServiceImpl.mostrarInfo().size(); x++) {
            if (codigoActual == productoServiceImpl.mostrarInfo().get(x).getCodigo()) {

                return true;
            }
        }
        return false;
    }

    public boolean productoExiste(String nombreActual) {

        for (int x = 0; x < productoServiceImpl.mostrarInfo().size(); x++) {
            if (nombreActual.equals(productoServiceImpl.mostrarInfo().get(x).getNombre())) {

                return true;
            }
        }
        return false;
    }

    public void validarDatos(String[] datos) throws Exception {
        boolean valido = true;
        int posicion = Integer.valueOf(datos[4]);
        boolean modificar = Boolean.valueOf(datos[5]);

        try {
            int codigo = Integer.valueOf(datos[0]);
            String nombre = datos[1];
            int cantidad = Integer.valueOf(datos[2]);
            double precio = Double.valueOf(datos[3]);

            if (this.validarNumeros(codigo) == false) {
                valido = false;
            }
            if (this.validarNombre(nombre) == false) {
                valido = false;
                throw new RuntimeException("Ingrese solo letras en el nombre!");

            }
            if (this.validarNumeros(cantidad) == false) {
                valido = false;
                throw new RuntimeException("Ingrese solo numeros!");
            }
            if (modificar == false) {
                if (this.codigoExiste(codigo) == true) {
                    valido = false;
                    throw new RuntimeException("Código existente!");

                }
            }

            if (this.productoExiste(nombre) == true) {

                valido = false;
                throw new RuntimeException("Producto ya existe!");

            }

            if (valido == true) {

                if (modificar == true) {
                    var productoNuevo = new Producto(codigo, nombre, cantidad, precio);
                    this.productoServiceImpl.crearProduct(productoNuevo);
                    this.productoServiceImpl.eliminarProducto(posicion);
                } else {
                    var productoNuevo = new Producto(codigo, nombre, cantidad, precio);
                    this.productoServiceImpl.crearProduct(productoNuevo);
                    this.productoServiceImpl.crearArchivo(productoNuevo, ruta);//Agrega archivo //4
                    
                }

                JOptionPane.showMessageDialog(null, "Se ha creado un nuevo producto");

            } else {
                JOptionPane.showMessageDialog(null, "No se creo un producto!");

            }

        } catch (NumberFormatException e1) {
            JOptionPane.showMessageDialog(null, "No se puedo ingresar texto en precio, cantidad o codigo!");

        }
    }

    public void eliminarProducto(int indice) {
        productoServiceImpl.eliminarProducto(indice);
    }

    public List<Producto> mostrarInfo() {
        return productoServiceImpl.mostrarInfo();
    }

    public List<Producto> mostrarInfoArchivo() { //5
        return productoServiceImpl.leerArchivo( ruta);
    }

    public void recuperarTabla(List<Producto> listaObtenida){
        productoServiceImpl.cargarDatos(listaObtenida);
    }
    
}
