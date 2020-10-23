package by.overone.alexsey.javaonline.task1.class10;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        AsusNoteBook asusNoteBook1 = new AsusNoteBook();
        AsusNoteBook asusNoteBook2 = new AsusNoteBook();
        AsusNoteBook asusNoteBook3 = new AsusNoteBook();
        ArrayList<NoteBook> noteBookArrayList = new ArrayList<>();
        asusNoteBook1.asusMethod();
        noteBookArrayList.add(asusNoteBook1);
        noteBookArrayList.add(asusNoteBook2);
        noteBookArrayList.add(asusNoteBook3);



        PixelBook pixelBook1 = new PixelBook();
        PixelBook pixelBook2 = new PixelBook();
        PixelBook pixelBook3 = new PixelBook();

        noteBookArrayList.add(pixelBook1);
        noteBookArrayList.add(pixelBook2);
        noteBookArrayList.add(pixelBook3);

        INoteBook2 lenovo = new LenovoNoteBook();
        lenovo.startBrowser();


        for (NoteBook noteBook : noteBookArrayList) {
            noteBook.turnOn();
        }
        HashSet<Integer> hashSet = new HashSet<>();
//        hashSet.add(1);
        hashSet.add(2);
        hashSet.add(3);
//        hashSet.add(1);//
        hashSet.add(32);
        hashSet.add(128);
        hashSet.add(45405);
        hashSet.add(408);
        hashSet.add(1098);
        System.out.println(hashSet);

        List<Integer> list = new ArrayList<>();
        ArrayList<Integer> arrayList = new ArrayList<>();


        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(1254);
        treeSet.add(1);
        treeSet.add(1);
        treeSet.add(2354);
        treeSet.add(14);
        treeSet.add(7);
        treeSet.add(199);
        System.out.println("treeSet = " + treeSet);


        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add(1);
        linkedHashSet.add(1);
        linkedHashSet.add(2);
        linkedHashSet.add(3);
        linkedHashSet.add(32);
        linkedHashSet.add(128);
        linkedHashSet.add(4545);
        linkedHashSet.add(408);
        linkedHashSet.add(1098);
        System.out.println("LinkedSet = " + linkedHashSet);

        System.out.println("=====WorkWithSet=====");
        for(Integer element : hashSet){
            System.out.println(element);
        }

        System.out.println(hashSet);

        if(hashSet.add(1)){
            System.out.println("Единица была добавленна");
        }


        Iterator<Integer> iterator = hashSet.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }




    }
}
