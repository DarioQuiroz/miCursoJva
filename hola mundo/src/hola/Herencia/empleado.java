/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hola.Herencia;

/**
 *
 * @author dquiroz
 */
public class empleado extends persona{
    private int idEmpleado;
    private double sueldo;
    private static int contadorEmpleados;
    
public empleado( String nombre,  double sueldo){
    super(nombre);
    this.idEmpleado=++contadorEmpleados;
    this.sueldo=sueldo;
}
    
public int getIdEmpleado(){
    return idEmpleado;
}
    public double getSueldo(){
        return sueldo;
    }
    public void setSueldo(double sueldo){
        this.sueldo=sueldo;
    }
    @Override
    public String toString(){
        return super.toString()+" empleado{ idEmpleado= "+idEmpleado+", sueldo="+sueldo+'}';
                
    }
}
