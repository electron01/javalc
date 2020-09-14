package by.overone.alexsey.op37;

import by.overone.alexsey.lecture4.Person;

import java.util.ArrayList;
import java.util.*;
public class Primer {
    public static void main(String[] args) {
        Person person = new Person();
        List<Integer> list = new ArrayList<>(); //Создание листа целых чисел
        list.add(12);
        list.add(12);
        list.add(20);

        for (Integer i:list) {//вывод всех эл-ов листа
            System.out.print(i +", ");
        }

        System.out.println("\n" +"=========");
        HashSet<Integer> hashSet = new HashSet<>();//Создание сета целых чисел
        Map<String,Integer> map = new HashMap<>();//Создание мар, ключ типа Стринг, значения целыя числа
        map.put("a",1);
        map.put("b",2);
        map.put("c",3);
        map.put("d",4);//Добавление в мар
        for (String key : map.keySet()){
            System.out.println("KEY = " + key);
        }
        for (Integer value : map.values()){
            System.out.println("Value = " + value);
        }
        for(Map.Entry entry : map.entrySet()){
            System.out.println("Key: = " + entry.getKey() + " Value: = " +entry.getValue());

        }



        hashSet.add(1);//Добавление в сет
        hashSet.add(2);
        hashSet.add(6);
        hashSet.add(1);
        hashSet.add(17);
        for (Integer i : hashSet){
            System.out.println(i);
        }
        ex();
        ex();
        ex();
    }

    static void ex(){
        System.out.println("Hello");
    }

}

//Задание 1 - Создать лист целых чисел, проверить есть ли там число 12, если да - вывести в консоль "число 12 соддержится в листе"
//Задание 2 - Создать сет целых чисел, посчитать сумму четных и нечетных чисел