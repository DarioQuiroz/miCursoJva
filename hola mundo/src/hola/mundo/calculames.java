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
public class calculames {
    public static void main(String[] args) {
        int mes=15;
        String estacion;
        if(mes==1||mes==2||mes==12){
            estacion ="invierno";
            
        }
        else if(mes==3||mes==4||mes==5)
        {
            estacion="primavera";
            
        }
        else if(mes==6||mes==7||mes==8)
        {
            estacion="verano";
            
        }
        else if (mes ==9||mes==10||mes==11) {
            estacion="otoño";
        }
        else{
            estacion="mes incorrecto";
        }
        System.out.println("la estacion para el mes "+mes+" es "+estacion);
    }
    
}
