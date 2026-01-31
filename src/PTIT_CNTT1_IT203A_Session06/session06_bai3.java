package PTIT_CNTT1_IT203A_Session06;

public class session06_bai3 {
    public static void main(String[] args) {
        Product product1 = new Product("sp01", "Laptop", 1000000);

        System.out.println("Thông tin sản phẩm");
        product1.productInfo();

        System.out.println("Set giá mới"); // lỗi
        product1.setPrice(-10);
        System.out.println("Thông tin mới");
        product1.productInfo();
    }
}
