package by.overone.alexsey.lecture16.view;

import by.overone.alexsey.lecture16.entity.User;
import by.overone.alexsey.lecture16.service.UserService;

import java.util.Scanner;

public class View {

    private static Scanner scanner = new Scanner(System.in);
    private static User user;

    public static void startMenu() {
        int userSelect;

        while (true) {
            System.out.println("Hello User!");
            System.out.println("Enter 1 - for SingIn");
            System.out.println("Enter 2 - for Registration");
            System.out.println("Enter 3 - for Close Program");

            userSelect = scanner.nextInt();

            switch (userSelect) {
                case 1:
                    System.out.println("Input your login");
                    String login = scanner.next();
                    System.out.println("Input your password");
                    String password = scanner.next();
                    user = UserService.singIn(login, password);
                    if (user != null) {
                        selectMenu();
                    } else {
                        System.out.println("Error!!!");
                    }
                    break;
                case 2:
                    System.out.println("Registration");
                    System.out.println("Input your login");
                    String newLogin = scanner.next();
                    System.out.println("Input your password");
                    String newPassword = scanner.next();
                    user = UserService.registration(newLogin, newPassword);
                    if (user != null) {
                        selectMenu();
                    } else {
                        System.out.println("Error!!!");
                    }
                    break;

                case 3:
                    return;
            }
        }

    }

    private static void selectMenu() {
        int userSelect;
        boolean isClose = false;
        do {
            System.out.println("Welcome Person - " + user.getLogin());
            System.out.println("######Select Menu######");
            System.out.println("Input 1 - Show goods");
            System.out.println("Input 2 - Buy goods");
            System.out.println("Input 3 - Show All Users");
            System.out.println("Input 4 - Log Out");
            System.out.println("######Select Menu######");
            userSelect = scanner.nextInt();

            switch (userSelect) {
                case 1:
                    //...

                    break;

                case 2:
                    //...

                    break;

                case 3:
                    UserService.showAllUsers();//todo:admin method

                case 4:
                    return;

            }


        }
        while (!isClose);
    }

}

