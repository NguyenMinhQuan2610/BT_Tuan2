/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Bt3;

import java.util.ArrayList;
import java.util.Scanner;

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
            menu();
    }

    public static void menu() {
        Scanner sc = new Scanner(System.in);
        String continute;
        ArrayList<SanPham> sp = new ArrayList<>();
        do {
            System.out.println("0. Thoat");
            System.out.println("1. Nhap danh sach");
            System.out.println("2. In danh sach");
            System.out.println("3. Sap xep giam dan theo gia");
            System.out.println("4. Tim va xoa san pham theo ten");
            System.out.println("5. Xuat gia trung binh");
            System.out.print("Nhap chuc nang ban muon: ");
            int chon = sc.nextInt();
            sc.nextLine();
            switch (chon) {
                case 0:
                    System.out.println("Goodbye,See u soon!!");
                    return;
                case 1:
                    nhap(sp);
                    break;
                case 2:
                    Xuat(sp);
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    double Avg = AVG(sp);
                    System.out.print(Avg);
                    break;
                default:
                    System.out.print("Khong co viec thuc hien nay, nhap lai !!");
            }
            System.out.println("\nBan co muon nhap tiep khong (Y/N)");
            continute = sc.nextLine();
        } while (continute.equalsIgnoreCase("Y"));
    }

    public static void nhap(ArrayList<SanPham> sanPham) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ten san pham: ");
        String ten = sc.nextLine();
        System.out.print("Nhap gia san pham: ");
        int gia = sc.nextInt();
        SanPham sp = new SanPham(ten, gia);
        sanPham.add(sp);
    }

    public static void Xuat(ArrayList<SanPham> sanPham) {
        for (SanPham sanPham1 : sanPham) {
            System.out.print(sanPham1 + "\n");
        }
    }

    public static double AVG(ArrayList<SanPham> sanPham) {
        if (sanPham.isEmpty()) {
            return 0;
        }
        int tongGia = 0;
        for (SanPham sanPham1 : sanPham) {
            tongGia += sanPham1.getPrice();
        }
        return (double) tongGia / sanPham.size();
    }
    }
    

