/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hola.mundo;

import java.util.Scanner;

/**
 *
 * @author dquiroz
 */
public class ciclowhilev2 {
    public static void main(String[] args) {
        System.out.println("introduce el numero de iteraciones");
        Scanner entrada=new Scanner(System.in);
        int maximoelementos=entrada.nextInt();
        int contador=0;
        while (contador<maximoelementos)
        {
            System.out.println("contador= "+contador);
            contador++;
        }
    }
}
