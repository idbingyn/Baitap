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
public class MainSV {
    public static void main(String[] args) {
        SinhVienIT IT = new SinhVienIT("Nguyen Pham Huu Duc", 9.0, 10.0, 9.0);
        IT.Xuat();

        SinhVienBiz Biz = new SinhVienBiz("Le Thi Ngoc Nhien", 9.0, 10.0);
        Biz.Xuat();
        
        SinhVienPoLy PoLy = new SinhVienIT("Nguyen Van Anh", 7, 9, 8);
        PoLy.Xuat();
    }
}
