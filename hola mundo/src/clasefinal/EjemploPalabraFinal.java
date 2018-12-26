/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clasefinal;

/**
 *
 * @author dquiroz
 */
public class EjemploPalabraFinal {
    public static void main(String[] args) {
         System.out.println("nombre persona: "+claseFinal.persona.getNombre());
       claseFinal.persona.setNombre("otro");
       System.out.println("nombre persona:"+claseFinal.persona.getNombre());
    }
}
