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
public class MainXe {
    public static void main(String[] args) {
        // qlChuyenXe obj
        QuanLyChuyenXe qlChuyenXe = new QuanLyChuyenXe();

        // create chuyen xe noi thanh
        ChuyenXe xeNoiThanh1 = new XeNoiThanh(1, "A", "79A-1241", 20000000, "Nha Trang - Cam Ranh", 50);
        ChuyenXe xeNoiThanh2 = new XeNoiThanh(2, "B", "79A-1242", 21000000, "Nha Trang - Cam Ranh", 50);
        ChuyenXe xeNoiThanh3 = new XeNoiThanh(3, "C", "79A-1244", 22000000, "Nha Trang - Ninh Hoa", 150);

        // them chuyen xe vao qlChuyenXe
        qlChuyenXe.themChuyenXe(xeNoiThanh1);
        qlChuyenXe.themChuyenXe(xeNoiThanh2);
        qlChuyenXe.themChuyenXe(xeNoiThanh3);

        // create chuyen xe ngoai thanh
        ChuyenXe xeNgoaiThanh1 = new XeNgoaiThanh(4, "D", "79A-1255", 30000000, "Tuy Hoa - Phu Yen", 1);
        ChuyenXe xeNgoaiThanh2 = new XeNgoaiThanh(5, "E", "79A-1256", 31000000, "Phan Rang - Ninh Thuan", 1);
        ChuyenXe xeNgoaiThanh3 = new XeNgoaiThanh(6, "F", "79A-1257", 32000000, "Quy Nhon - Binh Dinh", 1);

        // them chuyen xe vao qlChuyenXe
        qlChuyenXe.themChuyenXe(xeNgoaiThanh1);
        qlChuyenXe.themChuyenXe(xeNgoaiThanh2);
        qlChuyenXe.themChuyenXe(xeNgoaiThanh3);

        // in thong tin cac chuyen xe
        qlChuyenXe.inThongTin();

        // tong doanh thu xe noi thanh
        System.out.printf("\nTong doanh thu xe noi thanh: %.00f\n" , qlChuyenXe.tongDoanhThuNoiThanh());

        // tong doanh thu xe ngoai thanh
        System.out.printf("Tong doanh thu xe ngoai thanh: %.00f\n", qlChuyenXe.tongDoanhThuNgoaiThanh());

        // tong doanh thu
        System.out.printf("Tong doanh thu: %.00f\n", qlChuyenXe.tongDoanhThu());
    }
}
