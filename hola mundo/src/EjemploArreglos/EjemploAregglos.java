/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjemploArreglos;

/**
 *
 * @author dquiroz
 */
public class EjemploAregglos {
    public static void main(String[] args) {
        int edades[];
        edades=new int[3];
        edades[0]=30;
        edades[1]=45;
        edades[2]=50;
        System.out.println("Arreglo enteros indice 0: "+ edades[0]);         
         System.out.println("Arreglo enteros indice 1: "+ edades[1]);         
          System.out.println("Arreglo enteros indice 2: "+ edades[2]);   
          Persona personas[];
          personas=new Persona[4];
          personas[0]=new Persona("juan");
          personas[1]=new Persona("yo");
          personas[2]=new Persona("tu");
          System.out.println("\n");
          System.out.println("Arreglo personas indice 0: "+personas[0]);
            System.out.println("Arreglo personas indice 1: "+personas[1]);
              System.out.println("Arreglo personas indice 2: "+personas[2]);
              System.out.println("\b");
              String nombres[]= {"yo","tu","el","nosotros"};
              for (int i = 0; i < nombres.length; i++) {
                  System.out.println("arreglo string de nombres enb la posicion "+i +":"+nombres[i]);
        }
              
                
    }
}
