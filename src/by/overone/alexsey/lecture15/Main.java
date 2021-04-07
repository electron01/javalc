package by.overone.alexsey.lecture15;

import java.util.Deque;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
    /*    1.2) Разработать метод, позволяющий пользователю изменить все вхождения указанного пользователем, на другой символ, указанный пользователем
        1.3) Создать метод, который будет  проверить является ли строка, введенная пользователем палиндромом
        1.4) Развернуть строку(двумя способами, и с помощью метода и в ручную, с помощью цикла)
        1.5) Есть строка, разбить данную строку на массив строк, каждый  новый элемент массива, это слово после запятой
        String text = «Hello, hello, other»
        str[0]=«Hello»
        str[1]=«hello> и так далее*/

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter line");
//        String str = scanner.nextLine();
//        System.out.println("Enter symbol for replace");
//        String oldSymbol = scanner.next();
//        System.out.println("Enter new symbol");
//        String newSymbol = scanner.next();
//
//
//        System.out.println(str.replace(oldSymbol, newSymbol));

        System.out.println(replaceTest("Test Hello Bye", 'e', 'Z'));


        String testStringForReverse = "Test Hello Bye";
        StringBuilder testStringBuilderForReverse = new StringBuilder("Test Hello Bye");
        System.out.println(testStringBuilderForReverse.reverse());

        for (int i = 0; i < testStringForReverse.length(); i++) {
            System.out.print(testStringForReverse.charAt(testStringForReverse.length() - i - 1));
        }
        System.out.println();
        System.out.println("reverseStringWithCharAt(testStringForReverse) = " + reverseStringWithCharAt(testStringForReverse));


    }

    public static String replaceTest(String str, char oldSymbol, char newSymbol) {

        char[] chars = str.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == oldSymbol) {
                chars[i] = newSymbol;
            }
        }
        return new String(chars);

    }

    public static String reverseStringWithCharAt(String inputString) {
        int stringLength = inputString.length();
        String result = "";
        for (int i = 0; i < stringLength; i++) {
            result = inputString.charAt(i) + result;
        }
        return result;
    }
}
