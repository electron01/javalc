package by.overone.alexsey.javaonline.task1.class10;

public interface INoteBook {
    String name="hello";
    void turnOff();
    void startGame();
    default int sum(int a, int b){
        return a+b;
    }
}
