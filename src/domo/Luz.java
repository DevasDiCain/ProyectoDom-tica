/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domo;

import java.time.LocalTime;

/**
 *
 * @author jose
 */
public class Luz {//Las luces que contendrán las habitaciones de la casa

    private boolean estado;
    private double consumo;

    public boolean getEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public double getConsumo() {
        return consumo;
    }

    public void setConsumo(double consumo) {
        this.consumo = consumo;
    }

    public Luz(boolean estado, double consumo) {
        this.estado = estado;
        this.consumo = consumo;
    }

    public void encenderLuces() {
        if (this.estado == false) {
            this.estado = true;
        } else {
            System.out.println("Las luces ya están encendidas");
        }

    }

    public void apagarLuces() {
        if (this.estado == true) {
            this.estado = false;
        } else {
            System.out.println("Las luces  ya están apagadas");
        }
    }
    //Método que apagará todas las luces de la casa
    public  void apagadoGeneral() {
        this.estado = false;
    }
    //Método que apaga las luces de las estancias que tengan las persianas abiertas entre las 08:00 y las 16:00
    public static void apagadoEco(HabitacionesGenericas aApagar) {
        LocalTime primeraHora = LocalTime.of(8, 00);
        LocalTime segundaHora = LocalTime.of(18, 00);
        System.out.println("Apagado Eco");
        if (Reloj.hallarHora().isAfter(primeraHora) && Reloj.hallarHora().isBefore(segundaHora)) {
            System.out.println("Dentro de "
                    + "Rango horario");
            if (aApagar.getPersianas().getPosicion().equals(posicionPersiana.ABIERTA) || aApagar.getPersianas().getPosicion().equals(posicionPersiana.MEDIA_ALTURA)) {
                  aApagar.getLuces().apagarLuces();
            }
        }
    }
    public void consultarEstado(){
         if(this.estado==false){System.out.println("Las luces están apagadas");}else {System.out.println("Las luces están encendidas");}
    }

}
