public class MoreDataExeption extends RuntimeException {

    public MoreDataExeption(){
        super("Введено больше данных, чем нужно");
    }
}
