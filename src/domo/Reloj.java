/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domo;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;

/**
 *
 * @author jose
 */
public class Reloj {//El reloj servirá para el apagado eco y para futuras funciones además de informarnos de la hora y el día en el que nos encontramos
    
   static LocalTime hora;//hh:mm:ss
   static LocalDate fecha;//aaaa-mm-dd

    public Reloj(LocalTime hora, LocalDate fecha) {
        this.hora = hora;
        this.fecha = fecha;
    }
   public Reloj(){}
    
  public static void mostrarFecha(){
      Reloj.fecha=LocalDate.now();
      System.out.println(Reloj.fecha);
  }  
  
  public static void mostrarHora(){
      Reloj.hora=LocalTime.now();
      System.out.println(Reloj.hora);
  }
  public static void modificarFecha(LocalDate nuevaFecha){
      Reloj.fecha=nuevaFecha;
  
  }
  public static void  modificarHora(LocalTime nuevaHora){
      Reloj.hora=nuevaHora;
  }
    
  public static LocalTime hallarHora(){
    return  LocalTime.now();
  }
  public static LocalDate hallarFecha(){
     return LocalDate.now();
  }
}
