package shapes;

import java.util.Scanner;

public class HinhTron {

    final float PI = 3.14f;

    float r;    // Ban kinh
    float cv;   // Chu vi
    float dt;   // Dien tich

    public void nhapBanKinh() {
        System.out.println("Hay nhao vao ban kinh hinh tron: ");
        try (Scanner scanner = new Scanner(System.in)) {
            r = scanner.nextFloat();
        }
    }
    public void tinhChuvi() {
        cv = 2 * PI * r;
    }
    public void tinhDienTich() {
        dt = PI * r * r;
    }
    public void inChuvi() {
        System.out.println("Chu vi Hinh tron: " + cv);
    }
    public void inDienTich() {
        System.out.println("Dien tich Hinh tron: " + dt);
        }
}
