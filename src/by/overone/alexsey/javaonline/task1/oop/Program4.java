package by.overone.alexsey.javaonline.task1.oop;


public class Program4 {
    public static void main(String[] args) {
        int x = 2;
        ex(x);

        System.out.println(ex(x));
        int[][] array = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}, {10, 11, 12}};
        int[][] array3 = new int[5][5];
        int sum = 0;
        //{1,2,3} -> i=0
        //i = 0, j = 0 -> 1, i=0, j=1 -> 2, i=0, j=2 ->3
        //{4,5,6} -> i=1
        //{7,8,9} -> i=2
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                sum += array[i][j];
            }
        }
        System.out.println(sum);
        //4 task
        printer("Hello World!", 3);
        int x1 = printer2("Hello", 1);
        System.out.println("x1 = " + x1);
        //3 task
        int temp = 0;
        //{1,2,3},{4,5,6},{7,8,9} tmp=1
        //{7,2,3},{4,5,6},{7,8,9} tmp=1
        //{7,2,3},{4,5,6},{1,8,9} tmp=1
        for (int j = 0; j < array[0].length; j++) {
            temp = array[0][j];
            array[0][j] = array[array.length - 1][j];
            array[array.length - 1][j] = temp;
        }
        for(int i=0; i<array.length;i++){
            for(int j=0; j<array[i].length;i++){
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        int[] array2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

//        for(int i=0; i<array2.length;i++){
        //if(array2[i]%2==0)
//            System.out.println(array2[i]);
//        }
        for (int element : array2) {
            if (element % 2 == 0) {
                System.out.println(element);
            }
        }


    }

    static int ex(int x) {
        return x * x;
    }

    static void printer(String text, int count) {
        for (int i = 0; i < count; i++) {
            System.out.println(text);
        }
    }

    static int printer2(String text, int count) {
        if (count == 0) {
            return 0;
        }
        System.out.println(text);
        printer2(text, count - 1);//0
        return 1;
    }


}
