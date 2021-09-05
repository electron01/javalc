package by.overone.alexsey.dbtest;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        List<Book> list = new ArrayList<>();
        list.add(new Book(1,"Book1","Author1"));
        list.add(new Book(3,"Book3","Author2"));
        list.add(new Book(2,"Book4","Author3"));
        list.add(new Book(0,"Book0","Author4"));
        Collections.sort(list,Comparator.comparing(Book::getBookName));
        System.out.println(list);

    }
}
