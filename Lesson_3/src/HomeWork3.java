// 1. Создать новый список, добавить несколько строк и вывести коллекцию на экран.
// 2. Итерация всех элементов списка цветов и добавления к каждому символа '!'.
// 3. Вставить элемент в список в первой позиции.
// 4. Извлечь элемент (по указанному индексу) из заданного списка.
// 5. Обновить определенный элемент списка по заданному индексу.
// 6. Удалить третий элемент из списка.
// 7. Поиска элемента в списке по строке.
// 8. Создать новый список и добавить в него несколько елементов первого списка.
// 9. Удалить из первого списка все элементы отсутствующие во втором списке.
// 10. *Сортировка списка.

import java.util.ArrayList;
import java.util.Collections;

public class HomeWork3 {
    public static void main(String[] args) {

        // 1. Создать новый список, добавить несколько строк и вывести коллекцию на экран.
        ArrayList<String> lst = new ArrayList<>();
        lst.add("Apple");
        lst.add("Banana");
        lst.add("Watermelon");
        System.out.println(lst);


        // 2. Итерация всех элементов списка цветов и добавления к каждому символа '!'.

        ArrayList<String> color_lst = new ArrayList<>();
        color_lst.add("Red");
        color_lst.add("Green");
        color_lst.add("Blue");
        color_lst.add("Pink");
        color_lst.add("Black");
        color_lst.add("Yellow");

        for (int i = 0; i < color_lst.size(); i++) {
            System.out.println(color_lst.get(i)+"!");
        }

        // 3. Вставить элемент в список в первой позиции.
        System.out.println(color_lst);
        color_lst.add(0,"Orange");
        System.out.println(color_lst);

        // 4. Извлечь элемент (по указанному индексу) из заданного списка.
        System.out.println(color_lst.get(3));

        // 5. Обновить определенный элемент списка по заданному индексу.
        color_lst.set(2,"Purple");
        System.out.println(color_lst);

        // 6. Удалить третий элемент из списка.
        color_lst.remove(3);
        System.out.println(color_lst);

        // 7. Поиска элемента в списке по строке.
            System.out.println(color_lst.contains("Red"));


        // 8. Создать новый список и добавить в него несколько елементов первого списка.

        ArrayList<String> new_color_list = new ArrayList<>();
        new_color_list.add(color_lst.get(0));
        new_color_list.add(color_lst.get(4));


        System.out.println(new_color_list);

        // 9. Удалить из первого списка все элементы отсутствующие во втором списке.

        System.out.println(color_lst);
        System.out.println(new_color_list);
        ArrayList<String> res_list = new ArrayList<>();
        for (int i = 0; i < color_lst.size(); i++) {
            for (int j = 0; j < new_color_list.size(); j++) {
                if(color_lst.get(i) == new_color_list.get(j)){
                    res_list.add(color_lst.get(i));
                    color_lst.remove(i);
                }
            }
        }
        System.out.println(color_lst);
        System.out.println(res_list);
        System.out.println(color_lst.retainAll(new_color_list));




        // 10. *Сортировка списка.
        System.out.println(color_lst);
        Collections.sort(color_lst);
        System.out.println(color_lst);



    }
}
