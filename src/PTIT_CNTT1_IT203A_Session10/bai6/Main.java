package PTIT_CNTT1_IT203A_Session10.bai6;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


public class Main {
    public static void main(String[] args) {

        List<Product> products = new ArrayList<>();
        products.add(new Product(25000, "Banana"));
        products.add(new Product(30000, "Apple"));
        products.add(new Product(20000, "Orange"));

        // 1. giá tăng dần → anonymous class
        // Không dùng lambda vì
        // Vì đôi khi chúng ta cần thêm biến, phương thức phụ hoặc trạng thái bên trong comparator.
        // Lambda KHÔNG cho phép khai báo thêm thuộc tính như một class thực sự.
        // Anonymous Class thì cho phép.
        Collections.sort(products, new Comparator<Product>() {
            // Ví dụ thêm biến nội bộ (lambda KHÔNG làm được)
            private int compareCount = 0;

            @Override
            public int compare(Product p1, Product p2) {
                compareCount++;  // sử dụng biến nội bộ
                return Double.compare(p1.getPrice(), p2.getPrice());
            }
        });

        System.out.println("Sắp xếp theo giá tăng dần");
        products.forEach(System.out::println);

        // 2. tên a->z → lambda expression
        // Lambda dùng được khi logic đơn giản và KHÔNG cần thêm thuộc tính/phương thức bên trong.
        products.sort((p1, p2) -> p1.getName().compareTo(p2.getName()));

        System.out.println("\nSắp xếp theo tên");
        products.forEach(System.out::println);
    }
}
