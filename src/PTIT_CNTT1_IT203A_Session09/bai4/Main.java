package PTIT_CNTT1_IT203A_Session09.bai4;

public class Main {
    public static void main(String[] args) {
        Animal ani1 = new Dog();

        ani1.sound();

        // thử gọi phương thức riêng
        // lỗi compile-time không chạy được
        //ani1.foodType();

        if (ani1 instanceof Dog){
            Dog dog1 = (Dog) ani1;  // ép kiểu
            dog1.foodType();
        }
    }
}
