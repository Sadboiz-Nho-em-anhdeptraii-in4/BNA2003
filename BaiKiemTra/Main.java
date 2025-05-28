package BaiKiemTra;

public class Main {
    public static void main(String[] args) {
        // Tao doi tuong SinhVien
        SinhVien sv = new SinhVien();

        // Goi phuong thuc nhapThongTin
        sv.nhapThongTin();
        
        // Goi phuong thuc inThongTin
        sv.inThongTin();

        // goi phuong thuc getten
        sv.getten();

        // Tao doi tuong HocSinh
        HocSinh hs = new HocSinh("Tran Thi B", "HS001", 18);
        hs.inThongTin();  
    }
    
}