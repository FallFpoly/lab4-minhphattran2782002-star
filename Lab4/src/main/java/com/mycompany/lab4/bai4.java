/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lab4;

/**
 *
 * @author ICT
 */
public class bai4 {

    public static void main(String[] args) {
        SanPham4 sp1 = new SanPham4("Laptop Dell", 15000000, 2000000);
        SanPham4 sp2 = new SanPham4("Điện thoại iPhone", 20000000);
        System.out.println("===== Sản phẩm 1 =====");
        sp1.xuat();
        System.out.println("\n===== Sản phẩm 2 =====");
        sp2.xuat();
    }
}