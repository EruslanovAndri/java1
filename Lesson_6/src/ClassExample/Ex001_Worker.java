package ClassExample;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;

public class Ex001_Worker {
    public static void main(String[] args) {
        ExampleClassWorker w1 = new ExampleClassWorker();
        w1.firstName = "Name_1";
        w1.lastName = "Lastname_1";
        w1.salary = 100;
        w1.id = 1000;

        ExampleClassWorker w4 = new ExampleClassWorker();
        w4.firstName = "Name_1";
        w4.lastName = "Lastname_1";
        w4.salary = 100;
        w4.id = 1000;

        ExampleClassWorker w2 = new ExampleClassWorker();
        w2.firstName = "Name_2";
        w2.lastName = "Lastname_2";
        w2.salary = 200;
        w2.id = 2000;


        ExampleClassWorker w3 = new ExampleClassWorker();
        w3.firstName = "Name_3";
        w3.lastName = "Lastname_3";
        w3.salary = 300;
        w3.id = 3000;

        System.out.println(w1.toString());
        System.out.println(w2.toString());
        System.out.println(w3.toString());
        System.out.println(w4.toString());

        System.out.println(w1 == w4);
        System.out.println(w1.equals(w4));
        var workers = new HashSet<ExampleClassWorker>(Arrays.asList(w1,w2,w3));
        System.out.println(workers.contains(w4));

    }
}
