package by.overone.alexsey.javaonline.task1.class12;

import java.util.Objects;

public class Book implements Comparable {
    private String title;
    private int numberOfPages;
    private int yearOfPublishing;

    public Book(String title, int numberOfPages, int yearOfPublishing) {
        this.title = title;
        this.numberOfPages = numberOfPages;
        this.yearOfPublishing = yearOfPublishing;
    }

    public int getYearOfPublishing() {
        return yearOfPublishing;
    }

    public void setYearOfPublishing(int yearOfPublishing) {
        this.yearOfPublishing = yearOfPublishing;
    }

    public Book() {

    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }


    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", numberOfPages=" + numberOfPages +
                ", yearOfPublishing=" + yearOfPublishing +
                '}';
    }



    @Override
    public int compareTo(Object o) {//Comparable
        //this - book1
        // Object o - > Book book - book2
        // 0 - Они равны
        // 1
        // -1
        Book book = (Book) o;
//        if(this.numberOfPages==book.numberOfPages){
//            return 0;
//        }
//        else if(this.numberOfPages>book.numberOfPages){
//            return 1;
//        }
//        else{
//            return -1;
//        }
        return title.compareTo(book.title);

    }


}
