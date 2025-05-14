package main;

/**
 * Lớp nhân viên bán thời gian
 */
public class NhanVienPartTime extends NhanVien {
    private int gioLamViec; // Số giờ làm việc
    
    // Constructor
    public NhanVienPartTime() {
        super();
        this.gioLamViec = 0;
    }
    
    public NhanVienPartTime(String ten, int gioLamViec) {
        super(ten);
        this.gioLamViec = gioLamViec;
    }
    
    // Cài đặt phương thức tính lương
    @Override
    public void tinhLuong() {
        luong = Configs.LUONG_NHAN_VIEN_PART_TIME_MOI_GIO * gioLamViec;
    }
    
    // Ghi đè phương thức xuất thông tin
    @Override
    public void xuatThongTin() {
        System.out.println("\n=== Nhân viên Part-Time ===");
        System.out.println("Tên: " + ten);
        System.out.println("Số giờ làm việc: " + gioLamViec);
        System.out.println("Lương: " + luong + " VND");
        System.out.println("=========================");
    }
    
    // Getter và Setter
    public int getGioLamViec() {
        return gioLamViec;
    }
    
    public void setGioLamViec(int gioLamViec) {
        this.gioLamViec = gioLamViec;
    }
}