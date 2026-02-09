package PTIT_CNTT1_IT203A_Session10.bai1;

public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle(3);
        Shape rectangle = new Rectangle(6, 2);

        System.out.println("Diện tích hình tròn: " + circle.getArea());
        System.out.println("Chu vi hình tròn: " + circle.getPerimeter());

        System.out.println("\nDiện tích hình chữ nhật: " + rectangle.getArea());
        System.out.println("Chu vi hình chữ nhật: " + rectangle.getPerimeter());
    }
}
