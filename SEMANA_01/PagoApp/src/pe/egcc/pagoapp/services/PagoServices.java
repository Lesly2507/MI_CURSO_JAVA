package pe.egcc.pagoapp.services;

import pe.egcc.pagoapp.dto.PagoDto;

/**
 *
 * @author Alumno
 */
public class PagoServices {
 
    public void procesar(PagoDto dto){
    //Variables
       double ingresos, renta, neto;
    //Procesos
      ingresos = dto.getHorasDia()
              * dto.getDias() * dto.getPagoHora();
      if(ingresos> 1500.0){
       renta = ingresos * 0.08;
       } else {
         renta = 0.0;
      }
      neto = ingresos - renta;
      //Reporte
      dto.setIngresos(ingresos);
      dto.setRenta(renta);
      dto.setNeto(neto);
    }
}
