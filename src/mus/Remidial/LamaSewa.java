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
public class LamaSewa {
    private int lamasewa;

    public LamaSewa(int lamasewa) {
        this.lamasewa = lamasewa;
    }

    public int getLamasewa() {
        return lamasewa;
    }

    public void setLamasewa(int lamasewa) {
        this.lamasewa = lamasewa;
    }
    //method untuk menmapilkan lama sewa
    public String info(){
        String info ="";
        info += "Lama sewa\t:" + this.lamasewa + "hari";
        return info;
    }
}
