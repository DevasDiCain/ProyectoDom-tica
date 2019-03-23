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
public class Estancias { //Clase padre de todas las estancias de la casa
    private double m2;
    

    public Estancias(int m2){
    this.m2=m2;
    }

    public double getM2() {
        return m2;
    }

    public void setM2(double m2) {
        this.m2 = m2;
    }

    @Override
    public String toString() {
        return "Estancias{" + "m2=" + m2 + '}';
    }
    
}

