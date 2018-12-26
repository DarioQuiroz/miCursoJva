/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hola.Herencia;

import java.util.Date;

/**
 *
 * @author dquiroz
 */
public class CLiente  extends persona{
    private int idCliente;
    private java.util.Date fechaRegistro;
    private static int contadorClientes;
    private boolean vip;
    
    public CLiente(Date fechaRegistrDate, boolean vip){
        this.idCliente=++contadorClientes;
        this.fechaRegistro=fechaRegistrDate;
        this.vip=vip;
        
    }
  public int getIdCliente(){
      return idCliente;
  }
  public Date getFechaRegistro(){
      return fechaRegistro;
  }
  public boolean isVip(){
      return vip;
      
  }
    
    public void setVip(boolean vip){
        this.vip=vip;
    }

    @Override
    public String toString() {
        return super.toString()+ "CLiente{" + "idCliente=" + idCliente + ", fechaRegistro=" + fechaRegistro + ", vip=" + vip + '}';
    }
    
}
