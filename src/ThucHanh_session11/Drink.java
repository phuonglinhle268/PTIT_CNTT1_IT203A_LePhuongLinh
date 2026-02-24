package ThucHanh_session11;

public abstract class Drink {
    private String id;
    private String name;
    double price;

    public Drink(String id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public abstract double calculatePrice();

    public void displayInfo() {
        System.out.println("Mã: " + id);
        System.out.println("Tên: " + name);
        System.out.println("Giá: " + price);
    }
}

