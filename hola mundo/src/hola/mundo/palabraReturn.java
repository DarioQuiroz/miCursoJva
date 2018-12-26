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
public class palabraReturn {
    public static void main(String[] args) {
        int resultado=sumar(0,5);
        System.out.println("resultado "+ resultado);
    }

    private static int sumar(int a, int b) {
        if(a==0 && b==0){
               return 0; 
             
        }
   return a+b;
    }
    
    
}
