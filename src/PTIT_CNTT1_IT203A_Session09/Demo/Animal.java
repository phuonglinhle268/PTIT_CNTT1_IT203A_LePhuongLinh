package PTIT_CNTT1_IT203A_Session09.Demo;

import java.util.Scanner;

public class Animal {
    protected String animalName;
    protected int numberOfLegs;
    protected String furColor;
    protected double averageLifeExpectancy;

    public Animal() {
    }

    public Animal(String animalName, int numberOfLegs, String furColor, double averageLifeExpectancy) {
        this.animalName = animalName;
        this.numberOfLegs = numberOfLegs;
        this.furColor = furColor;
        this.averageLifeExpectancy = averageLifeExpectancy;
    }

    public String getAnimalName() {
        return animalName;
    }

    public void setAnimalName(String animalName) {
        this.animalName = animalName;
    }

    public int getNumberOfLegs() {
        return numberOfLegs;
    }

    public void setNumberOfLegs(int numberOfLegs) {
        this.numberOfLegs = numberOfLegs;
    }

    public String getFurColor() {
        return furColor;
    }

    public void setFurColor(String furColor) {
        this.furColor = furColor;
    }

    public double getAverageLifeExpectancy() {
        return averageLifeExpectancy;
    }

    public void setAverageLifeExpectancy(double averageLifeExpectancy) {
        this.averageLifeExpectancy = averageLifeExpectancy;
    }

    public void input() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập tên động vật: ");
        animalName = sc.nextLine();
        System.out.print("Nhập số chân: ");
        numberOfLegs = Integer.parseInt(sc.nextLine());
        System.out.print("Nhập màu lông: ");
        furColor = sc.nextLine();
        System.out.print("Nhập tuổi thọ trung bình: ");
        averageLifeExpectancy = Double.parseDouble(sc.nextLine());
    }

    public void display() {
        System.out.println("Tên động vật: " + animalName);
        System.out.println("Số chân: " + numberOfLegs);
        System.out.println("Màu lông: " + furColor);
        System.out.println("Tuổi thọ trung bình: " + averageLifeExpectancy);
    }
}
