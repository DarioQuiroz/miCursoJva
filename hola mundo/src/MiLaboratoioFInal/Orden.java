/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MiLaboratoioFInal;

/**
 *
 * @author dquiroz
 */
public class Orden {
    private int idOrden;
    private Computadora computadoras[];
    private int contadorComputadoras;
    private static int contadorOrdenes;
    private int maxComputadoras=5;
    public Orden(){
        this.idOrden=++contadorOrdenes;
        computadoras=new Computadora[maxComputadoras];
    }
    public void agregarComputadora(Computadora computadora){
        if(contadorComputadoras<maxComputadoras)
          computadoras[contadorComputadoras++]=computadora;
        else System.out.println("se ha superado el numero de espacios para el almacenamiento");
                
                
    }
   public void MostrarOrden(){
       System.out.println("el Id de la orden es "+idOrden);
       System.out.println("los productos de la orden son:");
       for (int i = 0; i < contadorComputadoras; i++) {
           System.out.println(computadoras[i]);
           
       }
   }
    
}
