package Chuong3;

public class MainClass {
    public static void main(String[] args) {
        // Công ty có 3 nhân viên toàn thời gian, trong đó có 1 sếp, sếp không làm thêm ngày nào
        NhanVienFullTime sep = new NhanVienFullTime("Nguyễn Văn Sếp");
        sep.setLoaiChucVu(Configs.NHAN_VIEN_SEP);
        
        NhanVienFullTime linh1 = new NhanVienFullTime("Trần Văn Linh"); // Không làm thêm ngày nào
        
        NhanVienFullTime linh2 = new NhanVienFullTime("Lê Thị Linh"); // Làm thêm 3 ngày
        linh2.setNgayLamThem(3);

        // Công ty đang thuê 1 nhân viên thời vụ
        NhanVienPartTime thoiVu = new NhanVienPartTime("Phan Thị Thời Vụ", 240); // Cô ấy siêng làm lắm
        
        // Tính lương cho nhân viên
        sep.tinhLuong();
        linh1.tinhLuong();
        linh2.tinhLuong();
        thoiVu.tinhLuong();
        
        // In thông tin nhân viên
        sep.xuatThongTin();
        linh1.xuatThongTin();
        linh2.xuatThongTin();
        thoiVu.xuatThongTin();
    }
}