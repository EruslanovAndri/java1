import java.util.ArrayList;
import java.util.List;

public class Ex002 {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        //ArrayList list = new ArrayList();
        list.add(2809);


        for (Object o : list) {
            System.out.println(o);

        }
        List<Integer> list1 = new ArrayList<Integer>();
        list1.add(1);
        list1.add(123);
        for (Object o : list1){
            System.out.println(o);
        }
    }
}
