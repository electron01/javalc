package by.overone.alexsey.lecture2;

public class Main {
    public static void main(String[] args) {//СТАРТ ПРОЕКТА
        //ex1(); // - ЗАПУСК КОДА ИЗ ФУНКЦИИ (static void ex1,  (НАЧАЛО НА 13 СТРОКЕ))
        //ex2();// - ЗАУПСК КОДА ИЗ ФУНКЦИИ (static void ex2)
         ex3();// - ЗАПУСК КОДА ИЗ ФУНКЦИИ (static void ex3)

    }


    static void ex1(){
        int x=10;
        int z=10;
        boolean xz=x==z;
        System.out.println("xz=x==z = " + xz);
        int k=15;
          boolean xk=x==k;//false
          boolean xk2=x>k; //false 10>15
          boolean xk3=x<k;// xk3 = 10<15; - True
        boolean xk4= x!=k; //xk4 = x!=k; 10!=15
        System.out.println("xk=x==k = " + xk);
        System.out.println("xk2=x>k = " + xk2);
        System.out.println("xk3=x<k = " + xk3);
        System.out.println("xk4=x!=k = " + xk4);
        boolean test = 10>10;//false
        boolean test2= 10>=10;//TRUE
        boolean test3 =19<25;//TRUE
        System.out.println("test=10>10 = "+test);
        System.out.println("test2=10>=10 = "+test2);
        System.out.println("test=19<=25 = "+test3);
//

    }

    static void ex2(){
        boolean test = (9>10)|(120<125);//false or True
        System.out.println("test = " +test);
        boolean test2 = (9>10)&(120<125);
        System.out.println("test2 = " +test2);
        boolean test3 = (19>10)^(120<125);//true^true = false (like OR)
        System.out.println("test3 = " +test3);
        boolean test4 = (9>10)||(120<125);
        System.out.println("test4 = " +test4);
        boolean test5 = false;
        boolean test6=!test5;
        System.out.println("test6 = " +test6);



//        boolean test7 = (1<2)|(127/0==2);// true 127/0
//        System.out.println("test7 = "+ test7);

        boolean test8 = (1<2)||(127/0==2);
        System.out.println("test8 = "+ test8);
//
//        boolean test9 = (12<2)&(127/0==2);
//        System.out.println("test9 = "+ test9);

        boolean test9 = (12<2)&&(127/0==2); //false and false/true = false
        System.out.println("test9 = "+ test9);
/**
 * False and False/TRUE = FALSE
 * TRUE OR FALSE/TRUE = TRUE
 * | || & &&
 */


    }
    static void ex3(){
        int number1=19;
        int number2=12;
        if(number1>number2)
        {
            System.out.println("number1>number2");

        }
        System.out.println("123");


        if(22>100){
            System.out.println("22>100");
        }else{
            System.out.println("22<100");
        }
        int num1=10;
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
//      Сюда!!!!!!!!!!!!
//        if(1200>129 || 1<0){
//            System.out.println("Yes");
//        }




        for(int i=0;i<10;i++)//(i;Условие(i<10);)
        {
            System.out.println(i);
        }
        int j=0;
        boolean isActive = false;
        while(isActive!=true){ //if( условие){ }
            j++;//1
            System.out.println(j);//1
            if(j==123){
                isActive=true;
            }
        }

        int[] array3 = new int[100];
        int[] array2 = {1,2,3,4};
        for(int i=0; i<array3.length; i++){
            System.out.println(array3[i]); //МАССИВ СОСТОИТ ИЗ 0
        }
        for(int i=0; i<array3.length; i++){ //МАССИВ ЗАПОЛНЯЕМ ЗН-ЯМИ ОТ 0 ДО 99
            array3[i]=i;
        }
        for(int i=0; i<array3.length; i++){ //ВЫВОД МАССИВА
            System.out.println(array3[i]=i);
        }

    }
}
