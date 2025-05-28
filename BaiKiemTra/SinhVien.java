package BaiKiemTra;

import java.util.Scanner;
import static java.lang.Math.pow;

public class SinhVien 
{
    public String ten;
    public String maSV;
    public int tuoi;
    


    public String getten() {
        return ten;
    }

    // phuong thuc nhap thong tin
    public void nhapThongTin() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ten: ");
        ten = sc.nextLine();
        System.out.println("Nhap ma SV: ");
        maSV = sc.nextLine();
        System.out.println("Nhap tuoi: ");
        tuoi=sc.nextInt();

    }
    // phuong thuc in thong tin
    public void inThongTin() {
        System.out.println("Ten: " + ten);
        System.out.println("Ma SV: " + maSV);
        System.out.println("Tuoi: " + tuoi);
    }
    // phuong thuc khoi tao khong co tham so
    public SinhVien() 
    {
    }
}

