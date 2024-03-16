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
public class client implements user {
    private ArrayList<String> namaMember = new ArrayList<String>(); 
    private ArrayList<String> alamat = new ArrayList<String>(); 
    private ArrayList<String> telepon = new ArrayList<String>(); 
    private ArrayList<Integer> saldo = new ArrayList<Integer>(); 
    
    public client() { 
        this.namaMember.add("Omar"); 
        this.alamat.add("sawojajar"); 
        this.telepon.add("081222"); 
        this.saldo.add(100000); 
         
        this.namaMember.add("Ravan"); 
        this.alamat.add("bululawang"); 
        this.telepon.add("081333"); 
        this.saldo.add(200000); 
        
        this.namaMember.add("Daka"); 
        this.alamat.add("bulan terang utama"); 
        this.telepon.add("081444"); 
        this.saldo.add(300000); 
    }
    public void setSaldo(int saldo){ 
        this.saldo.add(saldo); 
    } 
    public int getSaldo(int idMember){ 
        return this.saldo.get(idMember); 
    }        
    @SuppressWarnings("empty-statement")
    public void editSaldo(int idMember, int saldo){ 
        this.saldo.set(idMember, saldo);; 
    }       
    public int getJmlMember(){ 
        return this.saldo.size(); 
    }
    
    @Override 
    public void setNama(String namaMember ){ 
        this.namaMember.add(namaMember); 
    } 
     
    @Override 
    public void setAlamat(String alamat ){ 
        this.alamat.add(alamat); 
    } 
    @Override 
    public void setTelepon(String telepon ){ 
        this.telepon.add(telepon); 
    } 
     
    @Override 
    public String getNama(int idMember){ 
        return this.namaMember.get(idMember); 
    } 
     
    @Override 
    public String getAlamat(int idMember){ 
        return this.alamat.get(idMember); 
    } 
     
    @Override 
    public String getTelepon(int idMember){ 
        return this.telepon.get(idMember); 
    } 
}
    

    
