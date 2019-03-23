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

    public Despacho(int m2) {
        super(m2);
    }
  public void consusltarEstado() {

        if (getLuces().getEstado()==true) {
            System.out.println("Las Luces están ENCENDIDAS");
        } else {
            System.out.println("Las Luces están APAGADAS");
        }

        if (super.getPersianas().getPosicion()==posicionPersiana.ABIERTA || super.getPersianas().getPosicion()==posicionPersiana.MEDIA_ALTURA) {
            System.out.println("Las Persianas están ABIERTAS");
        } else {
            System.out.println("Las Persianas están BAJADAS");
        }

        if (super.getVigilancia().getEstado()
                == true) {
            System.out.println("La Vigilancia está ACTIVADA");
        } else {
            System.out.println("La Vigilancia está DESACTIVADA");
        }
    }
 
}
