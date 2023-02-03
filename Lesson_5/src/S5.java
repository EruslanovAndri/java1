// Map - структура
// HashMap - 16 штук по умолчанию
// Hash - уникальное имя элемента
// HashSet - key,value,hash,next

import java.util.*;

public class S5 {
    public static void main(String[] args) {
        HashMap<String,String> map = new HashMap<String ,String >();
        map.put("One","1");
        map.put("Two","2");
        map.put("Three","3");
        map.put("Four","4"); // добавляет значение даже если ключ уже есть.
        System.out.println(map.putIfAbsent("Five","5")); // проверяет ключ перед добавлением.
        System.out.println(map.putIfAbsent("Five","6"));
        System.out.println(map);
        System.out.println(map.keySet());
        System.out.println(map.values());
        System.out.println(map.get("One")); // возвращает значение по ключу.
       // map.forEach((k,v)-> System.out.println(k + "" + v)); // вывод данных ключ/значение


        Collection<String> col = map.values();
        System.out.println(col);
        Set<String> keySet = map.keySet();
        for (int i = 0; i < keySet.size(); i++) {
            System.out.println(" " + keySet.toArray()[i] + " " + map.get(keySet.toArray()[i]));

        }

        Iterator<String> iterator = map.keySet().iterator();
        while (iterator.hasNext()){
            String tmp = iterator.next(); // доступ к значениям
            System.out.println(tmp);
            // iterator.remove(); // может удалять все данные
        }
        for (String tmp: keySet){
            System.out.println(map.get(tmp)); // доступ к значениям
        }

        map.compute("One",(k, v) -> v="12" ); // меняет значения
        System.out.println(map);
        map.computeIfPresent("One",(k, v) -> v="122" );
        System.out.println(map);
        map.computeIfAbsent("Six", v -> v="133");
        System.out.println(map);


        System.out.println(map.getOrDefault("Six","yes"));
        System.out.println(map.size());


        LinkedHashMap<String,String> linkedHashMap = new LinkedHashMap<String,String>();

        linkedHashMap.put("One","1");
        linkedHashMap.put("Two","2");
        linkedHashMap.put("Three","3");
        linkedHashMap.put("Four","4");
        System.out.println(linkedHashMap);



        TreeMap<String,String> treeMap = new TreeMap<>();
        treeMap.put("One","1");
        treeMap.put("Two","2");
        treeMap.put("Three","3");
        treeMap.put("Four","4");
        treeMap.putIfAbsent("Five","5");

        System.out.println(treeMap);
        System.out.println(treeMap.headMap("Three",true));
        System.out.println(treeMap.tailMap("Three", false));

    }

}
