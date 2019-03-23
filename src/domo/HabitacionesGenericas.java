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
public class HabitacionesGenericas extends Estancias {//Estás son Hijas de Estancias y añade 3 atributos que recogerán Despacho, Salon y Dormitorio
    
   private  Luz Luces;
    private Persiana Persianas;
    private Vigilancia camara;

    public HabitacionesGenericas(int m2) {
        super(m2);
        this.Luces=new Luz(false,10.0);
        this.Persianas=new Persiana(3,2,posicionPersiana.BAJADA);
        this.camara=new Vigilancia(false,"1");
    }
    
    
    
   

    public Luz getLuces() {
      return this.Luces;
    }

    public void setLuces(Luz Luces) {
        this.Luces = Luces;
    }

    public Persiana getPersianas() {
        return Persianas;
    }

    public void setPersianas(Persiana Persianas) {
        this.Persianas = Persianas;
    }

    public Vigilancia getVigilancia() {
        return camara;
    }

    public void setVigilancia(Vigilancia Vigilancia) {
        this.camara = Vigilancia;
    }
    public void consusltarEstado() {//Este método será reutilizado por sus hijas

        if (this.Luces.getEstado()) {
            System.out.println("Las Luces están ENCENDIDAS");
        } else {
            System.out.println("Las Luces están APAGADAS");
        }

        if (this.Persianas.getPosicion()==posicionPersiana.ABIERTA || this.Persianas.getPosicion()==posicionPersiana.MEDIA_ALTURA) {
            System.out.println("Las Persianas están ABIERTAS");
        } else {
            System.out.println("Las Persianas están BAJADAS");
        }

        if (this.camara.getEstado()
                == true) {
            System.out.println("La Vigilancia está ACTIVADA");
        } else {
            System.out.println("La Vigilancia está DESACTIVADA");
        }
    }
    

    

    
}
