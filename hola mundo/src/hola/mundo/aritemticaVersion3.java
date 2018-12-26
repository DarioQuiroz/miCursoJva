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
public class aritemticaVersion3 {
    int a;
    int b;
    aritemticaVersion3(){     
    }

    public aritemticaVersion3(int a, int b) {
        this.a = a;
        this.b = b;
    }
    int sumar(){
        return a+b;
    }
    int restar(){
        return a-b;
        
    }
    int multiplicar(){
        return a*b;
        
    }
    int dividir(){
        return a/b;
    }
}
