package ThucHanh_session16;

public abstract class Product {
    private String id;
    private String name;
    private boolean price;

    public Product(String id, String name, boolean price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(boolean price) {
        this.price = price;
    }

    abstract double calculateFinalPrice();

    void displayInfo(){
        System.out.println("Mã sản phẩm: " + id);
        System.out.println("Tên sản phẩm: " + name);
        System.out.println("Giá: " + price);
    }
}
