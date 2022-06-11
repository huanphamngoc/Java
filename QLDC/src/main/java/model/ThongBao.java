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
public class ThongBao {
    private int id;
    private String noiDungTB, thoiGianGui;

    public ThongBao(int id, String noiDungTB, String thoiGianGui) {
        this.id = id;
        this.noiDungTB = noiDungTB;
        this.thoiGianGui = thoiGianGui;
    }

    public ThongBao() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNoiDungTB() {
        return noiDungTB;
    }

    public void setNoiDungTB(String noiDungTB) {
        this.noiDungTB = noiDungTB;
    }

    public String getThoiGianGui() {
        return thoiGianGui;
    }

    public void setThoiGianGui(String thoiGianGui) {
        this.thoiGianGui = thoiGianGui;
    }
    
    
}
