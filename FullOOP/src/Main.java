import Unit.*;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Random;
import java.util.Scanner;

// HW number 3:
//В материалы добавил xml с полями и параметрами по умолчанию.
//Убедиться что у вас все поля описанны. Создать в основной программе два списка.
//Положить в них по 10 случайных персонажей. В первом только крестьянин, разбойник, снайпер или колдун.
//Во втором крестьянин, копейщик, арбалетчик, монах.
//Вывести в консоль информацию обо всех персонажах не зависимо от списка,
//очередь должна определяться скоростью каждого персонажа.


// HW number 4:

// 1. Создать класс с описанием координат, x и y.
// 2. Добавить в абстрактный класс порле с координатами и пробросить
// его инициализацию до конструкторов персонажей. Farmer farmer = new Farmer(getName(), x, y);
// 3. Реализовать метод step() лучников.
// 3.1 Если жизнь равна нулю или стрел нет, завершить оьработку.
// 3.2 Поиск среди противников наиболее приближённого.
// 3.3 Нанести среднее повреждение найденному противнику.
// 3.4 Найти среди своих крестьянина.
// 3.5 Если найден завершить метод иначе уменьшить запас стрел на одну.
// Пункты 1, 2 и 3.2 рещены на семинаре ими можно воспользоваться!
public class Main {
    static final int UNITS = 10;
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
        Scanner user_input = new Scanner(System.in);
        String game = "";
        int i = 0;
        createTeam(team1, 1, 5, 1);
        createTeam(team2, 4, 8, 10);
//        System.out.println("------------------Team1---------------");
//        printTeam1(team1);
//        System.out.println("------------------Team2----------------");
//        printTeam2(team2);
        teams.addAll(team1);
        teams.addAll(team2);
//        System.out.println("------------------Team-------------");
//        printTeam(teams);

        sortTeam(teams);
        System.out.println("------------------Team sorted-------------");
        printTeam(teams);


        while (game == ""){
            if(Hero.findLive(team1).size() != 0 && Hero.findLive(team2).size() != 0){
                sortTeam(team1);
                sortTeam(team2);
                printTeam(team1);
                printTeam(team2);
                for (Hero hero : teams){
                    if(team1.contains(hero)){
                        hero.step(Hero.findLive(team1),Hero.findLive(team2));
               }
                    else {
                        hero.step(Hero.findLive(team2),Hero.findLive(team1));
                    }



                }
                game = user_input.nextLine();
            }
            else {
                winner(team1,team2);
                break;
            }

        }

    }

    static void createTeam(ArrayList list, int start, int end, int posY) {
        for (int i = 0; i < UNITS; i++) {
            int rnd = new Random().nextInt(start, end);
            switch (rnd) {
                case (1):
                    list.add(new Sniper(getName(), new Vector2D(i + 1, posY)));
                    break;
                case (2):
                    list.add(new Bandit(getName(), new Vector2D(i + 1, posY)));
                    break;
                case (3):
                    list.add(new Warlock(getName(), new Vector2D(i + 1, posY)));
                    break;
                case (4):
                    list.add(new Farmer(getName(), new Vector2D(i + 1, posY)));
                    break;
                case (5):
                    list.add(new CrossBowMan(getName(), new Vector2D(i + 1, posY)));
                    break;
                case (6):
                    list.add(new Monk(getName(), new Vector2D(i + 1, posY)));
                    break;
                case (7):
                    list.add(new Pikeman(getName(), new Vector2D(i + 1, posY)));
                    break;
            }
        }


    }




    /**
     * Метод генерирующий случайное имя из списка Names.
     *
     * @return возврящает имя для героя.
     */
    private static String getName() {
        String name = String.valueOf(Names.values()[new Random().nextInt(Names.values().length - 1)]);
        return name;
    }

    static void printTeam1(ArrayList<Hero> team1) {
        for (int i = 0; i < team1.size(); i++) {
            System.out.println(team1.get(i).getInfo());
        }
    }

    static void printTeam2(ArrayList<Hero> team2) {
        for (int i = 0; i < team2.size(); i++) {
            System.out.println(team2.get(i).getInfo());
        }
    }

    static void printTeam(ArrayList<Hero> teams) {
        printHeaders();
        for (int i = 0; i < teams.size(); i++) {
            System.out.println(teams.get(i).getInfo());
        }
        printLine();

    }

    static void sortTeam(ArrayList<Hero> teams) {
        teams.sort(new Comparator<Hero>() {
            @Override
            public int compare(Hero o1, Hero o2) {
                if(o2.getSpeed() == o1.getSpeed()) return (int) ((int) o2.getHp() - o1.getHp());
                else return o2.getSpeed() - o1.getSpeed();
            }
        });
    }

    static void printLine(){
        System.out.println("*********************************************************************************");
    }

    static void printHeaders(){
        System.out.println("*********************************************************************************");
        System.out.println("Class       Name      HP          MaxHp             Arrow        Coords(X.Y)");
        System.out.println("*********************************************************************************");
    }

    static void winner(ArrayList<Hero> team1,ArrayList<Hero> team2){
        int t1 = Hero.findLive(team1).size();
        int t2 = Hero.findLive(team2).size();
        System.out.println(t1 > t2?"Winner team1 ":"Winner team2");
    }



}


