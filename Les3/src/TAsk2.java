import java.io.FileReader;
import java.io.IOException;

public class TAsk2 {
    public static void main(String[] args)  {
        Counter counter = new Counter(1);
        counter.add();
        try {
            counter.add();
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }



    }
}
