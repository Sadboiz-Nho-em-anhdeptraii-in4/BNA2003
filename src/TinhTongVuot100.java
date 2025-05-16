package src;
import java.util.Scanner;

public class TinhTongVuot100 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tong = 0;
        int so;

        do {
            System.out.print("Nhập số nguyên: ");
            so = scanner.nextInt();
            tong += so;
        } while (tong <= 100);

        System.out.println("Tổng các số đã nhập là: " + tong);
        scanner.close();
    }
}
