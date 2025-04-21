import java.util.Scanner;

public class TinhGiaiThua {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        long giaiThua = 1;

        // Nhập số nguyên dương
        do {
            System.out.print("Nhập số nguyên dương: ");
            n = scanner.nextInt();
        } while (n < 0); // Lặp lại nếu người dùng nhập số âm

        // Tính giai thừa
        for (int i = 1; i <= n; i++) {
            giaiThua *= i;
        }

        // In kết quả
        System.out.println("Giai thừa của " + n + " là: " + giaiThua);

        scanner.close();
    }
}
