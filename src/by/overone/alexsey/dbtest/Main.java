package by.overone.alexsey.dbtest;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static final String URL = "jdbc:mysql://localhost:3306/Library?serverTimezone=UTC&useSSL=false";
    static final String PASS = "lexa75910";
    static final String LOGIN = "root";

    public static void main(String[] args) {
//
//          System.out.println(findByName());
        login();

    }

    private static Book findByName(String bookName) {
        try{
            String query = "SELECT * FROM book WHERE bookName = " + "'" + bookName + "'";
            System.out.println(query);
            Connection connection = getConnection();
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);
            return initBook(resultSet).get(0);
        }catch (SQLException ex){
            System.out.println(ex.getMessage());
            throw new RuntimeException();
        }

    }

    private static List<Book> getBooks() {
        try {
            Connection connection = getConnection();
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM book");
            return initBook(resultSet);//sqlException

        } catch (SQLException e) {
            throw new RuntimeException("Error created connection!");
        }
    }

    private static List<Book> initBook(ResultSet resultSet) throws SQLException {
        List<Book> books = new ArrayList<>();
        while (resultSet.next()) {
            Book book = new Book();
            book.setId(resultSet.getInt("id"));
            book.setBookName(resultSet.getString("bookName"));
            book.setAuthor(resultSet.getString("author"));
            books.add(book);
        }
        return books;
    }

    private static Book saveBook(Book book) {
        try {
            Connection connection = getConnection();
//            Statement statement = connection.createStatement();
//            statement.execute("INSERT INTO book (id,bookName,author) VALUES (3, +"  + "'" + book.getBookName()+"'" + ", "  + "'" + book.getAuthor() + "'"+ ")");
//            PreparedStatement preparedStatement =
//                    connection.prepareStatement("INSERT INTO book (id,bookName,author) VALUES (?,?,?)");
//            preparedStatement.setInt(1,book.getId());
//            preparedStatement.setString(2,book.getBookName());
//            preparedStatement.setString(3,book.getAuthor());
//            preparedStatement.executeUpdate();
        } catch (SQLException exception) {
            System.out.println(exception.getMessage());
            throw new RuntimeException("Error created connection!");
        }
        return book;
    }


    private static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, LOGIN, PASS);
    }

    private static   void login(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter login: ");
        String login = scanner.nextLine();
        System.out.println("Enter password: ");
        String password = scanner.nextLine();
//        String query = "SELECT * FROM user WHERE login ="  + "'" + login + "'" + "AND password =" + "'" + password + "'";
        String query = "SELECT * FROM user WHERE login = ? AND password = ? ";
        System.out.println(login);
        try(Connection connection = getConnection()){
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setString(1,login);
            statement.setString(2,password);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()){
                System.out.println("Find user!");
                System.out.println("id: " + resultSet.getInt("id"));
                System.out.println("login: " + resultSet.getString("login"));
                System.out.println("password: " + resultSet.getString("password"));
                return;
            }
            System.out.println("Error!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}


