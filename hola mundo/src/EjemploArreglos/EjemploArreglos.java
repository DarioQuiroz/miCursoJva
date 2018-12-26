/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjemploArreglos;

import hola.SobreCargaConstructores.Persona;

/**
 *
 * @author dquiroz
 */
public class EjemploArreglos {
    public static void main(String[] args) {
        int [] edades;
        edades=new int[3];
        edades[0]=30;
        edades[1]=15;
        
        System.out.println("el valpor del arreglo int en la posicion 1 es "+edades[0]);
         System.out.println("el valpor del arreglo int en la posicion 2 es "+edades[1]);
        Persona personas[];
         personas =new Persona[4];
         personas[0]=new Persona("juan",10);
         personas[1]=new Persona("carlos",15);
         System.out.println("el valor del arreglo personas en la posicion 0: "+personas[0]);
          System.out.println("el valor del arreglo personas en la posicion 1: "+personas[1]);
    }
    
}
