package ThucHanh_session11;

public class Coffee extends Drink{
    boolean hasMilk;

    public Coffee(int id, String name, double price, boolean hasMilk) {
        super(id, name, price);
        this.hasMilk = hasMilk;
    }

    @Override
    public void calculatePrice(){
        if (hasMilk == true){

        } else {

        }
    }

    @Override
    public void displayInfo(){
        System.out.println("Có sữa");
    }
}

