import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Lesson6Sergey {
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        set1.add(4);set1.add(31);set1.add(15);
        set2.add(4);set2.add(3);set2.add(6);set2.add(1);
        System.out.println(set1);
        System.out.println(set2);
        var u = new HashSet<>(set1);
        u.addAll(set2); // united two collection
        System.out.println(u);
        var r = new HashSet<>(set1);
        r.retainAll(set2); // отставляет общее в коллекции
        System.out.println(r);
        boolean res = set1.addAll(set2);
        System.out.println(res);
        System.out.println(set1.hashCode());
        System.out.println(set2.hashCode());
        HashSet<Integer> hashSet = new HashSet<Integer>();
        hashSet.add(1);
        System.out.println(hashSet);





    }
}
