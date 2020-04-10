/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package huuduc_59130364_baitapjava.Bai2;


import Bai1.NhanVien;
/**
 *
 * @author Pistol
 */
public class MainQL {
        public static void main(String[] args) {
    // create quan ly nhan vien object
    QuanLyNhanVien qlNhanVien = new QuanLyNhanVien();

    // create nhan vien
    NhanVien nv1 = new NhanVien();
    nv1.setTen("Nguyen Van A");
    nv1.setTuoi(20);
    nv1.setDiaChi("Cam Ranh - Khanh Hoa");
    nv1.setTienLuong(15000000);
    nv1.setTongGioLam(80);

    NhanVien nv2 = new NhanVien();
    nv2.setTen("Nguyen Thi B");
    nv2.setTuoi(24);
    nv2.setDiaChi("Cam Thinh - Khanh Hoa");
    nv2.setTienLuong(18000000);
    nv2.setTongGioLam(150);

    NhanVien nv3 = new NhanVien();
    nv3.setTen("Nguyen Nhu C");
    nv3.setTuoi(30);
    nv3.setDiaChi("Cam Phuoc - Khanh Hoa");
    nv3.setTienLuong(30000000);
    nv3.setTongGioLam(250);

    NhanVien nv4 = new NhanVien();
    nv4.setTen("Nguyen Pham D");
    nv4.setTuoi(21);
    nv4.setDiaChi("Cam Thanh - Khanh Hoa");
    nv4.setTienLuong(40000000);
    nv4.setTongGioLam(350);

    NhanVien nv5 = new NhanVien();
    nv5.setTen("Nguyen Minh E");
    nv5.setTuoi(26);
    nv5.setDiaChi("Cam Phuoc - Khanh Hoa");
    nv5.setTienLuong(45000000);
    nv5.setTongGioLam(250);

    // add nhan vien list vao qlNhanVien
    qlNhanVien.them(nv1);
    qlNhanVien.them(nv2);
    qlNhanVien.them(nv3);
    qlNhanVien.them(nv4);
    qlNhanVien.them(nv5);

    // in danh sach nhan vie
    qlNhanVien.inDS();
  }
}
