package by.overone.alexsey.lecture13;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {


       /* 1)Строки
        1.1) Проверить, с помощью метода, заканчивается ли строка, на конкретный символ, несколько символов, вывести true  - если да
        Затем, добавить возможность проверять начинается ли строка на конкретный символ или несколько символов
        Далее, добавить возможность, проверить содержит ли строка, какую-либо подстроку введенную пользователем, а так же вывести ее позицию
        1.2)Разработать метод, позволяющий пользователю изменить все вхождения указанного пользователем, на другой символ, указанный пользователем
        1.3)Создать метод, который будет  проверить является ли строка, введенная пользователем палиндромом
        1.4) Развернуть строку(двумя способами, и с помощью метода и в ручную, с помощью цикла)
        1.5) Есть строка, разбить данную строку на массив строк, каждый  новый элемент массива, это слово после запятой
        String text = «Hello, hello, other»
        str[0]=«Hello»
        str[1]=«hello> и так далее*/

//        MacBook macBook = new MacBook();
//        PixelBook pixelBook = new PixelBook();
//        NoteBook[] array = {macBook, pixelBook};
//
//        for (NoteBook noteBook : array) {
//            noteBook.launch();
//            noteBook.shutDown();
//        }
//        method(macBook);
//        method(pixelBook);

        NoteBook noteBook = new MacBook();
        MacBook macBook = new MacBook();
        method(macBook);
        method(noteBook);
        double x = 25.9;
        System.out.println(Math.round(x));

        String str = "   Hello World! PrivetTest testik Hello    ";
        String[] strings = str.split(" ");
        int randomWordIndex = (int)(Math.random() * 4);
        System.out.println(strings[randomWordIndex]);
//        System.out.println(str.substring(6));
//        System.out.println(str.substring(6,12));
//        System.out.println(str.replace('l','W'));
//        System.out.println(str.replaceFirst("Hello","Test"));
//        System.out.println(str.replaceAll("Hello","Test"));
        System.out.println(str.trim());
        char[] chars = str.toCharArray();
        System.out.println(Arrays.toString(chars));
        System.out.println(str.lastIndexOf('x'));
        System.out.println(str.hashCode());
//        str=str.toLowerCase();
        str = str.trim();
        System.out.println(str.hashCode());


        System.out.println(str.isEmpty());
        System.out.println(str.isBlank());
        System.out.println(Arrays.toString(strings));



    }

    static void method(NoteBook noteBook) {
        System.out.println("NoteBook::staticMethod");
        noteBook.launch();
    }

    static void method(MacBook macBook){
        System.out.println("MacBook::staticMethod");
        macBook.launch();
    }




}
