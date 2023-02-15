package S8;

public abstract class Archer extends Man{


    int shots,maxShots;
    float dist;
    String name;

    public Archer(float hp, int maxHp, int damage, int att, int def, int shots, int maxShots, float dist) {
        super(hp, maxHp, damage, att, def);
        this.shots = shots;
        this.maxShots = maxShots;
        this.dist = dist;
    }

    public float getDist() {
        return dist;
    }
}
