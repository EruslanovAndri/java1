

import java.util.TreeMap;

public class S6 {

    static TreeMap<Integer, String> treeMap = new TreeMap<>();

    public static void main(String[] args) {
        add(1);
        System.out.println(add(1));
        System.out.println(add(5));
        toString(treeMap);
        System.out.println(( treeMap.keySet().toArray()[0]).getClass());

    }

    public static boolean add(int num) {
        if(treeMap.containsKey(num)){
            return  false;
        }
        else{
            treeMap.putIfAbsent(num, null);
            return true;
        }

    }
    public static void toString(TreeMap<Integer,String> treeMap){
        System.out.println(treeMap.keySet());
    }

    public  static Object[] findIndex(int i){
        return treeMap.keySet().toArray();

    }


}


// смоделировать добавление элемента в Set не изпользуя Set.
