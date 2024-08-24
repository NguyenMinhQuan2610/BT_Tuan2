/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package BT1;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class ChuongTrinh {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Retangle r1=new Retangle();
        Retangle r2;
        
        Scanner sc=new Scanner(System.in);
        System.out.print("Cho biet chieu dai: ");
        double dai=sc.nextDouble();
        System.out.print("Cho biet chieu rong: ");
        double rong=sc.nextDouble();
        
        r2=new Retangle(dai,rong);
        System.out.println("Thong tin HCN thu nhat: ");
        System.out.println("Dai: "+r1.getLength() + "Rong: "+r1.getWidth() +"Dien tich: "+r1.findArea() + "Chu vi: "+r1.findPerimeter());
        
        System.out.println("Thong tin HCN thu hai: ");
        System.out.println("Dai: "+r2.getLength() + "Rong: "+r2.getWidth() +"Dien tich: "+r2.findArea() + "Chu vi: "+r2.findPerimeter());
        
    }
    
}
