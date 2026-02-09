package PTIT_CNTT1_IT203A_Session10.bai2;

public class Main {
    public static void main(String[] args) {
        Vehicle car = new Car("Xe ô tô");
        Vehicle bicycle = new Bicycle("Xe đạp");

        System.out.print(car.brand + "- Cách di chuyển: ");
        car.move();
        System.out.print(bicycle.brand + "- Cách di chuyển: ");
        bicycle.move();
    }



}
