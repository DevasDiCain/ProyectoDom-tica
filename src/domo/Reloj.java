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
public class Reloj {
    
    private static LocalTime hora;//hh:mm:ss
    private static LocalDate fecha;//aaaa-mm-dd

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
    public static void main(String[] args) {
        Reloj x = new Reloj();
        x.mostrarFecha();
        x.mostrarHora();
    }
}
