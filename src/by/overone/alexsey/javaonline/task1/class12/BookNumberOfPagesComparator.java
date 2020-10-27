package by.overone.alexsey.javaonline.task1.class12;

import java.util.Comparator;

public class BookNumberOfPagesComparator implements Comparator<Book> {
    @Override
    public int compare(Book o1, Book o2) {
        if (o1.getNumberOfPages() == o2.getNumberOfPages()) {
            return 0;
        } else if (o1.getNumberOfPages() > o2.getNumberOfPages()) {
            return 1;
        } else {
            return -1;
        }
    }
}

