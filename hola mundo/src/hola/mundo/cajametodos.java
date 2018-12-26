/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hola.mundo;

import sun.net.www.content.audio.x_aiff;

/**
 *
 * @author dquiroz
 */
public class cajametodos {
int a,b,c;
    public cajametodos() {
    }

    public cajametodos(int alto, int ancho, int profundo) {
        this.a = alto;
        this.b = ancho;
        this.c = profundo;
    }
    public int volumen(){
        int x=0;
        return x=a*b*c;
       
    }
   
}
