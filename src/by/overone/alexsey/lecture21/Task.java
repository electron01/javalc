package by.overone.alexsey.lecture21;

public class Task {
    public static void main(String[] args) {
        int[] array = {10, 7, 5, 8, 9, 1, 4, 5, 7, 0, 9};
        //1 find middle value
        double sum = 0;
        for (int i = 0; i < array.length; i++) {
//            sum = sum + array[i];
            sum += array[i];
        }

        System.out.println(sum / array.length);

        /**find 2 max value, 1 option*/
/*        int maxIndex = 0;
        for (int i = 0; i < array.length; i++) {
            if(array[i]>array[maxIndex]){
                maxIndex=i;
            }

        }
        System.out.println("max 1: " + array[maxIndex]);
        int maxIndex2 = 0;
        for (int i = 0; i < array.length; i++) {
            if(array[i]>array[maxIndex2] && array[i]!=array[maxIndex]){
                maxIndex2=i;
            }

        }
        System.out.println("max 2: " + array[maxIndex2]);*/

        /**find 2 max value, 2 option*/
/*        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        int countMax =3;
        for(int i = 1; i<=countMax;i++){
            System.out.println("max " +i +": " + array[array.length-i]);
        }*/

        /**find 2 max value, 3 option*/
        System.out.println("---------------------");
        int maxIndex1 = 0;
        int maxIndex2 = 0;
        for(int i=0; i<array.length;i++){
            if(array[i]>array[maxIndex1]){
                maxIndex2=maxIndex1;
                maxIndex1=i;
            }
        }
        System.out.println("max 1:" + array[maxIndex1]);
        System.out.println("max 2:" + array[maxIndex2]);

    }


}
