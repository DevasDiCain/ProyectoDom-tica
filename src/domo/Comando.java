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
public enum Comando {
    //Los tipos ENUM tienen dos características fundamentales:
    //1.-El constructor es privado
    //2.-Sólo pueden instanciarse con un tipo de objeto concreto
    
    APAGAR_SISTEMA(0,"Apagar Sistema"),
    CONSULTAR_HORA_RELOJ(1,"Consulta la hora del sistema"),
    MODIFICAR_HORA_RELOJ(2,"Modifica la hora del sistema"),
    SUBIR_PUERTA(3,"Subir la puerta del garaje"),
    ENCENDER_LUCES_Salon(4,"Enciende las luces del Salón"),
    APAGAR_LUCES_Salon(5,"Apagar las luces del Salón"),
    ACTIVAR_VIGILANCIA_Salon(6,"Activar Vigilancia Salón"),
    DESACTIVAR_VIGILANCIA_Salon(7,"Desactiva Vigilancia Salón"),
    SUBIR_PERSIANA_Salon(8,"Subir Persianas Salón"),
    BAJAR_PERSIANA_Salon(9,"Bajar persianas Salón"),
    BAJAR_PUERTA(10,"Bajar la puerta del garaje"),
    ENCENDER_LUCES_Habitacion(11,"Enciende las luces del Habitacion"),
    APAGAR_LUCES_Habitacion(12,"Apagar las luces del Habitacion"),
    ACTIVAR_VIGILANCIA_Habitacion(13,"Activar Vigilancia Habitacion"),
    DESACTIVAR_VIGILANCIA_Habitacion(14,"Desactiva Vigilancia Habitacion"),
    SUBIR_PERSIANA_Habitacion(15,"Subir Persianas Habitacion"),
    BAJAR_PERSIANA_Habitacion(16,"Bajar persianas Habitacion"),
    ENCENDER_LUCES_Despacho(17,"Enciende las luces del Despacho"),
    APAGAR_LUCES_Despacho(18,"Apagar las luces del Despacho"),
    ACTIVAR_VIGILANCIA_Despacho(19,"Activar Vigilancia Despacho"),
    DESACTIVAR_VIGILANCIA_Despacho(20,"Desactiva Vigilancia Despacho"),
    SUBIR_PERSIANA_Despacho(21,"Subir Persianas Despacho"),
    BAJAR_PERSIANA_Despacho(22,"Bajar persianas Despacho"),
    SIN_ACCION(23,"no hace nada"),
    ENCENDER_SISTEMA(24,"enciende el sistema"),
    CONSULTAR_FECHA_RELOJ(25,"Consulta fecha del reloj"),
    MODIFICAR_FECHA_RELOJ(26,"Modificar la fecha del reloj");
    
    
    private int codigo;
    private String descripcion;

    private Comando(int codigo, String descripcion){
    
        this.codigo= codigo;
        this.descripcion=descripcion;
}
    
    public int getCodigo(){
        return this.codigo;
    }
    public String getDescripcion(){
        return this.descripcion;
    }
}
