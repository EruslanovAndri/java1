public class Lesson2_StringBuilder {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();
        boolean b = true;
        int x = 3;
        float f = 1.234f;

        builder.append(b);
        builder.append(x);
        builder.append(f);
        System.out.println(builder);
        String s1 = "qwerty";
        String s2 = "qwerty";
        System.out.println(s1 == s2);
        StringBuilder b1 = new StringBuilder(s1);
        StringBuilder b2 = new StringBuilder(s2);
        System.out.println(b1.toString().equals(b2.toString()));

        Integer num1 = 3;
        Integer num2 = 56;
        System.out.printf("Res = %s\nRes = %s\nRes = %s\nRes = %f\n", num1 - num2,num1 + num2,num1 * num2,num1.floatValue() / num2.floatValue());
        StringBuilder b3 = new StringBuilder();
        b3.append(num1).append("+").append(num2).append("=").append(num1+num2);
        System.out.println(b3.toString().replace("="," равно "));

        long start = System.currentTimeMillis();
        String s = "";
        for (int i = 0; i < 10_000; i++) {
            s += "*";
        }
        long end = System.currentTimeMillis();
        System.out.println(end - start);

        StringBuilder b4 = new StringBuilder();

        long start1 = System.currentTimeMillis();
        for (int i = 0; i < 10_000; i++) {
            b4.append("*");
        }
        long end1 = System.currentTimeMillis();
        System.out.println(end1 - start1);
    }
}
