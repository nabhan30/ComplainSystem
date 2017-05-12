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
public class manajer extends pegawai{
    public String jabatan;
    
    public manajer(String n, int g, String j){
        super(n,g);
        this.jabatan = j;
    }
    
    public void tampilManajer(){
        this.tampilPegawai();
        System.out.println(this.jabatan);
    }
}
