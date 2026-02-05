package PTIT_CNTT1_IT203A_Session09.Demo;

import java.util.Scanner;

public class Bird extends Animal {
    private boolean isFly;
    private String birdSound;

    public Bird() {
        super();
    }

    public Bird(String animalName, int numberOfLegs, String furColor, double averageLifeExpectancy, boolean isFly, String birdSound) {
        super(animalName, numberOfLegs, furColor, averageLifeExpectancy);
        this.isFly = isFly;
        this.birdSound = birdSound;
    }

    public boolean isFly() {
        return isFly;
    }

    public void setFly(boolean fly) {
        isFly = fly;
    }

    public String getBirdSound() {
        return birdSound;
    }

    public void setBirdSound(String birdSound) {
        this.birdSound = birdSound;
    }

    @Override
    public void input() {
        super.input();  // gọi input lớp cha
        Scanner sc = new Scanner(System.in);

        System.out.print("Có bay được không (true/false): ");
        isFly = Boolean.parseBoolean(sc.nextLine());
        System.out.print("Tiếng hót: ");
        birdSound = sc.nextLine();
    }

    // Override display
    @Override
    public void display() {
        super.display();

        System.out.println("Có bay được không: " + isFly);
        System.out.println("Tiếng hót: " + birdSound);
    }
}
