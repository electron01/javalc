package by.overone.alexsey.lecture21;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.remove(1);


        for(Integer i : list){
            System.out.println(i);
//            list.add(100);//ConcurrentModificationException
        }
        ListIterator<Integer> iterator = list.listIterator();


        System.out.println("-------------");
        while(iterator.hasNext()) {
            Integer x = iterator.next();
//           list.remove(1);//ConcurrentModificationException
            System.out.print(x + " ");
            if(x == 6){
                iterator.remove();
            }

        }
        System.out.println();
        System.out.println("-------------");
        System.out.println(list);

    }
}
