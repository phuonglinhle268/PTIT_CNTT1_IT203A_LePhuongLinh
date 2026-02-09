package PTIT_CNTT1_IT203A_Session10.bai1;

public class Rectangle implements Shape{
    private double height;
    private double width;

    public Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
    }

    @Override
    public double getArea(){
        return width * height;
    }

    @Override
    public double getPerimeter(){
        return 2 * (width + height);
    }
}
