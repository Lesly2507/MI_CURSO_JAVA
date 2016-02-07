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
public class Trabajador {

    /**
     * Este método retorna el salario de un trabajador segun su categoria
     *
     * @param categoria Categoria del trabajador.
     * @return retorna el salario del trabajador
     */
    public double obtenerSalario(int categoria) {
        double salario = 0.0;
        switch (categoria) {
            case 1:
                salario = 1500.0;
                break;
            case 2:
                salario = 3500.0;
                break;
            case 3:
                salario = 6500.0;
                break;
        }
        return salario;
    }
}
