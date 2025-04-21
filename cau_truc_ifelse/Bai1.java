import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số thứ nhất: ");
        int a = scanner.nextInt();

        System.out.print("Nhập số thứ hai: ");
        int b = scanner.nextInt();

        // Các phép tính toán học
        int tong = a + b;
        int hieu = a - b;
        int tich = a * b;

        System.out.println("Tổng: " + tong);
        System.out.println("Hiệu: " + hieu);
        System.out.println("Tích: " + tich);

        if (b != 0) {
            double thuong = (double) a / b;
            int chiadu = a % b;

            System.out.println("Thương: " + thuong);
            System.out.println("Chia lấy dư: " + chiadu);
        } else {
            System.out.println("Không thể chia cho 0!");
        }

        // Các phép so sánh
        System.out.println("\n--- So sánh hai số ---");
        System.out.println(a + " == " + b + " : " + (a == b));
        System.out.println(a + " != " + b + " : " + (a != b));
        System.out.println(a + " > " + b + " : " + (a > b));
        System.out.println(a + " < " + b + " : " + (a < b));
        System.out.println(a + " >= " + b + " : " + (a >= b));
        System.out.println(a + " <= " + b + " : " + (a <= b));

        scanner.close();
    }
}
