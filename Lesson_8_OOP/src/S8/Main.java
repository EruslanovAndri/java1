package S8;

import java.util.Random;

public class Main {
    public static void main(String[] args) {

//        XBowMan xBowMan = new XBowMan("Ivan");
        Sniper sniper = new Sniper("Ivan");
        XBowMan xBowMan1 = new XBowMan(1.0f,1,2,3,5,5,5,4,"");
        System.out.println(sniper.getInfo());
        System.out.println(xBowMan1.getInfo());

        for (int i = 0; i < 10; i++) {
            System.out.println(getName());

        }

    }
    private static String getName(){
       String name = String.valueOf(Names.values()[new Random().nextInt(Names.values().length-1)]);
        return name;
    }
}
