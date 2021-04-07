package by.overone.alexsey.lecture16.entity;

import java.util.ArrayList;
import java.util.List;

public class UserList {


    private static UserList userList = new UserList();
    private List<User> UsersAuthorizationList = new ArrayList<>();

    public List<User> getUsersAuthorizationList() {
        return UsersAuthorizationList;
    }

    public void setUsersAuthorizationList(List<User> usersAuthorizationList) {
        UsersAuthorizationList = usersAuthorizationList;
    }


    private UserList() {
        this.getUsersAuthorizationList().add(new User("user","pass"));
        this.getUsersAuthorizationList().add(new User("l","p"));
    }

    public static UserList getUserList() {
        return userList;
    }


}
