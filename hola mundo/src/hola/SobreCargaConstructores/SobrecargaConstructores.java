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
public class SobrecargaConstructores {
    public static void main(String[] args) {
        Persona p1=new Persona("liliana", 22);
        System.out.println("imprimimos p1");
        System.out.println(p1);
        Persona p2=new Persona("juan", 33);
        System.out.println("\n imprimimos el objeto p2");
        System.out.println(p2);
        
        Empleado e1=new Empleado("pedro", 29, 1800);
        System.out.println("\n imprimimos el objeto e1");
        System.out.println(e1);
    }
    
}
