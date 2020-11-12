/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119053.latihan44.oo.hukumohm;

import model.Baterai;
/**
 *
 * @author Dean
 * Nama  : Dean Ghifari Faturrahman
 * Kelas : PBOIF2
 * NIM   : 10119053
 * Deskripsi Program : Program ini berisi program hukum OHM
 */
public class PBOIF210119053Latihan44OOHukumOHM {

    public static void main(String[] args) {        
        Baterai baterai = new Baterai();
        System.out.println("");
        Baterai baterai2 = new Baterai(3,12);
        System.out.println("Kuat Arus : " + baterai2.getKuatArus() + " ampere");
        System.out.println("Hambatan  : " + baterai2.getHambatan() + " ohm");
        System.out.println("Hasil Tegangan : " + baterai2.hitungTegangan() + " volt");
    }
    
}
