package PTIT_CNTT1_IT203A_Session11;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== ARENA OF HEROES ===");

        GameCharacter[] characters = new GameCharacter[3];

        characters[0] = new Warrior("Yasuo", 500, 50, 20);
        characters[1] = new Mage("Veigar", 350, 40, 200);

        // Anonymous Class tạo Goblin
        characters[2] = new GameCharacter("Goblin", 100, 10) {
            @Override
            public void attack(GameCharacter target) {
                System.out.println("Goblin cắn trộm " + target.getName() + "...");
                target.takeDamage(10);
            }
        };

        System.out.println("\nĐã khởi tạo " + GameCharacter.count + " nhân vật.\n");

        // giả lập trận đấu
        characters[0].attack(characters[2]);     // Warrior → Goblin
        ((Mage)characters[1]).useUltimate(characters[0]); // Mage → Warrior
        characters[2].attack(characters[1]);     // Goblin → Mage

        // hiện
        System.out.println("\nThông số sau trận đấu");
        for (GameCharacter c : characters) {
            if (c != null) c.displayInfo();
        }
    }
}
