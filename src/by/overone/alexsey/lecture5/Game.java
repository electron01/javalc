package by.overone.alexsey.lecture5;

import java.util.Arrays;
import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        int count = 1;
        char xod = 'x';

        boolean isGameOver = false;
        boolean isCorrectMove = false;
        Scanner scanner = new Scanner(System.in);


        char[][] array = {
                {'-', '-', '-'},
                {'-', '-', '-'},
                {'-', '-', '-'},
        };

        do {
            if (count % 2 == 0) {
                xod = '0';
            } else {
                xod = 'x';
            }
            //boolean isCorrectMove =false;
            while (!isCorrectMove) {//стар цикла
                System.out.println("Enter x");//ввод знач-ий
                int x = scanner.nextInt();
                System.out.println("Enter y");
                int y = scanner.nextInt();

                if (x > 3 || x < 0 || y < 0 || y > 3 || array[y][x] != '-') {//если ход некорректный,
                    System.out.println("Error!!!");  // выводим инфу и возвращаемся назад к старту цикла
                    System.out.println("Plz, enter x and y  Again !!!");


                } else { //если ход корректный
                    array[y][x] = xod;
                    count++;
                    isCorrectMove = true;//цикл прерывается
                }

            }


            System.out.println(Arrays.deepToString(array));//вывод массива
            isCorrectMove = false;//переменная опять равнва false, для проверки следующего хода


        } while (!isGameOver);

    }
}
