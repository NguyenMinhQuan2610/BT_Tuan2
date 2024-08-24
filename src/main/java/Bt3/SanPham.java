/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bt3;

/**
 *
 * @author Administrator
 */
public class SanPham {
    private String Name;
    private int price;

    public SanPham(String Name, int price) {
        this.Name = Name;
        this.price = price;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    
    @Override
    public String toString(){
        return "San pham"+"Ten: "+Name + "-Gia tien: "+price;
}
}
