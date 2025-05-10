package vong_lap_for;
import java.util.Scanner;

public class DemKyTuTrongChuoi {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Nhập một chuỗi bất kỳ: ");
            String input = scanner.nextLine();

            int soKyTuThuong = 0;
            int soKyTuHoa = 0;
            int soChuSo = 0;

            for (int i = 0; i < input.length(); i++) {
                char ch = input.charAt(i);

                if (Character.isLowerCase(ch)) {
                    soKyTuThuong++;
                } else if (Character.isUpperCase(ch)) {
                    soKyTuHoa++;
                } else if (Character.isDigit(ch)) {
                    soChuSo++;
                }
            }

            System.out.println("Số ký tự thường: " + soKyTuThuong);
            System.out.println("Số ký tự hoa: " + soKyTuHoa);
            System.out.println("Số chữ số: " + soChuSo);
        }
    }
}
