import java.util.Scanner;

public class Student {
    String name;
    int age;

    public void inputData(Scanner sc) {
        // nhập thông tin sinh viên ở đây
        System.out.print("Nhập tên: ");
        name = sc.nextLine();
        System.out.print("Nhập tuổi: ");
        age = sc.nextInt();
        sc.nextLine();
    }

    public void display() {
        System.out.println("Tên: " + name + ", Tuổi: " + age);
    }
}
