import Unit.*;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Random;
import java.util.Scanner;
public class Main {
    static final int UNITS = 10;
    public static ArrayList<Hero> team1 = new ArrayList<>();
    public static ArrayList<Hero> team2 = new ArrayList<>();
    public static ArrayList<Hero> teams = new ArrayList<>();
    public static void main(String[] args) {




        Scanner user_input = new Scanner(System.in);
        createTeam(team1, 1, 5, 1);
        createTeam(team2, 4, 8, 10);
        sortTeam(team1);
        sortTeam(team2);
        ArrayList<Hero> team1Live = new ArrayList<>(team1);
        ArrayList<Hero> team2Live = new ArrayList<>(team2);
        teams.addAll(team1);
        teams.addAll(team2);
        sortTeam(teams);
        System.out.println("------------------Team sorted-------------");
        printTeam(teams);


        while (true) {
            View.view();
            user_input.nextLine();
            sortTeam(teams);
            for (Hero hero: teams) {
                if (team1.size() != 0 && team2.size() != 0) {
                    if (team1.contains(hero)) {
                        hero.step(team1Live, team2Live);
                        team2Live = findLive(team2);
                    } else {
                        hero.step(team2Live, team1Live);
                        team1Live = findLive(team1);
                    }
                } else {
                    View.searchWinner(team1.size());
                    return;
                }
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


    static ArrayList<Hero> findLive(ArrayList<Hero> teams) {
        ArrayList <Hero> findLive = new ArrayList<>();
        for (Hero hero : teams) {
            if (hero.state.equals("Stand")|| hero.state.equals("Empty")) {
                findLive.add(hero);
            }
        }
        return findLive;
    }



}


