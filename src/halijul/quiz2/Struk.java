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
public class Struk {
    private String code;
    private ArrayList<Barang> barang = new ArrayList<>();
    private float total;
    
    public Struk() {}
    
    public Struk(String code, ArrayList<Barang> barang) {
        this.code = code;
        this.barang = barang;
        this.total = setTotal();
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setBarang(ArrayList<Barang> barang) {
        this.barang = barang;
    }
    
    public float setTotal() {
        float total = 0;
        for (Barang brg : this.barang) {
            total += brg.getTotal();
        }
        return total;
    }

    public String cetakStruk() {
        String str = "";
        str += "Kode\t\t: "+ this.code +"\n";
        str += "Daftar Belanja : \n";
        for(Barang brg : this.barang) {
            str += "\t"+ brg.getNama() +" "+ brg.getJumlah()+" "+ brg.getTotal() +"\n";
        }
        str += "Total\t\t: "+ this.total;
        return str;
    }
}
