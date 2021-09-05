package by.overone.alexsey.dbtest;

import java.util.Comparator;

public class BookComporatorById implements Comparator<Book> {
    @Override
    public int compare(Book o1, Book o2) {
        return Integer.compare(o1.getId(), o2.getId());
    }
}
