/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.intento0304.service;

import com.mycompany.intento0304.modelo.Pedido;
import com.mycompany.intento0304.modelo.Producto;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
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
public class PedidoServiceImpl implements PedidoService {

    private static List<Pedido> pedidoLista = new ArrayList<>();

    @Override
    public void crearPedido(Pedido pedido) {
        pedidoLista.add(pedido);
        try {
            this.crearArchivo(pedido, "C:\\Users\\Kristina\\Desktop\\UPS\\POO\\Archivos/pedido.txt");
        } catch (Exception ex) {
            Logger.getLogger(PedidoServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @Override
    public List<Pedido> mostrarInfo() {
        return pedidoLista;
    }

    @Override
    public void eliminarPedido(int indice) {

        pedidoLista.remove(indice);

        try {
            this.Actualizar();
        } catch (Exception ex) {
            Logger.getLogger(PedidoServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void Actualizar() throws Exception {
        var Borrarfile = new File("C:\\Users\\Kristina\\Desktop\\UPS\\POO\\Archivos/pedido.txt");
        Borrarfile.delete();

        for (var i = 0; i < pedidoLista.size(); i++) {
            this.crearArchivo(pedidoLista.get(i), "C:\\Users\\Kristina\\Desktop\\UPS\\POO\\Archivos/pedido.txt");
        }
    }

    @Override
    public Pedido buscarPorCodigo(int codigo) {
        Pedido retorno = null;
        for (var pedido : this.pedidoLista) {
            if (codigo == pedido.getCodigoPedido()) {
                retorno = pedido;
                break;
            }
        }
        return retorno;
    }

    @Override
    public void crearArchivo(Pedido pedido, String ruta) throws Exception {
        ObjectOutputStream salida = null;

        try {
            salida = new ObjectOutputStream(new FileOutputStream("C:\\Users\\Kristina\\Desktop\\UPS\\POO\\Archivos/pedido.txt", true));
            salida.writeObject(pedido);
            salida.close();

        } catch (Exception ex) {
            
            Logger.getLogger(PedidoServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @Override
    public List<Pedido> leerArchivo(String ruta) {

        List<Pedido> pedidoLista = new ArrayList<Pedido>();

        ObjectInputStream entradaOBj = null;

        try {
            var objeto = new FileInputStream(new File(ruta));
            while (objeto.available() > 0) {
                entradaOBj = new ObjectInputStream(objeto);
                Pedido pedido = (Pedido) entradaOBj.readObject();
                pedidoLista.add(pedido);
            }
            entradaOBj.close();

        } catch (Exception ex1) {

            Logger.getLogger(PedidoServiceImpl.class.getName()).log(Level.SEVERE, null, ex1);
        }
        return pedidoLista;
    }

    @Override
    public void cargarDatos(List<Pedido> cargarLista) {
        PedidoServiceImpl.pedidoLista = cargarLista;
    }

    @Override
    public void modificar(Pedido pedido, int codigo) {
        var indice = -1;
        for (var pedidos : this.pedidoLista) {
            indice++;
            if (codigo == pedidos.getCodigoPedido()) {
                this.pedidoLista.set(indice, pedido);

            }

        }
        try {
            this.Actualizar();
        } catch (Exception ex) {
            Logger.getLogger(PedidoServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
