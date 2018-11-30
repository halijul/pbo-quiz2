/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package halijul.quiz2;

import java.util.ArrayList;

/**
 *
 * @author Haliza
 */
public class modelCombobox {
    private ArrayList<Barang> barang = new ArrayList<>();
    
    public modelCombobox() {}

    public Barang[] getBarang() {
        Barang[] brg = new Barang[this.barang.size()];
        for(int i = 0; i < brg.length; i++) {
            brg[i] = this.barang.get(i);
        }
        return brg;
    }
    
    public void tambahBarang(Barang barang) {
        this.barang.add(barang);
    }
}
