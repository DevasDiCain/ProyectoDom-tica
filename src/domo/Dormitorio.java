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
public class Dormitorio extends HabitacionesGenericas {
    public Orientacion orientacion;
 

    public Dormitorio(int m2) {
        super(m2);
        this.orientacion = orientacion;      
    }

    

    public static void main(String[] args) {
        Dormitorio x = new Dormitorio(10);
        x.consusltarEstado();
    }
    
    
    
}
