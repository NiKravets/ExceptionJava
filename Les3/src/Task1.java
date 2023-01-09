import javax.imageio.IIOException;
import java.io.IOException;

public class Task1 {
    public static void main(String[] args)  {
        try {
            doSomething();
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    public static void doSomething() throws IOException {
        throw new IOException();

    }
}
