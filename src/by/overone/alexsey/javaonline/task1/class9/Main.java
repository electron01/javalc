package by.overone.alexsey.javaonline.task1.class9;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
      Phone phone = new Phone("Pixel",1000);
      phone.turnOn();
      phone.printMessage();
      phone.printMessage("Hello world");
      phone.printMessage(1);
      OtherPhone otherPhone = new OtherPhone();
      otherPhone.turnOn();
        System.out.println(phone);
        System.out.println(otherPhone);

        ArrayList<Phone> phones = new ArrayList<>();
        phones.add(phone);
        phones.add(otherPhone);
        phones.add(new Phone());
        System.out.println("==========");
        for (Phone ph:phones ){
            ph.turnOn();
        }
        method(phone);
        method(otherPhone);
      System.out.println("=====Test=====");
      Phone phone2 = new Phone("Iphone",1250);
      OtherPhone otherPhone2 = new OtherPhone("A");
     //
      Phone testPhone = new OtherPhone();

      System.out.println("======Testik=====");
      Testik testik = new Testik();
      testik.testMethod(testPhone);

      System.out.println("======Equals=====");
      Phone newPhone1 = new Phone(10,"OnePlus",1000);
      Phone newPhone2 = new Phone(10,"OnePlus",1000);
      System.out.println(newPhone1==newPhone2);
      System.out.println(newPhone1.equals(newPhone2));
//      System.out.println(newPhone1.equals(new Object()));



    }
    static void method(Phone phone){
      System.out.println("Static method");
    }
}
