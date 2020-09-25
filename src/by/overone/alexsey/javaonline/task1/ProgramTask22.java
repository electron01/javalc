package by.overone.alexsey.javaonline.task1;

public class ProgramTask22 {
    public static void main(String[] args) {
        //Массивы
        //[1,2,3,4,5,6,7,8,9,10]
        int x=0;

        int[] array = new int[10];
        //kol =10, index = 0 ... index = 9
        System.out.println(array[9]);
        //[0,0,0,0,0,0,0,0,0,0]
        int[] array2 = {1,2,3,4,5,6,7,8,9,10,250};
        int[] array3 = {102,212,3121,4354,554,654,754,854,9121,1001};
        //array3[0] - 102
        //array3[1] - 212
        //array3[2] - 3121
        //array3[3] - 4354
        //...
        //Значения Массива
        //[1,2,3,4,5,6,7,8,9,10]
        System.out.println(array2[4]);
        //array[index]

        array2[0] =100;
        //[100,2,3,4,5,6,7,8,9,10]
        //Массивы  - хранят информацию о кол-ве элементов
        //array2.length -> 10 Длинна (кол-во)
        //i<10

        for(int i=0;i<array2.length;i++){
            System.out.println(array2[i]);
        }//вывод массива в консоль


        //Есть массив
        //     int[] array2 = {100,2,3,4,5,6,7,8,9,10,250};
        //Вывести в консоль, только четные числа
        //Сумма = 100+2+3+4+5...


        System.out.println("=====Even numbers======");
        for(int i=0; i<array2.length;i++){
            if(array2[i]%2==0){//array[i]%2!=0
                System.out.println(array2[i]);
            }
        }
        //  int[] array = new int[10];
        // array[0]=0;
        // array[1]=1;
        // array[2]=2;
        //....[0,1,2,3,4,5,6,7,8,9]

        //2 var [1,2,3,4,5,6,7,8,9,10]
                            //i++ - > i=i+1
        for(int i=0;i<array.length;i++){
            array[i]=i+1;
            //array[i]=i+1 - > array[0]=0+1=1, i=0!!!
            //array[i]=i+1 - > array[1]=1+1=2, i=1!!!
            //array[i]=i+1 - > array[2]=2+1=3, i=2!!!
        }

        System.out.println("=====Primer!!!!=====");
        int y =5;

        System.out.println(y+1); //5 + 1 = 6 , y = 5
        System.out.println(y);
        //6 5
        System.out.println("=====y1======");
        int y1 =5;
        y1=y1+1;
        System.out.println(y1);
        System.out.println(y1);
        //6 6
        System.out.println("=====y2======");
        int y2 =5;
        y2++;
        System.out.println(y2);
        System.out.println(y2);
        //6 6


        System.out.println("======Primer2======");
        //z++   -> z = z+1
        //z=1 z++(z=z+1), z=2
        //z=2 z++(z=z+1), z=3
        int z =1;
        System.out.println(z++);
        System.out.println(z++);
        System.out.println("z = " +z);
        int h = ++z;
        System.out.println("h = " +h);
        System.out.println("z = " +z);

        //System.out.println(z++)
        //1)System.out.println(z)
        //2)z++
        //z++
        //++z


        //     int[] array2 = {100,2,3,4,5,6,7,8,9,10,250};
        //array.length -> 11
        //array[11] ? Error!!!
        //index = 0 ... index = 10
        //array[array.length] -> array[11]
        int totalSum = 0;
        for(int i=0;i<array2.length;i++){
            totalSum=totalSum+array2[i];
//            totalSum+=array2[i]; //строка 104 и 105 одинаковые

            //int x = 1;
            // x = x+2; - > x+=2;


        }
        System.out.println("totalSum = " +totalSum);
        //totalSum = 0;
        //totalSum = totalSum + array2[i]
        //i=0
        //totalSum = totalSum + array2[0]
        //totalSum = 0 + 100 = 100
        //i=1
        //totalSum = totalSum + array2[1]
        //totalSum = 100 + 2 = 102




        int example =1;
        example+=1;
        example = example +1;
        example++;


        example = example*5;
        example*=5;

        float f =2.5f;




    }
}
