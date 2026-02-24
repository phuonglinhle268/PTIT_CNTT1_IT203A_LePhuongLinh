package ThucHanh_session11;

public class Coffee extends Drink {
    boolean hasMilk;

    public Coffee(String id, String name, double price, boolean hasMilk) {
        super(id, name, price);
        this.hasMilk = hasMilk;
    }

    @Override
    public double calculatePrice() {
        if (hasMilk) return price + 5000;
        return price;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println( hasMilk ? "Có sữa" : "Đen đá");
    }
}

