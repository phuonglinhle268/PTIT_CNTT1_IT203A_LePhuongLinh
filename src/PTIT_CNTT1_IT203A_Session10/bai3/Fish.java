package PTIT_CNTT1_IT203A_Session10.bai3;

public class Fish extends Animal implements Swimmable{
    public Fish(String name) {
        super(name);
    }

    @Override
    public void swim(){
        System.out.println(name + " chỉ có thể bơi");
    }
}
