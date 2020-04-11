/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package huuduc_59130364_baitapjava.Bai4;

import java.util.ArrayList;

/**
 *
 * @author Pistol
 */
public class QuanLyChuyenXe {
    // attributes
    public ArrayList<ChuyenXe> dsChuyenXe = new ArrayList<>();

    // methods
    // them chuyen xe
    public void themChuyenXe(ChuyenXe cx) {
      dsChuyenXe.add(cx);
    }

    // Xuat danh sach chuyen xe
    public ArrayList<ChuyenXe> xuatDsChuyenXe() {
      return dsChuyenXe;
    }

    // Xuat thong tin chuyen xe
    public void inThongTin() {
      dsChuyenXe.forEach(cx -> cx.In());
    }

    // tinh tong doanh thu xe noi thanh
    public double tongDoanhThuNoiThanh() {
      double doanhThu = 0;
      doanhThu = dsChuyenXe.stream().filter((cx) -> (cx instanceof XeNoiThanh)).map((cx) -> cx.doanhThu).reduce(doanhThu, (accumulator, _item) -> accumulator + _item);
      return doanhThu;
    }

    // tinh tong doanh thu xe ngoai thanh
    public double tongDoanhThuNgoaiThanh() {
      double doanhThu = 0;
      doanhThu = dsChuyenXe.stream().filter((cx) -> (cx instanceof XeNgoaiThanh)).map((cx) -> cx.doanhThu).reduce(doanhThu, (accumulator, _item) -> accumulator + _item);
      return doanhThu;
    }

    // tinh tong doanh thu
    public double tongDoanhThu() {
      double doanhThu = 0;
      doanhThu = dsChuyenXe.stream().map((cx) -> cx.doanhThu).reduce(doanhThu, (accumulator, _item) -> accumulator + _item);
      return doanhThu;
    }   
}
