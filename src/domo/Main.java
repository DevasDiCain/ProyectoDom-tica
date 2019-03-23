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

    //Esta versión permite la creación de un usuario "temporal" con una serie de funciones limitadas
    //Una vez creado el usuario, este podrá acceder con sus credenciales
    //Al reiniciar el sistema se borrará el usuario "temporal"
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        Central centralita = new Central();//Creamos la central del sistema domótico
        System.out.println("Bienvenido al Registro del Sistema Domótico de su casa");
        System.out.println("Introduzca su nuevo USUARIO con el que podrá acceder a la interface");
        String u = sn.nextLine();
        System.out.println("Introduzca su nueva Contraseña");
        String a = sn.nextLine();
        Usuario usuariox = new Usuario(u, a);
        Central.registrarUsuario(usuariox);//Registramos el usuario introducido

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
            Central.comprobarUsuario(usuariox);//Comprobamos que las credenciales son correctas
        } while (Central.comprobarUsuario(user1) == -2);// Repetimos la acción hasta que esta sea correcta
        
        System.out.println("Genial, ya estás dentro, ahora selecciona que acciones deseas realizar en tu vivienda");
        do {
            //Ver Vista y Central para más información
            System.out.println("---------------------");
            Comando comando = Vista.menu();//Ejecuta la vista y la guarda en una variable de tipo Comando
            centralita.ejecutarComando(comando, centralita);//Ejecutamos la centralita
        } while (centralita.getSystem().isEstadoSistema() == true);//Se repite el bucle hasta que el Sistema se apague de manera manual

    }
}
