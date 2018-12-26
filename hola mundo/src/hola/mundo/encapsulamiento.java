/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hola.mundo;

/**
 *
 * @author dquiroz
 */
public class encapsulamiento {
    public static void main(String[] args) {
        
        encapsulamientoPersona p1 = new encapsulamientoPersona("juan","perez",false);
        System.out.println("nombre de p1: "+p1.getNombre());
        
       encapsulamientoPersona p2 = new encapsulamientoPersona("karla","dominguez",false);
        System.out.println("Etado del objeto p2: "+p2);
        
        p2.setBorrado(true);
        System.out.println("estado del objeto p2"+p2);

        encapsulamientoPersona p3= new encapsulamientoPersona();
        System.out.println(" estado del objeto p3:"+p3);
        
        p2.setNombre("panfilo");
        System.out.println(p2);
        System.out.println(p2.getApellido());
    }
}
