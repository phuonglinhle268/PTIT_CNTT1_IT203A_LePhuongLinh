package PTIT_CNTT1_IT203A_Session15.Bai2;

public class Patient {
    String id;
    String name;
    int age;

    public Patient(String id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return id + " - " + name + " - " + age + " tuổi";
    }
}
