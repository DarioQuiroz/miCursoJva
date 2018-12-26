/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SobrecargaMetodos;

/**
 *
 * @author dquiroz
 */
public class Operaciones {
    public static int summar(int a, int b){
        System.out.println("metodo sumar int, int");
        return a+b;
    }
    
       public static double summar(double a, double b){
        System.out.println("metodo sumar double, double");
        return a+b;
    }
       public static double summar(double a, int b){
        System.out.println("metodo sumar double, int");
        return a+b;
    }  
       public static double summar(int a, double b){
        System.out.println("metodo sumar int, double");
        return a+b;
    }
}
