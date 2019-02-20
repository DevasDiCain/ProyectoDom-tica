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
public class Garaje {
    
    private boolean Puerta;

    
    public Garaje(){}
    public Garaje(boolean Puerta) {
        this.Puerta = Puerta;
    }   
    public boolean isPuerta() {
        return Puerta;
    }

    public void setPuerta(boolean Puerta) {
        this.Puerta = Puerta;
    }
    public void consusltarEstado(){
        if(this.Puerta==true){System.out.println("La Puerta del Garaje está Abierta");}
        if(this.Puerta==false){System.out.println("La Puerta del Garaje está Cerrada");}
    }
    
}
