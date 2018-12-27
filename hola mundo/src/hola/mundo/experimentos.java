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
public class experimentos {
    public static void main(String[] args) {
     /*/   long a=10;
        for (;;) {
            System.out.println("el valor de i es: "+a);
            a++;
      */
     int contador=0;
            int matriz[][]=new int[10][15];
            for (int i = 0; i < 10; i++) {
                System.out.println("el tamaño de la matriz en columnas es "+matriz[i].length);
                for (int j = 0; j < 10; j++) {
                      System.out.println("numero de impresion "+contador+" el tamañoi de la matris es de "+matriz[j].length);
                      ++contador;
                }
            }
          
        }
    }
    
    
