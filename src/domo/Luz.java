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
public class Luz {

    private static boolean estado;
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
            System.out.println("Las luces del dormitorio ya están encendidas");
        }

    }

    public void apagarLuces() {
        if (this.estado == true) {
            this.estado = false;
        } else {
            System.out.println("Las luces del dormitorio ya están apagadas");
        }
    }

    public static void apagadoGeneral() {
        Luz.estado = false;
    }

    public static void apagadoEco(HabitacionesGenericas aApagar) {
        LocalTime primeraHora = LocalTime.of(8, 00);
        LocalTime segundaHora = LocalTime.of(18, 00);
        if (primeraHora.isAfter(Reloj.hallarHora()) && segundaHora.isBefore(Reloj.hallarHora())) {
            if (aApagar.getPersianas().getPosicion().equals(posicionPersiana.ABIERTA) || aApagar.getPersianas().getPosicion().equals(posicionPersiana.MEDIA_ALTURA)) {
                  aApagar.getLuces().setEstado(false);
            }
        }
    }
    public static void consultarEstado(){
         if(Luz.estado==false){System.out.println("Las luces están apagadas");}else {System.out.println("Las luces están encendidas");}
    }

}
