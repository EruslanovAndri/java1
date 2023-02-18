package HW.Unit;

import HW.Unit.SuperClass.Hero;

/**
 * Класс крестьянин
 */
public class Farmer extends Hero {


    Integer help;

    public Farmer(String name, Integer level, Float hp, Integer maxHp, Integer speed) {
        super(name, level, hp, maxHp, speed);
    }


    public Farmer(String name){
        super(name,1,20.1f,20,5);
        super.name = name;
        this.help = 4;
    }

    @Override
    public String getInfo(){
        return String.format("Фермер: %s \t Help: %d \tSpeed: %s ",super.getInfo(),this.help,super.speed);
    }


    @Override
    public void step() {
        int help = getHelp();
        if(help>0){
            setHelp(help-1);
        }
    }

    public Integer getHelp() {
        return help;
    }

    public void setHelp(Integer help) {
        this.help = help;
    }
}
