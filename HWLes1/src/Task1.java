public class Task1 {
    public static void main(String[] args) {
        int n = 5;
        int[] array = new int[n];
        findNumber(array,n);
        negativeLen(-1);
        StringToInt("O");
    }

    public static int findNumber(int[] array, int n) {
            return array[n];
    }
    public static int[] negativeLen(int size) {
        return new int[size];
    }
    public static int StringToInt(String input) {
        return Integer.parseInt(input);
    }
}
