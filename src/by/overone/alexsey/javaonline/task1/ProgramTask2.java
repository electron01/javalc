package by.overone.alexsey.javaonline.task1;

public class ProgramTask2 {
    public static void main(String[] args) {

        //ctr + /

        //for, while, do..while

        //for - исп-тся когда мы знаем количество
        //for (переменная ; условие; изменение переменной)
        int x=0;
        x = x+1;
        x+=1;
        x++;

        for (int i=0; i<=10;i++)//i=0 .. i=10
        //i=0, i<10 -> 0<10 - > System.out.println("1");->i++, i=1, i<1 -> 1<10 - >System.out.println("1");
        {
            System.out.println(i);

        }

//        for (;;){
//            System.out.println("Hello");
//        }

        System.out.println("=========");
        int j=0;
        for(j=5;j<15;j++){
            System.out.println(j);

        }
        System.out.println("j = " +j);

        System.out.println("=========");
        for(int k=0; k<100; k+=2){
            System.out.println(k);
        }
        //k = 0 .. k = 98
        // 100

//        for (int z=0,w=1; z<=100; z++,w+=2){
//            System.out.println("z = " +z);
//            System.out.println("w = " +w);
//        }

        //while (условие)- пока условие выполняется
        //gameOver = false
        //while(!gameOver)
        //while(!gameOver) -> while(!false) - > while (true) -> work
        //gameOver = true
        //while(!gameOver) - > while(!true) - > while (false)-> stop

        int i2=1;
        while (i2<100){
            System.out.println(i2);
            i2 = i2*10;

        }
        boolean test1 = true;
        boolean test2 = !test1;

        boolean gameOver = false;
        if (gameOver){
            System.out.println("gameOver - true");

        }else{
            System.out.println("gameOver - false");
        }
        int kol =10;
//        while(gameOver!=true){
          while(!gameOver){
            //if (если попали ) -> kol--
           kol--;
           if(kol==0){
               gameOver=true;
           }

        }
        System.out.println("=====While=====");
          int k2 =100;
          while(k2<10){
              System.out.println("Hello World!");
          }

        System.out.println("=====doWhile=====");
          int k3 = 100;
          do {
              System.out.println("Hello World");
          }
          while (k3<10);
          //doWhile отличается от while, тем  что do While - 100% выполнится хотя бы раз


    }
}
