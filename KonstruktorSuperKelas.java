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
        Pilihan cetak = new Pilihan();
        cetak.info();
    }
}
