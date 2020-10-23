package by.overone.alexsey.javaonline.task1.class10;

public class LenovoNoteBook extends NoteBook implements INoteBook, INoteBook2 {
    @Override
    public void turnOff() {
        System.out.println("lenovo turnOff");
    }

    @Override
    public void startGame() {
        System.out.println("lenovo: start app");
    }


    @Override
    public int sum(int a, int b) {
        return a * b;
    }

    @Override
    public void turnOn() {

    }

    @Override
    public void startBrowser() {

    }
}
