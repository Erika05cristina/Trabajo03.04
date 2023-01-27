/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.intento0304.service;

import com.mycompany.intento0304.modelo.Pedido;
import com.mycompany.intento0304.modelo.Producto;
import com.mycompany.intento0304.modelo.Proveedor;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Jonna
 */
public class ProveedorServiceImpl implements ProveedorService {

    private static List<Proveedor> proveedorLista = new ArrayList<>();

    @Override
    public void crearProveedor(Proveedor proveedor) {
        proveedorLista.add(proveedor);
        this.crearArchivo(proveedor, "C:\\Users\\Kristina\\Desktop\\UPS\\POO\\Archivos/proveedor.txt");
    }

    @Override
    public List<Proveedor> mostrarInfo() {
        return proveedorLista;
    }

    @Override
    public void eliminarProveedor(int indice) {
        proveedorLista.remove(indice);

        try {
            this.Actualizar();
        } catch (Exception ex) {
            Logger.getLogger(PedidoServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void Actualizar() throws Exception {
        var Borrarfile = new File("C:\\Users\\Kristina\\Desktop\\UPS\\POO\\Archivos/proveedor.txt");
        Borrarfile.delete();

        for (var i = 0; i < proveedorLista.size(); i++) {
            this.crearArchivo(proveedorLista.get(i), "C:\\Users\\Kristina\\Desktop\\UPS\\POO\\Archivos/proveedor.txt");
        }
    }

    @Override
    public Proveedor buscarPorCodigo(int codigo) {
        Proveedor retorno = null;
        for (var proveedor : this.proveedorLista) {
            if (codigo == proveedor.getCodigo()) {
                retorno = proveedor;
                break;
            }
        }
        return retorno;
    }

    @Override
    public void crearArchivo(Proveedor proveedor, String ruta) {
        ObjectOutputStream salida = null;

        try {
            salida = new ObjectOutputStream(new FileOutputStream(ruta, true));
            salida.writeObject(proveedor);
            salida.close();

        } catch (Exception ex) {

            Logger.getLogger(ProveedorServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public List<Proveedor> leerArchivo(String ruta) {
        List<Proveedor> proveedorLista = new ArrayList<Proveedor>();

        ObjectInputStream entrada = null;
        try {
            var objeto = new FileInputStream(new File(ruta));
            while (objeto.available() > 0) {
                entrada = new ObjectInputStream(objeto);
                Proveedor proveedor = (Proveedor) entrada.readObject();
                proveedorLista.add(proveedor);

            }
            entrada.close();

        } catch (Exception ex1) {

            Logger.getLogger(PedidoServiceImpl.class.getName()).log(Level.SEVERE, null, ex1);

        }
        return proveedorLista;
    }

    @Override
    public void cargarDatos(List<Proveedor> cargarLista) {
        ProveedorServiceImpl.proveedorLista = cargarLista;
    }

    @Override
    public void modificar(Proveedor proveedor, int codigo) {
        var indice = -1;
        for (var proveedores : this.proveedorLista) {
            indice++;
            if (codigo == proveedores.getCodigo()) {
                this.proveedorLista.set(indice, proveedor);

            }

        }
        try {
            this.Actualizar();
        } catch (Exception ex) {
            Logger.getLogger(ProveedorServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
