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
 public class Raton extends DispositivoEntrada {
    private int idRaton;
    private int contadorRatones;
    
   public Raton(String tipoEntrada, String marca){
       super(tipoEntrada, marca);
       idRaton=++contadorRatones;
   }

    @Override
    public String toString() {
        return "Raton{" + "idRaton=" + idRaton + ", contadorRatones=" + contadorRatones + '}';
    }
    
    
    
}
