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
    private Luz  Luces;
    private Persiana  Persianas;
    private Vigilancia camara;

    public Dormitorio(int m2) {
        super(m2);
        this.orientacion = orientacion;
        this.Luces = new Luz(false,10.0);
        this.Persianas = new Persiana(false,3,2);
        this.camara = new Vigilancia(false,"1");
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
        Dormitorio x = new Dormitorio(10);
        x.consusltarEstado();
    }
    
}
