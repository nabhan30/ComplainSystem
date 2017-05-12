/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul;

/**
 *
 * @author nabhan
 */
public class LemariA {
    private String nama;
    private int no, stok;
    
    public LemariA (String nama, int stok) {
        this.nama = nama;
        this.stok = stok;
    }
    
    public void Stok (int stok) {
        this.stok = stok;
    }
    
    public int bacaStok () {
        return this.stok;
    }
    
    public String[] bacaData() {
        String[] dataRoti = {this.nama};
        return dataRoti;
    }
    
    public void gantiNama(String roti) {
        this.nama = roti;
    }
    
    public String bacaNama() {
        return this.nama;
    }
    
}
