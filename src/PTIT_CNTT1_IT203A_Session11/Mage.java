package PTIT_CNTT1_IT203A_Session11;

public class Mage extends GameCharacter implements ISkill{
    private int mana;  //  Năng lượng phép thuật

    public Mage(String name, int hp, int attackPower, int mana) {
        super(name, hp, attackPower);
        this.mana = mana;
    }

    public int getMana() {
        return mana;
    }

    @Override
    public void attack(GameCharacter target){
        int damage;

        if (mana >= 5){
            damage = attackPower;
            mana -= 5;
            System.out.println("Mage: " + name + " tấn công (- 5 mana)");
        } else {
            damage = attackPower / 2;
            System.out.println("Mage: " + name + " sắp hết mana");
        }
        target.takeDamage(damage);
    }

    @Override
    public void  useUltimate(GameCharacter target){
        if (mana < 50){
            System.out.println(name + " không đủ mama");
            return;
        }
        System.out.println(name + " sử dụng Hỏa Cầu");
        mana -= 50;
        target.takeDamage(attackPower * 3);
    }

    @Override
    public void displayInfo() {
        System.out.println("Tên: " + name + " | HP: " + hp + " | Mana: " + mana);
    }
}
