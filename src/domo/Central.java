/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domo;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

/**
 *
 * @author jose
 */
public class Central {
    
   private static ArrayList <Usuario> usuarios = new ArrayList();
    
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
  public static void registrarUsuario(Usuario user){
      Central.usuarios.add(user);
      System.out.println("Usuario registrado");
  }
  public static boolean comprobarUsuario(Usuario user){
      if(Central.usuarios.contains(user)){System.out.println("Usuario Registrado");return true;}
      else{System.out.println("Usuario No encontrado en el sistema");return false;}
  }
  
    public void ejecutarComando(Comando comando){
        Central centralita = new Central();
        switch (comando){
            case APAGAR_SISTEMA:centralita.apagarSistema();System.out.println("Sistema Apagado");
                break;
            case CONSULTAR_HORA_RELOJ:Reloj.mostrarHora();
                break;
            case MODIFICAR_HORA_RELOJ:Reloj.modificarHora(LocalTime.NOON);System.out.println("Función Aún No Disponible");
                break;
            case SUBIR_PUERTA:centralita.subirPuertaGaraje();System.out.println("Puerta Garaje Subida");
                break;
            case ENCENDER_LUCES_Salon:centralita.encenderLucesSalon();System.out.println("Luces Salon encendidas");
                break;
            case APAGAR_LUCES_Salon:centralita.apagarLucesSalon();System.out.println("Luces Salon Apagada");
                break;
            case ACTIVAR_VIGILANCIA_Salon:centralita.activarVigilanciaSalon();System.out.println("Vigilancia Salon Activada");
                break;
            case DESACTIVAR_VIGILANCIA_Salon:centralita.desactivarVigilanciaSalon();System.out.println("Vigilancia Salon Desactivada");
                break;
            case SUBIR_PERSIANA_Salon:centralita.subirPersianaSalon();System.out.println("Persiana Salon Subida");
                break;
            case BAJAR_PERSIANA_Salon:centralita.bajarPersianaSalon();System.out.println("Persiana Salon Bajada");
                break;
            case BAJAR_PUERTA:centralita.bajarPuertaGaraje();System.out.println("Puerta Garaje Bajada");
                break;
            case ENCENDER_LUCES_Dormitorio:centralita.encenderLucesDormitorio();System.out.println("Luces Dormitorio Encendidas");
                break;
            case APAGAR_LUCES_Dormitorio:centralita.apagarLucesDormitorio();System.out.println("Luces Dormitorio Apagadas");
                break;
            case ACTIVAR_VIGILANCIA_Dormitorio:centralita.activarVigilanciaDormitorio();System.out.println("Vigilancia Dormitorio Activada");
                break;
            case DESACTIVAR_VIGILANCIA_Dormitorio:centralita.desactivarVigilanciaDormitorio();System.out.println("Vigilancia Dormitorio Desactivada");
                break;
            case SUBIR_PERSIANA_Dormitorio:centralita.subirPersianaDormitorio();System.out.println("Persiana Dormitorio Subida");
                break;
            case BAJAR_PERSIANA_Dormitorio:centralita.bajarPersianaDormitorio();System.out.println("Persiana Dormitorio Bajada");
                break;
            case ENCENDER_LUCES_Despacho:centralita.encenderLucesDespacho();System.out.println("Luces Despacho Encendidas");
                break;
            case APAGAR_LUCES_Despacho:centralita.apagarLucesDespacho();System.out.println("Luces Despacho Apagadas");
                break;
            case ACTIVAR_VIGILANCIA_Despacho:centralita.activarVigilanciaDespacho();System.out.println("Vigilancia Despacho Activada");
                break;
            case DESACTIVAR_VIGILANCIA_Despacho:centralita.desactivarVigilanciaDespacho();System.out.println("Vigilancia Despacho Desactivada");
                break;
            case SUBIR_PERSIANA_Despacho:centralita.subirPersianaDespacho();System.out.println("Persiana Despacho Subida");
                break;
            case BAJAR_PERSIANA_Despacho:centralita.bajarPersianaDespacho();System.out.println("Persiana Despacho Bajada");
                break;
            case SIN_ACCION:System.out.println("No hacer nada");
                break;
            case ENCENDER_SISTEMA:centralita.encenderSistema();System.out.println("Sistema Encendido");
                break;
            case CONSULTAR_FECHA_RELOJ:Reloj.mostrarFecha();
                break;
            case MODIFICAR_FECHA_RELOJ:Reloj.modificarFecha(LocalDate.MAX);System.out.println("Función Aún No Disponible");
        }
    }
}
