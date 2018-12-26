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
public class dowhile {
    public static void main(String[] args) {
        int contador=1000;
        int limite=100;
        do{
            System.out.println("contador= "+contador);
            contador++;
        }while (contador > limite);
    }
    
}
