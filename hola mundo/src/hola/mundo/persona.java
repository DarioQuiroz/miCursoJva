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
public class persona {
    String nombre;
    String apelidopaterno;
    String apellidomaterno;
     
    public void desplegarNombre(){
        System.out.println("nombre: "+nombre);
        System.out.println("Apelido Paterno: "+apelidopaterno);
        System.out.println("Apellido materno: "+apellidomaterno);
    
}
    
    public void cambiarNombre(String nuevoNombre){
        this.nombre=nuevoNombre;
    }
    public String obtenerNombre(){
        return nombre;
    }
}
