/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.egc.model;

/**
 *
 * @author Alumno
 */
public class Producto {
    
    private String nombre;
    private double precio;
    private int stock;
    private boolean activo;

    public Producto() {
    
        this.nombre = "Televisor de 80'";
        this.precio = 10500.0;
        this.stock = 200;
        this.activo = true;
        System.out.println("Objeto creado.");
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize(); 
         System.err.println("Chau objeto.");
    }
      
       public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }
}
