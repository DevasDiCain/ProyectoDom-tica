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
public class Sistema {//Clase que controla el encendido/apagado del sistema
    
    private boolean estadoSistema;

    public Sistema() {
        this.estadoSistema = true;
    }
    
    

    public boolean isEstadoSistema() {
        return estadoSistema;
    }

    public void setEstadoSistema(boolean estadoSistema) {
        this.estadoSistema = estadoSistema;
    }
    public void apagarSistema(){
        estadoSistema=false;
    }
    public void encenderSistema(){
        estadoSistema=true;
    }
    
    
}
