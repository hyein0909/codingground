public class Character {
    
    String name;
    int hp;
    int atk;
    
    public Character(String name, int hp, int atk) {
        this.name = name;
        this.hp = hp;
        this.atk = atk;
    }
    
    public void attack(Character ch) {
        System.out.println(this.name + " attack!");
        ch.hp -= this.atk;
        System.out.println(this.name + " HP: "+ch.hp);
    }
    
    public boolean isAlive() {
        if (hp<=0) {
            return false;
        }
        else {
            return true;
        }
    }
}