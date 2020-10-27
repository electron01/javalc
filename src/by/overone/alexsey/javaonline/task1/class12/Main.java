package by.overone.alexsey.javaonline.task1.class12;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("BBB", 150,1999);
        Book book = new Book("ABC", 120,2000);
        Book book2 = new Book("ZZZ", 200,2005);
        Book book3 = new Book("AAA", 270,1980);
        Book book4 = new Book("GHG", 270,1985);
        ArrayList<Book> books = new ArrayList<>();
        books.add(book2);
        books.add(book);
        books.add(book1);
        books.add(book3);
        books.add(book4);
//        System.out.println(books.get(1));
        Collections.sort(books,new BookYearOfPublishingComparator());
        book1.compareTo(book2);
        System.out.println(books);
        BookNumberOfPagesComparator bookNumberOfPagesComparator = new BookNumberOfPagesComparator();
        BookYearOfPublishingComparator bookYearOfPublishingComparator = new BookYearOfPublishingComparator();
        Comparator<Book> pcomp = new BookNumberOfPagesComparator().thenComparing(new BookYearOfPublishingComparator());

        TreeSet<Book> treeSet2 = new TreeSet<>(pcomp);
        treeSet2.add(book);
        treeSet2.add(book1);
        treeSet2.add(book2);
        treeSet2.add(book3);
        treeSet2.add(book4);
        System.out.println(treeSet2);

        Collections.sort(books,bookNumberOfPagesComparator);
        System.out.println(books);

        Collections.sort(books,pcomp);
        System.out.println(books);

        book1.compareTo(new Object());




    }
}
