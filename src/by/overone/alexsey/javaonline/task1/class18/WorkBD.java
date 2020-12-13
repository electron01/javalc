package by.overone.alexsey.javaonline.task1.class18;

import java.sql.*;

public class WorkBD {
    private Connection connection = null;
    final String URL = "jdbc:mysql://localhost:3306/primer?autoReconnect=true&useSSL=false";
    final String username = "root";
    final String PASSWORD = "root";
    private static WorkBD workBD = new WorkBD();
    private WorkBD(){

    }
    public static WorkBD getInstance(){
        return workBD;
    }

    public static void main(String[] args) {


        String sql = "insert into basket ";
        WorkBD workBD = new WorkBD();
        workBD.sqlMethod(sql);
        workBD.sqlMethod(sql);
        workBD.sqlMethod(sql);
        workBD.sqlMethod(sql);
        workBD.sqlMethod(sql);
        workBD.sqlMethod(sql);
/*        try {
            Class.forName("com.mysql.jdbc.Driver");


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
            while (resultSet.next()) {
                System.out.println(resultSet.getString(1));
            }
            resultSet.close();
            statement.close();
            connection.close();

        } catch (ClassNotFoundException exception) {

        } catch (SQLException exception) {


        }*/

    }

    void setUp() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            //insert into Person (lastName,firstName,username,password) values («artemov»,»artem»,»user»,»user»);
            connection = DriverManager.getConnection(URL, username, PASSWORD);
        } catch (ClassNotFoundException e) {
            System.out.println("Error");
//log
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    void sqlMethod(String query) {
        //       String query = "select firstName from Person where id =  ?";
        PreparedStatement statement = null;
        try {
            statement = connection.prepareStatement(query);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        try {
            statement.setInt(1, 1);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        try {
            ResultSet resultSet = statement.executeQuery();
        } catch (SQLException e) {
            e.printStackTrace();
        }
//            while (resultSet.next()) {
//                System.out.println("id = " + resultSet.getString(1) +
//                        " username = " + resultSet.getString(4) +
//                        " password = " + resultSet.getString(5)
//                );
//            }
    }


}

