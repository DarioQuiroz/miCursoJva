/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hola.Herencia;

/**
 *
 * @author dquiroz
 */
public class pruebaHerencia {
    public static void main(String[] args) {
        empleado e1=new empleado("pedro", 2500);
        System.out.println("imprimo el objeto empleado 1");
        System.out.println(e1);
        
        empleado e2=new empleado("Juan", 2500);
        e2.setEdad(28);
        e2.setGenero('M');
        e2.setDireccion("México,");
        System.out.println("\nimprimimos el objeto empleado 2");
        System.out.println(e2);;
        
        CLiente c1= new CLiente(new java.util.Date(), false);
        System.out.println("\nimprimimos el objeto cliente 1");
        System.out.println(c1);
        
        c1.setNombre("Karla");
        c1.setEdad(22);
        c1.setGenero('f');
        c1.setDireccion("paris");
        System.out.println("\n volvemos a imprimir el objeto cliente1");
        System.out.println(c1);
        System.out.println(new java.util.Date());
    }
}
