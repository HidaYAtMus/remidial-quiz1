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
public class Penyewa {
    private String idpenyewa;
    private String namapenyewa;

    public Penyewa(String idpenyewa, String namapenyewa) {
        this.idpenyewa = idpenyewa;
        this.namapenyewa = namapenyewa;
    }

    public String getIdpenyewa() {
        return idpenyewa;
    }

    public void setIdpenyewa(String idpenyewa) {
        this.idpenyewa = idpenyewa;
    }

    public String getNamapenyewa() {
        return namapenyewa;
    }

    public void setNamapenyewa(String namapenyewa) {
        this.namapenyewa = namapenyewa;
    }
    //mathoed untuk mwmpilkan data penyewa
    public String info(){
        String info = "";
        info += "id penyewa\t:" + idpenyewa + "\n";
        info += "Nama penyewa\t: " + namapenyewa + "\n";
        return info;
    }
}
