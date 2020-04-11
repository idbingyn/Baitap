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
public class SinhVienIT extends SinhVienPoLy {
    public double diemJava;
    public double diemCSS;
    public double diemHTML;

    public SinhVienIT(String hoTen, double diemJava, double diemCSS, double diemHTML) {
        super(hoTen, "IT");
        this.diemJava = diemJava;
        this.diemCSS = diemCSS;
        this.diemHTML = diemHTML;
    }

    @Override
    public double getDiem() {
        return (diemJava *2 + diemCSS + diemHTML)/(double)4;
    } 
}
