/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domo;

import java.time.LocalTime;

/**
 *
 * @author jose
 */
public class Central {
    
   
    
    //SALON
    public void encenderLucesSalon(){
      Salon salon = new Salon();
      salon.setLuces(true);
  }  
  public void apagarLucesSalon(){
      Salon salon = new Salon();
      salon.setLuces(false);
  }
  
  public void activarVigilanciaSalon(){
      Salon salon = new Salon();
      salon.setVigilancia(true);
  }
  public void desactivarVigilanciaSalon(){
      Salon salon = new Salon();
      salon.setVigilancia(false);
  }
  public void subirPersianaSalon(){
      Salon salon = new Salon();
      salon.setPersianas(true);
  }
  public void bajarPersianaSalon(){
      Salon salon = new Salon();
      salon.setPersianas(false);
  }
  
            //GARAJE
  
  public void subirPuertaGaraje(){
      Garaje garaje = new Garaje();
      garaje.setPuerta(true);
  }
  public void bajarPuertaGaraje(){
      Garaje garaje = new Garaje();
      garaje.setPuerta(false);
  }
  
            //DORMITORIO
  
   public void encenderLucesDormitorio(){
      Dormitorio dormitorio = new Dormitorio();
      dormitorio.setLuces(true);
  }  
  public void apagarLucesDormitorio(){
     Dormitorio dormitorio = new Dormitorio();
      dormitorio.setLuces(false);
  }
  
  public void activarVigilanciaDormitorio(){
      Dormitorio dormitorio = new Dormitorio();
      dormitorio.setVigilancia(true);
  }
  public void desactivarVigilanciaDormitorio(){
      Dormitorio dormitorio = new Dormitorio();
      dormitorio.setVigilancia(false);
  }
  public void subirPersianaDormitorio(){
      Dormitorio dormitorio = new Dormitorio();
      dormitorio.setPersianas(true);
  }
  public void bajarPersianaDormitorio(){
      Dormitorio dormitorio = new Dormitorio();;
      dormitorio.setPersianas(false);
  }
    
        //Despacho
  
  public void encenderLucesDespacho(){
      Despacho despacho = new Despacho();
      despacho.setLuces(true);
  }  
  public void apagarLucesDespacho(){
      Despacho despacho = new Despacho();
      despacho.setLuces(false);
  }
  
  public void activarVigilanciaDespacho(){
       Despacho despacho = new Despacho();
      despacho.setVigilancia(true);
  }
  public void desactivarVigilanciaDespacho(){
       Despacho despacho = new Despacho();
      despacho.setVigilancia(false);
  }
  public void subirPersianaDespacho(){
      Despacho despacho = new Despacho();
      despacho.setPersianas(true);
  }
  public void bajarPersianaDespacho(){
       Despacho despacho = new Despacho();
      despacho.setPersianas(false);
  }
  
            //Sistema
  public void apagarSistema(){
      Sistema system = new Sistema();
      system.setEstadoSistema(false);
    }
  public void encenderSistema(){
      Sistema system = new Sistema();
      system.setEstadoSistema(true);
  }
            //Reloj

    public void ejecutarComando(Comando comando){
        Central centralita = new Central();
        switch (comando){
            case APAGAR_SISTEMA:centralita.apagarSistema();
                break;
            case CONSULTAR_HORA:centralita.
            
        }
    }
}
