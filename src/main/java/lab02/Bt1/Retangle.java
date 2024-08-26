/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab02.Bt1;

/**
 *
 * @author Administrator
 */
public class Retangle {
    double rong,dai;

    public Retangle(double rong, double dai) {
        this.rong = rong;
        this.dai = dai;
    }

    public double getRong() {
        return rong;
    }

    public void setRong(double rong) {
        this.rong = rong;
    }

    public double getDai() {
        return dai;
    }

    public void setDai(double dai) {
        this.dai = dai;
    }

   public double TinhDienTich(){
       return dai*rong;}
   public double TinhChuVi(){
       return (dai+rong)*2;
   }
   public void Xuat(){
       System.out.print("Chieu dai: "+dai + ",Chieu rong: "+rong + ",Chu Vi: "+TinhChuVi() + ",Dien Tich: "+TinhDienTich());
   }
   
}
