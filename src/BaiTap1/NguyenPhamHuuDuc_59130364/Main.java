/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap1.NguyenPhamHuuDuc_59130364;

import BaiTap1.Else.GiaoVien;
import BaiTap1.Else.HocSinh;
import BaiTap1.Else.LopHoc;

/**
 *
 * @author Pistol
 */
public class Main {
    public static void main(String[] args) {
        HocSinh hs1 = new HocSinh("Nguyen Pham Huu Duc", 21, "Khanh Hoa", "0956523598", "59cntt2", "Coding");
        HocSinh hs2 = new HocSinh("Nguyen Nam Duong", 21, "Khanh Hoa", "0858462596", "59cntt2", "Design");
        HocSinh hs3 = new HocSinh("Tran Tien Cao", 21, "Khanh Hoa", "0252547815", "59cntt2", "Testing");
        GiaoVien gv1 = new GiaoVien("Phan Bao", 59, "Khanh Hoa", "0965236540", "Database", "IT");
        GiaoVien gv2 = new GiaoVien("Nguyen An", 65, "Khanh Hoa", "0862358430", "Object-oriented programming", "IT");
        GiaoVien gv3 = new GiaoVien("Tham Duong", 60, "TPHCM", "0753526485", "Math base for informatics", "IT");

        LopHoc lopHoc = new LopHoc();
        lopHoc.themHS(hs1);
        lopHoc.themHS(hs2);
        lopHoc.themHS(hs3);
        lopHoc.themHS(hs1);

        lopHoc.themGV(gv1);
        lopHoc.themGV(gv2);
        lopHoc.themGV(gv3);
        lopHoc.themGV(gv1);

        System.out.println("\nDanh sach hoc sinh:");
        lopHoc.inDSHS();
        System.out.println("\nDanh sach giao vien:");
        lopHoc.inDSGV();
    }    
}
