package PTIT_CNTT1_IT203A_Session06;

// bài 3
public class Product {
    private String productID;
    private String productName;
    private double price;

    public Product(String productID, String productName, double price){
        this.productID = productID;
        this.productName = productName;
        setPrice(price);
    }

    public String getProductID(){
        return productID;
    }
    public String getProductName(){
        return productName;
    }
    public double getPrice(){
        return price;
    }

    public void setPrice(double price) {
        if(price > 0){
            this.price = price;
        } else {
            System.out.println("Giá bán không hợp lệ");
        }
    }

    public void productInfo(){
        System.out.println("Mã sản phẩm: " + productID);
        System.out.println("Tên sản phẩm: " + productName);
        System.out.println("Giá bán: " + price);
    }
}
