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
public class PalabraReturnClases {
    public static void main(String[] args) {
        Suma s=crearObjetoSuma();
        int resultado = s.a+s.b;
        System.out.println("resultado: "+resultado);
    }
    public static Suma crearObjetoSuma(){
        Suma S=new Suma(3,4);
        return S;
    }
}
