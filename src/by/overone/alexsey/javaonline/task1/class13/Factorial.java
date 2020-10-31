package by.overone.alexsey.javaonline.task1.class13;

public class Factorial {
    //1! - 1
    //2! - 1*2 =2
    //3! - 1*2*3 = 6
    //4! - 1*2*3*4 = 24
    public int getFactorialNumber(int number) {
        if(number<0){
            try {
                throw new Exception("Number <0");
            } catch (Exception e) {
                System.out.println("Error! number <0");
                return 0;
            } finally {
                System.out.println("Method finished");
            }
        }
        int result =1;
        for(int i=2; i<=number;i++){
            result*=i;
            //result = result * i
        }
        return result;

    }
}
