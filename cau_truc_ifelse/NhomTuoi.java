package cau_truc_ifelse;
import java.util.Scanner;
public class NhomTuoi {
    public static void main(String[] args) {
        // Tạo đối tượng Scanner để nhập dữ liệu
        Scanner scanner = new Scanner(System.in);

        // Nhập tên 
        System.out.print("Nhập tên của bạn: ");
        String ten = scanner.nextLine();

        // Nhập năm sinh
        System.out.print("Nhập năm sinh của bạn: ");
        String namsinhStr = scanner.nextLine();
        int namsinh = Integer.parseInt(namsinhStr);  //Chuyen doi String thanh intB

        // Tính tuổi
        int tuoi = 2025 - namsinh; // Giả sử hiện tại là năm 2025

        // Kiểm tra và xuất thông báo theo nhóm tuổi
        if (tuoi < 16) {
            System.out.println("Ban " + ten + " ở độ tuổi vị thành niên.");
        } else if (tuoi >= 16 && tuoi < 18) {
            System.out.println("Ban " + ten + " Ở độ tuổi trưởng thành.");
        } else {
            System.out.println("Bạn " + ten + " đã già.");
        }

        // Đóng scanner
        scanner.close();

            
    }
}
