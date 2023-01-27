/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.intento0304.service;

import com.mycompany.intento0304.modelo.Pedido;
import com.mycompany.intento0304.modelo.Proveedor;
import java.util.List;

/**
 *
 * @author Jonna
 */
public interface ProveedorService {

    public void crearProveedor(Proveedor proveedor);

    public void eliminarProveedor(int indice);

    public List<Proveedor> mostrarInfo();
    
   public Proveedor buscarPorCodigo(int codigo);
   
   
   
   public void crearArchivo(Proveedor proveedor,  String ruta) ;//1
    //2
    public List<Proveedor> leerArchivo( String ruta);
    
    public void cargarDatos(List<Proveedor> cargarLista);
    
    public void modificar(Proveedor proveedor, int codigo);//Agr

}
