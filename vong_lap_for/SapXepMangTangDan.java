import java.util.Scanner;
import java.util.Arrays;

public class SapXepMangTangDan {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            // Nhập số lượng phần tử của mảng
            System.out.print("Nhập số phần tử của mảng: ");
            int n = scanner.nextInt();

            int[] A = new int[n];

            // Nhập các phần tử của mảng
            System.out.println("Nhập các phần tử của mảng:");
            for (int i = 0; i < n; i++) {
                System.out.print("A[" + i + "] = ");
                A[i] = scanner.nextInt();
            }

            // In mảng ban đầu
            System.out.println("Mảng ban đầu:");
            for (int i = 0; i < n; i++) {
                System.out.print(A[i] + " ");
            }

            // Sắp xếp mảng theo thứ tự tăng dần
            Arrays.sort(A);

            // In mảng sau khi sắp xếp
            System.out.println("\nMảng sau khi sắp xếp tăng dần:");
            for (int i = 0; i < n; i++) {
                System.out.print(A[i] + " ");
            }
        }
    }
}
