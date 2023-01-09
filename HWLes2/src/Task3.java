import java.io.FileNotFoundException;
/*        try {
                int a = 90;
                int b = 3;
                System.out.println(a / b);
                printSum(23, 234);
                int[] abc = { 1, 2 };
                abc[3] = 9;
                } catch (Throwable ex) {
                System.out.println("Что-то пошло не так...");
                } catch (NullPointerException ex) {
                System.out.println("Указатель не может указывать на null!");
                } catch (IndexOutOfBoundsException ex) {
                System.out.println("Массив выходит за пределы своего размера!");
                }
                }
          public static void printSum(Integer a, Integer b) throws FileNotFoundException {
                System.out.println(a + b);
          }

          Throwable включает в себя NullPointerException и IndexOutOfBoundsException по этому должен идти последней проверкой.
           в методе printSum проверка на FileNotFoundException не требуется так как на вход приходит два integer, а возвращает строкув консоль.*/
public class Task3 {
    public static void main(String[] args) {
        try {
            int a = 90;
            int b = 3;
            int i = 3;
            int[] abc = { 1, 2 };
            System.out.println(a / b);
            printSum(23, null);
            abc[i] = 9;

        } catch (NullPointerException ex) {
            System.out.println("Указатель не может указывать на null!");
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("Массив выходит за пределы своего размера!");
        } catch (Throwable ex) {
            System.out.println("Что-то пошло не так...");
        }
    }
    public static void printSum(Integer a, Integer b){
        System.out.println(a + b);
    }

}
