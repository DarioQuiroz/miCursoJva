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
public class manejo_de_operadores {
      public static void main(String[] args) {
          System.out.println(" operadores ariteticos");
          int a=1+2;
          int b= a*4;
          int c=b/2;
          int d=c-4;
          int e=-d;
          System.out.println("a= "+a);
            System.out.println("b= "+b);
              System.out.println("c= "+c);
                System.out.println("c= "+c);
                  System.out.println("d= "+d);
          System.out.println("\n operador modulo (residuo");
          System.out.println("x mod 2= "+a%2);
          System.out.println("\n operador compuesto");
          a+=2;
          b-=4;
          c*=a;
            System.out.println("a= "+a);
            System.out.println("b= "+b);
              System.out.println("c= "+c);
              System.out.println(" \n operador de incremento");
              a++;
              System.out.println("a= "+a);
              System.out.println("\n operador de decremento");
              a--;
              System.out.println("\n valor de preincremento");
               c=++a;
               System.out.println("c= "+c);
               System.out.println("valor de postincremento");
               d=b++;
               System.out.println("valor de d" +d);  
               System.out.println("\noperador relacional");
               
               boolean res =a<b;
               System.out.println("res= "+res);
               System.out.println("\n operador ternario ");
               int min =(a<b)?a:b;
               System.out.println("min= "+min);
               System.out.println("\n operador de asignacion");
               int i, j,k;
               i= j=k=100;
               System.out.println("i= "+i);
               System.out.println("j= "+j);
               System.out.println("k= "+k);
                       
      }
    
}
