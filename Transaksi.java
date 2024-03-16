/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projek_laundri;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author SMK TELKOM 023
 */
public class Transaksi {
    
    private ArrayList<Integer> idClient = new ArrayList<Integer>();
    private ArrayList<Integer> IdLaundry = new ArrayList<Integer>();
    private ArrayList<Integer> banyak = new ArrayList<Integer>();

    public Transaksi() {
        this.banyak.add(0);
        this.idClient.add(0);
        this.IdLaundry.add(2);
        this.banyak.add(0);
        this.idClient.add(1);
        this.IdLaundry.add(3);
        this.banyak.add(1);
        this.idClient.add(0);
        this.IdLaundry.add(1);
        this.banyak.add(1);
        this.idClient.add(2);
        this.IdLaundry.add(2);
    }

    public void prosesTransaksi(client client, Transaksi transaksi, JenisLaundry jenislaundry) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("\nSilahkan belanja");
        System.out.print("Masukkan ID Client: ");
        int idClient = scanner.nextInt();
        
        System.out.println("\n" + "Selamat datang " + client.getNama(idClient-1));
        System.out.println("Saldo Anda : " + client.getSaldo(idClient-1));

        ArrayList<Integer> idLaundry = new ArrayList<Integer>();
        ArrayList<Integer> banyak = new ArrayList<Integer>();
        
        int i = 0;
        int temp = 0;
        int pilih;
        do {
            System.out.print("Masukkan kode barang: ");
            temp = scanner.nextInt();
            if (true) {
                idLaundry.add(temp-1);
                System.out.print(jenislaundry.getNamaLaundry(idLaundry.get(i)) + " sebanyak : ");
                banyak.add(scanner.nextInt());
                System.out.println("Apakah sudah selesai memilih?");
                System.out.println("[1] Sudah \n[2]Belum");
                pilih = scanner.nextInt();
                
                if (pilih == 1) {
                    System.out.println("\nTransaksi belanja " + client.getNama(idClient) + " sebagai berikut");
                    System.out.println("Nama Barang \\tQty \\tHarga \\tJumlah \\t\"");
                
                } else
                i++;

               
            }
        } while (pilih != 1);

        int total = 0;
        int x = idLaundry.size();
        for (int j = 0; j < x; j++) {
            int jumlah = banyak.get(j) * jenislaundry.getHarga(idLaundry.get(j));
            total += jumlah;
            System.out.println(jenislaundry.getNamaLaundry(idLaundry.get(j)) + "\t" + banyak.get(j) + "\t" + jenislaundry.getHarga(idLaundry.get(j)) + "\t" + jumlah);
            transaksi.setTransaksi(jenislaundry, idClient, idLaundry.get(j), banyak.get(j));
        }

        System.out.println("\n" + "Total Belanja : " + total);
        client.editSaldo(idClient, client.getSaldo(idClient) - total);
        System.out.println("Nama Client : " + client.getNama(i));
        System.out.println("Sisa Saldo : " + client.getSaldo(i) );
        System.out.println("\n"+"=========== TERIMAKASIH ===========");
    }

    public void setTransaksi(JenisLaundry jenislaundry, int idLaundry, int idClient, int banyaknya) {
        this.idClient.add(idClient);
        this.idClient.add(idClient);
        this.banyak.add(banyaknya);
        jenislaundry.editHarga(idClient, jenislaundry.getHarga(idLaundry));
    }

    public int getIdJenisLaundry(int id) {
        return this.IdLaundry.get(id);
    }

    public int getBanyaknya(int id) {
        return this.banyak.get(id);
    }

    public int getIdMember(int id) {
        return this.idClient.get(id);
    }

    public int getJmlTransaksi() {
        return this.idClient.size();
    }
}