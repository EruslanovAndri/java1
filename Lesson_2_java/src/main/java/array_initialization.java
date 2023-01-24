import java.util.Arrays;
import java.util.Random;

public class array_initialization {
    public static void main(String[] args) {
        int arr[] = new int[5];
        System.out.println(Arrays.toString(arr));
        Random rnd = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rnd.nextInt(500);
            }
        System.out.println(Arrays.toString(arr));

        int[] newArr = new int[arr.length+1];
        newArr[0] = 13;
        for (int i = 1; i < newArr.length; i++) {
                newArr[i] = arr[i-1];
        }
        arr = newArr;
        System.out.println(Arrays.toString(arr));

        }


}


// Размер массива нельзя просто так изменить, нужно создавать новый экземпляр массива с изменениями и включением в
// старой информации и новой.



