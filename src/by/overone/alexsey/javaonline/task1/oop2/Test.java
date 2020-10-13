package by.overone.alexsey.javaonline.task1.oop2;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        String text = "Hello World";
        text = "      Hello hello World world qqq lolololoo       ";
        System.out.println(text);
        System.out.println(text.replace('l','Z'));
        System.out.println(text.trim());
        System.out.println(text.charAt(6));
        System.out.println(text.replace(" ",""));
        text=text.trim();


        String[] words = text.split(" ");
        System.out.println(Arrays.toString(words));
        System.out.println(text.substring(6, 11));
      for(int i=0;i<words.length;i++){
          System.out.println("Length["+i+"] = "+words[i].length());
      }
      //String text1 = new String("Artem");
     // String text2 = new String("Artem");
        String text1 = "Artem";
        String text2 = "Artem";
        System.out.println(text1==text2);

    }
}
