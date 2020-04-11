/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package huuduc_59130364_baitapjava.Bai3;

/**
 *
 * @author Pistol
 */
public class SinhVienBiz extends SinhVienPoLy {
    public double diemMarketing;
    public double diemSales;

    public SinhVienBiz(String hoTen, double diemMarketing, double diemSales) {
        super(hoTen, "Biz");
        this.diemMarketing = diemMarketing;
        this.diemSales = diemSales;
    }

    @Override
    public double getDiem() {
        return (2* diemMarketing + diemSales)/(double)3;
    }
}
