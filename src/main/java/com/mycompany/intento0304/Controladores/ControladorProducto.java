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

    public void validarDatos(String[] datos) {
        boolean valido = true;
        
        int codigo = Integer.valueOf(datos[0]);
        String nombre = datos[1];
        int cantidad = Integer.valueOf(datos[2]);
        double precio = Double.valueOf(datos[3]);

        if (this.validarNumeros(codigo) == false) {
            valido = false;
        }
        if (this.validarNombre(nombre) == false) {
            valido = false;
        }
        if (this.validarNumeros(cantidad) == false) {
            valido = false;
        }
        /*if(validarPrecio(precio) == false){
            valido = false;
        }*/

        if (valido == true) {
            var productoNuevo = new Producto(codigo, nombre, cantidad, precio);
            this.productoServiceImpl.crearProduct(productoNuevo);
            JOptionPane.showMessageDialog(null, "Se ha creado un nuevo producto");

        } else {
            JOptionPane.showMessageDialog(null, "No se creo un producto!");

        }

    }

    public void eliminarProducto(int indice) {
        productoServiceImpl.eliminarProducto(indice);
    }

    public List<Producto> mostrarInfo() {
        return productoServiceImpl.mostrarInfo();
    }

}
