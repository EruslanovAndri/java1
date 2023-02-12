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

package HW;

import HW.Unit.*;

public class Main{
    public static void main(String[] args) {
        Bandit bandit = new Bandit("Bob",1,100,100, true);
        System.out.println(bandit.getInfo());

        Crossbowman crossbowman = new Crossbowman("Max",1,90,120,25,35);
        System.out.println(crossbowman.getInfo());
        crossbowman.attack();


        Fermer fermer = new Fermer("Vik",1,75,120);
        System.out.println(fermer.getInfo());

        Monk monk = new Monk("Jack",1,99,200,45);
        System.out.println(monk.getInfo());

        Pikeman pikeman = new Pikeman("Piky",1,12,54,12);
        System.out.println(pikeman.getInfo());

        Sniper sniper = new Sniper("Goal",1,144,300,15);
        System.out.println(sniper.getInfo());


        Warlock warlock = new Warlock("John",1,36,123,33);
        System.out.println(warlock.getInfo());


    }

}
