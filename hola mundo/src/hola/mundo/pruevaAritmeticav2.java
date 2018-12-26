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
public class pruevaAritmeticav2 {public static void main(String[] args) {
         int operandoa=7;
    int operandob=7;
    
    aritemticaVersion3 obj=new aritemticaVersion3(operandoa, operandob);
            System.out.println("operando a "+operandoa+" y operando b "+operandob);
            System.out.println("\n la suma de "+obj.sumar());  
            System.out.println("\n la resta de "+obj.restar());
            System.out.println("\n la multiplicasion "+obj.multiplicar());
            System.out.println("\n la division es "+obj.dividir());
            
    }
   
    
}
