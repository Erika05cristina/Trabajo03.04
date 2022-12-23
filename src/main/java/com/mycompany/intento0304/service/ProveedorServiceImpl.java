/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.intento0304.service;

import com.mycompany.intento0304.modelo.Producto;
import com.mycompany.intento0304.modelo.Proveedor;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Jonna
 */
public class ProveedorServiceImpl implements ProveedorService {

    List<Proveedor> proveedorLista = new ArrayList<>();

    @Override
    public void crearProveedor(Proveedor proveedor) {
        proveedorLista.add(proveedor);
    }

    @Override
    public List<Proveedor> mostrarInfo() {
        return proveedorLista;
    }

    @Override
    public void eliminarProveedor(int indice) {
        proveedorLista.remove(indice);
    }

 

}
