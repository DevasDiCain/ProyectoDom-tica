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
    public void consusltarEstado(){
        if(this.Puerta.getEstado()==true){System.out.println("La Puerta del Garaje está Abierta");}
        if(this.Puerta.getEstado()==false){System.out.println("La Puerta del Garaje está Cerrada");}
    }
   public void abrirPuerta(){
       if(this.Puerta.getEstado()==false){
           this.Puerta.setEstado(true);
       }else {System.out.println("La puerta ya está abierta");}
    }
   public void cerrarPuerta(){
       if(this.Puerta.getEstado()==true){
           this.Puerta.setEstado(false);
       }else {System.out.println("La puerta ya está cerrada");}
   }

    @Override
    public String toString() {
        return super.toString()+"Garaje{" + "Puerta=" + Puerta + ", capacidadVehiculos=" + capacidadVehiculos + '}';
    }
    
}
