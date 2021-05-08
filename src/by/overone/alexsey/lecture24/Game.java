package by.overone.alexsey.lecture24;

import java.util.Random;
import java.util.Scanner;

public class Game {
    public static String startGame() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        //[1,36]
        System.out.println("Enter number");
        int userNumber = scanner.nextInt();
        int randomInt = random.nextInt(36) + 1;
        if (userNumber != randomInt) {
            System.out.println("userNumber = " + userNumber);
            System.out.println("randomInt = " + randomInt);
            return "You Lose";
        } else {
            return "You Win!";
        }

    }

}

