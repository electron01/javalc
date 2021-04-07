package by.overone.alexsey.lecture16.service;

import by.overone.alexsey.lecture16.entity.User;
import by.overone.alexsey.lecture16.entity.UserList;

import java.util.List;

public class UserService {

    public static User singIn(String login, String password) {
        UserList userList = UserList.getUserList();
        List<User> listUser = userList.getUsersAuthorizationList();

        for (User user : listUser) {
            if (user.getLogin().equals(login)
                    && user.getPassword().equals(password)) {
                System.out.println("Welcome!");
                return user;
            }
        }
        return null;
    }


    public static boolean isLoginExists(String login) {
        UserList userList = UserList.getUserList();
        List<User> listUser = userList.getUsersAuthorizationList();

        for (User user : listUser) {
            if (user.getLogin().equals(login)) {
                System.out.println("Error Login already is exists !");
                return true;
            }
        }
        return false;
    }

    public static User registration(String login, String password) {
        //isLoginExists(login),
        // return true - если такой логин уже есть,
        // false - если нет
        if (!(isLoginExists(login))) {
            User user = new User(login, password);//Создаем объект класса User
            UserList.getUserList()//получаем объект класса UserList
                    .getUsersAuthorizationList()//получаем список User'ov
                    .add(user);//add new User в этот список User'ov!
            return user;
        }
        System.out.println("Plz Again input");
        return null;

    }

    public static void showAllUsers() {
        UserList userList = UserList.getUserList();
        for(User user: userList.getUsersAuthorizationList()){
            System.out.println(user);

        }
    }
}

