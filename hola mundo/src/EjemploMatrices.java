/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dquiroz
 */
public class EjemploMatrices {
    public static void main(String[] args) {
        int edades[][];
        edades=new int[3][2];
        edades[0][0]=10;
         edades[0][1]=15;
          edades[1][0]=20;
           edades[1][1]=25;
            edades[2][0]=30;
             edades[2][1]=35;
             System.out.println("Matriz en la posocion 0,0 "+ edades[0][0]);
              System.out.println("Matriz en la posocion 0,1 "+ edades[0][1]);
               System.out.println("Matriz en la posocion 1,0 "+ edades[1][0]);
                System.out.println("Matriz en la posocion 1,1 "+ edades[1][1]);
                 System.out.println("Matriz en la posocion 2,0 "+ edades[2][0]);
                  System.out.println("Matriz en la posocion 2,1 "+ edades[2][1]);
                  
                  Persona personas[][]=new Persona[3][2];
    personas[0][0]=new Persona("Juan");
    personas[0][1]=new Persona("Armando");
    personas[1][0]=new Persona("Karla");
    personas[1][1]=new Persona("Laura");
    personas[2][0]=new Persona("Pedro");
    personas[2][1]=new Persona("Javier");
        System.out.println("\n");
        for (int i = 0; i <personas.length; i++) {
            for (int j = 0; j < personas[i].length; j++) {
                System.out.println("Matriz personas indice: "+i+"-"+j+": "+personas[i][j]);
            }
        }
    }
    
}
