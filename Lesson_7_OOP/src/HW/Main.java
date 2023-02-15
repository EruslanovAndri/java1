// HW 1
//1.Крестьянин,
//2. разбойник,
//3. снайпер,
//4. колдун,
//5. копейщик,
//6. арбалетчик,
//7. монах.
//Для каждого сформировать список свойств и возможных действий.
//Напрнимер свойство скорость, действие нанести удар.
//Проанализировать получившиеся свойства и действия персонажей и создать
//Обобщённый класс описывающий свойства и действия имеющиеся у всех персонажей.
//Создать этот класс. Создать классы для каждого типа персонажей наследующие
//и расширяющие абстрактный(обобщённый) класс.
//В основной программе создать по одному экземпляру каждого типа персонажей.

// HW 2
//Доработать дерево классов так, чтобы экземпляры классов создавались конструктором
//с именем в параметре а остальные параметры инициализировали сами в зависимости от персонажа.
//Добавить файл интерфейса в котором описать два метода, void step(); и String getInfo();
//Добавить реализацию интерфейса в ваш коренной абстрактный класс. Переопределить getInfo так,
//чтобы он возвращал строки:"Я крестьянин", "Я снайпер" и так далее в зависимости от типа персонажа.
//В основном классе создать список и добавить в него 10 случаных персонажей.
//Пройти по списку и вывести строку возвращаемую getInfo.




package HW;

import HW.Unit.*;

import java.util.Random;

public class Main{
    public static void main(String[] args) {
        Monk monk = new Monk(getName());
        System.out.println(monk.getInfo());

        Warlock warlock = new Warlock(getName());
        System.out.println(warlock.getInfo());

        CrossBowMan crossBowMan = new CrossBowMan(getName());
        System.out.println(crossBowMan.getInfo());

        Sniper sniper = new Sniper(getName());
        System.out.println(sniper.getInfo());

        Bandit bandit = new Bandit(getName());
        System.out.println(bandit.getInfo());

        Farmer farmer =  new Farmer(getName());
        System.out.println(farmer.getInfo());

        Pikeman pikeman = new Pikeman(getName());
        System.out.println(pikeman.getInfo());
    }

    private static String getName(){
        String name = String.valueOf(Names.values()[new Random().nextInt(Names.values().length-1)]);
        return name;
    }
}
