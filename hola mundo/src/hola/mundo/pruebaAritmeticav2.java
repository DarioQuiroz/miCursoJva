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
public class pruebaAritmeticav2 {
    public static void main(String[] args) {
        aritmeticav2 obj1=new aritmeticav2();
        
        int resultado=obj1.sumar(1,4);
        System.out.println("resultado de suma deirecta obj1 "+resultado);
        
        
        System.out.println("resultado de suma sin atributos "+obj1.sumar());
        aritmeticav2 obj2=new aritmeticav2(4,5);
        System.out.println("resultado suma atributos con constructor "+obj2.sumar());
    }
}
