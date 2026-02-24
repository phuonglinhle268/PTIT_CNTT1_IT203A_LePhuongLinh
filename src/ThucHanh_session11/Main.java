package ThucHanh_session11;

public class Main {
    public static void main(String[] args) {
        Drink[] drinks = new Drink[3];

        drinks[0] = new Coffee(1, "Bạc Xỉu", 30000, true);
        drinks[1] = new FruitJuice(2, "Nước cam", 40000, 10);
        drinks[2] = null;

        for(Drink d : drinks){
            if (d != null) {
                d.displayInfo();
            }
        }
    }
}
