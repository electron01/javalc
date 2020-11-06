package by.overone.alexsey.javaonline.task1.class14;

public class AddElementException extends Exception {
    public AddElementException(){
        super();
    }
    public AddElementException(String message){
        super(message);
    }
    public AddElementException(Throwable throwable){
        super(throwable);
    }
    public AddElementException(String message, Throwable throwable){
        super(message,throwable);
    }
}
