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
public class PalabraNull {
    public static void main(String[] args) {
        Persona1 p1= new Persona1("Juan");
        System.out.println("nombre p1"+p1.obtenerNombre());
      
        Persona1 p2 = p1;
        System.out.println("nombre p2"+p2.obtenerNombre());
         p1=null;
          System.out.println("nombre p2 "+p2.obtenerNombre());
          if(p1 !=null){
              System.out.println("nombre o1: "+p1.obtenerNombre());
          }
    }
    
}
class Persona1 {
    String nombre;
    public Persona1(String nombre){
        this.nombre=nombre;
        
    }

    Persona1() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public String obtenerNombre(){
        return this.nombre;
    }
}