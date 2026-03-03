package ThucHanh_session16;

public class FoodProduct extends Product {
    int discountPercent = 0;

    public FoodProduct(String id, String name, boolean price, int discountPercent) {
        super(id, name, price);
        this.discountPercent = discountPercent;
    }

    @Override
    double calculateFinalPrice(){
        return price - (price * discountPercent / 100);
    }

    @Override
    void displayInfo(){
        System.out.println("Giảm giá: " + discountPercent);
    }
}
