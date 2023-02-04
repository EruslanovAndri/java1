// 1. Создать словарь HashMap. Обобщение <Integer, String>.
// 2.Заполнить тремя ключами (индекс, цвет), добавить ключь, если не было!)
// 3.Изменить значения дописав восклицательные знаки.
// 4.*Создать TreeMap, заполнить аналогично.
// 5.*Увеличить количество элементов до 1000 случайными ключами и общей строкой.
// 6.**Сравнить время последовательного и случайного перебора тысячи элементов словарей35

import java.util.*;
import java.util.Random;

public class HM5{
    public static void main(String[] args) {
        // 1. Создать словарь HashMap. Обобщение <Integer, String>.
        // 2.Заполнить тремя ключами (индекс, цвет), добавить ключь, если не было!)
        HashMap<Integer,String> hashMap = new HashMap<Integer,String>();
        hashMap.put(1,"Blue");
        hashMap.put(2,"Yellow");
        hashMap.put(3,"White");
        hashMap.putIfAbsent(3,"Green");
        System.out.println(hashMap);

        // 3.Изменить значения дописав восклицательные знаки.

        for (Map.Entry<Integer,String> item: hashMap.entrySet()){
            System.out.println(item.getKey()+ " "  +  item.getValue()+ "!");
        }
        // 4.*Создать TreeMap, заполнить аналогично.

        TreeMap<Integer,String> treeMap = new TreeMap<Integer,String>();
        treeMap.put(1,"Green");
        treeMap.put(2,"Black");
        treeMap.put(3,"Pink");
        treeMap.putIfAbsent(4,"Purple");
        System.out.println(treeMap);

        for (Map.Entry<Integer,String> item: treeMap.entrySet() ){
            System.out.println(item.getKey() + " " + item.getValue() + "!");
        }

        // 5.*Увеличить количество элементов до 1000 случайными ключами и общей строкой.

        int count = 0;
        Random rnd = new Random();
        while (count < 1000){
            treeMap.put(rnd.nextInt(2000),"String" );
            count ++;

        }
        System.out.println(treeMap);

        // 6.**Сравнить время последовательного и случайного перебора тысячи элементов словарей35

        long start = System.currentTimeMillis();
        for (int i = 0; i < treeMap.size(); i++) {
            System.out.println(i);
        }
        long end = System.currentTimeMillis();

        System.out.println(end - start);
    }
}
