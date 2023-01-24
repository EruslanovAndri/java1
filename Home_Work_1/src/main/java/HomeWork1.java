//Первый семинар.
// 1. Выбросить случайное целое число в диапазоне от 0 до 2000 и сохранить в i
// 2. Посчитать и сохранить в n номер старшего значащего бита выпавшего числа
// 3. Найти все кратные n числа в диапазоне от i до Short.MAX_VALUE сохранить в массив m1
// 4. Найти все некратные n числа в диапазоне от Short.MIN_VALUE до i и сохранить в массив m2
// int i = new Random().nextInt(k); //это кидалка случайных чисел!)

import java.util.Random;
import java.util.Arrays;
public class HomeWork1 {
    public static void main(String[] args) {
        int i = 0;
        int n = 0;
        int[] m1 = new int[0];
        int[] m2 = new int[0];

        Random rnd = new Random();
        i = rnd.nextInt(20);
        n = Integer.toBinaryString(i).length();

        System.out.println(i); // Random choice

        System.out.println(Integer.toBinaryString(i)); // Convert to binaryString

        System.out.println(n);  // get length of binary number

        for (int j = i; j < Short.MAX_VALUE; j++) {
            if (j % n == 0) {
                int[] temp1 = new int[m1.length + 1];
                temp1[0] += j;
                for (int k = 1; k < temp1.length; k++) {
                    temp1[k] = m1[k - 1];
                }
                m1 = temp1;
            }


        }
        for (int l = Short.MIN_VALUE; l < i; l++) {
            if (l % n != 0) {
                int[] temp2 = new int[m2.length + 1];
                temp2[0] += l;
                for (int k = 1; k < temp2.length; k++) {
                    temp2[k] = m2[k - 1];
                }
                m2 = temp2;
            }


        }
        System.out.println(Arrays.toString(m1));
        System.out.println(Arrays.toString(m2));
    }
}



