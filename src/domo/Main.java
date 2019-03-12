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
          Central centralita = new Central();
        System.out.println("!Bienvenido al registro¡");
        System.out.println("Introduzca su nuevo Usuario");
        String u=sn.nextLine();
        System.out.println("Introduzca su nueva Contraseña");
        String a=sn.nextLine();
        Usuario usuariox = new Usuario(u,a);
        Central.registrarUsuario(usuariox);
        Central.comprobarUsuario(usuariox);
        Comando comando =Vista.menu();
        centralita.ejecutarComando(comando);
        
    }
}
