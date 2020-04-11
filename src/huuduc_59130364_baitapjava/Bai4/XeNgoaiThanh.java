/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package huuduc_59130364_baitapjava.Bai4;

/**
 *
 * @author Pistol
 */
public class XeNgoaiThanh extends ChuyenXe{
    // attributes
    public String noiDen;
    public int soNgay;
  
    // constructor
    public XeNgoaiThanh(int maChuyen, String taiXe, String soXe, double doanhThu, String noiDen, int soNgay) {
      super(maChuyen, taiXe, soXe, doanhThu);
      this.noiDen = noiDen;
      this.soNgay = soNgay;
    }

    // methods
    // in thong tin chuyen xe
    @Override
    public void In() {
      super.In();
      System.out.println("noi den: " + this.noiDen);
      System.out.println("so ngay: " + this.soNgay);
    } 
}
