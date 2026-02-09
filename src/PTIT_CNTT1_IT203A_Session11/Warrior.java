package PTIT_CNTT1_IT203A_Session11;

public class Warrior extends GameCharacter implements ISkill{
    private int armor; //(giáp - giảm sát thương nhận vào).

    public Warrior(String name, int hp, int attackPower, int armor) {
        super(name, hp, attackPower);
        this.armor = armor;
    }

    public int getArmor() {
        return armor;
    }

    @Override
    public void attack(GameCharacter target){
        System.out.println("Warrior: " + name + " tấn công " + target.getName());
        target.takeDamage(attackPower);
    }

    @Override
    public void takeDamage(int damage){
        int realDamage = damage - armor;
        if (realDamage < 0) realDamage = 0;
        hp -= realDamage;

        System.out.println(name + " nhận " + realDamage + " sát thương thực tế");

        if (hp <= 0) {
            hp = 0;
            System.out.println(name + " bị hạ gục");
        }
    }

    @Override
    public void useUltimate(GameCharacter target){
        System.out.println(name + " dùng chiêu cuối: Đấm ngàn cân!");
        target.takeDamage(attackPower * 2);

        int lostHP = (int)(hp * 0.1);
        hp -= lostHP;
        System.out.println(name + " mất " + lostHP + " HP");
    }

    @Override
    public void displayInfo(){
        System.out.println("Tên: " + name + " | HP: " + hp + " | Giáp: " + armor);
    }
}
