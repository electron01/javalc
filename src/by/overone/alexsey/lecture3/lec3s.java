package by.overone.alexsey.lecture3;

public class lec3s {
    public static void main(String[] args) {
        int x = 5;
        int y = 2;
        char op = '%';
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
//
        System.out.println("Work with Array!!!!!!!!!!!");

        int[] array = new int[100];

        for (int i = 99, j = 0; i > 0; i--, j++) {
            array[j] = i;

        }

        for (int i = 0; i < 100; i++) {
            System.out.println(array[i]);

        }


//        for(;;){
//            System.out.println("AAA"); //Бесконечный цикл
//    }
//        System.out.println();
//
//        for (int i = 1; i <= 10; ) { //изменение пер-ой в отдельной строке
//            System.out.println(i);
//            i++; //изменение переменной
//        }

    }
}
