package by.overone.alexsey.op37;

public class Lec1 {
        public static void main(String[] args) {
            int x = 12;
//            int y = x*2 + ++x;
//            System.out.println(y);
            boolean test = true;
            boolean test2 = false;
            boolean test3 = 5>=5;
            boolean test4 = 5<=5;
            int num1 =101;
            int num2 =100;
            if(num1>num2){
                System.out.println(num1+">"+num2);
            }
            else if(num2>num1){
                System.out.println(num2+">"+num1);
            }
            else{
                System.out.println("num1==num2");
            }
            int i =129;
            byte b = (byte)i;//Явное Преобразование
            System.out.println(b);
            char ch ='$';
//            int i1 =ch;
            long l =10000000000l;
//            System.out.println(i1);

        int i3 = 2134564567;//64567//6461
        long lg = i3;
        double db = i3;
        float fl = i3;

        System.out.println("double db = " + db);
        System.out.println("float fl  = " + fl);
        System.out.println("int i3    =  " + i3);

        byte x2 = 120;
        int x1 = x2;//Неявное Преобразование (Автоматическое преобразование)

        System.out.println("x2 = " + x2);
        long lg1 = 213456456756654l;
            //569->56756654
        double db1 = i3;
        float fl1 = i3;//6461->64567756654
        System.out.println("long lg1 = "+lg1);
        System.out.println("double db = " + db1);
        System.out.println("float fl =" + fl1);

        float f1 = 0.3f;
        float f2 = 0.1f;
        System.out.print("f1-f2 = ");
        System.out.print(f1-f2);

        //Создание массива целых чисел на 10 элементов
        int[] array = new int[10];
        int[] array2 = {1,2,3,4,5,6,7,8,9,10};

        //array = array[0] = 0, array[1]=0, array[2]=0, array[3]=0 ... array[9]=0
        //array2 = array2[0]=1, array2[1]=2, array2[2] = 3, array2[3] = 4 ... array2[9] = 10
            //В квадратных скобках - индексы (начиная с нуля)


        }
    }


