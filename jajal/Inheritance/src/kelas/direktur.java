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
public class direktur extends manajer{
    public int tunjangan;

    public direktur(String n, int g, String j, int t) {
        super(n, g, j);
        this.tunjangan = t;
    }
    
    public void tampilDirektur(){
        this.tampilManajer();
        System.out.println(this.tunjangan);
    }
}
