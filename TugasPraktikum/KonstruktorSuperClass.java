/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasPraktikum;



/**
 *
 * @author TUF
 */
class RunPustel extends Pustel {

    private String namaperpustakaan;

    public RunPustel(String namaperpustakaan, String namapiket, String jamkerja, int noinduk) {
        super(namapiket, jamkerja, noinduk);
        this.namaperpustakaan = namaperpustakaan;
    }

    public void info() {
        System.out.println("Nama Perpustakaan : " + this.namaperpustakaan);
        super.info();
    }

}

public class KonstruktorSuperClass {

    public static void main(String[] args) {
        RunPustel cetak1 = new RunPustel("Pustel", "Memoreza Sabana", "Istirahat ke-2", 161003);
        cetak1.info();
    }
}
