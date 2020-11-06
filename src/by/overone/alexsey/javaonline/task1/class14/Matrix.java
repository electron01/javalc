package by.overone.alexsey.javaonline.task1.class14;

import java.util.HashSet;
import java.util.Set;

public class Matrix {
    private int[][] array;
    private int number;
    private Set<Integer> integers = new HashSet<>();
    {
        number = 1;
        array = new int[3][3];
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int[][] getArray() {
        return array;
    }

    public void setArray(int[][] array) {
        this.array = array;
    }

    public void addInteger(int element) throws AddElementException {
        if (!integers.add(element)) {
            throw new AddElementException("Matrix: addInteger exception");
        }

    }

    public void removeInteger(int element) {
        integers.remove(element);
    }
}
