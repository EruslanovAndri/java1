import java.util.Arrays;
import java.util.Random;

public class S1 {
    public static void main(String[] args) {
        int x = 0; // 32bit signed
        long l; // 64 bit signed
        float f = 0.0f; // 32bit
        double d = 0; //64bit
        // byte 8bit,short  16bit
        String str = "word";

        System.out.print("Hello \nAndrey");
        System.out.println("\nGood");
        System.out.print(str);

        // Массивы статические их невозможно изменить

        int[] ints = new int[10];
        ints[0] = 2;
        Random rnd = new Random();
        for (int i = 0; i < ints.length; i++) {
                ints[i] = (int) (Math.random()*100);
                // либо по другому, работает быстрее
                ints[i] = rnd.nextInt(500);
        }
        System.out.println(Arrays.toString(ints));


        String str1 = "Coffee, Milk, Sugar";
        System.out.println(str1);
        str1 += "!";
        String[] splitStr = str1.split(" ");
        for (int i = 0; i < splitStr.length; i++) {
            if(splitStr[i].contains(",") | splitStr[i].contains("!")){
                splitStr[i] = splitStr[i].substring(0,splitStr[i].length()-1);
            }

        }
        System.out.println(Arrays.toString(splitStr));





    }
}
