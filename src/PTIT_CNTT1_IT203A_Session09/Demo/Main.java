package PTIT_CNTT1_IT203A_Session09.Demo;

public class Main {
    public static void main(String[] args) {

        System.out.println("=== NHẬP THÔNG TIN CHO BIRD ===");
        Bird b = new Bird();
        b.input();
        System.out.println("\n=== HIỂN THỊ THÔNG TIN BIRD ===");
        b.display();

        System.out.println("\n=== NHẬP THÔNG TIN CHO MAMAL ANIMAL ===");
        MammalAnimal m = new MammalAnimal();
        m.input();
        System.out.println("\n=== HIỂN THỊ THÔNG TIN MAMAL ANIMAL ===");
        m.display();
    }
}
