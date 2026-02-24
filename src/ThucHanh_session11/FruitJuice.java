package ThucHanh_session11;

public class FruitJuice extends Drink implements IMixable{
    int discountPercent;

    public FruitJuice(int id, String name, double price, int discountPercent) {
        super(id, name, price);
        this.discountPercent = discountPercent;
    }

    @Override
    public void calculatePrice(){

    }

    @Override
    public void mix(){
        System.out.println("Đang ép trái cây tươi");
    }
}
