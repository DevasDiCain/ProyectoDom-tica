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
        System.out.println("¿A qué parte de la casa desea tener acceso?");
        System.out.println("1-Salón \n 2-Garaje  \n 3-Dormitorio \n 4-Despacho");
        int opcion = sn.nextInt();
        int operacion;
        
        while (opcion<4 && opcion >0){
        switch (opcion){
            case 1: System.out.println("¿Qué tipo de acción desea realizar en el Salón?");
                    System.out.println("1-Encender las Luces \n 2-Apagar las luces \n "
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
                     
            case 3: System.out.println("¿Qué tipo de acción desea realizar en el Dormitorio?");
                    System.out.println("1-Encender las Luces \n 2-Apagar las luces \n "
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
        }
        }
        return Comando.SIN_ACCION;
    }
}