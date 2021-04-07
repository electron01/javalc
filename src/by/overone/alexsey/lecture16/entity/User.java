package by.overone.alexsey.lecture16.entity;

public class User {
    private int id;
    private String login;
    private String password;
    private static int userCount;


    public User(String login, String password) {
        this.id = ++userCount;
        this.login = login;
        this.password = password;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getUserCount() {
        return userCount;
    }

    public void setUserCount(int userCount) {
        this.userCount = userCount;
    }


    @Override
    public String toString() {
        return "User{" +
                "id: " + this.getId() + ", " +
                "login: " + this.getLogin() + ", " +
                "password: " + this.getPassword() +
                "}";
    }



}
