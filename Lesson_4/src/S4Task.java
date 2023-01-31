import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;

public class S4Task {
    public static void main(String[] args) {
        FileReader reader = null;
        String text = "";
        try {
            reader = new FileReader("db.sql");
            while (reader.ready()){
                text += (char)reader.read();

            }

        }
        catch (IOException e){
            System.out.println(e.getMessage());
        }
//        System.out.println(text);

        String[] str1 = text.split("\n");
        ArrayList<String> surname = new ArrayList<>();
        ArrayList<String> name = new ArrayList<>();
        ArrayList<String> ochestvo = new ArrayList<>();
        ArrayList<Integer> age = new ArrayList<>();
        ArrayList<Boolean> gender = new ArrayList<>();
        LinkedList<Integer> ll = new LinkedList<>();
        for (int i = 0; i < str1.length; i++) {
            String[] tmp = str1[i].split(" ");
            surname.add(tmp[0]);
            name.add(tmp[1]);
            ochestvo.add(tmp[2]);
            age.add(Integer.parseInt(tmp[3]));
            gender.add(tmp[4].equals("жен") ? true:false);
            ll.add(i);

        }

//        System.out.println(surname);
//        System.out.println(name);
//        System.out.println(ochestvo);
//        System.out.println(age);
//        System.out.println(gender);
//        System.out.printf("%s\n%s\n%s\n%s\n%s",surname, name,ochestvo,age,gender);
//        for (int i = 0; i < name.size(); i++) {
//            System.out.printf("%d. %s %s.%s. %d %s\n",ll.get(i),surname.get(ll.get(i)),name.get(ll.get(i)).charAt(0),ochestvo.get(ll.get(i)).charAt(0),
//                    age.get(ll.get(i)),gender.get(ll.get(i)).equals(true) ? "жен":"муж");
//        }
        for (int i = 0; i < age.size()-1; i++) {
            for (int j = 0; j < age.size()-i-1; j++) {
                if(age.get(ll.get(j)) > age.get(ll.get(j+1))){
                    int temp = ll.get(j);
                    ll.set(j,ll.get(j+1));
                    ll.set(j+1,temp);
                }
            }
        } // BubleSort
        System.out.println(ll);
        // [2, 1, 4, 0, 3]
        for (int i = 0; i < name.size(); i++) {
            System.out.printf("%d. %s %s.%s. %d %s\n",ll.get(i),surname.get(ll.get(i)),name.get(ll.get(i)).charAt(0),ochestvo.get(ll.get(i)).charAt(0),
                    age.get(ll.get(i)),gender.get(ll.get(i)).equals(true) ? "жен":"муж");
        }
    }
}

//    public static void insertionSort(int[] sortArr) {
//        int j;
//        //сортировку начинаем со второго элемента, т.к. считается, что первый элемент уже отсортирован
//        for (int i = 1; i < sortArr.length; i++) {
//            //сохраняем ссылку на индекс предыдущего элемента
//            int swap = sortArr[i];
//            for (j = i; j > 0 && swap < sortArr[j - 1]; j--) {
//                //элементы отсортированного сегмента перемещаем вперёд, если они больше элемента для вставки
//                sortArr[j] = sortArr[j - 1];
//            }
//            sortArr[j] = swap;
//        }
//    }
//
//    public static void main(String args[]) {
//        int[] sortArr = {12, 6, 4, 1, 15, 10};
//        insertionSort(sortArr);
//        for(int i = 0; i < sortArr.length; i++){
//            System.out.print(sortArr[i] + "\n");
//        }
//    }

// текст в формате ФИО + возраст + пол
// 5-6 человек
// считать и разделить по строкам и по словам
// создать списки отдельно для фамилий, имён отчеств возраста и пола
//  заполнить данными для каждого человека из файла
// возраст хранится числом, пол Boolean
// вывод в формате Иванов И.И. 35 лет мужчина
// Сортировать по возрасту