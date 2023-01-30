import java.util.*;

public class Ex003 {
    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>();
        deque.addFirst(1); deque.addLast(2);
        deque.addLast(23);
        System.out.println(deque);
        System.out.println(deque.offerFirst(0));
        System.out.println(deque.getFirst()); // show index
        System.out.println(deque.getLast());
//        deque.removeLast(); deque.removeLast();
//        deque.offerFirst(1); deque.offerLast(2);
//        deque.pollFirst(); deque.pollLast();
        deque.getFirst(); deque.getLast();
//        deque.peekFirst(); deque.peekLast();
    }
}