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
        System.out.println("Bienvenido al Registro del Sistema Domótico de su casa");
        System.out.println("Introduzca su nuevo USUARIO con el que podrá acceder a la interface");
        String u = sn.nextLine();
        System.out.println("Introduzca su nueva Contraseña");
        String a = sn.nextLine();
        Usuario usuariox = new Usuario(u, a);
        Central.registrarUsuario(usuariox);

        Usuario user1 = new Usuario("", "");
        System.out.println("Bienvenido a la Centralita");
        System.out.println("---------------------------");
        do {
            System.out.println("Introduzca sus credenciales");
            System.out.println("¿Usuario?");
            String usuario = sn.nextLine();
            System.out.println("¿Contraseña?");
            String pass = sn.nextLine();
            user1 = new Usuario(usuario, pass);
            Central.comprobarUsuario(usuariox);
        } while (Central.comprobarUsuario(user1) == -2);
        
        System.out.println("Genial, ya estás dentro, ahora selecciona que acciones deseas realizar en tu vivienda");
        do {
            System.out.println("---------------------");
            Comando comando = Vista.menu();
            centralita.ejecutarComando(comando, centralita);
        } while (centralita.getSystem().isEstadoSistema() == true);

    }
}
