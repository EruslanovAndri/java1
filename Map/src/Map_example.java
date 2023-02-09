import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Map_example {
    public static void main(String[] args) {
        // как хранит MAP
        // хранит 4 значения: key, value,hash,next
        // не хранит данные по порядку
        // Map не имеет индексов

        HashMap<Integer, Integer> hashMap = new HashMap<Integer, Integer>();
        hashMap.put(1, 11);
        hashMap.put(2, 19);
        System.out.println(hashMap.putIfAbsent(3,11)); // возвращает null если ключа нет в HashMap и его можно добавить.
        System.out.println(hashMap);

        hashMap.forEach((key,value) -> System.out.println("Key = " + key + " Value = " + value)); // нет возможности изменять данные,только вывод.

        Set<Integer> keySet = hashMap.keySet(); // в переменную keySet записываем все ключи из HashMap.
        System.out.println("List of key = " + keySet);

        for (int i = 0; i < keySet.size(); i++) { //итерируемся по размеру keyset
            System.out.println("Key " + keySet.toArray()[i] + " = " + "Value " + hashMap.get(keySet.toArray()[i]));
            //                  выбираем ключ конвертируя его в array            из hashMap получаем значение под конкретным ключом.

        }

        Iterator<Integer> iterator = hashMap.values().iterator(); // достаем значения или ключи.
        while (iterator.hasNext()){
            Integer tmp = iterator.next();
            System.out.println("Value = "+tmp);
        }

        for (Integer tmp : keySet) {
            System.out.println(hashMap.get(tmp));
        }

        System.out.println(hashMap.remove(1));
        System.out.println(hashMap);
        System.out.println(hashMap.entrySet());

    }


}