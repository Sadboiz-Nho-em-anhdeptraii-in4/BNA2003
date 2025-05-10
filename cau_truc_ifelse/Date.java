import java.util.Scanner;

public class Date {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int ngay = scan.nextInt(); // Đọc vào một số nguyên

        switch (ngay) {
            case 0:
                System.out.println("Chủ Nhật");
                break;
            case 1:
                System.out.println("Thứ Hai");
                break;
            case 2:
                System.out.println("Thứ Ba");
                break;
            case 3:
                System.out.println("Thứ Tư");
                break;
            case 4:
                System.out.println("Thứ Năm");
                break;
            case 5:
                System.out.println("Thứ Sáu");
                break;
            case 6:
                System.out.println("Thứ Bảy");
                break;
            default:
                System.out.println("Số ngày trong tuần không hợp lệ");
        }

        scan.close(); // Đóng Scanner khi dùng xong
    }
}
