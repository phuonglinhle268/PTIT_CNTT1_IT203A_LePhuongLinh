package PTIT_CNTT1_IT203A_Session09.bai6;

public class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    // Overload method: cùng tên, khác tham số (compile-time)
    public double area(double width, double height) {
        return width * height;
    }

    @Override
    public double area() {      // OVERRIDING (runtime)
        return width * height;
    }
}
