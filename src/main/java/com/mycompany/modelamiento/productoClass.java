/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.modelamiento;

/**
 *
 * @author Alumno
 */
public class productoClass {
    private String idProducto;
    private String nombreProducto;
    private Double precio;
    private Double stock;
    private String nombreProveedor;

    public productoClass(String idProducto, String nombreProducto, Double precio, Double stock, String nombreProveedor) {
        this.idProducto = idProducto;
        this.nombreProducto = nombreProducto;
        this.precio = precio;
        this.stock = stock;
        this.nombreProveedor = nombreProveedor;
    }

    public String getIdProducto() {
        return idProducto;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public Double getPrecio() {
        return precio;
    }

    public Double getStock() {
        return stock;
    }

    public String getNombreProveedor() {
        return nombreProveedor;
    }

    
}
