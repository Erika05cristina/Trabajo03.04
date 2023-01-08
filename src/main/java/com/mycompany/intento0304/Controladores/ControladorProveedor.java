/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.intento0304.Controladores;

import com.mycompany.intento0304.modelo.Pedido;
import com.mycompany.intento0304.modelo.Proveedor;
import com.mycompany.intento0304.service.PedidoServiceImpl;
import com.mycompany.intento0304.service.ProveedorServiceImpl;
import static java.lang.Integer.getInteger;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Jonna
 */
public class ControladorProveedor {

    private ProveedorServiceImpl proveedorServiceImpl = new ProveedorServiceImpl();
    private PedidoServiceImpl pedidoServiceImpl = new PedidoServiceImpl();

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
        //var cod = Integer.valueOf(numero).intValue();

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

    public boolean validarHora(String hora) {
        boolean b;
        char[] a = hora.toString().toCharArray();
        String[] c = hora.split(":");
        if ((a[0] == ' ') || (a[1] == ' ') || (a[2] == ' ') || (a[3] == ' ') || (a[4] == ' ')
                || (getInteger(c[0]) > 23) || (getInteger(c[1]) > 59)) {
            b = false;
        } else {
            b = true;
        }
        return b;
    }

    public void validarDatos(String[] datos) {
        boolean valido = true;
        int codigo = Integer.valueOf(datos[0]);
        String nombre = datos[1];
        String ruta = datos[2];
        String horaIngreso = datos[3];
        String horaSalida = datos[4];
        var pedido = this.pedidoServiceImpl.buscarPorCodigo(Integer.valueOf(datos[5]));

        if (this.validarCodigo(codigo) == false) {
            valido = false;
        }
        if (this.validarTexto(nombre) == false) {
            valido = false;
        }
        if (this.validarTexto(ruta) == false) {
            valido = false;
        }
/*        if (this.validarHora(horaIngreso) == false) {
            valido = false;
        }
      /*  if (this.validarHora(horaSalida) == false) {
            valido = false;
        }*/

        if (valido == true) {
            var proveedor = new Proveedor(codigo, nombre, ruta, horaIngreso, horaSalida, pedido);
            this.proveedorServiceImpl.crearProveedor(proveedor);

            JOptionPane.showMessageDialog(null, "Se ha creado un nuevo proveedor");

        } else {
            JOptionPane.showMessageDialog(null, "No se creo un proveedor!");

        }

    }

    public void eliminarProveedor(int indice) {
        proveedorServiceImpl.eliminarProveedor(indice);
    }

    public List<Proveedor> mostrarInfo() {
        return proveedorServiceImpl.mostrarInfo();
    }

}
