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

    private static ArrayList<Usuario> usuarios = new ArrayList();
    private Salon salon;
    private Despacho despacho;
    private Dormitorio dormitorio;
    private Garaje garaje;

    public Central() {
        this.salon = new Salon(10);
        this.despacho = new Despacho(10);
        this.dormitorio = new Dormitorio (10);
        this.garaje = new Garaje();
    }
 
    
    //SALON
    public void encenderLucesSalon() {
        salon.encenderLuces();
    }

    public void apagarLucesSalon() {
        salon.apagarLuces();
    }

    public void activarVigilanciaSalon() {
        salon.apagarVigilancia();
    }

    public void desactivarVigilanciaSalon() {
        salon.apagarVigilancia();
    }

    public void subirPersianaSalon() {
        salon.subirPersiana();
    }

    public void bajarPersianaSalon() {
        salon.bajarPersiana();
    }

    //GARAJE
    public void subirPuertaGaraje() {
        Garaje garaje = new Garaje();
        garaje.isPuerta().setEstado(true);
    }

    public void bajarPuertaGaraje() {
        Garaje garaje = new Garaje();
        garaje.isPuerta().setEstado(false);
    }

    //Habitacion
    public void encenderLucesHabitacion() {
        HabitacionesGenericas habitacion = new HabitacionesGenericas();
        habitacion.getLuces().get(0).setEstado(true);
    }

    public void apagarLucesHabitacion() {
         HabitacionesGenericas habitacion = new HabitacionesGenericas();
        habitacion.getLuces().get(0).setEstado(false);
    }

    public void activarVigilanciaHabitacion() {
         HabitacionesGenericas habitacion = new HabitacionesGenericas();
        habitacion.isVigilancia().setEstado(true);
    }

    public void desactivarVigilanciaHabitacion() {
        HabitacionesGenericas habitacion = new HabitacionesGenericas();
        habitacion.isVigilancia().setEstado(false);
    }

    public void subirPersianaHabitacion() {
         HabitacionesGenericas habitacion = new HabitacionesGenericas();
        habitacion.isPersianas().setEstado(true);
    }

    public void bajarPersianaHabitacion() {
       HabitacionesGenericas habitacion = new HabitacionesGenericas();
        habitacion.isPersianas().setEstado(false);
    }

    //Despacho
    public void encenderLucesDespacho() {
        Despacho despacho = new Despacho();
        despacho.setLuces(true);
    }

    public void apagarLucesDespacho() {
        Despacho despacho = new Despacho();
        despacho.setLuces(false);
    }

    public void activarVigilanciaDespacho() {
        Despacho despacho = new Despacho();
        despacho.setVigilancia(true);
    }

    public void desactivarVigilanciaDespacho() {
        Despacho despacho = new Despacho();
        despacho.setVigilancia(false);
    }

    public void subirPersianaDespacho() {
        Despacho despacho = new Despacho();
        despacho.setPersianas(true);
    }

    public void bajarPersianaDespacho() {
        Despacho despacho = new Despacho();
        despacho.setPersianas(false);
    }

    //Sistema
    public void apagarSistema() {
        Sistema system = new Sistema();
        system.setEstadoSistema(false);
    }

    public void encenderSistema() {
        Sistema system = new Sistema();
        system.setEstadoSistema(true);
    }

   public static void registrarUsuario(Usuario user) {
      Central.usuarios.add(user);
        Central.usuarios.add(user);
      System.out.println("Usuario registrado");
        System.out.println(Central.usuarios.size());
  }
        
  

    public static int comprobarUsuario(Usuario user) {
        for (int i = 0; i < Central.usuarios.size(); i++) {
            if (Central.usuarios.get(i).equals(user)) {
                System.out.println("Usuario ingresado correctamente"); return 1;
            } else {
                System.out.println("Usuario/Contraseña incorrecta");return-2;
            }
        }
        return -1;
    }
    public void ejecutarComando(Comando comando) {
        Central centralita = new Central();
        switch (comando) {
            case APAGAR_SISTEMA:
                centralita.apagarSistema();
                System.out.println("Sistema Apagado");
                break;
            case CONSULTAR_HORA_RELOJ:
                Reloj.mostrarHora();
                break;
            case MODIFICAR_HORA_RELOJ:
                Reloj.modificarHora(LocalTime.NOON);
                System.out.println("Función Aún No Disponible");
                break;
            case SUBIR_PUERTA:
                centralita.subirPuertaGaraje();
                System.out.println("Puerta Garaje Subida");
                break;
            case ENCENDER_LUCES_Salon:
                centralita.encenderLucesSalon();
                System.out.println("Luces Salon encendidas");
                break;
            case APAGAR_LUCES_Salon:
                centralita.apagarLucesSalon();
                System.out.println("Luces Salon Apagada");
                break;
            case ACTIVAR_VIGILANCIA_Salon:
                centralita.activarVigilanciaSalon();
                System.out.println("Vigilancia Salon Activada");
                break;
            case DESACTIVAR_VIGILANCIA_Salon:
                centralita.desactivarVigilanciaSalon();
                System.out.println("Vigilancia Salon Desactivada");
                break;
            case SUBIR_PERSIANA_Salon:
                centralita.subirPersianaSalon();
                System.out.println("Persiana Salon Subida");
                break;
            case BAJAR_PERSIANA_Salon:
                centralita.bajarPersianaSalon();
                System.out.println("Persiana Salon Bajada");
                break;
            case BAJAR_PUERTA:
                centralita.bajarPuertaGaraje();
                System.out.println("Puerta Garaje Bajada");
                break;
            case ENCENDER_LUCES_Habitacion:
                centralita.encenderLucesHabitacion();
                System.out.println("Luces Habitacion Encendidas");
                break;
            case APAGAR_LUCES_Habitacion:
                centralita.apagarLucesHabitacion();
                System.out.println("Luces Habitacion Apagadas");
                break;
            case ACTIVAR_VIGILANCIA_Habitacion:
                centralita.activarVigilanciaHabitacion();
                System.out.println("Vigilancia Habitacion Activada");
                break;
            case DESACTIVAR_VIGILANCIA_Habitacion:
                centralita.desactivarVigilanciaHabitacion();
                System.out.println("Vigilancia Habitacion Desactivada");
                break;
            case SUBIR_PERSIANA_Habitacion:
                centralita.subirPersianaHabitacion();
                System.out.println("Persiana Habitacion Subida");
                break;
            case BAJAR_PERSIANA_Habitacion:
                centralita.bajarPersianaHabitacion();
                System.out.println("Persiana Habitacion Bajada");
                break;
            case ENCENDER_LUCES_Despacho:
                centralita.encenderLucesDespacho();
                System.out.println("Luces Despacho Encendidas");
                break;
            case APAGAR_LUCES_Despacho:
                centralita.apagarLucesDespacho();
                System.out.println("Luces Despacho Apagadas");
                break;
            case ACTIVAR_VIGILANCIA_Despacho:
                centralita.activarVigilanciaDespacho();
                System.out.println("Vigilancia Despacho Activada");
                break;
            case DESACTIVAR_VIGILANCIA_Despacho:
                centralita.desactivarVigilanciaDespacho();
                System.out.println("Vigilancia Despacho Desactivada");
                break;
            case SUBIR_PERSIANA_Despacho:
                centralita.subirPersianaDespacho();
                System.out.println("Persiana Despacho Subida");
                break;
            case BAJAR_PERSIANA_Despacho:
                centralita.bajarPersianaDespacho();
                System.out.println("Persiana Despacho Bajada");
                break;
            case SIN_ACCION:
                System.out.println("No hacer nada");
                break;
            case ENCENDER_SISTEMA:
                centralita.encenderSistema();
                System.out.println("Sistema Encendido");
                break;
            case CONSULTAR_FECHA_RELOJ:
                Reloj.mostrarFecha();
                break;
            case MODIFICAR_FECHA_RELOJ:
                Reloj.modificarFecha(LocalDate.MAX);
                System.out.println("Función Aún No Disponible");
        }
    }
}

  
    