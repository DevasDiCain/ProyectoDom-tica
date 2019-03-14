/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domo;

import java.util.ArrayList;
import java.util.Scanner;

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
    }
   public void consusltarEstado() {

        if (super.getLuces().getEstado()) {
            System.out.println("Las Luces están encendidas");
        } else {
            System.out.println("Las Luces están apagadas");
        }

        if (super.getLuces().getEstado()
                == true) {
            System.out.println("Las Persianas están abiertas");
        } else {
            System.out.println("Las Persianas están bajadas");
        }

        if (super.getVigilancia().getEstado()
                == true) {
            System.out.println("La Vigilancia está activada");
        } else {
            System.out.println("La Vigilancia está desactivada");
        }
    }
 
}
