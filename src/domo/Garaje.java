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
//Hereda de estancias
public class Garaje extends Estancias {
    
    private PuertaAutomatica Puerta;
    private int capacidadVehiculos;
    

    
    public Garaje(int m2){
        super(m2);
        this.capacidadVehiculos=0;
        this.Puerta= new PuertaAutomatica();
    }
    
    public PuertaAutomatica getPuerta() {
        return Puerta;
    }

    public void setPuerta(PuertaAutomatica Puerta) {
        this.Puerta = Puerta;
    }
   
  

    @Override
    public String toString() {
        return super.toString()+"Garaje{" + "Puerta=" + Puerta + ", capacidadVehiculos=" + capacidadVehiculos + '}';
    }
    
}
