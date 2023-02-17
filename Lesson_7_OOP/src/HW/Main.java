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
import HW.Unit.Enumerator.Names;
import HW.Unit.Magicains.Monk;
import HW.Unit.Magicains.Warlock;
import HW.Unit.Shooters.CrossBowMan;
import HW.Unit.Shooters.Pikeman;
import HW.Unit.Shooters.Sniper;
import HW.Unit.SuperClass.Hero;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Random;

public class Main{
    public static void main(String[] args) {

        ArrayList<Hero> team1 = new ArrayList<>();
        ArrayList<Hero> team2 = new ArrayList<>();
        ArrayList<Hero> teams = new ArrayList<>();
        createTeam(team1,1,5);
        createTeam(team2,5,8);
        teams.addAll(team1);
        teams.addAll(team2);



        teams.sort(new Comparator<Hero>() {
            @Override
            public int compare(Hero o1, Hero o2) {
                return o1.getSpeed() - o2.getSpeed();
            }
        });

        for (int i = 0; i < teams.size(); i++) {
            System.out.println(teams.get(i).getInfo());
        }

//        System.out.println(team1);
//        System.out.println(team2);
//        Monk monk = new Monk(getName());
//        System.out.println(monk.getInfo());
//
//
//        Warlock warlock = new Warlock(getName());
//        System.out.println(warlock.getInfo());
//
//        CrossBowMan crossBowMan = new CrossBowMan(getName());
//        System.out.println(crossBowMan.getInfo());
//
//        Sniper sniper = new Sniper(getName());
//        System.out.println(sniper.getInfo());
//
//        Bandit bandit = new Bandit(getName());
//        System.out.println(bandit.getInfo());
//
//        Farmer farmer =  new Farmer(getName());
//        System.out.println(farmer.getInfo());
//
//        Pikeman pikeman = new Pikeman(getName());
//        System.out.println(pikeman.getInfo());

        ArrayList<Hero> list = new ArrayList<Hero>();
        Random rnd = new Random();
        int array_size = 10;
        while (list.size() < array_size){
            Integer r = rnd.nextInt(1,8);
            switch (r){
                case (1):
                    list.add(new Monk(getName()));
                    break;
                case (2):
                    list.add(new Warlock(getName()));
                    break;
                case (3):
                    list.add(new CrossBowMan(getName()));
                    break;
                case (4):
                    list.add(new Sniper(getName()));
                    break;
                case (5):
                    list.add(new Bandit(getName()));
                    break;
                case (6):
                    list.add(new Farmer(getName()));
                    break;
                default:
                    list.add(new Pikeman(getName()));
                    break;
            }
        }
//        System.out.println("------------------------------------------------");
//        for (int i = 0; i < list.size(); i++) {
//            System.out.println(list.get(i).getInfo());
//        }


    }

    public  static void createTeam(ArrayList targetList , int start , int end ){
        int array_size = 10;
        Random rnd = new Random();
        while (targetList.size() < array_size){
            int r = rnd.nextInt(start,end);
            switch (r){
                case (1):
                    targetList.add(new Bandit(getName()));
                    break;
                case (2):
                    targetList.add(new Sniper(getName()));
                    break;
                case (3):
                    targetList.add(new Warlock(getName()));
                    break;
                case (4):
                    targetList.add(new Farmer(getName()));

                case (5):
                    targetList.add(new Pikeman(getName()));
                    break;
                case (6):
                    targetList.add(new CrossBowMan(getName()));
                    break;
                case (7):
                    targetList.add(new Monk(getName()));
                    break;
            }


            // Сделать два списка 1 Крестьянин	Разбойник	Снайпер	Колдун
            // 2 крестьянин копейщик	арбалетчик	монах

        }
    }

    private static String getName(){
        String name = String.valueOf(Names.values()[new Random().nextInt(Names.values().length-1)]);
        return name;
    }

}
