package by.overone.alexsey.lecture24;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StartApp {
    public static void main(String[] args) {
        Book book1 = new Book("Book_1", "Author_1", Genre.ART);
        Book book2 = new Book("Book_2", "Author_2", Genre.SCIENTIFIC);
        Book book3 = new Book("Book_3", "Author_3", Genre.NOVEL);
        List<Book> bookList = new ArrayList<>();
        bookList.add(book1);
        bookList.add(book2);
        bookList.add(book3);
        printBookList(bookList);
        System.out.println("--------PrintByGenre-------");
        printBookListByGenre(bookList,Genre.ART);
        Scanner scanner = new Scanner(System.in);
        String test = scanner.next();
        System.out.println(test.equals(book1.getBookName()));
//        Genre art = Genre.valueOf("ART");
//        System.out.println("art = " + art);


    }

    private static void printBookList(List<Book> list) {
        for (Book book : list) {
            System.out.println(book);
        }
    }

    private static void printBookListByGenre(List<Book> list, Genre genre) {
        for (Book book : list) {
            if (book.getGenre() == genre) {
                System.out.println(book);
            }
        }
    }
}
