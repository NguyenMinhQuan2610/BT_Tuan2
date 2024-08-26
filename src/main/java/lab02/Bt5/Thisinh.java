/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab02.Bt5;

/**
 *
 * @author Administrator
 */
public class Thisinh {
    int sobaodanh;
    String hoten,diaChi,khoi,Monthi;

    public Thisinh(int sobaodanh, String hoten, String diaChi, String khoi, String Monthi) {
        this.sobaodanh = sobaodanh;
        this.hoten = hoten;
        this.diaChi = diaChi;
        this.khoi = khoi;
        this.Monthi = Monthi;
    }

    public int getSobaodanh() {
        return sobaodanh;
    }

    public void setSobaodanh(int sobaodanh) {
        this.sobaodanh = sobaodanh;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getKhoi() {
        return khoi;
    }

    public void setKhoi(String khoi) {
        this.khoi = khoi;
    }

    public String getMonthi() {
        return Monthi;
    }

    public void setMonthi(String Monthi) {
        this.Monthi = Monthi;
    }

    @Override
    public String toString() {
        return "Thisinh{" + "sobaodanh=" + sobaodanh + ", hoten=" + hoten + ", diaChi=" + diaChi + ", khoi=" + khoi + ", Monthi=" + Monthi + '}';
    }

   
    
    
}
