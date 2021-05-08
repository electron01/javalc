package by.overone.alexsey.lecture24;

public class Main {
    public static void main(String[] args) {
        int number = 100;
//        System.out.println(findReverseNumber(number));
        Game.startGame();

    }


    public static int findReverseNumber(int number) {
        int reverseNumber = number % 10;
        while (number / 10 != 0) {
            number /= 10;
            int remainder = number % 10;
            reverseNumber = reverseNumber * 10 + remainder;
        }
        return reverseNumber;
    }


}
