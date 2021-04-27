package by.overone.alexsey.lecture19;

import java.util.*;

public class Main {
    public static void main(String[] args) {
//        List<Car> list = new ArrayList<>();
//        list.add(new Car("CarName1",2222,"blue"));
//        list.add(new Car("CarName1",1111,"red"));
//        list.add(new Car("CarName1",3333,"black"));


//        List<String> strings = new ArrayList<>();
//        strings.add("ABC");
//        strings.add("ABZ");
//        strings.add("ZZZ");
//        strings.add("QQQ");
//        strings.add("abc");
//        strings.add("abw");
//        Collections.sort(strings);
//        System.out.println(strings);
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(2);
        list.add(12);
        list.add(3);
        list.add(2);//not
        list.add(12);//not
        list.add(1);
        list.add(10);//not
////        System.out.println(deleteDuplicate(list));
//        System.out.println(list);
//        Set<Integer> hashSet = new HashSet<>(list);
//        System.out.println(hashSet);


        Map<String, Integer> hashMap = new LinkedHashMap<>();
        hashMap.put("Key4", 444);
        hashMap.put("Key3", 333);
        hashMap.put("Key1", 111);
        hashMap.put("Key2", 222);
        hashMap.put("Key1", 12345);
//        System.out.println("HashMap = " + hashMap);


        Map<String, Integer> treeMap = new TreeMap<>();
        treeMap.put("abc", null);
        treeMap.put("AAA", 121);
        treeMap.put("Key2", 222);
        treeMap.put("Key3", 333);
        treeMap.put("Key4", 444);
        treeMap.put("Key1", 12345);
//        System.out.println("TreeMap = " + treeMap);

        Set<Integer> hashSet = new HashSet<>(16,0.75f);
        Set<Integer> linkedSet = new LinkedHashSet<>();
        linkedSet.add(1);
        linkedSet.add(2);
        linkedSet.add(3);
        linkedSet.add(1);
        linkedSet.add(1);
        linkedSet.add(10);
        linkedSet.add(101);
        for(Integer i : linkedSet){
            System.out.println(i);
        }
       // Set<Integer> linkedSet = new LinkedHashSet<>();
        hashSet.add(1);
        hashSet.add(1);
        hashSet.add(2);
        hashSet.add(2);

        for(Integer i : hashSet){
            System.out.println(i);
        }

        System.out.println(hashMap.get("hfkjgk"));
        System.out.println(hashSet);

        Car car = new Car("Car1",1111,"Black");
        Car car2 = new Car("Car1",1111,"Black");
        Set<Car> carSet = new HashSet<>(1,7.6f);
        carSet.add(car);


        carSet.add(car2);
        System.out.println("carSet = " + carSet);

        Set<Integer> treeSet = new TreeSet<>();
       treeSet.add(12);
       treeSet.add(12);
       treeSet.add(1);
       treeSet.add(5);
       treeSet.add(2);
        System.out.println("treeSet = " + treeSet);
    }





    private static List deleteDuplicate(List<Integer> list) {
        List<Integer> newList = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (newList.contains(list.get(i))) {
                continue;
            } else {
                newList.add(list.get(i));
            }
        }
        return newList;
    }
}
