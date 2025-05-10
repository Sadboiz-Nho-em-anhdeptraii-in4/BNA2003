import java.util.Scanner;

public class TinhTongNhoHon100 {
  public static void main(String[] args) {
    int number, sum = 0;
    try (Scanner scanner = new Scanner(System.in)) {
      do {
       System.out.println("Nhập vào số nguyên bất kỳ: ");
         number = scanner.nextInt();
         sum += number;//sum = sum + number;
  } while (sum < 100);
    }      
    System.out.println("Tổng các số nguyên vừa nhập = "+sum);
    } }
