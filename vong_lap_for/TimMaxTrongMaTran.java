import java.util.Scanner;

public class TimMaxTrongMaTran {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            // Nhập số hàng và số cột của ma trận
            System.out.print("Nhập số hàng: ");
            int hang = scanner.nextInt();

            System.out.print("Nhập số cột: ");
            int cot = scanner.nextInt();

            int[][] maTran = new int[hang][cot];

            // Nhập các phần tử cho ma trận
            System.out.println("Nhập các phần tử cho ma trận:");
            for (int i = 0; i < hang; i++) {
                for (int j = 0; j < cot; j++) {
                    System.out.print("Phần tử [" + i + "][" + j + "]: ");
                    maTran[i][j] = scanner.nextInt();
                }
            }

            // Tìm phần tử lớn nhất
            int max = maTran[0][0];
            for (int i = 0; i < hang; i++) {
                for (int j = 0; j < cot; j++) {
                    if (maTran[i][j] > max) {
                        max = maTran[i][j];
                    }
                }
            }

            // Hiển thị kết quả
            System.out.println("Phần tử lớn nhất trong ma trận là: " + max);
        }
    }
}
