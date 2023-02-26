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


        ArrayList<Hero> team1 = new ArrayList<>();
        ArrayList<Hero> team2 = new ArrayList<>();
        ArrayList<Hero> teams = new ArrayList<>();
        Scanner user_input = new Scanner(System.in);
        String game = "";
        createTeam(team1, 1, 5, 1);
        createTeam(team2, 4, 8, 10);
        teams.addAll(team1);
        teams.addAll(team2);
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
        System.out.println(t1 > t2 ? "Winner team1" : "Winner team2");
    }



}


