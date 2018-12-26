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
public class precedencia_de_operadores {
        public static void main(String[] args) {
            System.out.println("primer ejemplo de operadores");
            int x=5;
            int Y=10;
            int z=++x*Y--;
            System.out.println("x= "+x);
            System.out.println("y =" +Y);
            System.out.println("z= "+z);
            System.out.println("ejemplo deevaluacion");
            System.out.println(4+5*6/3);
            System.out.println((4+5)*(6/3));
            System.out.println("otro ejemplo de evaluacion");
            System.out.println("operador asociativo a la izquierda" );
            System.out.println(1+2+" izquierda ");  
                 System.out.println("izquierda "+1+2);            


}

    
}
