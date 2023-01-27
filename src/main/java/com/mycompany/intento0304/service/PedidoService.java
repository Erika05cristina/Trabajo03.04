/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.intento0304.service;

import com.mycompany.intento0304.modelo.Pedido;
import com.mycompany.intento0304.modelo.Producto;
import java.util.List;

/**
 *
 * @author Jonna
 */
public interface PedidoService {

    public void crearPedido(Pedido pedido);

    public void eliminarPedido(int indice);

    public List<Pedido> mostrarInfo();

    public Pedido buscarPorCodigo(int codigo);
   
    
    
    public void crearArchivo(Pedido pedido,  String ruta)throws Exception; //1
    //2
    public List<Pedido> leerArchivo( String ruta);
    
    public void cargarDatos(List<Pedido> cargarLista);
    
    public void modificar(Pedido pedido, int codigo);//Agr

}
