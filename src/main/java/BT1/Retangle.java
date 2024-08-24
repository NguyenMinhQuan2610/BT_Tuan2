/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BT1;

/**
 *
 * @author ADMIN
 */
public class Retangle {
    private double length;
    private double width;

    public Retangle() {
    }

    public Retangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }
    
    public double findArea(){
        double area=length*width;
        return area;
    }
    public double findPerimeter(){
        double kq=(length+width)*2;
        return kq;
    }
}
