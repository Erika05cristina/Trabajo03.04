/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.intento0304.modelo;

import java.io.Serializable;

/**
 *
 * @author Jonna
 */
public class Pedido implements Serializable{

    private int codigoPedido;
    private String nombreComprador;
    private double totalSinIva;
    private String tipoDeMercaderia;
    private String observaciones;
    private Producto producto;

    public Pedido(int codigoPedido, String nombreComprador, double totalSinIva, String tipoDeMercaderia, String observaciones, Producto producto) {
        this.codigoPedido = codigoPedido;
        this.nombreComprador = nombreComprador;
        this.totalSinIva = totalSinIva;
        this.tipoDeMercaderia = tipoDeMercaderia;
        this.observaciones = observaciones;
        this.producto = producto;
    }

    public int getCodigoPedido() {
        return codigoPedido;
    }

    public void setCodigoPedido(int codigoPedido) {
        this.codigoPedido = codigoPedido;
    }

    public String getNombreComprador() {
        return nombreComprador;
    }

    public void setNombreComprador(String nombreComprador) {
        this.nombreComprador = nombreComprador;
    }

    public double getTotalSinIva() {
        return totalSinIva;
    }

    public void setTotalSinIva(double totalSinIva) {
        this.totalSinIva = totalSinIva;
    }

  
    public String getTipoDeMercaderia() {
        return tipoDeMercaderia;
    }

    public void setTipoDeMercaderia(String tipoDeMercaderia) {
        this.tipoDeMercaderia = tipoDeMercaderia;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    @Override
    public String toString() {
        return "Pedido{" + "codigoPedido=" + codigoPedido + ", nombreComprador=" + nombreComprador + ", totalSinIva=" + totalSinIva + ", tipoDeMercaderia=" + tipoDeMercaderia + ", observaciones=" + observaciones + ", producto=" + producto + '}';
    }

    
    
}
