package com.controllers;

import java.util.List;
import java.util.Scanner;
import com.models.Barang;
import com.Utility;

/**
 * BarangController
 */
public class BarangController {
    private List<Barang> listBarang;
    static Scanner scan = new Scanner(System.in);

    public BarangController(List<Barang> listBarang) {
        this.listBarang = listBarang;
        menuBarang();
    }

    void menuBarang() {
        int pilih = 0;
        do {
            show();

            System.out.println("[1] Input Barang");
            System.out.println("[2] Update Barang");
            System.out.println("[3] Hapus Barang");
            System.out.println("[0] Halaman Utama");
            System.out.println("Pilih Menu \n ============");
            pilih = Utility.inputInt(scan.nextLine());

            switch (pilih) {
                case 0:
                    System.out.println("");
                    break;
                case 1:
                    store();
                    break;
                case 2:
                    update();
                    break;
                case 3:
                    destroy();
                    break;
                default:
                    break;
            }
        } while (pilih != 0);
    }

    void show() {
        System.out.println(
                "______________________________________________________________________________");
        System.out.println(
                "| NO |     Nama Barang     |          Harga          |          Stok         |");
        System.out.println(
                "===============================================================================");
        int i = 1;
        for (Barang barang : listBarang) {
            System.out.printf("|%-4s|%-21s|%-25s|%-23s| %n", i++, barang.getNamaBarang(),
                    Utility.toRupiah(barang.getHarga()),
                    barang.getStok());
        }
    }

    void store() {
        // String nama, alamat, jenis_kelamin, nim;
        Barang b = new Barang();
        System.out.println("Masukkan Nama Barang");
        b.setNamaBarang(scan.nextLine());
        System.out.println("Masukkan Harga");
        b.setHarga(Utility.inputInt(scan.nextLine()));
        System.out.println("Masukkan Stok Barang");
        b.setStok(Utility.inputInt(scan.nextLine()));
        listBarang.add(b);
    }

    void update() {
        System.out.println("======Ubah Data Barang======");
        System.out.println("~Kosongkan Data Jika Tidak Ingin Dirubah~");
        System.out.println("~Ketik 0 kembali ke menu utama-");
        System.out.println("Pilih NO :");
        int inputan = Utility.inputInt(scan.nextLine());
        if (inputan > 0 && --inputan < listBarang.size()) {
            System.out.println("Masukkan nama");
            String nama = scan.nextLine();

            if (!nama.equals("")) {
                listBarang.get(inputan).setNamaBarang(nama);
            }
            System.out.println("Masukkan Harga");
            int harga = Utility.inputInt(scan.nextLine());

            if (harga >= 0) {
                listBarang.get(inputan).setHarga(harga);
            }

            System.out.println("Masukkan Stok");
            int stok = Utility.inputInt(scan.nextLine());
            if (stok >= 0) {
                listBarang.get(inputan).setStok(stok);
            }
        }
    }

    void destroy() {
        System.out.println("Masukkan No");
        int inputan = Utility.inputInt(scan.nextLine());

        if (inputan > 0 && --inputan < listBarang.size()) {
            listBarang.remove(inputan);
            System.out.println("\n Data Berhasil Dihapus \n");
        }
    }
}
