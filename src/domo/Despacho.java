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
public class Despacho {
     private Luz  Luces;
    private Persiana  Persianas;
    private Vigilancia camara;

    public Despacho(Luz Luces, Persiana Persianas, Vigilancia camara) {
        this.Luces = Luces;
        this.Persianas = Persianas;
        this.camara = camara;
    }

    public void consusltarEstado(){
    if (this.Luces.getEstado()==true){System.out.println("Las Luces están encendidas");}
    if (this.Luces.getEstado()==false){System.out.println("Las Luces están apagadas");}
    if(this.Persianas.getEstado()==true){System.out.println("Las Persianas están abiertas");}
    if(this.Persianas.getEstado()==false){System.out.println("Las Persianas están bajadas");}
    if(this.camara.getEstado()==true){System.out.println("La Vigilancia está activada");}
    if(this.camara.getEstado()==false){System.out.println("La Vigilancia está desactivada");}
    }
}
