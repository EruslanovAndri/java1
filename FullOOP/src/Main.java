import Bandit.Bandit;
import Enumerats.Names;
import Farmer.Farmer;
import Magicians.Monk;
import Magicians.Warlock;
import Shooters.CrossBowMan;
import Shooters.Pikeman;
import Shooters.Sniper;
import SuperClass.Hero;

import javax.naming.Name;
import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        /**
         * Вывод всех на экран
         */
        System.out.println("-----------------------------------------------------------------");
        Hero hero1 = new Warlock(getName());
        System.out.println(hero1.getInfo());
        System.out.println("--------------");
        Hero hero2 = new Monk(getName());
        System.out.println(hero2.getInfo());
        System.out.println("--------------");
        Hero hero3 = new Sniper(getName());
        System.out.println(hero3.getInfo());
        System.out.println("--------------");
        Hero hero4 = new CrossBowMan(getName());
        System.out.println(hero4.getInfo());
        System.out.println("--------------");
        Hero hero5 = new Pikeman(getName());
        System.out.println(hero5.getInfo());
        System.out.println("--------------");
        Hero hero6 = new Bandit(getName());
        System.out.println(hero6.getInfo());
        System.out.println("--------------");
        Hero hero7 = new Farmer(getName());
        System.out.println(hero7.getInfo());
        System.out.println("--------------");

        /**
         *  Конец вывода всех на экран
         */


        /**
         * Формирование списка со случайным выбором героев.
         */

        ArrayList<Hero> heroList = new ArrayList<>();
        int heroListSize = 10;
        while (heroList.size() < heroListSize){
            Integer rnd = new Random().nextInt(1,8);
            switch (rnd){
                case (1):
                    heroList.add(new Warlock(getName()));
                    break;
                case (2):
                    heroList.add(new Monk(getName()));
                    break;
                case (3):
                    heroList.add(new Sniper(getName()));
                    break;
                case (4):
                    heroList.add(new CrossBowMan(getName()));
                    break;
                case (5):
                    heroList.add(new Pikeman(getName()));
                    break;
                case (6):
                    heroList.add(new Bandit(getName()));
                    break;
                default:
                    heroList.add(new Farmer(getName()));
            }

        }

        for (int i = 0; i < heroList.size(); i++) {
            System.out.println(heroList.get(i).getInfo());
        }

//        END ------------------------------------------


        ArrayList<Hero> team1 = new ArrayList<>();
        ArrayList<Hero> team2 = new ArrayList<>();
        ArrayList<Hero> teams = new ArrayList<>();
        createTeam(team1,1,5);
        createTeam(team2,5,8);
        teams.addAll(team1);
        teams.addAll(team2);
        System.out.println(team1.size());
        System.out.println(team2.size());
        System.out.println(teams.size());


    }

    public static void createTeam(ArrayList teamList, int start, int end){
        int arraySize = 10;
        Random rnd = new Random();
        while (teamList.size() < arraySize){
            int r = rnd.nextInt(start,end);
            switch (r){
                case (1):
                    teamList.add(new Bandit(getName()));
                    break;
                case (2):
                    teamList.add(new Sniper(getName()));
                    break;
                case (3):
                    teamList.add(new Warlock(getName()));
                    break;
                case (4):
                    teamList.add(new Farmer(getName()));

                case (5):
                    teamList.add(new Pikeman(getName()));
                    break;
                case (6):
                    teamList.add(new CrossBowMan(getName()));
                    break;
                case (7):
                    teamList.add(new Monk(getName()));
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
}
