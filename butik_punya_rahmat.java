package com;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import com.controllers.transaksiconstroller;
import com.controllers.laporantransaksi;
import com.controllers.pakaiancontroller;
import com.models.pakaian;
import com.models.transaksi;

public class App {

    static Scanner scan = new Scanner(System.in);
    public static final Locale locale = new Locale("in", "ID");

    public static void main(String[] args) throws Exception {
        List<pakaian> listpakaian = new ArrayList<pakaian>();
        List<transaksi> listtransaksi = new ArrayList<transaksi>();

        do {
            System.out.println("=== TODO LIST APP ===");
            System.out.println("[1] Data Pakaian");
            System.out.println("[2] Transaksi");
            System.out.println("[3] Laporan Transaksi");
            System.out.println("---------------------");
            System.out.print("Pilih menu> ");
        } while (showMenu(listpakaian, listtransaksi) != 0);
    }

    public static int showMenu(List<pakaian> pakaian, List<transaksi> transaksi) {
        int selectedMenu = utility.inputInt(scan.nextLine());
        switch (selectedMenu) {
            case 1:
                new pakaiancontroller(pakaian);
                break;
            case 2:
            new transaksiconstroller(transaksi, pakaian);
            break;
            case 3:
            new laporantransaksi(transaksi);
            break;
        }
        return selectedMenu;
    }
}
