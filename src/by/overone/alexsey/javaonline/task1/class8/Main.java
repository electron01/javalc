package by.overone.alexsey.javaonline.task1.class8;

import by.overone.alexsey.inter.A;

import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        NoteBook noteBook = new NoteBook();
        System.out.println(noteBook.getId());
        NoteBook noteBook1 = new NoteBook();
        System.out.println(noteBook1.getId());
        PixelBook pixelBook = new PixelBook();
        pixelBook.setProcessor("Intel");
        System.out.println(pixelBook.getId());
        System.out.println(pixelBook.toString());

//        int i = 120;
//        Integer integer = 100;
//        integer.toString();
//

        ArrayList<Integer> arrayList = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(12);
        linkedList.add(100);
        System.out.println("element =" + linkedList.get(1));
        System.out.println(linkedList);
        System.out.println(arrayList.size());
        arrayList.add(120);
        System.out.println(arrayList.size());
        arrayList.add(110);
        arrayList.add(100);
        arrayList.add(120);
        arrayList.add(110);
        arrayList.add(100);
        arrayList.add(120);
        arrayList.add(0, 200);
        arrayList.remove(1);
//        arrayList.clear();
        System.out.println(arrayList.size());
        arrayList.trimToSize();
        System.out.println(arrayList.size());
        System.out.println(arrayList);

        for (Integer element : arrayList) {
            System.out.println(element);
        }

        ArrayList<NoteBook> noteBookArrayList = new ArrayList<>();
        noteBookArrayList.add(noteBook);//id = 1
        noteBookArrayList.add(pixelBook); // id = 3
        noteBookArrayList.add(noteBook1); //id =2


        System.out.println("=====noteBookArrayList=====");
        for(NoteBook e : noteBookArrayList){
            System.out.println(e.getId());
            if(e instanceof PixelBook){
                System.out.println(((PixelBook) e).getProcessor());
            }
        }
        System.out.println("=====noteBookArrayList=====");



    }
}
