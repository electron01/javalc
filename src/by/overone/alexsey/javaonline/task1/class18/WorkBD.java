package by.overone.alexsey.javaonline.task1.class18;

import java.sql.*;
public class WorkBD {
    public static void main(String[] args) {
        final String URL = "jdbc:mysql://localhost:3306/primer?autoReconnect=true&useSSL=false";
        final String username = "root";
        final String PASSWORD = "root";
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection connection = DriverManager.getConnection(URL,username,PASSWORD);

//            Statement statement = connection.createStatement();
//            ResultSet resultSet = statement.executeQuery("select * from Person");
            String query = "select firstName from Person where id =  ?";
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setInt(1, 1);
            ResultSet resultSet = statement.executeQuery();
//            while (resultSet.next()) {
//                System.out.println("id = " + resultSet.getString(1) +
//                        " username = " + resultSet.getString(4) +
//                        " password = " + resultSet.getString(5)
//                );
//            }
            while (resultSet.next()){
                System.out.println(resultSet.getString(1));
            }
            resultSet.close();
            statement.close();
            connection.close();

        } catch (ClassNotFoundException exception) {

        } catch (SQLException exception) {


        }

    }
}
