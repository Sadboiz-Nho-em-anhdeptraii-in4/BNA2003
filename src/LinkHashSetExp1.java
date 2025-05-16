package src;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class LinkHashSetExp1 {
    public static void main(String[] args) {
        // Khởi tạo một LinkedHashSet
        Set<String> linkedHashSet = new LinkedHashSet<>();

        // Thêm các phần tử vào LinkedHashSet
        linkedHashSet.add("Apple");
        linkedHashSet.add("Banana");
        linkedHashSet.add("Cherry");
        linkedHashSet.add("Date");

        // In ra các phần tử trong LinkedHashSet
        for (String str : linkedHashSet) {
            System.out.println(str);
        }

        // Nhap phan tu can xoa
        Scanner scanner = new Scanner(System.in);
        String itemToRemove = scanner.nextLine();

        // Xoa phan tu va kiem tra ket qua
        if (linkedHashSet.remove(itemToRemove)) {
            System.out.println("Phan tu " + itemToRemove + " da duoc xoa.");
        } else {
            System.out.println("Phan tu " + itemToRemove + " khong ton tai trong LinkedHashSet.");
        }

        // In lai LinkedHashSet sau khi xoa
        System.out.println("LinkedHashSet sau khi xoa:");
        for (String str : linkedHashSet) {
            System.out.println(str);
        }
    }
}
