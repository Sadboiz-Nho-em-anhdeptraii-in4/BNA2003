package vong_lap_for;

import java.util.Scanner;

public class TinhTrungBinhCong {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Nhập số lượng phần tử (n): ");
            int n = scanner.nextInt();

            int sum = 0;
            for (int i = 1; i <= n; i++) {
                System.out.print("Nhập số nguyên thứ " + i + ": ");
                int number = scanner.nextInt();
                sum += number;
            }

            double average = (double) sum / n;
            System.out.println("Trung bình cộng của " + n + " số nguyên là: " + average);
        }
    }
}
