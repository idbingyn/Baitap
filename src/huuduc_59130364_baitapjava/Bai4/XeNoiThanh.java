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
public class XeNoiThanh extends ChuyenXe {
    // attributes
    public String soTuyen;
    public double soKm;

    // constructor
    public XeNoiThanh(int maChuyen, String taiXe, String soXe, double doanhThu, String soTuyen, double soKm) {
      super(maChuyen, taiXe, soXe, doanhThu);
      this.soTuyen = soTuyen;
      this.soKm = soKm;
    }

    // methods
    // in thong tin
    @Override
    public void In() {
      super.In();
      System.out.println("tuyen: " + this.soTuyen);
      System.out.println("so km di duoc: " + this.soKm);
    }
}
