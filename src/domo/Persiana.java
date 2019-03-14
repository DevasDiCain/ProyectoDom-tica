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

    private int largo;
    private int ancho;
    private posicionPersiana posicion;

    public Persiana( int largo, int ancho, posicionPersiana posicion) {
        this.largo = largo;
        this.ancho = ancho;
        this.posicion = posicion;
    }

    public posicionPersiana getPosicion() {
        return posicion;
    }

    public void setPosicion(posicionPersiana posicion) {
        this.posicion = posicion;
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
        if (this.posicion == posicionPersiana.BAJADA || this.posicion == posicionPersiana.MEDIA_ALTURA) {
            this.posicion = posicionPersiana.ABIERTA;
        } else {
            System.out.println("Las persianas del dormitorio ya están subidas");
        }
    }

    public void bajarPersianas() {
        if (this.posicion == posicionPersiana.ABIERTA || this.posicion == posicionPersiana.MEDIA_ALTURA) {
            this.posicion = posicionPersiana.BAJADA;
        } else {
            System.out.println("Las persianas del dormitorio ya están bajadas");
        }
    }
    
    public void aMediaAltura(){}

}
