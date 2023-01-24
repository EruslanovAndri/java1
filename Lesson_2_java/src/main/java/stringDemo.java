import java.util.Arrays;

public class stringDemo {
    public static void main(String[] args) {
        String[] str = {"kkdk","rrr"};
        System.out.println(String.join("", str));
        System.out.println(Arrays.stream(str).toList());
        for (int i = 0; i < str.length; i++) {
            String temp = str[i];
            if(i != 0){
                temp = str[i-1];
                str[i] = temp;
                System.out.println(Arrays.stream(str).toList());
            }

        }
    }

}
