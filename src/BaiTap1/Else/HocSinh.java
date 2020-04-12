/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap1.Else;

/**
 *
 * @author Pistol
 */
public class HocSinh extends CaNhan{
    private String lop;
    private String nangKhieu;

    public HocSinh(String hoten, int tuoi, String diaChi, String sdt, String lop, String nangKhieu) {
        super(hoten, tuoi, diaChi, sdt);
        this.lop = lop;
        this.nangKhieu = nangKhieu;
    }

    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }

    public String getNangKhieu() {
        return nangKhieu;
    }

    public void setNangKhieu(String nangKhieu) {
        this.nangKhieu = nangKhieu;
    }

    @Override
    String hienThiTT() {
        return "Hoten: " + getHoten() + " -- Tuoi: " + getTuoi() + " -- Dia chi: " + getDiaChi() + " -- So dien thoai: " + getSdt()
            + " -- Lop: " + getLop() + " -- Nang khieu: " + getNangKhieu();
    }   
}
