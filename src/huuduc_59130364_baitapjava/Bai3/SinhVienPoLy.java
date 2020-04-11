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
public abstract class SinhVienPoLy {
    public String hoTen;
    public String nganh;

    public SinhVienPoLy(String hoTen, String nganh) {
        this.hoTen = hoTen;
        this.nganh = nganh;
    }
   public abstract double getDiem();

    public String getHocLuc(){
        double diem = getDiem();
        String hocLuc;
        if(diem<5) hocLuc = "Yeu";
        else 
            if(diem<6.5) hocLuc = "Trung binh";
            else 
                if(diem<7.5) hocLuc = "Kha";
                else 
                    if(diem<9) hocLuc = "Gioi";
                    else hocLuc = "Xuat sac";

        return hocLuc;
    }
     public void Xuat() {
        System.out.println("\nThong tin sinh vien: " + hoTen);
        System.out.println("Nganh: " + nganh + "\nDiem: " + getDiem() + "\nHoc luc: " + getHocLuc());
    }
}
