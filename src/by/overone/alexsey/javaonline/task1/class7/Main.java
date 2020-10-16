package by.overone.alexsey.javaonline.task1.class7;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String text = "     Hello    world    123   test  testsss  ";
        text = text.trim();
        String[] words = text.split("\\s+");
        System.out.println(Arrays.toString(words));
//        System.out.println(text.replaceAll("\\s+",""));
        System.out.println(text.replaceAll("[\\s]{2,}", " "));
        String test = "   а роза упала на лапу Азор    а   ";
        test = test.replaceAll(" ", "");
        test = test.toLowerCase();
        System.out.println("test =" + test);
        boolean isPalindrom = true;
        for (int j = 0; j < test.length() / 2; j++) {
            if (test.charAt(j) != test.charAt(test.length() - 1 - j)) {
                isPalindrom = false;
                System.out.println();
                break;
            }
        }
        System.out.println(isPalindrom);
        // t e s t = 4 symbol
        // t !=t
        // e!=s
        //12321 -> 5/2 = 2


        StringBuilder stringBuilder = new StringBuilder(test);
        stringBuilder.append(" work");
        stringBuilder.reverse();
        System.out.println(stringBuilder);
        StringBuffer stringBuffer = new StringBuffer();
        User user = new User(1, "Artem");
        user.setId(2);
        Admin admin = new Admin(1, "admin", "123");
        admin.deleteUser();
        admin.getId();
        User[] array = new User[5];
        array[0] = user;
        array[1] = admin;


        Admin[] admins = new Admin[5];
        admins[0] = admin;
//        admins[1] = user; error

        User admin1 = new Admin(2, "admin1", "321");
//        User admin2 = new User(2,"admin1");
//        admins[1] = admin1;
        // Ошибка на этапе компиляции
        array[2] = admin1;
//        admin1.deleteUser();
        ((Admin)admin1).deleteUser();

    }
}
