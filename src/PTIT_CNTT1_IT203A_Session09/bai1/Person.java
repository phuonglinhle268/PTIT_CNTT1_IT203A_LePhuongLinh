package PTIT_CNTT1_IT203A_Session09.bai1;

// bài 1
public class Person {
    private String fullname;
    private double age;

    public Person() {}

    public Person(String fullname, double age) {
        this.fullname = fullname;
        this.age = age;
    }

    public void display(){
        System.out.println("Tên: " + fullname);
        System.out.println("Tuổi: " + age);
    }
}

