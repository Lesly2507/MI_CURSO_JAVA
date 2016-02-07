/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.egcc.pagoapp.prueba;

import pe.egcc.pagoapp.dto.PagoDto;
import pe.egcc.pagoapp.services.PagoServices;

/**
 *
 * @author Alumno
 */
public class Prueba01 {
    
    public static void main(String[] args) {
        //Dato
        PagoDto dto = new PagoDto();
        dto.setHorasDia(6);
        dto.setDias(20);
        dto.setPagoHora(150.0);
        //Proceso
        PagoServices service = new PagoServices();
        service.procesar(dto);
        //Reporte
        System.out.println("Ingresos" + dto.getIngresos());
        System.out.println("Renta" + dto.getRenta());
        System.out.println("Neto" + dto.getNeto());
    }
}
