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
public class proveedorClass {
    private String rut;
    private String nombre;
    private String direccion; 
    private String telefono;
    private String web;
    
    public proveedorClass(){
        rut = null;
        nombre = null;
        direccion = null; 
        telefono = null;
        web = null;        
    }
    
    public proveedorClass(String rut,String nombre,String direccion, String telefono,String web){
        this.rut = rut;
        this.nombre = nombre;
        this.direccion = direccion; 
        this.telefono = telefono;
        this.web = web;        
    }
    
    public String getRut(){
        return rut;
    }
    
        public String getNombre(){
        return nombre;
    }
        
        public String getDireccion(){
        return direccion;
    }
        
    public String getTelefono(){
        return telefono;
    }

    public String getWeb(){
        return web;
    }
}
