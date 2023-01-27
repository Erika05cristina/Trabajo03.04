/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.intento0304.service;

import com.mycompany.intento0304.modelo.Producto;
import java.util.List;

/**
 *
 * @author Jonna
 */
public interface ProductoService {
    

    public void crearProduct(Producto producto);

    public void eliminarProducto(int indice);

    public List<Producto> mostrarInfo();

    public Producto buscarPorCodigo(int codigo);
    
    public void crearArchivo(Producto producto,  String ruta)throws Exception; //1
    //2
    public List<Producto> leerArchivo( String ruta);
    
    public void cargarDatos(List<Producto> cargarLista);
    
    public void modificar(Producto producto, int codigo);//Agr

}
