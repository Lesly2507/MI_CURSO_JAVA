/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.egc.prueba;

import pe.egc.model.Trabajador;

/**
 *
 * @author Alumno
 */
public class Prueba01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Trabajador trabajador;
        trabajador = new Trabajador();
        System.out.println("Salario: " + trabajador.obtenerSalario(2));
    }
    
}
