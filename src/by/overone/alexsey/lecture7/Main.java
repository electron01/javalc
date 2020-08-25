package by.overone.alexsey.lecture7;

import jdk.swing.interop.SwingInterOpUtils;

public class Main {
    public static void main(String[] args) {
        //Примитивные типы данных
        //byte,short,int,char,long,float.double,boolean
        int number = 10;
        number =21;//Так можно сделать
//      number ="Hello" //так сделать нельзя, так как, Java - строго типизированный язык, а значит каждая перемнная имеет свой тип, тут number имеет тип int, а значит положить внутрь number строку мы не можем!
        byte bt = 120;
        int i1 =bt;//Неявное преобразование (int больше чем byte)
        short sh = (short)i1;//Явное преобразование(short меньше чем int), мы явно указываем тип, и только мы отвечаем за корректность преобразования int в short

        int a=1;
        int b=2;
        if(a>b){//Если а больше б, выполнится этот блок (строчка 16), и после этого все else if и else  будут пропущенны, и дальше будет выполнение (строки 25)!
            System.out.println("a>b");
        }
        else if(b>a){//Только если(!!!) if не выполнился то будет происходить эта проверка -> Если б больше а, выполнится этот блок (строчка 19), и после этого все else if и else  будут пропущенны, и дальше будет выполнение (строки 25)!
            System.out.println("b>a");

        }
        else{//Если не из блоков if(else if) не выполнился, то выполнится блок else (строчка 23), и после этого будет выполняться (строчка 25)!
            System.out.println("a==b");
        }

        number++;//Пост Инкремент - добавили 1, number =21; станет number =22;
        number--;//Пост Декремент - отняли 1, number =22; станет number =21;
        System.out.println(number);
//Нужно заполнить массив от 1 до 10
        //Решение
        int[] array = new int[10];
        for(int i=0;i<array.length;i++){
            array[i]=i+1;
            //получается в начале i=0, array[0]=0+1,то есть array[0]=1, array[1]=1+1=2, array[2]=2+1=3,array[3]=4 ... array[9]=10
        }
        System.out.println("=====Array=====");
        for (int i=0; i<array.length;i++){//Просто Вывод массива!
            System.out.println(array[i]);
        }
        System.out.println("=====Array=====");
//        array[10]=12;//Ошибка!!! последний индекс = 9(array[9],так как нумерация идет от нуля до 9, а количество получается 10))
        //Изменить размер массива в процессе выполнения, нельзя!!!
        // цикл while (условие) используется, когда мы не знаем!, сколько раз нам нужно будет выполнить код внутри этого цикла, пока условие перестанет выполняться
        ex();
        ex();
        ex();//три раза выведет hello  в консоле
        System.out.println("===============");
        String text = "Text";
        System.out.println(text.toLowerCase());//метод который приведет всю строку к нижнему регистру (text)
        System.out.println(text.toUpperCase());//метод который приведет всю строку к верхнему регистру (TEXT)
        //Нужно вывести на экран от 0 до 10, с помощью цикла
        //С помощью  for
        System.out.println("=====For=====");
        for (int j=0;j<10;j++){
            System.out.println(j);
        }
        System.out.println("=====For=====");
        //while
        System.out.println("=====While=====");
        int j2=0;
        while (j2<10){
            System.out.println(j2);
            j2++;
        }
        System.out.println("=====While=====");
        //do while
        System.out.println("=====doWhile=====");
        int j3=0;
        do{
            System.out.println(j3);
            j3++;
        }
        while(j3<10);
        System.out.println("=====doWhile=====");
        //Отличе while от do while, одно - то что, do while 100% выполнит свой блок кода ХОТЯ БЫ ОДИН РАЗ, после чего проверит условие while, и если условие не выполняеться, то прекратит свою работу
        System.out.println("=====Primer=====");
        int count = 100;
        do{
            System.out.println("do while = "+  count);//do while = 100  выведется в консоль
        }
        while (count<10); //когда будет выполняться эта строчка, получится count<10 (count =100, 100<10 - Нет!, цтел остановится)

        while (count<10){//В первую очередь смотрим условие count<10(100<10 условие не выполняется)
            System.out.println("while = " + count); //сюда даже не зайдем!//ВОТ и отличие от do while, который один раз выведет 100
        }
    }
    static void ex(){//Функция(метод), используется чтобы не писать много рах одно и тоже(не дублировать код)
        System.out.println("Hello");
    }
}
