import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Student> list = new ArrayList<>();

        System.out.print("Nhập số sinh viên: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            Student s = new Student();
            System.out.println("Nhập sinh viên thứ " + (i + 1));
            s.inputData(sc); // Truyền sc vào nếu inputData cần Scanner
            list.add(s);
        }

        System.out.println("\nDanh sách sinh viên:");
        for (Student s : list) {
            s.display();
        }
    }
}