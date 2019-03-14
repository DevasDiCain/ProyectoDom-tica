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
public class HabitacionesGenericas extends Estancias {
    
   private  Luz Luces;
    private Persiana Persianas;
    private Vigilancia camara;

    public HabitacionesGenericas(int m2) {
        super(m2);
        this.Luces=new Luz(false,10.0);
        this.Persianas=new Persiana(false,3,2);
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
    public void consusltarEstado() {

        if (this.Luces.getEstado()) {
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
    

    

    
}
