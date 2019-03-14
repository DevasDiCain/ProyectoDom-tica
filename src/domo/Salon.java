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
public class Salon extends HabitacionesGenericas {
    //Estado de las Luces,Persianas y Vigilancia.

    private Luz Luces;
    private Persiana Persianas;
    private Vigilancia Camara;
    
    public Salon(int m2) {
        super(m2);
    }
    
    public Luz getLuces() {
        return Luces;
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
    
    public Vigilancia getCamara() {
        return Camara;
    }
    
    public void setCamara(Vigilancia Camara) {
        this.Camara = Camara;
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
