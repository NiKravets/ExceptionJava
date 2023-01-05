import java.util.Arrays;

public class Task3 {
    public static void main(String[] args) {
        int[] array1 = {6,476,86,2,5,26,13,7};
        int[] array2 = {8,254,7,45,0,278,9,2};
        System.out.println(Arrays.toString(divArray(array1, array2)));
    }

    public static int[] divArray(int[] array1,int[] array2){
        if(array1.length != array2.length) throw new RuntimeException("Длинны массивом не равны");
        int[] divArray = new int[array1.length];
        for (int i = 0; i <array1.length; i++) {
            if(array2[i] == 0) throw new RuntimeException("Деление на ноль не приемлемо!");
            divArray[i] = array1[i]/array2[i];
        }
        return divArray;
    }
}
