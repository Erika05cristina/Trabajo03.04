/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.intento0304.service;

import com.mycompany.intento0304.modelo.Producto;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.security.Principal;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Jonna
 */
public class ProductoServiceImpl implements ProductoService {

    private static List<Producto> productoLista = new ArrayList<>();

    @Override
    public void crearProduct(Producto producto) {
        productoLista.add(producto);
        try {
            this.crearArchivo(producto, "C:\\\\Users\\\\Kristina\\\\Desktop\\\\UPS\\\\POO/producto.txt");
        } catch (Exception ex) {
            Logger.getLogger(ProductoServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public List<Producto> mostrarInfo() {

        return productoLista;
    }

    @Override
    public void eliminarProducto(int indice) {
        productoLista.remove(indice);
    }

    @Override
    public Producto buscarPorCodigo(int codigo) {
        Producto retorno = null;
        for (var producto : this.productoLista) {
            if (codigo == producto.getCodigo()) {
                retorno = producto;
                break;
            }
        }
        return retorno;
    }

    @Override
    public void crearArchivo(Producto producto, String ruta) throws Exception {

        DataOutputStream salida = null;

        try {
            salida = new DataOutputStream(new FileOutputStream(ruta, true));
            salida.writeInt(producto.getCodigo());
            salida.writeUTF(producto.getNombre());
            salida.close();
        } catch (Exception ex) {
            salida.close();
        }

    }

    @Override
    public List<Producto> leerArchivo(Producto producto, String ruta) {

        try {

            var archivoLectura = new FileReader(ruta);
            var lectura = new BufferedReader(archivoLectura);
            var linea = "";
            while (linea != null) {
                linea = lectura.readLine();
                System.out.println("linea = " + linea);

            }
            lectura.close();
        } catch (FileNotFoundException e) {
            System.out.println("No existe el archivo que desea leer!");
        } catch (Exception e1) {
            System.out.println("Error general" + e1.getMessage() + e1.toString());

        }
        return productoLista;

    }

}
