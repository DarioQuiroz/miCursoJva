/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gm.ventas;

/**
 *
 * @author dquiroz
 */
public class Ventas {
    public static void main(String[] args) {
        Producto p1= new Producto("camisa", 50);
          Producto p2= new Producto("pantalon", 100);
           Producto p3= new Producto("camisa", 150);
           
           
           
           Orden orden1= new Orden();
           
           orden1.agregarProdcto(p1);
           orden1.agregarProdcto(p2);
           orden1.agregarProdcto(p3);
           
           orden1.mostrarOrden();

            Orden orden2= new Orden();
            Producto p4= new Producto("zapatos", 100);
           Producto p5= new Producto("Blusa", 150);
           
           orden2.agregarProdcto(p1);
           orden2.agregarProdcto(p4);
           orden2.agregarProdcto(p5);
           orden2.agregarProdcto(p4);
           orden2.agregarProdcto(p3);
           orden2.mostrarOrden();

    }
    
}
