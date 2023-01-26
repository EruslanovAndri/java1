// 1. Напишите программу, чтобы найти вхождение в строке (содержащей все символы другой строки).
// 2. Напишите программу, чтобы проверить, являются ли две данные строки вращением друг друга (вхождение в обратном порядке).
// 3. *Напишите программу, чтобы перевернуть строку с помощью рекурсии.
// 4. Дано два числа, например 3 и 56, необходимо составить следующие строки: 3 + 56 = 59 3 – 56 = -53 3 * 56 = 168 Используем метод StringBuilder.append().
// 5.Замените символ “=” на слово “равно”. Используйте методы StringBuilder.insert(),StringBuilder.deleteCharAt().
// 6. *Замените символ “=” на слово “равно”. Используйте методы StringBuilder.replace().
// 7. **Сравнить время выполнения пунка 6 со строкой содержащей 10000 символов "=" средствами String и StringBuilder.

import java.util.Arrays;

public class HomeWork2 {
    public static void main(String[] args) {
        // 1. Напишите программу, чтобы найти вхождение в строке (содержащей все символы другой строки).

        String s1 = "Hello world";
        String s2 = "world";
//        String s1 = "ABC";
//        String s2 = "BCA";
        StringBuilder builder1 = new StringBuilder(s1);
        StringBuilder builder2 = new StringBuilder(s2);
        System.out.println(builder1.toString().contains(builder2.toString()));

        // 2. Напишите программу, чтобы проверить, являются ли две данные строки вращением друг друга (вхождение в обратном порядке)

        if (areRotations(s1,s2))
            System.out.println("Yes");
        else
            System.out.println("NO");
//        System.out.println(builder1.reverse().toString().contains(builder2.reverse().toString()));


        // 3. *Напишите программу, чтобы перевернуть строку с помощью рекурсии.

        String s3 = "Peace";
        System.out.println(reverse(s3));

        // 4. Дано два числа, например 3 и 56, необходимо составить следующие строки:
        // 3 + 56 = 59 3 – 56 = -53 3 * 56 = 168 Используем метод StringBuilder.append().
        Integer num1 = 3;
        Integer num2 = 56;
        StringBuilder builder = new StringBuilder();
        builder.append(num1).append("+").append(num2).append("=").append(num1 + num2).append("\n")
                .append(num1).append("-").append(num2).append("=").append(num1 - num2).append("\n")
                .append(num1).append("*").append(num2).append("=").append(num1 * num2).append("\n")
                .append(num1).append("/").append(num2).append("=").append(num1.floatValue() / num2.floatValue());
        System.out.println(builder);


       // 5.Замените символ “=” на слово “равно”. Используйте методы StringBuilder.insert(),StringBuilder.deleteCharAt().
        System.out.println(builder.deleteCharAt(4).insert(4," равно "));


//        6. *Замените символ “=” на слово “равно”. Используйте методы StringBuilder.replace().
        long start = System.currentTimeMillis();
        System.out.println(builder.toString().replace("="," равно "));
        long end  = System.currentTimeMillis();
        System.out.println(end - start);

        // 7. **Сравнить время выполнения пунка 6 со строкой содержащей 10000 символов "=" средствами String и StringBuilder.

        long start_1 = System.currentTimeMillis();
        String str = "";
        for (int i = 0; i < 10_000; i++) {
            str += "=";
        }
        long end_1 = System.currentTimeMillis();
        System.out.println(end_1 - start_1);


        long start_2 = System.currentTimeMillis();
        StringBuilder str_builder = new StringBuilder();
        for (int i = 0; i < 10_000; i++) {
            str_builder.append("=");
        }
        long end_2 = System.currentTimeMillis();
        System.out.println(end_2-start_2);


        }

    public static String reverse(String s3) {
        if (s3.length() == 1) return s3;
        return s3.charAt(s3.length() - 1) + reverse(s3.substring(0, s3.length() - 1));

    }


    static boolean areRotations(String s1,String s2){
        return (s1.length() == s2.length()) && ((s1+s1).contains(s2));
    }






    }







