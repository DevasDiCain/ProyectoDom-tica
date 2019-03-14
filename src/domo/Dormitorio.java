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
