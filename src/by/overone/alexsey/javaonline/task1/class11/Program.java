package by.overone.alexsey.javaonline.task1.class11;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Program {
    public static void main(String[] args) {
        JavaProgrammist javaProgrammist = new JavaProgrammist("ABC");
        JavaProgrammist javaProgrammist1 = new JavaProgrammist("ZZZ");
        CppProgrammist cppProgrammist = new CppProgrammist("ZXC");
        CppProgrammist cppProgrammist1 = new CppProgrammist("CPPL");
        ArrayList<Programmist> programmists = new ArrayList<>();
        programmists.add(javaProgrammist);
        programmists.add(javaProgrammist1);
        programmists.add(cppProgrammist);
        programmists.add(cppProgrammist1);
        for(Programmist programmist: programmists){
            startWriteCode(programmist);
//            programmist.writeCode();
        }
        HashMap<String,Integer> hashMap = new HashMap<>();
        HashMap<String,Programmist> hashMap2 = new HashMap<>();
        hashMap.put("1",10);
        hashMap.put("2",20);
        hashMap.put("3",30);
        hashMap.put("1",30);
        System.out.println(hashMap);

//        for (String key : hashMap.keySet()) {
//            System.out.println("Key: " + key);
//        }
//
//        for (int value : hashMap.values()) {
//            System.out.println("Value: " + value);
//        }

        for (Map.Entry entry : hashMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + " Value: "
                    + entry.getValue());
        }

        hashMap2.put("Artem",javaProgrammist);
//        hashMap2.put(null,)
                //11001 -> 25
                //&
                //10001 -> 17
               //=10001
        //25&17
        System.out.println(25&17);
        hashMap2.put("Alex",new CppProgrammist("Alex"));
        System.out.println(hashMap2);


    }
    public static void startWriteCode(Programmist programmist){
        programmist.writeCode();
    }
    public static void method(int x){
        System.out.println(x);

    }
}
