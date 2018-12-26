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
public class pasoporreferenci {
    public static void main(String[] args) {
        persona p= new persona();
        p.cambiarNombre("juan");
        imprimirNombre(p);
        modificarPersona(p);
        imprimirNombre(p);
    }
    public static void modificarPersona(persona arg){
        arg.cambiarNombre("carlos");
        
    }
    public static void imprimirNombre(persona p){
        System.out.println("valor recibido "+p.obtenerNombre());
    }
}
