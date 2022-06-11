/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Admin
 */
public class HoDan {
    private int soNha;
    private int soTV;

    public HoDan() {
    }

    public HoDan(int soNha, int soTV) {
        this.soNha = soNha;
        this.soTV = soTV;
    }

    public int getSoNha() {
        return soNha;
    }

    public void setSoNha(int soNha) {
        this.soNha = soNha;
    }

    public int getSoTV() {
        return soTV;
    }

    public void setSoTV(int soTV) {
        this.soTV = soTV;
    }
    
    
}
