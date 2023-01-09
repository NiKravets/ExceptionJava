public class Task1 {

    public static void main(String[] args) {
        String[][] arr = {{"5","7","dfg"},{"5","sh","2"},{"g","2","4"},{"6","6","6"},{"g","7","g"}};
        System.out.println(sum2d(arr));

    }
    public static int sum2d(String[][] arr) {
        int sum = 0;
        int val = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < 5; j++) {

                try {
                    val = Integer.parseInt(arr[i][j]);
                } catch (RuntimeException e) {
                    val = 0;
                } finally {
                    sum += val;
                }
            }
        }
        return sum;
    }
}
