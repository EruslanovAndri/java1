import java.lang.annotation.Repeatable;
import java.util.Arrays;

public class MyStringExample {
    public static void main(String[] args) {
        String str = "Milk,City,Car";
        System.out.println(str);
        str += "!";
        System.out.println(str);
        System.out.println(str.replaceAll(",","+"));

        String[] a = str.split(" ");
        System.out.println(Arrays.toString(a));

        for (int i = 0; i < a.length; i++) {
            if (a[i].contains(",") | a[i].contains("!")){
                a[i] = a[i].substring(0,a[i].length()-1);
            }
            System.out.println(Arrays.toString(a));
        }

    }
}
