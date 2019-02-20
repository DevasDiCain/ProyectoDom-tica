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
public class Main {

    public static void main(String[] args) {
       
        
        Scanner sn = new Scanner(System.in);
        int opcion=0;
        while(opcion<2||opcion>0){
        System.out.println("¿1-Desea Crear Una Cuenta De Usuario Nueva?\n 2-¿Ya tiene una cuenta de usuario registrada?");
         opcion=sn.nextInt();
         sn.nextLine();
        switch(opcion){
            case 1: System.out.println("Introduzca su nuevo Usuario");
                    String u=sn.nextLine();
                    System.out.println("Introduzca su nueva Contraseña");
                    String a=sn.nextLine();
                    Usuario usuariox = new Usuario(u,a);
                    Central.registrarUsuario(usuariox);
                break;
            case 2: 
                    boolean opxion=false;
                    while(opxion==false){
                    System.out.println("Introduzca su Usuario");
                    String user=sn.nextLine();
                    System.out.println("Introduzca su Contraseña");
                    String passer=sn.nextLine();
                    Usuario usuarion = new Usuario(user,passer);
                    opxion=Central.comprobarUsuario(usuarion);
                    }
                break;
        }
        }
    }
    
    

}
