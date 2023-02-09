import java.util.HashSet;

//Разработать программу, имитирующую поведение коллекции HashSet.
//В программе содать метод add добавляющий элемент,
//метод toString возвращающий строку с элементами множества и метод позволяющий читать
//элементы по индексу. Формат данных Integer.
public class HW6 {

    public static void main(String[] args) {
        MyHashSet hashSet = new MyHashSet();
        hashSet.add(11);
        hashSet.add(2);
        hashSet.add(4);
        hashSet.add(53);
        System.out.println(hashSet);
        System.out.println(hashSet.getSize());
        hashSet.getElement();


    }
}


class MyHashSet {
    private HashSet<Integer> hashSet = new HashSet<>();

    public boolean add(Integer i) {
        return hashSet.add(i) != false ? true : false;
    }

    @Override
    public String toString() {
        return hashSet.toString();
    }

    public Integer getSize(){
        return hashSet.size();
    }

    public void getElement() {
        for (int i = 0; i < hashSet.size(); i++) {
            System.out.println(hashSet.toArray()[i] + " Element");
        }
    }
}





