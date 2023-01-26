public class Example01_object {
    public static void main(String[] args) {
        Object o = 1; GetType(o);
        o = 1.2; GetType(o);


    }
    static void GetType(Object obj){ // получение информации о типе.
        System.out.println(obj.getClass().getName());
    }
}
