package com.models;

public class Transaksi {
    private String NamaBarang;
    private int qty;
    private int harga;

    public int getHarga() {
        return this.harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public String getNamaBarang() {
        return this.NamaBarang;
    }

    public void setNamaBarang(String NamaBarang) {
        this.NamaBarang = NamaBarang;
    }

    public int getQty() {
        return this.qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public Transaksi() {
    }
}
