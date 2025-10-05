/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab4;

/**
 *
 * @author ICT
 */
public class bai3 {
    public static void main(String[] args) {
        // Tạo sản phẩm bằng constructor 3 tham số
        SanPham3 sp1 = new SanPham3("Laptop", 15000000, 2000000);

        // Tạo sản phẩm bằng constructor 2 tham số
        SanPham3 sp2 = new SanPham3("Điện thoại", 8000000);

        // Xuất thông tin sản phẩm
        System.out.println("===== Sản phẩm 1 =====");
        sp1.xuat();

        System.out.println("\n===== Sản phẩm 2 =====");
        sp2.xuat();
    }
}