/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domo;

import java.util.Scanner;

/**
 *
 * @author jose
 */
public class Vista {
    
    //Identificar las distintas acciones que realiza el
    //Usuario en la centralita
    
    public static Comando menu(){
        Scanner sn = new Scanner(System.in);
      
       //Interface fácil e intuitiva para el usuario
       //Se volverá a repetir la Vista hasta que el usuario desee.
       //Si los valores introducidos no están comprendidos entre las opciones establecidas se repetirá la pregunta hasta que introduzca un valor correcto
        System.out.println("¿A qué parte de la casa desea tener acceso?");
        System.out.println(" 1-Salón \n 2-Garaje  \n 3-Dormitorio \n 4-Despacho \n 5-Reloj \n 6-Luces \n 7-Consultar Estado de la vivienda \n 8-Salir");
          int opcion = sn.nextInt();
          System.out.println("------------");
        int operacion;
        while (opcion<=8 && opcion >0){
        switch (opcion){
            case 1: System.out.println("¿Qué tipo de acción desea realizar en el Salón?");
                    System.out.println(" 1-Encender las Luces \n 2-Apagar las luces \n "
                            + "3-Activar Vigilancia \n 4-Desactivar Vigilancia \n 5-Subir Persiana"
                            + " \n 6-Bajar Persiana \n 7-Consultar estado \n 8-Salir");
                           operacion=sn.nextInt();
                           switch(operacion){
                               case 1: return Comando.ENCENDER_LUCES_Salon;
                                        
                               case 2: return Comando.APAGAR_LUCES_Salon;
                               
                               case 3: return Comando.ACTIVAR_VIGILANCIA_Salon;
                               
                               case 4: return Comando.DESACTIVAR_VIGILANCIA_Salon;
                               
                               case 5: return Comando.SUBIR_PERSIANA_Salon;
                               
                               case 6: return Comando.BAJAR_PERSIANA_Salon;
                               
                               case 7: return Comando.CONSULTAR_ESTADO_SALON;
                               
                               case 8: return Comando.APAGAR_SISTEMA;
                                       
                           }
                    break;
                    
            case 2: System.out.println("¿Qué tipo de acción desea realizar en el Garaje?");
                    System.out.println(" 1-Abrir Puerta \n 2-Cerrar Puerta \n 3-Consultar estado Garaje \n 4-Salir");
                           operacion=sn.nextInt();
                           switch (operacion){
                               case 1: return Comando.SUBIR_PUERTA;
                               
                               case 2: return Comando.BAJAR_PUERTA;
                               
                               case 3: return Comando.CONSULTAR_ESTADO_GARAJE;
                               
                               case 4: return Comando.APAGAR_SISTEMA;
                           }
                     break;
                     
            case 3: System.out.println("¿Qué tipo de acción desea realizar en el Dormitorio?");
                    System.out.println("\n 1-Encender las Luces \n 2-Apagar las luces \n "
                            + "3-Activar Vigilancia \n 4-Desactivar Vigilancia \n 5-Subir Persiana"
                            + " \n 6-Bajar Persiana \n 7-Consultar estado \n 8-Salir");
                           operacion=sn.nextInt();
                           switch(operacion){
                               case 1: return Comando.ENCENDER_LUCES_Dormitorio;
                               
                               case 2: return Comando.APAGAR_LUCES_Dormitorio;
                               
                               case 3: return Comando.ACTIVAR_VIGILANCIA_Dormitorio;
                               
                               case 4: return Comando.DESACTIVAR_VIGILANCIA_Dormitorio;
                               
                               case 5: return Comando.SUBIR_PERSIANA_Dormitorio;
                               
                               case 6: return Comando.BAJAR_PERSIANA_Dormitorio;
                               
                               case 7: return Comando.CONSULTAR_ESTADO_DORMITORIO;
                               
                               case 8: return Comando.APAGAR_SISTEMA;
                           
                           }
                     break;
            case 4: System.out.println("¿Qué tipo de acción desea realizar en el Despacho?");
                    System.out.println(" 1-Encender las Luces \n 2-Apagar las luces \n "
                            + "3-Activar Vigilancia \n 4-Desactivar Vigilancia \n 5-Subir Persiana"
                            + " \n 6-Bajar Persiana \n 7-Consultar estado \n 8-Salir");
                           operacion=sn.nextInt();
                           switch(operacion){
                               case 1: return Comando.ENCENDER_LUCES_Despacho;
                               
                               case 2: return Comando.APAGAR_LUCES_Despacho;
                               
                               case 3: return Comando.ACTIVAR_VIGILANCIA_Despacho;
                               
                               case 4: return Comando.DESACTIVAR_VIGILANCIA_Despacho;
                               
                               case 5: return Comando.SUBIR_PERSIANA_Despacho;
                               
                               case 6: return Comando.BAJAR_PERSIANA_Despacho;
                               
                               case 7: return Comando.CONSULTAR_ESTADO_DESPACHO;
                               
                               case 8: return Comando.APAGAR_SISTEMA;
                           }
                    break;
            case 5: System.out.println("¿Que tipo de acción desea realizar en el Reloj?");
                    System.out.println(" 1-Consultar la Hora \n 2-Consultar la Fecha \n 3-Modificar la Hora \n 4-Modificar la fecha \n 5-Salir");
                      operacion = sn.nextInt();
                        switch(operacion){
                            case 1: return Comando.CONSULTAR_HORA_RELOJ;
                            
                            case 2: return Comando.CONSULTAR_FECHA_RELOJ;
                            
                            case 3: return Comando.MODIFICAR_HORA_RELOJ;
                            
                            case 4: return Comando.MODIFICAR_FECHA_RELOJ;
                            
                            case 5: return Comando.APAGAR_SISTEMA;
                    
                    }
                    break;
            case 6: System.out.println(" 1-¿Desea realizar un apagado general? \n 2-¿Desea activar el apagado eco? \n 3-¿Desea consultar el estado de las luces de su vivienda?");
                     operacion = sn.nextInt();
                      switch (operacion){
                          case 1: return Comando.APAGADO_GENERAL;
                          
                          case 2: return Comando.APAGADO_ECO;
                          
                          case 3: return Comando.CONSULTAR_LUCES;

                      }
                      break;
                      
            case 7: return Comando.CONSULTAR_ESTADO_VIVIENDA;
                                  
            case 8: return Comando.APAGAR_SISTEMA;      
        }   
        }
        
        
        
        return Comando.SIN_ACCION;
    
    }
}
