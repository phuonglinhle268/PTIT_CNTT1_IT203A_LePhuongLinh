package ThucHanh_session16;

public class ElectronicProduct extends Product {
    int warrantyMonths = 0;

    public ElectronicProduct(String id, String name, boolean price, int warrantyMonths) {
        super(id, name, price);
        this.warrantyMonths = warrantyMonths;
    }

    @Override
    double calculateFinalPrice(){
        if (warrantyMonths > 12) {
            return setPrice();
        }
        return price;
    }

    @Override
    void displayInfo(){
        System.out.println("Tháng bảo hành: " + warrantyMonths + " tháng");
    }

}
