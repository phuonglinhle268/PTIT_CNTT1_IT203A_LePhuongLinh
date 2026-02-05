package PTIT_CNTT1_IT203A_Session09.Demo;

import java.util.Scanner;

public class MammalAnimal extends Animal {
    private String foodType;
    private boolean isLiveWithHuman;
    private String mammalSound;

    public MammalAnimal() {
    }

    public MammalAnimal(String animalName, int numberOfLegs, String furColor, double averageLifeExpectancy, String foodType, boolean isLiveWithHuman, String mammalSound) {
        super(animalName, numberOfLegs, furColor, averageLifeExpectancy);
        this.foodType = foodType;
        this.isLiveWithHuman = isLiveWithHuman;
        this.mammalSound = mammalSound;
    }

    public String getFoodType() {
        return foodType;
    }

    public void setFoodType(String foodType) {
        this.foodType = foodType;
    }

    public boolean isLiveWithHuman() {
        return isLiveWithHuman;
    }

    public void setLiveWithHuman(boolean liveWithHuman) {
        isLiveWithHuman = liveWithHuman;
    }

    public String getMammalSound() {
        return mammalSound;
    }

    public void setMammalSound(String mammalSound) {
        this.mammalSound = mammalSound;
    }

    @Override
    public void input() {
        super.input();
        Scanner sc = new Scanner(System.in);

        System.out.print("Kiểu thức ăn: ");
        foodType = sc.nextLine();
        System.out.print("Có sống cùng con người không (true/false): ");
        isLiveWithHuman = Boolean.parseBoolean(sc.nextLine());
        System.out.print("Tiếng kêu: ");
        mammalSound = sc.nextLine();
    }

    // Override display
    @Override
    public void display() {
        super.display();

        System.out.println("Kiểu thức ăn: " + foodType);
        System.out.println("Sống cùng con người: " + isLiveWithHuman);
        System.out.println("Tiếng kêu: " + mammalSound);
    }
}
