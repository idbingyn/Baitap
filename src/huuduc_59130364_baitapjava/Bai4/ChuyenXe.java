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
public class ChuyenXe {
    // attributes
    public int maChuyen;
    public String taiXe;
    public String soXe;
    public double doanhThu;

    // contructor
    public ChuyenXe(int maChuyen, String taiXe, String soXe, double doanhThu) {
      this.maChuyen = maChuyen;
      this.taiXe = taiXe;
      this.soXe = soXe;
      this.doanhThu = doanhThu;
    }

    // methods
    // in thong tin xe
    public void In() {
      System.out.println("ma chuyen xe: " + this.maChuyen);
      System.out.println("ten tai xe: " + this.taiXe);
      System.out.println("so xe: " + this.soXe);
      System.out.printf("doanh thu: %.00f\n", this.doanhThu);
    };   
}
