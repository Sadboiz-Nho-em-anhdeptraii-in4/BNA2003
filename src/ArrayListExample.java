package src;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();

        // Nhập số lượng phần tử
        System.out.print("Nhập số lượng phần tử: ");
        int n = scanner.nextInt();

        // Nhập các phần tử
        for (int i = 0; i < n; i++) {
            System.out.print("Nhập số nguyên thứ " + (i + 1) + ": ");
            numbers.add(scanner.nextInt());
        }

        // Tìm phần tử lớn nhất
        int max = Collections.max(numbers);
        System.out.println("\nSố lớn nhất trong danh sách là: " + max);

        // Nhập 1 số và xóa tất cả phần tử có giá trị đó
        System.out.print("\nNhập số nguyên cần xóa khỏi danh sách: ");
        int removeVal = scanner.nextInt();
        numbers.removeIf(num -> num == removeVal);

        System.out.println("Danh sách sau khi xóa các phần tử có giá trị " + removeVal + ":");
        for (int num : numbers) {
            System.out.print(num + " ");
        }

        // Sắp xếp và in dãy số
        Collections.sort(numbers);
        System.out.println("\n\nDanh sách sau khi sắp xếp tăng dần:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }
}
