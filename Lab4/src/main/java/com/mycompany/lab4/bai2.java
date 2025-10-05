/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lab4;

/**
 *
 * @author ICT
 */
public class bai2 {

    public static void main(String[] args) {
        SanPham sp1 = new SanPham();
        SanPham sp2 = new SanPham();
        // Nhập thông tin từ bàn phím
        System.out.println("=== Nhập sản phẩm 1 ===");
        sp1.nhap();

        System.out.println("\n=== Nhập sản phẩm 2 ===");
        sp2.nhap();

        // Xuất thông tin 2 sản phẩm
        System.out.println("\n=== Thông tin sản phẩm 1 ===");
        sp1.xuat();

        System.out.println("\n=== Thông tin sản phẩm 2 ===");
        sp2.xuat();
    }
}