/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domo;

import java.util.ArrayList;

/**
 *
 * @author jose
 */
public class Despacho extends HabitacionesGenericas {

    private Luz Luces;
    private Persiana Persianas;
    private Vigilancia camara;

    public Despacho(int m2) {
        super(m2);
        this.Luces = super.getLuces();
        this.Persianas = super.getPersianas();
        this.camara = super.getVigilancia();
    }

    public void consusltarEstado() {

        if (this.Luces.getEstado() == true) {
            System.out.println("Las Luces están encendidas");
        } else {
            System.out.println("Las Luces están apagadas");
        }

        if (this.Persianas.getEstado()
                == true) {
            System.out.println("Las Persianas están abiertas");
        } else {
            System.out.println("Las Persianas están bajadas");
        }

        if (this.camara.getEstado()
                == true) {
            System.out.println("La Vigilancia está activada");
        } else {
            System.out.println("La Vigilancia está desactivada");
        }
    }

    public static void main(String[] args) {
        Despacho x = new Despacho(10);
        x.consusltarEstado();
    }
}
