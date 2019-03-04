/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domo;

import java.util.Objects;

/**
 *
 * @author jose
 */
public class Usuario {
    
    private  String id;
    private  String pass;
    private  int rango;
    
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
    
    public  void registrarUsuario(String ID , String PASS,int Rang){
    this.id=ID;
    this.pass=PASS;
    this.rango=Rang;
    }
    public  void modificarUsuario(String nuevaID, String nuevaPASS, int nuevoRango){
   this.id=nuevaID;
    this.pass=nuevaPASS;
    this.rango=nuevoRango;
    }
              //Usuario
  public int comprobarUsuario(Usuario user){
      Usuario x = new Usuario("Devas","1234");
      if(x.equals(user)==true){
      System.out.println("La cuenta introducida es correcta");return 1;
      }else{System.out.println("La cuenta introducida es incorrecta");}
      return 2;
  }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 47 * hash + Objects.hashCode(this.id);
        hash = 47 * hash + Objects.hashCode(this.pass);
        hash = 47 * hash + this.rango;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Usuario other = (Usuario) obj;
        if (this.rango != other.rango) {
            return false;
        }
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        if (!Objects.equals(this.pass, other.pass)) {
            return false;
        }
        return true;
    }

    
}
