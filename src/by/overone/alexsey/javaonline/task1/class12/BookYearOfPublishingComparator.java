package by.overone.alexsey.javaonline.task1.class12;

import java.util.Comparator;

public class BookYearOfPublishingComparator implements Comparator<Book> {
    @Override
    public int compare(Book o1, Book o2) {
        if (o1.getYearOfPublishing() == o2.getYearOfPublishing()) {
            return 0;
        } else if (o1.getYearOfPublishing() > o2.getYearOfPublishing()) {
            return 1;
        } else {
            return -1;
        }
    }
}
