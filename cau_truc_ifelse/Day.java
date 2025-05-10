import java.util.Scanner;

public class Day {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập vào số nguyên từ 1 đến 12: ");
        int thang = scanner.nextInt();

        if (thang >= 1 && thang <= 12) {
            System.out.println("Tháng " + thang);
        } else {
            System.out.println("Số bạn nhập không hợp lệ. Vui lòng nhập từ 1 đến 12.");
        }

        scanner.close();
    }
}
