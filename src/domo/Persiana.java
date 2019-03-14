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
public class Persiana {
    private boolean estado;
    private int largo;
    private int ancho;

    public Persiana(boolean estado, int largo, int ancho) {
        this.estado = estado;
        this.largo = largo;
        this.ancho = ancho;
    }

    public boolean getEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public int getLargo() {
        return largo;
    }

    public void setLargo(int largo) {
        this.largo = largo;
    }

    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }
    
    public void subirPersianas() {
        if (this.estado == false) {
            this.estado=true;
        } else {
            System.out.println("Las persianas del dormitorio ya están subidas");
        }
    }
    public void bajarPersianas(){
        if(this.estado==true){
            this.estado=false;
        }else {System.out.println("Las persianas del dormitorio ya están bajadas");}
    }
    
}
