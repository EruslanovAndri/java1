package Unit;

public abstract class Magician extends Hero {

    private int magic;

    public Magician(String name, Float hp, int maxHp, int speed, int attack, int defence, int damage, int magic) {
        super(name, hp, maxHp, speed, attack, defence, damage);
        this.magic = magic;
        super.speed = speed;
        super.attack = attack;
        super.defence = defence;
        super.damage = damage;
    }

    public int getMagic() {
        return magic;
    }
}
