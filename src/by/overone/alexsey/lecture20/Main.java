package by.overone.alexsey.lecture20;


//try
//catch
//finally
//throw
//throws
public class Main  {
    public static void main(String[] args)   {
        int[] array = {1,2,3};
        Moderator moderator = null;
        try {
            moderator = new Moderator("Alex","121asa1");
        } catch (ModeratorAgeNotNumber exception) {
            System.out.println(exception.getMessage());
        }
        System.out.println(moderator);

//        try {
//            System.out.println(12/2);
//            System.out.println(1 / 0);
//            System.out.println(array[6]);
//            Moderator moderator2 = new Moderator("Artem","30");
//
//
//        }
//        catch (ArithmeticException exception){
//            System.out.println("Find Exception");
//        }
//        catch (ModeratorAgeNotNumber exception){
//            System.out.println("Find Exception");
//        }
//        finally {
//            System.out.println("Finally");
//        }




    }

}
