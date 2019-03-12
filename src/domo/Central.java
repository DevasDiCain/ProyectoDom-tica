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
    private Sistema system;

    public Central() {
        this.salon = new Salon(10);
        this.despacho = new Despacho(10);
        this.dormitorio = new Dormitorio(10);
        this.garaje = new Garaje(10);
        this.system= new Sistema();
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
        garaje.abrirPuerta();
    }

    public void bajarPuertaGaraje() {
        garaje.cerrarPuerta();
    }

    //Dormitorio
    public void encenderLucesDormitorio() {
        dormitorio.encenderLuces();
    }

    public void apagarLucesDormitorio() {
        dormitorio.apagarLuces();
    }

    public void activarVigilanciaDormitorio() {
        dormitorio.activarVigilancia();
    }

    public void desactivarVigilanciaDormitorio() {
        dormitorio.desactivarVigilancia();
    }

    public void subirPersianaDormitorio() {
        dormitorio.subirPersianas();
    }

    public void bajarPersianaDormitorio() {
        dormitorio.bajarPersianas();
    }

    //Despacho
    public void encenderLucesDespacho() {
        despacho.encenderLuces();
    }

    public void apagarLucesDespacho() {
        despacho.apagarLuces();
    }

    public void activarVigilanciaDespacho() {
        despacho.activarVigilancia();
    }

    public void desactivarVigilanciaDespacho() {
        despacho.desactivarVigilancia();
    }

    public void subirPersianaDespacho() {
       despacho.subirPersianas();
    }

    public void bajarPersianaDespacho() {
        despacho.bajarPersianas();
    }

    //Sistema
    public void apagarSistema() {
        this.system.setEstadoSistema(false);
    }

    public void encenderSistema() {
       this.system.setEstadoSistema(true);
    }
    
    //Usuarios
    public static void registrarUsuario(Usuario user) {
        usuarios.add(user);
        System.out.println("Usuario registrado");
        System.out.println(Central.usuarios.size());
    }

    public static int comprobarUsuario(Usuario user) {
        for (int i = 0; i < usuarios.size(); i++) {
            if (usuarios.get(i).equals(user)) {
                System.out.println("Usuario ingresado correctamente");
                return 1;
            } else {
                System.out.println("Usuario/Contraseña incorrecta");
                return -2;
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
            case ENCENDER_LUCES_Dormitorio:
                centralita.encenderLucesDormitorio();
                System.out.println("Luces Dormitorio Encendidas");
                break;
            case APAGAR_LUCES_Dormitorio:
                centralita.apagarLucesDormitorio();
                System.out.println("Luces Dormitorio Apagadas");
                break;
            case ACTIVAR_VIGILANCIA_Dormitorio:
                centralita.activarVigilanciaDormitorio();
                System.out.println("Vigilancia Dormitorio Activada");
                break;
            case DESACTIVAR_VIGILANCIA_Dormitorio:
                centralita.desactivarVigilanciaDormitorio();
                System.out.println("Vigilancia Dormitorio Desactivada");
                break;
            case SUBIR_PERSIANA_Dormitorio:
                centralita.subirPersianaDormitorio();
                System.out.println("Persiana Dormitorio Subida");
                break;
            case BAJAR_PERSIANA_Dormitorio:
                centralita.bajarPersianaDormitorio();
                System.out.println("Persiana Dormitorio Bajada");
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
