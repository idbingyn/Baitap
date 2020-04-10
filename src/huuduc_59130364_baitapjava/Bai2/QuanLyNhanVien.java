/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package huuduc_59130364_baitapjava.Bai2;


import Bai1.NhanVien;
import java.util.ArrayList;
/**
 *
 * @author Pistol
 */
public class QuanLyNhanVien {
    // danh sach nhan vien
    ArrayList<NhanVien> dsNhanVien = new ArrayList<>();

    // implement methods
public void them(NhanVien nv) {
dsNhanVien.add(nv);
};

public void inDS() {
dsNhanVien.forEach(nv -> System.out.println(nv.getThongTin()));
};
}
