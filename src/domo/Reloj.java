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
    
    private LocalTime hora;
    private LocalDate fecha;
    
    
  public void mostrarFecha(){
      this.fecha=LocalDate.now();
      System.out.println(this.fecha);
  }  
  
  public void mostrarHora(){
      this.hora=LocalTime.now();
      System.out.println(this.hora);
  }
    public static void main(String[] args) {
        Reloj x = new Reloj();
        x.mostrarFecha();
        x.mostrarHora();
    }
}
