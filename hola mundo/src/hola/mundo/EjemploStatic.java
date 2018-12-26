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
public class EjemploStatic {
    public static void main(String[] args) {
            PersonaStatic p1= new PersonaStatic("Juan");
            System.out.println("Persona1: "+p1);
            
                PersonaStatic p2= new PersonaStatic("karla");
            System.out.println("Persona2: "+p2);
            
            System.out.println("No. Personas:  "+PersonaStatic.getContadorPersonas());
    }

  
         
    
}
  class PersonaStatic {

   
        private String nombre;
        private  int idPersona;
        private static int contadorPersonas;
        
         public PersonaStatic(String nombre) {
             contadorPersonas++;
             idPersona=contadorPersonas;
        this.nombre = nombre;
    }
         public static int getContadorPersonas(){
             return contadorPersonas;
         }
         
        public String toString(){
            return "Persona[ idPersona: "+idPersona+", nombre: "+nombre+"]";
        }
    }