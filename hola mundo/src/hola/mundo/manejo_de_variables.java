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
public class manejo_de_variables {
      public static void main(String[] args) {
      boolean bool1;
      bool1=true;
      boolean bool2;
      bool2=false; 
          System.out.println("valor de bool1 "+bool1);     
           System.out.println("valor de bool2 "+bool2);     
           
           
           
           byte b1=10;
           byte b2= 0xa;
           
           System.out.println("valor de b1 "+b1);     
           System.out.println("valor de b2 "+b2);  
           System.out.println("");
           
           short s1=2;
            System.out.println("valor de short "+s1);  
            
            char ch1=65, ch2= 'A';
            System.out.println("valor de char 1 "+ch1);
            System.out.println("valor de char2  + "+ch2);
            
            
            int decimal= 100;
            int octal =0144;
            int hexa=0x64;
            System.out.println("valor in decimla +"+ decimal);
            System.out.println("valor int octal "+octal);
            System.out.println("valor exadecima "+ hexa);

            long long1=10, long2 = 20L;
          System.out.println("valore de long " +long1);
          System.out.println("valore  de long2 "+long2);
          
          System.out.println("");
           float f1=15,f2=22.3f;
           System.out.println("valor de float 1 "+f1);
           System.out.println("alor de float 2"+f2);
           double d1=11.0, d2=30.15D;
           System.out.println("valor de double 1" +d1);
           System.out.println("valor de double 2"+d2);
           
    }
    
}
