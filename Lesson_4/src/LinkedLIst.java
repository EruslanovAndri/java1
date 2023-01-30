import java.util.LinkedList;

public class LinkedLIst {
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<>();
        ll.add(1);
        ll.add(12);
        ll.remove(1);
        ll.addFirst(10); // add on the first position
        ll.addLast(18); // add on the last position
        System.out.println(ll.getClass());
        System.out.println(ll.peekFirst());
        System.out.println(ll.contains(1)); // contains or not?
        System.out.println(ll);
        System.out.println(ll.get(0)); // доступ к элементу в списке
    }
}
