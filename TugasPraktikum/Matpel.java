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
class Matpel {

    private String jenismatpel;
    private String bukupenunjang;
    private int jampelajaran;

    public Matpel(String jenismatpel, String bukupenunjang, int jampelajaran) {
        this.jenismatpel = jenismatpel;
        this.bukupenunjang = bukupenunjang;
        this.jampelajaran = jampelajaran;
        
    }

    public void info() {
        System.out.println("Jenis Mata Pelajaran    : " + this.jenismatpel);
        System.out.println("Mata Pelajaran          : " + this.bukupenunjang);
        System.out.println("Jam Pelajaran           : " + this.jampelajaran + " Jam");
    }
}
