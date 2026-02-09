package PTIT_CNTT1_IT203A_Session10.bai3;

public class Main {
    public static void main(String[] args) {
        Duck duck = new Duck("Vịt");
        Fish fish = new Fish("Cá");

        duck.swim();
        duck.fly();

        fish.swim();
        //lỗi khi fish.fly()
    }
}
