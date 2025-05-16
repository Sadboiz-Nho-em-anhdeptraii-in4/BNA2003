package src;
import java.util.Scanner;
import java.util.ArrayList;


public class MaxArrList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();
        int number; // phần tử của mảng

        System.out.println("Nhập số lượng phần tử cua ArrayList: ");
        int n = scanner.nextInt();
        // nhập và thêm các phần tử vào ArrayList 

        for (int i = 0; i < n; i++) {
            System.out.print("Nhập phần tử thứ " + i + ": ");
            number = scanner.nextInt();
            numbers.add(number); // Sửa arrListInteger thành numbers
        }
        // tìm phần tử lớn nhất trong mảng sử dụng phương thức compareTo()
        // giả sử phần tử lớn nhất là phần tử đầu tiên trong ArrayList
        int max = numbers.get(0); // Sửa arrListInteger thành numbers

        for (int i = 1; i < numbers.size(); i++) { // Sửa arrListInteger thành numbers
            if (numbers.get(i).compareTo(max) > 0) {
                max = numbers.get(i);
            }
        }
        System.out.println("Phan tu lon nhat trong ArrayList la: " + max);
    } 
}