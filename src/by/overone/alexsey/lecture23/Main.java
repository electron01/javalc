package by.overone.alexsey.lecture23;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int[] array = {1, -7, 5, 1, 3, 6, 9, 10, 12, 1, 2, 4, 6, 3, 14,16};
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        int findNumber =8;
        System.out.println("index = " + binarySearchWithLoop(array,0,array.length-1,findNumber));
        System.out.println("--------------");

        String string = "Hello everyone hello bye";
        int index = 3;
        char newChar = 'Z';
        String[] words = string.split(" ");
        List<String> newWord = new ArrayList<>();


        for (String word : words) {
            if (word.length() > index) {
                String subWord = word.substring(0, index);
                subWord += newChar;
                subWord += word.substring(index + 1);
                newWord.add(subWord);
            } else {
                newWord.add(word);
            }
        }

        System.out.println(Arrays.toString(words));
        System.out.println(newWord);
//        StringBuilder stringBuilder = new StringBuilder("By");
//        stringBuilder.setCharAt(index,newChar);
//        System.out.println(stringBuilder);//exception index = 3 but string length - 2



    }

    public static int binarySearchWithLoop(int[] array, int start, int end, int number) {
        int middle;
        if(number>array[array.length-1] || number<array[0]){
            return -1;
        }
        while (end>=start){
            middle=(start+end)/2;
//            System.out.println("middle = " + middle);
            if (array[middle]==number){
                return middle;
            } else if(array[middle]>number){
                end= middle-1;
            }else if (array[middle]<number){
                start=middle+1;
            }
        }
        return -1;

    }

}
