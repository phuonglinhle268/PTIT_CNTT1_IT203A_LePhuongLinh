package PTIT_CNTT1_IT203A_Session09.bai6;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Shape> list = new ArrayList<>();

        list.add(new Circle(3));                // bán kính
        list.add(new Circle(10, true));         // đường kính
        list.add(new Rectangle(4, 6));

        double totalArea = 0;

        for (Shape s : list) {
            System.out.println("\nDiện tích = " + s.area());
            totalArea += s.area();
        }

        System.out.println("\nTổng diện tích = " + totalArea);
    }
}
