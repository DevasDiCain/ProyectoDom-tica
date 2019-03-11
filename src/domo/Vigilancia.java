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
public class Vigilancia {
    private boolean estado;
    private String ip;// Dirección ip de la camara

    public Vigilancia(boolean estado, String ip) {
        this.estado = estado;
        this.ip = ip;
    }
    

    public boolean getEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }
    
    
}
