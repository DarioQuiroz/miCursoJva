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
public class pasoporvalor {
    public static void main(String[] args) {
        int x=10;
        imprimir(x);
        cambiarValor(x);
        imprimir(x);
    }

    private static void imprimir(int arg) {
      System.out.println("Valor recibido: "+arg);
    }

    private static void cambiarValor(int i) {
          i=200;
       
    }
    
}
