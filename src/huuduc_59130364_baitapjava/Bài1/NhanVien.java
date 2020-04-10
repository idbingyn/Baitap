/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package huuduc_59130364_baitapjava.Bài1;

/**
 *
 * @author Pistol
 */
public class NhanVien {
    // thuoc tinh
  private String Ten;
  private int Tuoi;
  private String Diachi;
  private double Tienluong;
  private int Tonggiolam;

  // constructor
  public NhanVien() {
    this.Ten = "";
    this.Tuoi = 0;
    this.Diachi = "";
    this.Tienluong = 0;
    this.Tonggiolam = 0;
  }

  // getter, setter
  public void setTen(String ten) {
    this.Ten = ten;
  }
  public String getTen() {
    return this.Ten;
  }
  public void setTuoi(int tuoi) {
    this.Tuoi = tuoi;
  }
  public int gettuoi() {
    return this.Tuoi;
  }
  public void setDiaChi(String diaChi) {
    this.Diachi = diaChi;
  }
  public String getDiaChi() {
    return this.Diachi;
  }
  public void setTienLuong(double tienLuong) {
    this.Tienluong = tienLuong;
  }
  public double getTienLuong() {
    return this.Tienluong;
  }
  public void setTongGioLam(int tongGioLam) {
    this.Tonggiolam = tongGioLam;
  }
  public int getTongGioLam() {
    return this.Tonggiolam;
  }

  // methods
  // get thong tin nhan vien
  public String getThongTin() {
    return "Ten: " + this.Ten + ", tuoi: " + this.Tuoi + ", dia chi: " + this.Diachi
      + ", tien luong : " + this.Tienluong + ", tong gio lam: " + this.Tonggiolam
      + ", tien thuong: " + this.tinhThuong();
  }

  // tinh luong nhan vien
  public double tinhThuong() {
    if (this.Tonggiolam >= 200) {
      return this.Tienluong * 0.2;
    } else if (this.Tonggiolam >= 100) {
      return this.Tienluong * 0.1;
    }
    return 0;
  }
}
