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
class Matapelajaran extends Matpel {

    private String Matapelajaran;

    public Matapelajaran(String Matapelajaran, String jenismatpel, String bukupenunjang, int jampelajaran) {
        super(jenismatpel, bukupenunjang, jampelajaran);
        this.Matapelajaran = Matapelajaran;
    }

    public void info() {
        System.out.println();
        System.out.println("Mata Pelajaran          : " + this.Matapelajaran);
        super.info();
    }
}

public class KonstruktorSuperKelas {

    public static void main(String[] args) {
        Matapelajaran cetak1 = new Matapelajaran("Sejarah Indonesia", "Sosial", "Buku Paket", 2);
        Matapelajaran cetak2 = new Matapelajaran("Produktif RPL", "Informatika", "Modul Online", 12);
        Matapelajaran cetak3 = new Matapelajaran("Bahasa Inggris", "Bahasa", "Buku Paket", 2);
        Matapelajaran cetak4 = new Matapelajaran("Kimia", "Sains", "Modul Online", 2);

        cetak1.info();
        cetak2.info();
        cetak3.info();
        cetak4.info();

    }
}
