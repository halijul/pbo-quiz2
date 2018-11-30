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
public class Barang {
    private String nama;
    private float harga;
    private int jumlah;

    public Barang(String nama, float harga) {
        this.nama = nama;
        this.harga = harga;
    }
    
    public Barang(String nama, float harga, int jumlah) {
        this.nama = nama;
        this.harga = harga;
        this.jumlah = jumlah;
    }

    public String getNama() {
        return nama;
    }

    public float getHarga() {
        return harga;
    }
    
    public int getJumlah() {
        return jumlah;
    }

    public float getTotal() {
        return harga * jumlah;
    }

    @Override
    public String toString() {
        return nama;
    }
    
    
}
