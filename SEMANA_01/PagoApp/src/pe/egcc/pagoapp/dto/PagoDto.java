/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.egcc.pagoapp.dto;

/**
 *
 * @author Alumno
 */
public class PagoDto {
    //Datos  
    private int horasDia;
    private int dias;
    private double pagoHora;
    //Resultado
    private double ingresos;
    private double renta;
    private double neto;

    public PagoDto(){
    }
    /**
     * @return the horasDia
     */
    public int getHorasDia() {
        return horasDia;
    }

    /**
     * @param horasDia the horasDia to set
     */
    public void setHorasDia(int horasDia) {
        this.horasDia = horasDia;
    }

    /**
     * @return the dias
     */
    public int getDias() {
        return dias;
    }

    /**
     * @param dias the dias to set
     */
    public void setDias(int dias) {
        this.dias = dias;
    }

    /**
     * @return the pagoHora
     */
    public double getPagoHora() {
        return pagoHora;
    }

    /**
     * @param pagoHora the pagoHora to set
     */
    public void setPagoHora(double pagoHora) {
        this.pagoHora = pagoHora;
    }

    /**
     * @return the ingresos
     */
    public double getIngresos() {
        return ingresos;
    }

    /**
     * @param ingresos the ingresos to set
     */
    public void setIngresos(double ingresos) {
        this.ingresos = ingresos;
    }

    /**
     * @return the renta
     */
    public double getRenta() {
        return renta;
    }

    /**
     * @param renta the renta to set
     */
    public void setRenta(double renta) {
        this.renta = renta;
    }

    /**
     * @return the neto
     */
    public double getNeto() {
        return neto;
    }

    /**
     * @param neto the neto to set
     */
    public void setNeto(double neto) {
        this.neto = neto;
    }
   
}
