/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MiLaboratorioMain;

import MiLaboratoioFInal.*;
import MiLaboratoioFInal.Orden;


/**
 *
 * @author dquiroz
 */
public class MundoPc {
    public static void main(String[] args) {
        
        Monitor monitorbenq=new Monitor("benq",50.0);
        Teclado techzone= new Teclado("bluetho","toshiba");
        Raton mouse=new Raton("cable","perfect");
        Computadora CP1=new Computadora("Benq", monitorbenq, techzone, mouse);
                
                Orden o1=new Orden();
                o1.agregarComputadora(CP1);
                o1.MostrarOrden();
                   
                Orden o2= new Orden();
                o2.agregarComputadora(CP1);
                o2.MostrarOrden();
                
    }
    
}
