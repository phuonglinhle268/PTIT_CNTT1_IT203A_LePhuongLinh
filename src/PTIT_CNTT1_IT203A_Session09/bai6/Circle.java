package PTIT_CNTT1_IT203A_Session09.bai6;

public class Circle extends Shape{
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    //Overload constructor 2 (nhận, ktra đường kính)
    public Circle(double diameter, boolean isDiameter) {
        if (isDiameter) {
            this.radius = diameter / 2;
        }
    }

    @Override
    public double area() {          // OVERRIDING
        return Math.PI * radius * radius;
    }
}
