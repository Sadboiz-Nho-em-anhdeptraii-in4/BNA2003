package src;
import java.util.Scanner;

    // Khai báo 1 lớp hình tròn
class HinhTron {

    // Dưới đây là các thuộc tính
    final float PI = 3.14f;
    float r;
    float cv;
    float dt;

    // Phương thức nhập bán kính
    void nhapBanKinh() {
        System.out.print("Hãy nhập vào Bán kính Hình tròn: ");
        try (Scanner scanner = new Scanner(System.in)) {
            r = scanner.nextFloat();
        }
    }

    // Tính chu vi
    void tinhChuVi() {
        cv = 2 * PI * r;
    }

    // Tính diện tích
    void tinhDienTich() {
        dt = PI * r * r;
    }

    // In chu vi
    void inChuVi() {
        System.out.println("Chu vi Hình tròn: " + cv);
    }

    // In diện tích
    void inDienTich() {
        System.out.println("Diện tích Hình tròn: " + dt);
    }
}

public class Main {
    public static void main(String[] args) {
        
        // Tạo đối tượng hình tròn
        HinhTron htron = new HinhTron();

        // Gọi các phương thức 
        htron.nhapBanKinh();
        htron.tinhChuVi();
        htron.tinhDienTich();
        htron.inChuVi();
        htron.inDienTich();
    }
}