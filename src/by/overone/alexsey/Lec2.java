package by.overone.alexsey;

public class Lec2 {
    public static void main(String[] args) {
        int num1=12;
        int num2=10;

        if(num1>num2){
            System.out.println("num1>num2");
        }
        else if(num1<num2){
            System.out.println("num1<num2");
        }
        else{
            System.out.println("num1==num2");//4
        }
        System.out.println("HELLO");


        int x = 5;
        int y = 2;
        char op = '*';
        int rez;
        if (op == '+') {//start this if
            rez = x + y;
            System.out.println(rez);
        }  //end this if
        else if (op == '-') {
            rez = x - y;
            System.out.println(rez);
        } else if (op == '*') {
            rez = x * y;
            System.out.println(rez);
        } else if (op == '/') {
            rez = x / y;
            System.out.println(rez);
        } else if (op == '%') {
            rez = x % y;
            System.out.println(rez);
        } else {
            System.out.println("Error!!!");
        }
    }
}
