import java.util.Scanner;

public class BaiToan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số thứ nhất: ");
        int a = scanner.nextInt();

        System.out.print("Nhập số thứ hai: ");
        int b = scanner.nextInt();

        int tong = a + b;
        int hieu = a - b;
        int tich = a * b;

        // Kiểm tra tránh chia cho 0
        if (b != 0) {
            double thuong = (double) a / b;
            int chiadu = a % b;

            System.out.println("Tổng: " + tong);
            System.out.println("Hiệu: " + hieu);
            System.out.println("Tích: " + tich);
            System.out.println("Thương: " + thuong);
            System.out.println("Chia lấy dư: " + chiadu);
        } else {
            System.out.println("Không thể chia cho 0!");
        }

        scanner.close();
    }
}
