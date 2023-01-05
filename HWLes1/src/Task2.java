import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {
        int[] array1 = {6,476,86,2,5,26,13,7,5};
        int[] array2 = {8,254,7,45,23,278,9,2};
        System.out.println(Arrays.toString(diffArray(array1, array2)));
    }

    public static int[] diffArray(int[] array1,int[] array2){
        if(array1.length != array2.length) throw new RuntimeException("Длинны массивом не равны");
        int[] diffArray = new int[array1.length];
        for (int i = 0; i <array1.length; i++) diffArray[i] = array1[i] - array2[i];
        return diffArray;
    }
}
