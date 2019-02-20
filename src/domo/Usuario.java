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
    
    private String id;
    private String pass;
    private int rango;
    
    public Usuario(){}

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
    
    public void registrarUsuario(String ID , String PASS,int Rang){
    this.id=ID;
    this.pass=PASS;
    this.rango=Rang;
    }
    public void modificarUsuario(String nuevaID, String nuevaPASS, int nuevoRango){
    this.id=nuevaID;
    this.pass=nuevaPASS;
    this.rango=nuevoRango;
    }
    
}
