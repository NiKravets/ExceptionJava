public class IncorrectGenderException extends RuntimeException{

    public IncorrectGenderException(){
        super("Некоректно ввелен пол");
    }
}
