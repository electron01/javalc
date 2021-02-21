package by.overone.alexsey.lecture5;

import java.util.Arrays;
import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        int count =1 ;
        char xod = 'x';

        boolean isGameOver = false;
        Scanner scanner = new Scanner(System.in);


        char[][] array = {
                {'-','-','-'},
                {'-','-','-'},
                {'-','-','-'},
        };

        do {
            if(count%2==0){
                xod='0';
            }else{
                xod='x';
            }
            System.out.println("Enter x");
            int x = scanner.nextInt();
            System.out.println("Enter y");
            int y = scanner.nextInt();

            if(x>3 || x<0 || y<0 || y>3 || array[y][x]!='-'){
                System.out.println("Error!!!!!");


            }
            array[y][x] = xod;
            count++;


            System.out.println(Arrays.deepToString(array));



        }while (!isGameOver);

    }
}
