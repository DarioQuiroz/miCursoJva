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
public class Persona {
    private int idPersona;
    private String nombre;
    private int edad;
    private static int contadorPersonas;
    
    private Persona(){
        this.idPersona=++contadorPersonas;
    }
    
    public Persona(String nombre, int edad){
        
    }
}
