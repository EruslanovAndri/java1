import javax.crypto.spec.PSource;
import java.util.Arrays;
import java.util.Random;

public class Lesson2_Group {
    public static void main(String[] args) {

        long start = System.currentTimeMillis(); // скорость выполнения программы.

        int x = new Random().nextInt(500);
        System.out.println(x);
        int n = Integer.toBinaryString(x).length();
        System.out.println(n);
        int count = 0;
        for (int i = Short.MIN_VALUE; i < x ; i++) {
            if(i%n == 0) count++;
        }

        int[] m = new int[count];
        count = 0;
        for (int i = Short.MIN_VALUE; i < x; i++) {
            if(i%n == 0) m[count++] = i;
        }
//        System.out.println(Arrays.toString(m));

        String s = "se";
        // StringBuilder работает быстрее если нужно постоянно изменять строку.
        StringBuilder builder = new StringBuilder("Hello");
        s = builder.toString();
        builder.append("!");
        System.out.println(builder);
        builder.deleteCharAt(0);
        System.out.println(builder);
        builder.insert(0,"H");
        System.out.println(builder);



        long end = System.currentTimeMillis();
        System.out.println(end - start); // показывает скорость работы пр-мы в м/с.


    }



}
