package by.overone.alexsey.lecture30;

import java.sql.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    static final  String URL = "jdbc:mysql://localhost:3306/Library?serverTimezone=UTC&useSSL=false";
    static final  String PASS = "lexa75910";
    static final  String LOGIN = "root";

    public static void main(String[] args) throws SQLException {
        Book book = new Book();
        book.setName("NewBook");
        book.setPrice(200);
        book.setCreateDate(LocalDate.now());
        createBook(book);
        getAllBook();
    }

    public static void getAllBook() throws SQLException {
//        Class.forName("com.mysql.jdbc.Driver");
        String selectFromBook = "SELECT * FROM book";
        Connection connection = DriverManager.getConnection(URL,LOGIN,PASS);
        Statement statement = connection.createStatement();
        try(ResultSet resultSet = statement.executeQuery(selectFromBook)){
            List<Book> books = initBook(resultSet);
            System.out.println(books);
        }

    }
    private static List<Book> initBook(ResultSet resultSet) throws SQLException{
        List<Book> allBook = new ArrayList<>();
        while (resultSet.next()){
            Book book = new Book();
            book.setId(resultSet.getInt("id"));
            book.setPrice(resultSet.getInt("price"));
            book.setName(resultSet.getString("name"));
            book.setCreateDate(resultSet.getDate("create_date").toLocalDate());
            allBook.add(book);
        }
        return allBook;
    }

    private static Book createBook(Book book) throws SQLException {
        String createNewBook = "INSERT INTO book (name,price,create_date) VALUES (?,?,?)";
        //                                                                        1,2,3
        Connection connection = DriverManager.getConnection(URL, LOGIN, PASS);
        try (PreparedStatement preparedStatement = connection.prepareStatement(createNewBook)) {
            preparedStatement.setString(1, book.getName());//1- book name - NewBook
            preparedStatement.setInt(2, book.getPrice());//2- book price - 200
            preparedStatement.setDate(3, Date.valueOf(book.getCreateDate()));//3- book create date - 200
            preparedStatement.executeUpdate();
        }
        return book;
    }
}
