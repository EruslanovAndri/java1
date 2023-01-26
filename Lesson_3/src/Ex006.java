import java.util.ArrayList;
import java.util.List;

public class Ex006 {
    public static void main(String[] args) {
        Character value = null;
        List<Character> list1 = new ArrayList<Character>(); // create empty list
        list1.add('A'); // add simbol to the list.
        list1.add('n');
        list1.add('d');
        System.out.println(list1);
        List<Character> list3 = List.copyOf(list1);
        list1.remove(1); // java.lang.UnsupportedOperationException
        List<Character> list2 = List.copyOf(list1);
        System.out.println(list2);
        System.out.println(list1);
        System.out.println(list3);
        
    }
}
