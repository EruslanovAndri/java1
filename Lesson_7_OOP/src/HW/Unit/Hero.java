package HW.Unit;

/**
 * Общий класс
 */
public class Hero {

   protected String name;
   protected Integer level;
   protected Integer hp;
   protected Integer maxHp;

    /**
     * Конструктор общего класса.
     * @param name
     * @param level
     * @param hp
     * @param maxHp
     */
    public Hero(String name, Integer level, Integer hp, Integer maxHp) {
        this.name = name;
        this.level = level;
        this.hp = hp;
        this.maxHp = maxHp;
    }

    /**
     * Методы в классе Hero возвращающие поля класса.
     * @return
     */
    public String getName(){
        return name;
    }

    public Integer getLevel(){
        return level;
    }

    public Integer getHp(){
        return hp;
    }

    public Integer getMaxHp(){
        return maxHp;
    }

    /**
     * Переопределение базового метода toString под свою задачу.
     * @return
     */
    @Override
    public String toString(){
        return getInfo();
    }

    public String  getInfo(){
        return String.format("Name: %s Level: %d HP: %d MaxHp: %d",this.name,
                this.level,this.hp,this.maxHp);
    }

}
