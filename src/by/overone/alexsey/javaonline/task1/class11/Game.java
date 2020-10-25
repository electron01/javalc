package by.overone.alexsey.javaonline.task1.class11;

import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        char[][] playingField = {
                {'-', '-', '-'},
                {'-', '-', '-'},
                {'-', '-', '-'}
        };
        int count = 1;
        char symbol = '-';
        boolean gameOver = false;
        while (!gameOver) {
            if(count%2!=0){
                System.out.println("Ходит игрок1");
                symbol='X';
            }else{
                System.out.println("Ходит игрок2");
                symbol='0';

            }
            if (attack(playingField, symbol,count)) {
                printPlayingField(playingField);
                break;
            }
            count++;
        }
        // X 0 X
        // X 0 0
        // 0 X X
    }

    public static boolean attack(char[][] playingField, char symbol,int count) {
        int row = 0;
        int column = 0;
        Scanner scanner = new Scanner(System.in);
        printPlayingField(playingField);
        row = scanner.nextInt();
        column = scanner.nextInt();
        if (playingField[row][column] == '-') {
            playingField[row][column] = symbol;
        }
        if (isGameOver(playingField, symbol,count)) {
            return true;
        }
        return false;
    }

    public static boolean isGameOver(char[][] playingField, char symbol,int count) {
        if (playingField[0][0] == symbol && playingField[0][1] == symbol && playingField[0][2] == symbol) {
            System.out.println("Player(" + symbol + ") - win");
            return true;
        }
        if (playingField[1][0] == symbol && playingField[1][1] == symbol && playingField[1][2] == symbol) {
            System.out.println("Player(" + symbol + ") - win");
            return true;
        }
        if (playingField[2][0] == symbol && playingField[2][1] == symbol && playingField[2][2] == symbol) {
            System.out.println("Player(" + symbol + ") - win");
            return true;
        }
        if (playingField[0][0] == symbol && playingField[1][0] == symbol && playingField[2][0] == symbol) {
            System.out.println("Player(" + symbol + ") - win");
            return true;
        }
        if (playingField[0][1] == symbol && playingField[1][1] == symbol && playingField[2][2] == symbol) {
            System.out.println("Player(" + symbol + ") - win");
            return true;
        }
        if (playingField[0][2] == symbol && playingField[1][2] == symbol && playingField[2][2] == symbol) {
            System.out.println("Player(" + symbol + ") - win");
            return true;
        }
        if (playingField[0][0] == symbol && playingField[1][1] == symbol && playingField[2][2] == symbol) {
            System.out.println("Player(" + symbol + ") - win");
            return true;
        }
        if (playingField[0][2] == symbol && playingField[1][1] == symbol && playingField[2][0] == symbol) {
            System.out.println("Player(" + symbol + ") - win");
            return true;
        }
        if(count==8){
            System.out.println("Draw");
            return true;
        }
        return false;
    }

    public static void printPlayingField(char[][] playingField) {
        for (int i = 0; i < playingField.length; i++) {
            for (int j = 0; j < playingField[i].length; j++) {
                System.out.print(playingField[i][j] + " ");
            }
            System.out.println();
        }
    }
}
