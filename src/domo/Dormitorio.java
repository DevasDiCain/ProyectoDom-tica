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
public class Dormitorio {
    
    private boolean Luces;
    private boolean Persianas;
    private boolean Vigilancia;
    
    
    
    public Dormitorio(){}

    public boolean isLuces() {
        return Luces;
    }

    public void setLuces(boolean Luces) {
        this.Luces = Luces;
    }

    public boolean isPersianas() {
        return Persianas;
    }

    public void setPersianas(boolean Persianas) {
        this.Persianas = Persianas;
    }

    public boolean isVigilancia() {
        return Vigilancia;
    }

    public void setVigilancia(boolean Vigilancia) {
        this.Vigilancia = Vigilancia;
    }

    public void consusltarEstado(){
    if (this.Luces==true){System.out.println("Las Luces están encendidas");}
    if (this.Luces==false){System.out.println("Las Luces están apagadas");}
    if(this.Persianas==true){System.out.println("Las Persianas están abiertas");}
    if(this.Persianas==false){System.out.println("Las Persianas están bajadas");}
    if(this.Vigilancia==true){System.out.println("La Vigilancia está activada");}
    if(this.Vigilancia==false){System.out.println("La Vigilancia está desactivada");}
    }
}
