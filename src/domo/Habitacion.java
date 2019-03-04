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
public class Habitacion extends Estancias {
    
    private ArrayList<Luz> Luces;
    private Persiana Persianas;
    private Vigilancia Vigilancia;
    
    
    
    public Habitacion(){}

    public ArrayList<Luz> getLuces() {
      return this.Luces;
    }

    public void setLuces(ArrayList<Luz> Luces) {
        this.Luces = Luces;
    }

    public Persiana isPersianas() {
        return Persianas;
    }

    public void setPersianas(Persiana Persianas) {
        this.Persianas = Persianas;
    }

    public Vigilancia isVigilancia() {
        return Vigilancia;
    }

    public void setVigilancia(Vigilancia Vigilancia) {
        this.Vigilancia = Vigilancia;
    }

    public void consusltarEstado(){
        for (int i = 0 ; i < this.Luces.size(); i++){
    if (this.Luces.get(i).isEstado()==true){System.out.println("Las Luces están encendidas");}
    if (this.Luces.get(i).isEstado()==false){System.out.println("Las Luces están apagadas");}
    
        }
    if(this.Persianas.isEstado()==true){System.out.println("Las Persianas están abiertas");}
    if(this.Persianas.isEstado()==false){System.out.println("Las Persianas están bajadas");}
    if(this.Vigilancia.isEstado()==true){System.out.println("La Vigilancia está activada");}
    if(this.Vigilancia.isEstado()==false){System.out.println("La Vigilancia está desactivada");}
    }
}
