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

    public Sistema getSystem() {
        return system;
    }

    //SALON
    public void encenderLucesSalon() {
        if(salon.getLuces().getEstado()==false){
        salon.getLuces().encenderLuces();
        }else {System.out.println("Las luces ya están encendidas");}
    }

    public void apagarLucesSalon() {
        if(salon.getLuces().getEstado()==true){
        salon.getLuces().apagarLuces();
        }else {System.out.println("Las luces ya están apagadas");}
    }

    public void activarVigilanciaSalon() {
        if(salon.getVigilancia().getEstado()==false){
        salon.getVigilancia().activarVigilancia();
        }else {System.out.println("La vigilancia ya está activada");}
    }

    public void desactivarVigilanciaSalon() {
        if(salon.getVigilancia().getEstado()==true){
        salon.getVigilancia().desactivarVigilancia();
        }else {System.out.println("La vigilancia ya está apagada");}
    }

    public void subirPersianaSalon() {
        this.salon.getPersianas().subirPersianas();
    }

    public void bajarPersianaSalon() {
        this.salon.getPersianas().bajarPersianas();
    }
    public void consultarEstadoSalon(){
        this.salon.consusltarEstado();
    }

    //GARAJE
    public void subirPuertaGaraje() {
        if(garaje.getPuerta().getEstado()==false){
        garaje.getPuerta().abrirPuerta();
        }else {System.out.println("La puerta ya está subida");}
    }

    public void bajarPuertaGaraje() {
        if(garaje.getPuerta().getEstado()==true){
        garaje.getPuerta().cerrarPuerta();
        } else {System.out.println("La puerta ya está bajada");}
    }
    public void consultarEstadoGaraje(){
        garaje.consultarEstadoGaraje();
    }
    //Dormitorio
    public void encenderLucesDormitorio() {
        dormitorio.getLuces().encenderLuces();
    }

    public void apagarLucesDormitorio() {
        dormitorio.getLuces().apagarLuces();
    }

    public void activarVigilanciaDormitorio() {
        dormitorio.getVigilancia().activarVigilancia();
    }

    public void desactivarVigilanciaDormitorio() {
        dormitorio.getVigilancia().desactivarVigilancia();
    }

    public void subirPersianaDormitorio() {
        dormitorio.getPersianas().subirPersianas();
    }

    public void bajarPersianaDormitorio() {
        dormitorio.getPersianas().bajarPersianas();
    }
    public void consultarEstadoDormitorio(){
        dormitorio.consusltarEstado();
    }

    //Despacho
    public void encenderLucesDespacho() {
        despacho.getLuces().encenderLuces();
    }

    public void apagarLucesDespacho() {
        despacho.getLuces().apagarLuces();
    }

    public void activarVigilanciaDespacho() {
        despacho.getVigilancia().activarVigilancia();
    }

    public void desactivarVigilanciaDespacho() {
        despacho.getVigilancia().desactivarVigilancia();
    }

    public void subirPersianaDespacho() {
       despacho.getPersianas().subirPersianas();
    }

    public void bajarPersianaDespacho() {
        despacho.getPersianas().bajarPersianas();
    }
    public void consultarEstadoDespacho(){
        despacho.consusltarEstado();
    }

    //Sistema
    public void apagarSistema() {
        system.apagarSistema();
        
    }

    public void encenderSistema() {
       system.encenderSistema();
    }
    //LUCES
    
    public void apagarLucesGeneral(){
    this.despacho.getLuces().apagarLuces();
    this.dormitorio.getLuces().apagarLuces();
    this.salon.getLuces().apagarLuces();
    }
    
    //Usuarios
    public static void registrarUsuario(Usuario user) {
        usuarios.add(user);
        System.out.println("Usuario registrado");
    }
    

    public static int comprobarUsuario(Usuario user) {
        for (int i = 0; i < usuarios.size(); i++) {
            if (usuarios.get(i).equals(user)) {
                return 1;
            } else {
                System.out.println("Usuario/Contraseña incorrecta");
                return -2;
            }
        }
        return -1;
    }
    public void consultarEstadoVivienda(){
        System.out.println("---->Salon<----");
        salon.consusltarEstado();
        System.out.println("---->Despacho<----");
        despacho.consusltarEstado();
        System.out.println("---->Dormitorio<----");
        dormitorio.consusltarEstado();
        System.out.println("---->Garaje<----");
        garaje.consultarEstadoGaraje();
    }
    public void apagadoGeneral(){
        this.despacho.getLuces().setEstado(false);
        this.dormitorio.getLuces().setEstado(false);
        this.salon.getLuces().setEstado(false);
    }
    public void apagadoEco(){
        this.despacho.getLuces().apagadoEco(despacho);
        this.dormitorio.getLuces().apagadoEco(dormitorio);
        this.salon.getLuces().apagadoEco(salon);
    }

    public void ejecutarComando(Comando comando, Central centralita) {
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
                break;
                
            case APAGADO_GENERAL:
                centralita.apagadoGeneral();
                System.out.println("Luces apagadas");
                break;
            case APAGADO_ECO:
               centralita.apagadoEco();
                break;
                
            case CONSULTAR_LUCES:
                System.out.println("---->Salon<----");
                salon.getLuces().consultarEstado();
                System.out.println("---->Despacho<----");
                despacho.getLuces().consultarEstado();
                System.out.println("---->Dormitorio<----");
                dormitorio.getLuces().consultarEstado();
                break;
                
                
            case CONSULTAR_ESTADO_SALON:
                centralita.consultarEstadoSalon();
                break;
             
            case CONSULTAR_ESTADO_DESPACHO:
                centralita.consultarEstadoDespacho();
                break;
             
            case CONSULTAR_ESTADO_DORMITORIO:
                centralita.consultarEstadoDormitorio();
                break;
                
            case CONSULTAR_ESTADO_GARAJE:
                centralita.consultarEstadoGaraje();
                break;
                
            case CONSULTAR_ESTADO_VIVIENDA:
                centralita.consultarEstadoVivienda();
                break;
             
            
            
        }
    }
}
