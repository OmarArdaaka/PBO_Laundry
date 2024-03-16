/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projek_laundri;

import java.util.ArrayList;

/**
 *
 * @author SMK TELKOM 023
 */
public class petugas implements user {
    private ArrayList<String> namaPetugas = new ArrayList<String>(); 
    private ArrayList<String> alamat = new ArrayList<String>(); 
    private ArrayList<String> telepon = new ArrayList<String>(); 
    private ArrayList<Integer> jabatan = new ArrayList<Integer>(); 
     
    public petugas() { 
        this.namaPetugas.add("admin"); 
        this.alamat.add("kedung kandang"); 
        this.telepon.add("081112223333"); 
        this.jabatan.add(0); 
    } 
 
    public void setJabatan(int jabatan ){ 
        this.jabatan.add(jabatan); 
    } 
    public int getJabatan(int id){ 
        return this.jabatan.get(id); 
    }        
    public int getJmlPetugas(){ 
        return this.namaPetugas.size(); 
    }       
 
    @Override 
    public void setNama(String namaKaryawan ){ 
        this.namaPetugas.add(namaKaryawan); 
    } 
     
    @Override 
    public void setAlamat(String alamat ){ 
        this.namaPetugas.add(alamat); 
 
    } 
    @Override 
    public void setTelepon(String telepon ){ 
        this.namaPetugas.add(telepon); 
    } 
     
    @Override 
    public String getNama(int idKaryawan){ 
        return this.namaPetugas.get(idKaryawan); 
    } 
     
    @Override 
    public String getAlamat(int idKaryawan){ 
        return this.alamat.get(idKaryawan); 
    } 
     
    @Override 
    public String getTelepon(int idKaryawan){ 
        return this.telepon.get(idKaryawan); 
    }       
}

    

