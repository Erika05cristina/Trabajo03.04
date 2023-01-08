/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.intento0304.service;

import com.mycompany.intento0304.modelo.Pedido;
import com.mycompany.intento0304.modelo.Producto;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Jonna
 */
public class PedidoServiceImpl implements PedidoService {

    
    private static List<Pedido> pedidoLista = new ArrayList<>();

    @Override
    public void crearPedido(Pedido pedido) {
        pedidoLista.add(pedido);
    }

    @Override
    public List<Pedido> mostrarInfo() {
        return pedidoLista;
    }

    @Override
    public void eliminarPedido(int indice) {
        pedidoLista.remove(indice);
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

}
