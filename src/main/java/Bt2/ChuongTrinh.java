/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Bt2;

/**
 *
 * @author Administrator
 */
public class ChuongTrinh {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Account ac1;
        Account ac2;
        
        ac1=new Account("01","Nguyen Van A",500000);
        ac2=new Account("02","Nguyen Minh Quan",100000);
        
        System.out.println("--------------THONG TIN TAI KHOAN-------------");
        System.out.println("id: " + ac1.getId() + " name: " + ac1.getName() + " So du: " + ac1.getBalance());
        System.out.println("id: " + ac2.getId() + " name: " + ac2.getName() + " So du: " + ac2.getBalance());
        
        ac1.credit(50000);
        ac2.credit(10000);
        
        System.out.println("----------------Tai Khoan sau khi nap tien----------------");
        System.out.println("id: " + ac1.getId() + " name: " + ac1.getName() + " So du: " + ac1.getBalance());
        System.out.println("id: " + ac2.getId() + " name: " + ac2.getName() + " So du: " + ac2.getBalance());
        
        ac1.debit(500000);
        ac2.debit(20000);
        
        System.out.println("---------------Tai Khoan sau khi rut tien-----------------");
        System.out.println("id: " + ac1.getId() + " name: " + ac1.getName() + " So du: " + ac1.getBalance());
        System.out.println("id: " + ac2.getId() + " name: " + ac2.getName() + " So du: " + ac2.getBalance());
    }
    
}
