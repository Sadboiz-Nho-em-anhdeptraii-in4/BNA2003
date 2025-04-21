import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập một số: ");
        int number = scanner.nextInt();  // Nhập số từ bàn phím

        // Kiểm tra số chẵn hay lẻ
        if (number % 2 == 0) {
            System.out.println(number + " là số chẵn.");
        } else {
            System.out.println(number + " là số lẻ.");
        }

        scanner.close();
    }
}
