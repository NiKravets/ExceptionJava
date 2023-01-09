import java.io.IOException;

public class Counter implements AutoCloseable{

    int count;


    public Counter(int count) {
        this.count = count;
    }

    public int add(){
        return  count++;
    }


    @Override
    public void close() throws Exception {


    }

}
