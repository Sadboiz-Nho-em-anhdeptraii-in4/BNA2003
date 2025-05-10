package shapes;

import java.util.Scanner;

public class HinhChuNhat {
    float dai;     // chieu dai
    float rong;    // chieu rong
    float cv;      // chu vi
    float dt;      // dien tich

    public void nhapChieuDai() {
        System.out.println("Hay nhap vao Chieu dai Hinh chu nhat: ");
        try (Scanner scanner = new Scanner(System.in)) {
            dai = scanner.nextFloat();
        }
    }

    public void nhapChieuRong() {
        System.out.println("Hay nhap vao Chieu rong Hinh chu nhat: ");
        try (Scanner scanner = new Scanner(System.in)) {
            rong = scanner.nextFloat();
        }
    }
    public void tinhChuvi() {
        cv = 2 * (dai + rong);
    }
    public void tinhDienTich() {
        dt = dai * rong;
    }
    public void inChuvi() {
        System.out.println("Chu vi Hinh chu nhat: " + cv);
    }
    public void inDienTich() {
        System.out.println("Dien tich Hinh chu nhat: " + dt);
    }

}
