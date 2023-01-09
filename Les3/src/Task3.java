public class Task3 {
    public static void main(String[] args) {
        int a = 15;
        int b = 0;
        try {
            System.out.println(div(a,b));
        }catch (ZeroException e){
            System.out.println(e.getMessage());
        }

    }

    public static int div(int a,int b) {
        try {
            return a / b;
        } catch (ArithmeticException e) {
            throw new ZeroException("b = 0", e);
        }
    }
}
