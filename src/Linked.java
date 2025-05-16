package src;
import java.util.LinkedList;

public class Linked {
    public static void main(String[] args) {
        
        // Khai báo 1 LinkedList co ten la List
        // Co kieu la String
        LinkedList<String> list = new LinkedList<String>();

        // Thêm các phần tử vào LinkedList
        list.add("Java");
        list.add("Python");
        list.add("C++");
        list.add("PHP");

        System.out.println("Vi du su dung phuong thuc addAll() ");
        System.out.println("..........................");

        // them cac phan tu vao LinkedListA
        LinkedList<String> listA = new LinkedList<String>();
        listA.addAll(list);
        System.out.println("ListA");
        showList(listA);

        System.out.println("\nVí dụ sử dụng phương thức retainAll()");
        System.out.println("-------------------------------------");

        // khởi tạo listB
        LinkedList<String> listB = new LinkedList<String>();
        listB.add("Java");

        // xóa những phần tử không thuộc listB khỏi listA
        listA.retainAll(listB);
        System.out.print("listA:");
        showList(listA);

        System.out.println("\nVí dụ sử dụng phương thức removeAll()");
        System.out.println("-------------------------------------");

        // xóa những phần tử thuộc listB khỏi list
        list.removeAll(listB);
        System.out.print("list:");
        showList(list);
    }

        // phương thức showList
    public static void showList(LinkedList<String> list) {
        // Show list through for-each
        for (String obj : list) {
            System.out.print("\t" + obj + ", ");
        }
        System.out.println();
    }
}