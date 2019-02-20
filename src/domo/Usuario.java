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
public class Usuario {
    
    private static String id;
    private static String pass;
    private static int rango;
    
    public Usuario(String id, String pass){
    this.id="Devas";
    this.pass="1234";
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }
    
    public static void registrarUsuario(String ID , String PASS,int Rang){
    Usuario.id=ID;
    Usuario.pass=PASS;
    Usuario.rango=Rang;
    }
    public static void modificarUsuario(String nuevaID, String nuevaPASS, int nuevoRango){
    Usuario.id=nuevaID;
    Usuario.pass=nuevaPASS;
    Usuario.rango=nuevoRango;
    }
              //Usuario
  public int comprobarUsuario(Usuario user){
      Usuario x = new Usuario("Devas","1234");
      if(x.equals(user)==true){
      System.out.println("La cuenta introducida es correcta");return 1;
      }else{System.out.println("La cuenta introducida es incorrecta");}
      return 2;
  }

    
}
