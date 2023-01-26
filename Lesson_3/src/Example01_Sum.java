public class Example01_Sum {
    public static void main(String[] args) {
        System.out.println(Sum(1,2));
        System.out.println(Sum(1.3,3.5));
    }
    static Object Sum(Object a,Object b){

        if(a instanceof Double && b instanceof Double){
            return (Object) ((Double) a + (Double) b);

        } else if (a instanceof Integer && b instanceof Integer) {
            return  (Object) ((Integer) a + (Integer) b);
        } else return  0;
    }

}
