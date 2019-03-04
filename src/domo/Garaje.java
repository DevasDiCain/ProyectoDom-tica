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
    

    
    public Garaje(){
        super();
        this.capacidadVehiculos=0;
        this.Puerta= new PuertaAutomatica();
    }
    public Garaje(PuertaAutomatica Puerta) {
        this.Puerta = Puerta;
    }   
    public PuertaAutomatica isPuerta() {
        return Puerta;
    }

    public void setPuerta(PuertaAutomatica Puerta) {
        this.Puerta = Puerta;
    }
    public void consusltarEstado(){
        if(this.Puerta.isEstado()==true){System.out.println("La Puerta del Garaje está Abierta");}
        if(this.Puerta.isEstado()==false){System.out.println("La Puerta del Garaje está Cerrada");}
    }
    public Garaje (int capacidadVehiculos , PuertaAutomatica Puerta, int m2){
    super(m2);
    this.capacidadVehiculos=0;
    this.Puerta= new PuertaAutomatica();
    }

    @Override
    public String toString() {
        return super.toString()+"Garaje{" + "Puerta=" + Puerta + ", capacidadVehiculos=" + capacidadVehiculos + '}';
    }
    
}
