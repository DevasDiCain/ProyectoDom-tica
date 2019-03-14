/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domo;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author jose
 */
public class Despacho extends HabitacionesGenericas {

    private Luz Luces;
    private Persiana Persianas;
    private Vigilancia camara;

    public Despacho(int m2) {
        super(m2);
        this.Luces = super.getLuces();
        this.Persianas = super.getPersianas();
        this.camara = super.getVigilancia();
    }

   


    public static void main(String[] args) {
        Despacho x = new Despacho(10);
        x.consusltarEstado();
    }
}
