package Chuong3;

/**
 * Lớp nhân viên toàn thời gian
 */
public class NhanVienFullTime extends NhanVien {
    private int ngayLamThem; // Số ngày làm thêm
    private int loaiChucVu; // Chức vụ: sếp hoặc nhân viên thường
    
    // Constructor
    public NhanVienFullTime() {
        super();
        this.ngayLamThem = 0;
        this.loaiChucVu = Configs.NHAN_VIEN_LINH; // Mặc định là nhân viên thường
    }
    
    public NhanVienFullTime(String ten) {
        super(ten);
        this.ngayLamThem = 0;
        this.loaiChucVu = Configs.NHAN_VIEN_LINH;
    }
    
    public NhanVienFullTime(String ten, int ngayLamThem) {
        super(ten);
        this.ngayLamThem = ngayLamThem;
        this.loaiChucVu = Configs.NHAN_VIEN_LINH;
    }
    
    // Cài đặt phương thức tính lương
    @Override
    public void tinhLuong() {
        if (loaiChucVu == Configs.NHAN_VIEN_SEP) {
            luong = Configs.LUONG_NHAN_VIEN_FULL_TIME_SEP + ngayLamThem * Configs.LUONG_LAM_THEM_MOI_NGAY;
        } else {
            luong = Configs.LUONG_NHAN_VIEN_FULL_TIME_LINH + ngayLamThem * Configs.LUONG_LAM_THEM_MOI_NGAY;
        }
    }
    
    // Ghi đè phương thức xuất thông tin
    @Override
    public void xuatThongTin() {
        String chucVu = (loaiChucVu == Configs.NHAN_VIEN_SEP) ? "Sếp" : "Nhân viên";
        System.out.println("\n=== Nhân viên Full-Time ===");
        System.out.println("Tên: " + ten);
        System.out.println("Chức vụ: " + chucVu);
        System.out.println("Ngày làm thêm: " + ngayLamThem);
        System.out.println("Lương: " + luong + " VND");
        System.out.println("=========================");
    }
    
    // Getter và Setter
    public void setNgayLamThem(int ngayLamThem) {
        this.ngayLamThem = ngayLamThem;
    }
    
    public int getNgayLamThem() {
        return ngayLamThem;
    }
    
    public void setLoaiChucVu(int loaiChucVu) {
        this.loaiChucVu = loaiChucVu;
    }
    
    public int getLoaiChucVu() {
        return loaiChucVu;
    }
}