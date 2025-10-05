/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab4;

/**
 *
 * @author ADMIN
 */
class SanPham4 {
    // Khai báo private
    private String tenSp;
    private double donGia;
    private double giamGia;

    // Constructor không tham số
    public SanPham4() {}

    // Constructor 3 tham số
    public SanPham4(String tenSp, double donGia, double giamGia) {
        this.tenSp = tenSp;
        this.donGia = donGia;
        this.giamGia = giamGia;
    }

    // Constructor 2 tham số (ngầm hiểu giamGia = 0)
    public SanPham4(String tenSp, double donGia) {
        this(tenSp, donGia, 0);
    }

    // Getter và Setter
    public String getTenSp() {
        return tenSp;
    }

    public void setTenSp(String tenSp) {
        this.tenSp = tenSp;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    public double getGiamGia() {
        return giamGia;
    }

    public void setGiamGia(double giamGia) {
        this.giamGia = giamGia;
    }

    // 
    private double getThueThuNhap() {
        return donGia * 0.1;
    }

    // xuat
    public void xuat() {
        System.out.println("Tên sản phẩm: " + tenSp);
        System.out.println("Đơn giá: " + donGia);
        System.out.println("Giảm giá: " + giamGia);
        System.out.println("Thuế nhập khẩu: " + getThueThuNhap());
    }
}