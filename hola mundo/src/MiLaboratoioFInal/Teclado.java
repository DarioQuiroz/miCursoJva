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
public class Teclado extends DispositivoEntrada{
    private int idTeclado;
    private int contadorTeclados;
    public Teclado(String tipoEntrada, String marca){
        super(tipoEntrada, marca);
        idTeclado=++contadorTeclados;
    }

    @Override
    public String toString() {
        return "Teclado{" + "idTeclado=" + idTeclado + ", contadorTeclados=" + contadorTeclados + '}';
    }
    
}
