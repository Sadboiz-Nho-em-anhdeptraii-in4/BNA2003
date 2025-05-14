package main;

/**
 * Lớp trừu tượng NhanVien làm lớp cha cho các loại nhân viên cụ thể
 */
public abstract class NhanVien {
    protected String ten;
    protected long luong;
    
    // Constructor
    public NhanVien() {
        this.ten = "";
        this.luong = 0;
    }
    
    public NhanVien(String ten) {
        this.ten = ten;
        this.luong = 0;
    }
    
    // Phương thức tính lương (sẽ được triển khai cụ thể trong lớp con)
    public abstract void tinhLuong();
    
    // Phương thức xuất thông tin nhân viên
    public void xuatThongTin() {
        System.out.println("Nhân viên: " + ten);
        System.out.println("Lương: " + luong + " VND");
    }
}