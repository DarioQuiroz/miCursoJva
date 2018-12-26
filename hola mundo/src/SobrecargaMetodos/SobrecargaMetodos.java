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
public class SobrecargaMetodos {
    public static void main(String[] args) {
        System.out.println("Resultado 1 "+Operaciones.summar(3, 4));
        System.out.println("resultado 2 "+Operaciones.summar(5, 4.1));
        System.out.println("resultado 3 "+Operaciones.summar(7.1, 3));
        System.out.println("resultado 4 "+Operaciones.summar(2.2, 6.8));
        System.out.println("resultado 5 "+Operaciones.summar(3, 1L));
        System.out.println("resultado 6 "+Operaciones.summar(3F, 'A'));
                        
    }
   
}
