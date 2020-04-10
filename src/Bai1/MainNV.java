/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai1;

/**
 *
 * @author Pistol
 */
public class MainNV {
public static void main(String[] args) {
    NhanVien nv1 = new NhanVien();
    NhanVien nv2 = new NhanVien();
    nv1.setTen("Nguyen Van A");
    nv1.setTuoi(25);
    nv1.setDiaChi("Cam Ranh - Khanh Hoa");
    nv1.setTienLuong(15000000);
    nv1.setTongGioLam(80);
    nv2.setTen("Nguyen Thi B");
    nv2.setTuoi(24);
    nv2.setDiaChi("Cam Thinh - Khanh Hoa");
    nv2.setTienLuong(18000000);
    nv2.setTongGioLam(150);
    System.out.println(nv1.getThongTin());
    System.out.println(nv2.getThongTin());
} 
}

