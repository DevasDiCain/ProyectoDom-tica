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
public class Garaje extends Estancias {//Garaje será hija directa de Estancias y no de HabitacionesGenericas
    
    private PuertaAutomatica Puerta; //Clase PuertaAutomática será definida en su clase
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
    public void consultarEstadoGaraje(){
        Puerta.consusltarEstado();
    }
}
