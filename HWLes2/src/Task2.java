public class Task2 {
/*
try {
        int d = 0;
        double catchedRes1 = intArray[8] / d;
        System.out.println("catchedRes1 = " + catchedRes1);
    } catch (ArithmeticException e) {
        System.out.println("Catching exception: " + e);
    }

    В коде встречаются непроверяемые исключения ArithmeticException и ArrayIndexOutOfBoundsException
    их можно избежать с помощью проверок.
*/


    public static void main(String[] args) {
        int d = 0;
        int i = 8;
        int[] intArray = {5, 7, 9, 2, 456, 72, 56, 23};
        if (d == 0) {
            System.out.println("Нельзя делить на ноль!");
        } else {
            if (i > intArray.length-1) {
                System.out.println("Индекс за диапазоном массива");
            } else {

                double catchedRes1 = intArray[i] / d;
                System.out.println("catchedRes1 = " + catchedRes1);
            }
        }
    }
}
