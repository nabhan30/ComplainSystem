/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kelas;

/**
 *
 * @author A S U S
 */
public class pegawai {
    public String nama;
    public int gaji;
    
    public pegawai(String n, int g){
        this.nama = n;
        this.gaji = g;
    }
    
    public void tampilPegawai(){
        System.out.println(this.nama);
        System.out.println(this.gaji);
    }
}
