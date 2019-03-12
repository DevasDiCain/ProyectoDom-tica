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
        
        System.out.println("Bienvenido a la Centralita");
        System.out.println("---------------------------");
        
        System.out.println("Introduzca sus credenciales");
        System.out.println("¿Usuario?");
        String usuario =sn.nextLine();
        System.out.println("¿Contraseña?");
        String pass= sn.nextLine();
        Usuario user1 = new Usuario(usuario,pass);
       
        if( Central.comprobarUsuario(user1)==1){
        System.out.println("¿A qué parte de la casa desea tener acceso?");
        System.out.println(" 1-Salón \n 2-Garaje  \n 3-Habitacion \n 4-Despacho \n 5-Reloj");
          int opcion = sn.nextInt();
        int operacion;
        while (opcion<=5 && opcion >0){
        switch (opcion){
            case 1: System.out.println("¿Qué tipo de acción desea realizar en el Salón?");
                    System.out.println(" 1-Encender las Luces \n 2-Apagar las luces \n "
                            + "3-Activar Vigilancia \n 4-Desactivar Vigilancia \n 5-Subir Persiana"
                            + " \n 6-Bajar Persiana");
                           operacion=sn.nextInt();
                           switch(operacion){
                               case 1: return Comando.ENCENDER_LUCES_Salon;
                                        
                               case 2: return Comando.APAGAR_LUCES_Salon;
                               
                               case 3: return Comando.ACTIVAR_VIGILANCIA_Salon;
                               
                               case 4: return Comando.DESACTIVAR_VIGILANCIA_Salon;
                               
                               case 5: return Comando.SUBIR_PERSIANA_Salon;
                               
                               case 6: return Comando.BAJAR_PERSIANA_Salon;
                               
                                       
                           }
                    break;
                    
            case 2: System.out.println("¿Qué tipo de acción desea realizar en el Garaje?");
                    System.out.println("1-Abrir Puerta \n 2-Cerrar Puerta");
                           operacion=sn.nextInt();
                           switch (operacion){
                               case 1: return Comando.SUBIR_PUERTA;
                               
                               case 2: return Comando.BAJAR_PUERTA;
                           }
                     break;
                     
            case 3: System.out.println("¿Qué tipo de acción desea realizar en el Habitacion?");
                    System.out.println("\n 1-Encender las Luces \n 2-Apagar las luces \n "
                            + "3-Activar Vigilancia \n 4-Desactivar Vigilancia \n 5-Subir Persiana"
                            + " \n 6-Bajar Persiana");
                           operacion=sn.nextInt();
                           switch(operacion){
                               case 1: return Comando.ENCENDER_LUCES_Dormitorio;
                               
                               case 2: return Comando.APAGAR_LUCES_Dormitorio;
                               
                               case 3: return Comando.ACTIVAR_VIGILANCIA_Dormitorio;
                               
                               case 4: return Comando.DESACTIVAR_VIGILANCIA_Dormitorio;
                               
                               case 5: return Comando.SUBIR_PERSIANA_Dormitorio;
                               
                               case 6: return Comando.BAJAR_PERSIANA_Dormitorio;
                           
                           }
                     break;
            case 4: System.out.println("¿Qué tipo de acción desea realizar en el Despacho?");
                    System.out.println("1-Encender las Luces \n 2-Apagar las luces \n "
                            + "3-Activar Vigilancia \n 4-Desactivar Vigilancia \n 5-Subir Persiana"
                            + " \n 6-Bajar Persiana");
                           operacion=sn.nextInt();
                           switch(operacion){
                               case 1: return Comando.ENCENDER_LUCES_Despacho;
                               
                               case 2: return Comando.APAGAR_LUCES_Despacho;
                               
                               case 3: return Comando.ACTIVAR_VIGILANCIA_Despacho;
                               
                               case 4: return Comando.DESACTIVAR_VIGILANCIA_Despacho;
                               
                               case 5: return Comando.SUBIR_PERSIANA_Despacho;
                               
                               case 6: return Comando.BAJAR_PERSIANA_Despacho;
                           }
                    break;
            case 5: System.out.println("¿Que tipo de acción desea realizar en el Reloj?");
                    System.out.println(" 1-Consultar la Hora \n 2-Consultar la Fecha \n 3-Modificar la Hora \n 4-Modificar la fecha");
        }              operacion = sn.nextInt();
                        switch(operacion){
                            case 1: return Comando.CONSULTAR_HORA_RELOJ;
                            
                            case 2: return Comando.CONSULTAR_FECHA_RELOJ;
                            
                            case 3: return Comando.MODIFICAR_HORA_RELOJ;
                            
                            case 4: return Comando.MODIFICAR_FECHA_RELOJ;
                    
                    }
                    break;
        }
        } else if(Central.comprobarUsuario(user1)==2){
            System.out.println("Introduzca sus credenciales");
        System.out.println("¿Usuario?");
        String usuario1 =sn.nextLine();
        System.out.println("¿Contraseña?");
        String pass1= sn.nextLine();
        Usuario user2 = new Usuario(usuario1,pass1);
        }
        
        
        return Comando.SIN_ACCION;
    
    }
}
