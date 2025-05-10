import java.util.Scanner;

public class CoBan {
    String soDT;

    // Constructor mac dinh
    public CoBan() {
        this.soDT = "";
    }

    // Phuong thuc nhap thong tin
    public void nhapThongTin() {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Nhap so can cuoc cong dan: ");
            scanner.nextLine();

            System.out.print("Nhap ho ten: ");
            scanner.nextLine();

            System.out.print("Nhap so dien thoai: ");
            this.soDT = scanner.nextLine();
        }

    }

    // Phuong thuc xuat thong tin
}
