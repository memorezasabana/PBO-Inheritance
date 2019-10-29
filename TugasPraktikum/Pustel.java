/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasPraktikum;
import java.util.Scanner;
/**
 *
 * @author TUF
 */
class Pustel {

    private String namapiket;
    private String jamkerja;
    private int noinduk;

    public Pustel(String namapiket, String jamkerja, int noinduk) {
        this.namapiket = namapiket;
        this.jamkerja = jamkerja;
        this.noinduk = noinduk;
        
    }

    public void info() {
        System.out.println("No Induk          : " + this.noinduk);
        System.out.println("Nama Piket        : " + this.namapiket);
        System.out.println("Jam Kerja         : " + this.jamkerja);
        

    }
}
