package by.overone.alexsey.lecture22;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HomeWork  {
    public static void main(String[] args) {
        //1 task
     /*   int minIndex1 = 0,minIndex2 = 0,minIndex3=0;
        int[] array = new int[]{8,9,-2,1,3,2,9,10,7,0,10};
        for(int i=0; i<array.length;i++){
            if(array[i]<array[minIndex1]) {
                minIndex3 = minIndex2;
                minIndex2 = minIndex1;
                minIndex1 = i;
            }
            else if (array[i]<array[minIndex2]){
                minIndex2=i;
            }
            else if (array[i]<array[minIndex3]){
                minIndex3=i;
            }

        }
        System.out.println("min 1:" + array[minIndex1]);
        System.out.println("min 2:" + array[minIndex2]);
        System.out.println("min 3:" + array[minIndex3]);*/
     /*   //1 task 2 option
        Arrays.sort(array);
        int minCount = 5;
        for (int i=1; i<=minCount;i++){
            System.out.println("Min №" + i + ": " + array[i]);
        }*/

        //task 2
        String name = "Alex";
        String[] skills = {"Java", "Spring", "Sql"};
        User user = new User(name, skills);
        UserIterator iterator = user.getUserIterator();
        List<Integer> list = new ArrayList<>();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        System.out.println("---------------");
        String str = "Hello hello hello bye";
        int index = 3;
        char newChar = 'Z';
        //HelZo helZo helZo bye
        String[] words = str.split(" ");
        for (String word : words) {
            if (index < word.length()) {
                char[] chars = word.toCharArray();
                chars[index] = newChar;
                System.out.println(chars);
            } else {
                System.out.println(word);
            }
        }
        System.out.println("---------------");
        Role role = Role.ADMIN;
        System.out.println(Arrays.toString(Role.values()));
    }



}
