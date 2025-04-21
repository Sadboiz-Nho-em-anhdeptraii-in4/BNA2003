import java.util.Scanner;
import java.util.Arrays;

public class MaxTrongMaTran {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            // Nhập số hàng và số cột
            System.out.print("Nhập số hàng của ma trận: ");
            int rows = scanner.nextInt();

            System.out.print("Nhập số cột của ma trận: ");
            int cols = scanner.nextInt();

            // Khởi tạo mảng 2 chiều
            int[][] matrix = new int[rows][cols];

            // Nhập giá trị cho ma trận
            System.out.println("Nhập các phần tử của ma trận:");
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    System.out.print("Phần tử [" + i + "][" + j + "]: ");
                    matrix[i][j] = scanner.nextInt();
                }
            }

            // In ma trận nếu cần
            System.out.println("Ma trận đã nhập:");
            for (int[] row : matrix) {
                System.out.println(Arrays.toString(row));
            }

            // Tìm phần tử lớn nhất
            int max = matrix[0][0];
            int maxRow = 0, maxCol = 0;

            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    if (matrix[i][j] > max) {
                        max = matrix[i][j];
                        maxRow = i;
                        maxCol = j;
                    }
                }
            }

            // Hiển thị kết quả
            System.out.println("Phần tử lớn nhất là: " + max + " tại vị trí [" + maxRow + "][" + maxCol + "]");
        }
    }
}
