package by.overone.alexsey.lecture14;

import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
     /*   ArrayList<String> arrayList = new ArrayList<>(20);
        arrayList.add("Hi");
        arrayList.add("Hi2");
        System.out.println(arrayList);
        String[] array = new String[10];
        array[0] = "Hi";
        array[1] = "Hi2";
        System.out.println(Arrays.toString(array));

        System.out.println("length: " + array.length);
        System.out.println("size: " + arrayList.size());*/


        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Hello0");
        arrayList.add("Hello1");
        arrayList.add("Hello2");
        arrayList.add(2, "Hello");
        String oldValue = arrayList.set(2, "Hi");
        System.out.println("oldValue: " + oldValue);

        ArrayList<String> arrayList2 = new ArrayList<>();
//        arrayList2.add("Bye");
//        arrayList2.add("Bye2");
//
//        arrayList.addAll(arrayList2);

        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }
        arrayList.removeAll(arrayList2);
        System.out.println("======arrayList=======");
        System.out.println(arrayList);

        System.out.println("======linkedList=======");
        LinkedList<String> linkedList = new LinkedList<>();

        linkedList.add("Hello");
        linkedList.add("Hello2");
        System.out.println(linkedList.get(1));
        System.out.println(linkedList);



      /*  String str1 = "Hello World!";
        System.out.println("stingStart = " + stingStart("World Hello", "Hello"));
        System.out.println("stringEnd = " + stingEnd("Hello World", "rld"));

        System.out.println(str1.endsWith("World!"));
        System.out.println(str1.startsWith("W", 6));
        System.out.println(str1.contains("llo"));
        System.out.println(str1.indexOf("llo"));*/

    }

    static boolean stingStart(String str, String word) {
        if (str == null || word == null) {
            return false;
        }
        if (word.length() > str.length()) {
            return false;
        }

        for (int index = 0; index < word.length(); index++) {
            if (!(str.charAt(index) == word.charAt(index))) {
                return false;
            }
        }
        return true;
    }

    static boolean stingEnd(String str, String word) {
        if (str == null || word == null) {
            return false;
        }
        if (word.length() > str.length()) {
            return false;
        }
        int startCheckWith = str.length() - word.length();
        for (int i = 0; i < word.length(); i++) {
            if (!(str.charAt(startCheckWith + i) == word.charAt(i))) {
                return false;
            }
        }
        return true;
    }
}
