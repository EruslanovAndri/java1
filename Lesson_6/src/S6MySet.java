import java.util.HashMap;
import java.util.HashSet;

public class S6MySet {


    public static void main(String[] args) {
        MySet mySet = new MySet();

        mySet.add(1);
        mySet.add(5);
        mySet.add(66);
        System.out.println(mySet.toString());
    }
}


class MySet{

    private HashMap<Integer,Object> map = new HashMap<>();

    private final Object OBJ = new Object();

    public boolean add(Integer i){
        map.put(i,OBJ);
        return true;

    }
    public static void toString(MySet ){
        System.out.println(MySet.map.keySet());
    }

}
