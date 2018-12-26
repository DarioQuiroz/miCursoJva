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
public class caja {
    public static void main(String[] args) {
        
        int alto=2, ancho=2, profundo=2;
        
        cajametodos obj1= new cajametodos(alto, ancho, profundo);
        int x=obj1.volumen();
        System.out.println("el volumen del cubo es de "+x);
        System.gc();
        
    }
}
