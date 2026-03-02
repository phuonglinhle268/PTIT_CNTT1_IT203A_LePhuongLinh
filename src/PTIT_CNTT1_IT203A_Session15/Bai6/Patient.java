package PTIT_CNTT1_IT203A_Session15.Bai6;

public class Patient {
    String id;
    String name;
    int age;
    String gender;

    public Patient(String id, String name, int age, String gender) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
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

    public String getGender() {
        return gender;
    }

    @Override
    public String toString() {
        return id + " . " + name + " - " + gender + " - " + age;
    }
}
