package src;
import java.util.HashSet;
import java.util.Scanner;

public class Hash {
    public static void main(String[] args)  {
        String name;
        HashSet<String> hashSetString = new HashSet<>();
        Scanner scanner = new Scanner(System.in);

        // Them cac phan tu vao hashSetString
        hashSetString.add("Wilson");
        hashSetString.add("Smith");
        hashSetString.add("Nike");
        hashSetString.add("Adidas");
        hashSetString.add("Lenovo");
        hashSetString.add("Lenovo");

        // hien thi cac phan tu trong hashSetString
        System.out.println("Cac phan tu trong hashSetString la: ");
        System.out.println(hashSetString);
        System.out.println("Nhap phan tu can xoa: ");
        name = scanner.nextLine();
        // neu phan tu can xoa co ton tai hashSetString thi se thong bao xoa thanh cong
        // va hien thi cac phan tu con lai nguoc lai thong bao xoa khong thanh cong
        if (hashSetString.contains(name)) {
            hashSetString.remove(name);
            System.out.println("Da xoa phan tu " + name + " khoi hashSetString");
            System.out.println("Cac phan tu con lai trong hashSetString la: ");
            System.out.println(hashSetString);
        } else {
            System.out.println("Khong tim thay phan tu " + name + " trong hashSetString");
        }
    }
}
