/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.projek_laundri;

/**
 *
 * @author SMK TELKOM 023
 */
public class main_londri {

    public static void main(String[] args) {
        client client = new client();
        JenisLaundry jenis = new JenisLaundry();
        Transaksi transaksi = new Transaksi();
        Laporan laporan = new Laporan();
        
        laporan.NamaToko();
        laporan.laporan(jenis);
        laporan.laporan(client);
        transaksi.prosesTransaksi(client, transaksi, jenis);
        laporan.laporan(jenis);
        laporan.laporan(client);
    }
}
  
