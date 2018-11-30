/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package halijul.quiz2;

/**
 *
 * @author Haliza
 */
public class modelTabel {
    private String[] namakolom;
    
    public modelTabel() {
        this.namakolom = new String[]{
            "Nama","Harga","Jumlah"
        };
    }

    public String[] getNamakolom() {
        return namakolom;
    }
}
