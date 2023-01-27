import java.util.ArrayList;
import java.util.Random;

public class ListPractice {
    public static void main(String[] args) {
        ArrayList<String> str = new ArrayList<>(); // string add by hands
        str.add("Один");
        str.add("Два");
        str.add("Три");
        str.add("Четыре");
        str.add("Пять");

        ArrayList<Integer> num = new ArrayList<>();
        Random rnd = new Random();
        for (int i = 0; i < str.size(); i++) {
            num.add(rnd.nextInt(6)+1);
        }
        System.out.println(str);
        System.out.println(num);
        ArrayList<String> str2 = new ArrayList<>();
        for (int i = 0; i < str.size(); i++) {
            if(!(str.get(i).length() >= num.get(i))){
                str2.add(str.get(i));
            }

        }
        System.out.println(str2);

        for (int i = str.size()-1; i > 0; i--) {
            if (str.get(i).length() > num.get(i)){
                str.remove(i);
            }
        }
        System.out.println(str);
    }

}
// Int Random == length of String list
// compare int.length and str.length
// delete слово если оно меньше числа под одинаоковым индексом