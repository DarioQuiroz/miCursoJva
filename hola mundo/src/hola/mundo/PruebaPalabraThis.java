/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hola.mundo;

import java.time.chrono.ThaiBuddhistChronology;

/**
 *
 * @author dquiroz
 */
public class PruebaPalabraThis {
    public static void main(String[] args) {
        Persona p=new Persona("juan");
    }
   

}
class Persona {
String nombre;
         Persona(String nombre) {
           this. nombre=nombre;
           Imprimir i=new Imprimir();
           i.imprimir(this);
         }
        
    
    
}
class Imprimir{
    public void imprimir(Object o){
        System.out.println("imprimir parametro: " +o);
        System.out.println("imprimir objeto actual (this): "+this);
    }
}