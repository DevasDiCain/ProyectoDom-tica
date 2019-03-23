/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domo;

/**
 *
 * @author jose
 */
public class Dormitorio extends HabitacionesGenericas {
    public Orientacion orientacion;
 

    public Dormitorio(int m2) {
        super(m2);
        this.orientacion = orientacion;      
    }
    public void consusltarEstado() {

        if (super.getLuces().getEstado()) {
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
