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
public class Karyawan {
    private String idkaryawan;
    private String namakaryawan;

    public Karyawan(String idkaryawan, String namakaryawan) {
        this.idkaryawan = idkaryawan;
        this.namakaryawan = namakaryawan;
    }

    public String getIdkaryawan() {
        return idkaryawan;
    }

    public void setIdkaryawan(String idkaryawan) {
        this.idkaryawan = idkaryawan;
    }

    public String getNamakaryawan() {
        return namakaryawan;
    }

    public void setNamakaryawan(String namakaryawan) {
        this.namakaryawan = namakaryawan;
    }
    
    
}
