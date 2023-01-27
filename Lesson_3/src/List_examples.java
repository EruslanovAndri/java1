import java.util.*;

public class List_examples {
    public static void main(String[] args) {
        int a = 0; //примитивный тип 4 байта
        ArrayList<String> list = new ArrayList<String>(); // инициализировали лист, можно в него сохранить все типы
        list.add("Hello world!");
        list.add("Hello");
        list.add("world!");
        list.add("HW!");
        list.add(2,"World of Java!");
        list.set(2,"Java!");
        a = list.size();
        list.remove(a-1);
        System.out.println(list.remove("Java!"));

        for (int i = 0; i < list.size(); i++) {
                System.out.println(list.get(i)); // print list
        }

        for(String str : list){
            System.out.println(str); // print list
        }

        Iterator<String > iterator = list.iterator(); // итератор пробегает по листу и выводит каждый элемент.
        while (iterator.hasNext()){
            String str = iterator.next();
            System.out.println(str);
            //iterator.remove(); // удаляет из листа
        }

        ListIterator<String > listIterator = list.listIterator(list.size()/2);
        while (listIterator.hasPrevious()){
            String str = listIterator.previous();
            System.out.println(str);
        }

        list.forEach( (k) -> System.out.println(k));
        System.out.println(list);
        System.out.println(list.indexOf("Hello"));
        list.lastIndexOf("Hello");

        ArrayList<Integer> l1 = new ArrayList<>();
        ArrayList<Integer> l2 = new ArrayList<>();
        Random rnd = new Random();
        for (int i = 0; i < 8; i++) {
            l1.add(rnd.nextInt(8));
            l2.add(rnd.nextInt(8));
        }


        System.out.println(l1);
        Collections.sort(l1);
        System.out.println(l1);
        //System.out.println(l2);
//        l1.removeAll(l2);
//        System.out.println(l1);
//
//        l1.retainAll(l2);

        l1.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer t0, Integer t1) {
                return t1 - t0;
            }
        });
        System.out.println(l1);

    }
}


// Что такое списки и как работать с ними!!!