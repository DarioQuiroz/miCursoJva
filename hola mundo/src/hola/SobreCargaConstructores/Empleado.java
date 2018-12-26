/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hola.SobreCargaConstructores;

/**
 *
 * @author dquiroz
 */
public class Empleado extends Persona{
    private double sueldo;
    
    public Empleado(String nombre, int edad, double sueldo) {
        super(nombre, edad);
        this.sueldo=sueldo;
        
    }
    public double getSueldo()
            {
                return sueldo;
            }   
    public void setSUeldo(double sueldo){
        this.sueldo=sueldo;
        
    }


    @Override
    public String toString() {
        return super.toString()+ "Empleado{" + "sueldo=" + sueldo + '}';
    }


}
