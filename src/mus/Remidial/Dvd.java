/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mus.Remidial;

/**
 *
 * @author HP
 */
public class Dvd {
    private String kode;
    private String namaDvd;
    private Penyewa sewa;
    private LamaSewa waktu;
    private Karyawan karyawan;

    public Dvd(String kode, String namaDvd, Penyewa sewa, LamaSewa waktu, Karyawan karyawan) {
        this.kode = kode;
        this.namaDvd = namaDvd;
        this.sewa = sewa;
        this.waktu = waktu;
        this.karyawan = karyawan;
    }

    public String getKode() {
        return kode;
    }

    public void setKode(String kode) {
        this.kode = kode;
    }

    public String getNamaDvd() {
        return namaDvd;
    }

    public void setNamaDvd(String namaDvd) {
        this.namaDvd = namaDvd;
    }

    public Penyewa getSewa() {
        return sewa;
    }

    public void setSewa(Penyewa sewa) {
        this.sewa = sewa;
    }

    public LamaSewa getWaktu() {
        return waktu;
    }

    public void setWaktu(LamaSewa waktu) {
        this.waktu = waktu;
    }

    public Karyawan getKaryawan() {
        return karyawan;
    }

    public void setKaryawan(Karyawan karyawan) {
        this.karyawan = karyawan;
    }
    //metod untuk menampilkan data penyewaan
    public String info(){
        String info ="";
        info += "Kode DVD : " + this.kode + "\n";
        info += "Nama DVD : " + this.namaDvd + "\n"+"\n";
        info += "Penyewa : " + "\n";
        info += this.sewa.info();
        info += this.waktu.info() + "\n" + "\n";
        info += "Karyawan yang melayani : " + "\n";
        info += this.karyawan.info() + "\n";
        return info;
    }
}
