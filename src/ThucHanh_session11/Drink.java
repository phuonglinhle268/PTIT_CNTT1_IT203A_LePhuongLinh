package ThucHanh_session11;

public abstract class Drink {
    private int id;
    private String name;
    private double price;

    public Drink(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public abstract void calculatePrice();

    public void displayInfo(){
        System.out.println("Mã: "+ id);
        System.out.println("Tên: " + name);
        System.out.println("Giá gốc: " + price);
    }


}


