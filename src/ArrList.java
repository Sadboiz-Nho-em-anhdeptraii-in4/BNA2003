package src;
import java.util.ArrayList;

public class ArrList {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Black");
        colors.add("White");
        colors.add("Pink");
        colors.add("Yellow");

        System.out.println(colors.get(1));
        System.out.println(colors.contains("Red"));
        System.out.println(colors.size());
        System.out.println(colors);
    }
}
