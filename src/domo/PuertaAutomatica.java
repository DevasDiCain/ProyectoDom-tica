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
public class PuertaAutomatica {
    private boolean estado;
    private int retardo;//segundos

    public boolean getEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public int getRetardo() {
        return retardo;
    }

    public void setRetardo(int retardo) {
        this.retardo = retardo;
    }

    public PuertaAutomatica(){
    this.estado=true;
    this.retardo=0;
    }

    @Override
    public String toString() {
        return "PuertaAutomatica{" + "estado=" + estado + ", retardo=" + retardo + '}';
    }
    
}
