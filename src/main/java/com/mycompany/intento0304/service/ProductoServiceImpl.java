/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.intento0304.service;

import com.mycompany.intento0304.modelo.Producto;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
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

        try {
            productoLista.add(producto);
            this.crearArchivo(producto, "C:\\Users\\Kristina\\Desktop\\UPS\\POO\\Archivos/producto.txt");
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
        var Borrarfile = new File("C:\\Users\\Kristina\\Desktop\\UPS\\POO\\Archivos/producto.txt");
       Borrarfile.delete();

        this.productoLista.remove(indice);

        try {
            this.Actualizar();
            
        } catch (Exception ex) {
            Logger.getLogger(ProductoServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        } 
        
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
            salida.writeInt(producto.getCantidad());
            salida.writeDouble(producto.getPrecio());
            salida.close(); 
        } catch (Exception ex) {
            //Quitado //salida.close();
            Logger.getLogger(ProductoServiceImpl.class.getName()).log(Level.SEVERE, null, ex); //Agregado

        }

    }

    @Override
    public List<Producto> leerArchivo(String ruta) {
        var productoLista = new ArrayList<Producto>(); //AGR
        DataInputStream entrada = null;//AGR
        try {
            entrada = new DataInputStream(new FileInputStream(ruta));
            while (true) {
                var codigo = entrada.readInt();
                var nombre = entrada.readUTF();
                var cantidad = entrada.readInt();
                var precio = entrada.readDouble();

                var producto = new Producto(codigo, nombre, cantidad, precio);
                productoLista.add(producto);

            }

        } catch (IOException e) {
            try {
                entrada.close();
            } catch (Exception ex) {
                Logger.getLogger(ProductoServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return productoLista;

    }

    @Override
    public void cargarDatos(List<Producto> cargarLista) {
        ProductoServiceImpl.productoLista = cargarLista;
    }

    //AGR
    public void Actualizar() throws Exception {
        var Borrarfile = new File("C:\\Users\\Kristina\\Desktop\\UPS\\POO\\Archivos/producto.txt");
        Borrarfile.delete();

        for (var i = 0; i < productoLista.size(); i++) {
            this.crearArchivo(productoLista.get(i), "C:\\Users\\Kristina\\Desktop\\UPS\\POO\\Archivos/producto.txt");
        }
    }

    @Override
    public void modificar(Producto producto, int codigo) {
        var indice = -1;
        for (var productos : this.productoLista) {
            indice++;
            if (codigo == productos.getCodigo()) {
                this.productoLista.set(indice, producto);
            }
        }
        
        try {
            this.Actualizar();
        } catch (Exception ex) {
            Logger.getLogger(ProductoServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
