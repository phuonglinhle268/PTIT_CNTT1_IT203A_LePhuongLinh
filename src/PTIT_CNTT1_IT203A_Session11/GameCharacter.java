package PTIT_CNTT1_IT203A_Session11;

public abstract class GameCharacter {
    String name;
    int hp;  // máu hiện tại
    int attackPower;// sức tấn công cơ bản

    public static int count = 0; // đếm số lượng nv đã tạo

    public GameCharacter(String name, int hp, int attackPower) {
        this.name = name;
        this.hp = hp;
        this.attackPower = attackPower;
        count++;         // Tự động tăng mỗi khi một nhân vật được khởi tạo
    }

    public String getName() {
        return name;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

   public abstract void attack(GameCharacter target);


//    Logic nhận sát thương takeDamage(int damage):
//    HP mới = HP cũ − sát thương nhận vào
//    Nếu HP ≤ 0 → in ra:
    public void takeDamage(int amount){
        hp -= amount;
        if (hp <= 0){
            hp = 0;
            System.out.println(name + " đã bị hạ gục");
        }
    }

    public void displayInfo(){
        System.out.println("Tên: " + name + " | HP: " + hp);
    }
}
