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
public class Dormitorio extends HabitacionesGenericas {
    public Orientacion orientacion;
    private Luz  Luces;
    private Persiana  Persianas;
    private Vigilancia camara;

    public Dormitorio(int m2) {
        super(m2);
        this.orientacion = orientacion;
        this.Luces = new Luz(false,10.0);
        this.Persianas = new Persiana(false,3,2);
        this.camara = new Vigilancia(false,"1");
    }

    
    public void consusltarEstado() {

        if (this.Luces.getEstado() == true) {
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
     public void encenderLuces() {
        if (this.Luces.getEstado() == false) {
            this.Luces.setEstado(true);
        } else {
            System.out.println("Las luces del dormitorio ya están encendidas");
        }

    }

    public void apagarLuces() {
        if (this.Luces.getEstado() == true) {
            this.Luces.setEstado(false);
        } else {
            System.out.println("Las luces del dormitorio ya están apagadas");
        }
    }

    public void subirPersianas() {
        if (this.Persianas.getEstado() == false) {
            this.Persianas.setEstado(true);
        } else {
            System.out.println("Las persianas del dormitorio ya están subidas");
        }
    }
    public void bajarPersianas(){
        if(this.Persianas.getEstado()==true){
            this.Persianas.setEstado(false);
        }else {System.out.println("Las persianas del dormitorio ya están bajadas");}
    }
    public void activarVigilancia(){
        if (this.camara.getEstado()==false){
            this.camara.setEstado(true);
        }else {System.out.println("La vigilancia del dormitorio ya está activada");}
    }
    public void desactivarVigilancia(){
        if(this.camara.getEstado()==true){
            this.camara.setEstado(false);
        }else{System.out.println("La vigilancia del dormitorio ya está desactivada");}
    }

    public static void main(String[] args) {
        Dormitorio x = new Dormitorio(10);
        x.consusltarEstado();
    }
    
}
