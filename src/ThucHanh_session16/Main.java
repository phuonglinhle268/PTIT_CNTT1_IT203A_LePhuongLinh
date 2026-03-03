package ThucHanh_session16;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        ProductRepository repo = new ProductRepository();

        // Thêm 4 sản phẩm
        repo.add(new ElectronicProduct("ep1", "Laptop", 25000000, 24));
        repo.add(new ElectronicProduct("ep2", "Tai nghe", 800000, 6));
        repo.add(new FoodProduct("fp1", "Bánh", 40000, 10));
        repo.add(new FoodProduct("fp2", "Kẹo", 20000, 5));


        System.out.println("Danh sách sản phẩm");
        for (Product p : repo.findAll()) {
            p.displayInfo();
            System.out.println("Thành tiền: " + p.calculateFinalPrice());
        }

        //tìm theo id sản phẩm 1
        System.out.println("\n");
        Product found = repo.findById("ep1");
        if (found != null) {
            found.displayInfo();
            System.out.println("Thành tiền: " + found.calculateFinalPrice());
        } else {
            System.out.println("Không tìm thấy");
        }

        // Sắp xếp theo giá tăng dần
        System.out.println("\nSắp xếp giá tăng dần");
        List<Product> sortedList = repo.findAll();
        Collections.sort(sortedList, new Comparator<Product>() {
            @Override
            public int compare(Product a, Product b) {
                return Double.compare(a.getPrice(), b.getPrice());
            }
        });

        for (Product p : sortedList) {
            System.out.println(p.getId() + " - " + p.getName() + " - " + p.getPrice());
        }

        // thống kê
        System.out.println("\nThống kê");
        Map<String, Integer> stats = new HashMap<>();
        stats.put("Electronic", 0);
        stats.put("Food", 0);

        for (Product p : repo.findAll()) {
            if (p instanceof ElectronicProduct)
                stats.put("Electronic", stats.get("Electronic") + 1);
            else if (p instanceof FoodProduct)
                stats.put("Food", stats.get("Food") + 1);
        }

        System.out.println(stats);
    }
}
