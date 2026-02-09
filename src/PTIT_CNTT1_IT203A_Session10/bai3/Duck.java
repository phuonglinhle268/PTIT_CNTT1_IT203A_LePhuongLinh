package PTIT_CNTT1_IT203A_Session10.bai3;

public class Duck extends Animal implements Swimmable, Flyable{
    public Duck(String name) {
        super(name);
    }

    @Override
    public void swim(){
        System.out.println(name + " có thể bơi");
    }

    @Override
    public void fly(){
        System.out.println(name + " có thể bay");
    }
}
