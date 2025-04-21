import java.util.Scanner;

public class DemKyTuXuatHien {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            // Nhập chuỗi không quá 80 ký tự
            String chuoi;
            do {
                System.out.print("Nhập một chuỗi (không quá 80 ký tự): ");
                chuoi = scanner.nextLine();
            } while (chuoi.length() > 80);

            // Nhập 1 ký tự
            System.out.print("Nhập một ký tự để đếm: ");
            char kyTuCanDem = scanner.next().charAt(0);

            int dem = 0;
            for (int i = 0; i < chuoi.length(); i++) {
                if (chuoi.charAt(i) == kyTuCanDem) {
                    dem++;
                }
            }

            System.out.println("Số lần xuất hiện của ký tự '" + kyTuCanDem + "' là: " + dem);
        }
    }
}
