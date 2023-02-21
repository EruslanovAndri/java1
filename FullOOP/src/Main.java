import Bandit.Bandit;
import Enumerats.Names;
import Farmer.Farmer;
import GameInterface.GameInterface;
import Magicians.Monk;
import Magicians.Warlock;
import Shooters.CrossBowMan;
import Shooters.Pikeman;
import Shooters.Sniper;
import SuperClass.Hero;

import javax.naming.Name;
import java.util.ArrayList;
import java.util.Random;

// HW number 3:
//В материалы добавил xml с полями и параметрами по умолчанию.
//Убедиться что у вас все поля описанны. Создать в основной программе два списка.
//Положить в них по 10 случайных персонажей. В первом только крестьянин, разбойник, снайпер или колдун.
//Во втором крестьянин, копейщик, арбалетчик, монах.
//Вывести в консоль информацию обо всех персонажах не зависимо от списка,
//очередь должна определяться скоростью каждого персонажа.
public class Main {
    public static void main(String[] args) {

        /**
         * Вывод всех на экран
         */
//        System.out.println("-----------------------------------------------------------------");
//        Hero hero1 = new Warlock(getName());
//        System.out.println(hero1.getInfo());
//        System.out.println("--------------");
//        Hero hero2 = new Monk(getName());
//        System.out.println(hero2.getInfo());
//        System.out.println("--------------");
//        Hero hero3 = new Sniper(getName());
//        System.out.println(hero3.getInfo());
//        System.out.println("--------------");
//        Hero hero4 = new CrossBowMan(getName());
//        System.out.println(hero4.getInfo());
//        System.out.println("--------------");
//        Hero hero5 = new Pikeman(getName());
//        System.out.println(hero5.getInfo());
//        System.out.println("--------------");
//        Hero hero6 = new Bandit(getName());
//        System.out.println(hero6.getInfo());
//        System.out.println("--------------");
//        Hero hero7 = new Farmer(getName());
//        System.out.println(hero7.getInfo());
//        System.out.println("--------------");
//        System.out.println("*******************");
//          Hero sniper = new Sniper(getName());
//        System.out.println(sniper.getInfo());
//        System.out.println("*******************");
//        System.out.println("*******************");
//        Hero XB = new CrossBowMan(getName());
//        System.out.println(XB.getInfo());
//        System.out.println("*******************");
//        Hero pik = new Pikeman(getName());
//        System.out.println(pik.getInfo());
//        System.out.println("*******************");
//        Hero monk = new Monk(getName());
//        System.out.println(monk.getInfo());
//        System.out.println("*******************");
//        Hero farmer = new Farmer(getName());
//        System.out.println(farmer.getInfo());
//        System.out.println("*******************");
//        Hero bandit = new Bandit(getName());
//        System.out.println(bandit.getInfo());
//        System.out.println("*******************");

        /**
         *  Конец вывода всех на экран
         */


        /**
         * Формирование списка со случайным выбором героев.
         */

//        ArrayList<Hero> heroList = new ArrayList<>();
//        int heroListSize = 10;
//        while (heroList.size() < heroListSize){
//            Integer rnd = new Random().nextInt(1,8);
//            switch (rnd){
//                case (1):
//                    heroList.add(new Warlock(getName()));
//                    break;
//                case (2):
//                    heroList.add(new Monk(getName()));
//                    break;
//                case (3):
//                    heroList.add(new Sniper(getName()));
//                    break;
//                case (4):
//                    heroList.add(new CrossBowMan(getName()));
//                    break;
//                case (5):
//                    heroList.add(new Pikeman(getName()));
//                    break;
//                case (6):
//                    heroList.add(new Bandit(getName()));
//                    break;
//                default:
//                    heroList.add(new Farmer(getName()));
//            }
//
//        }
//
//        for (int i = 0; i < heroList.size(); i++) {
//            System.out.println(heroList.get(i).getInfo());
//        }

//        END ------------------------------------------


        ArrayList<Hero> team1 = new ArrayList<>();
        ArrayList<Hero> team2 = new ArrayList<>();
        ArrayList<Hero> teams = new ArrayList<>();
        createTeam(team1,1,5);
        createTeam(team2,4,8);
        System.out.println("------------------Team1---------------");
        printTeam1(team1);
        System.out.println("------------------Team2----------------");
        printTeam2(team2);
        teams.addAll(team1);
        teams.addAll(team2);
        System.out.println("------------------Team-------------");
        printTeam(teams);
        sortTeam(teams);
        System.out.println("------------------Team sorted-------------");
        printTeam(teams);









    }

    static void createTeam(ArrayList list, int start, int end){
        int arraySize = 10;
        while (list.size() < arraySize){
            int rnd = new Random().nextInt(start,end);
            switch (rnd){
                case (1):
                    list.add(new Bandit(getName()));
                    break;
                case (2):
                    list.add(new Sniper(getName()));
                    break;
                case (3):
                    list.add(new Warlock(getName()));
                    break;
                case (4):
                    list.add(new Farmer(getName()));

                case (5):
                    list.add(new Pikeman(getName()));
                    break;
                case (6):
                    list.add(new CrossBowMan(getName()));
                    break;
                case (7):
                    list.add(new Monk(getName()));
                    break;
            }
        }

    }


    /**
     * Метод генерирующий случайное имя из списка Names.
     * @return возврящает имя для героя.
     */
     private static String getName(){
        String name = String.valueOf(Names.values()[new Random().nextInt(Names.values().length-1)]);
        return name;
    }

    static void  printTeam1(ArrayList<Hero> team1){
        for (int i = 0; i < team1.size(); i++) {
            System.out.println(team1.get(i).getInfo());
        }
    }
    static void printTeam2(ArrayList<Hero> team2){
        for (int i = 0; i < team2.size(); i++) {
            System.out.println(team2.get(i).getInfo());
        }
    }

    static void printTeam(ArrayList<Hero> teams){
        for (int i = 0; i < teams.size(); i++) {
            System.out.println(teams.get(i).getInfo());
        }

    }

    static void sortTeam(ArrayList<Hero> teams){
         teams.sort(((o1, o2) -> o1.getSpeed() - o2.getSpeed()));
    }

}
