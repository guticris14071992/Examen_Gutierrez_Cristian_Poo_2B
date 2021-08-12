/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.intsuperior.vista;

import ec.edu.intsuperior.controlador.Persona;

/**
 *
 * @author cj_gu
 */
public class cliente extends Persona{
    String ruc;

    public cliente() {
    }

    public cliente(String nombre, String apellidos, String edad, int horas_trbajo, int pago_hora) {
        super(nombre, apellidos, edad, horas_trbajo, pago_hora);
        this.ruc=ruc;
    }

    
    
    
    @Override
    public double sueldo_bruto() {
        return gethoras_trabajadas()* getPago_hora();
    }

    @Override
    public double horas_extras() {
        int h_ext=gethoras_trabajadas()-40;
        if(gethoras_trabajadas()>40)
        return h_ext * getPago_hora()*2;
        else
            return 0;
    }

    @Override
    public double sueldoNeto() {
         return sueldo_bruto()+ horas_extras();
    }

    private int gethoras_trabajadas() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String print() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
