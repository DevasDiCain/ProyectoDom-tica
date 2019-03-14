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
public class Luz {
    
    private boolean estado;
    private double consumo;

    
    public boolean getEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public double getConsumo() {
        return consumo;
    }

    public void setConsumo(double consumo) {
        this.consumo = consumo;
    }

    public Luz(boolean estado, double consumo) {
        this.estado = estado;
        this.consumo = consumo;
    }
    public void encenderLuces() {
        if (this.estado == false) {
            this.estado =true;
        } else {
            System.out.println("Las luces del dormitorio ya están encendidas");
        }

    }

    public void apagarLuces() {
        if (this.estado == true) {
            this.estado=false;
        } else {
            System.out.println("Las luces del dormitorio ya están apagadas");
        }
    }
    
}
