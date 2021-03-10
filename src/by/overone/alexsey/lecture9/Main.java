package by.overone.alexsey.lecture9;



//Задание:
//1)Разобраться с теорией
//2) Получения n-ого по счёту числа Фибоначчи (цикл)
//3)Получения n-ого по счёту числа Фибоначчи (Рекурсия)
//4) Создать класс калькулятор с методами для сложения* и вычитания* цифр, создать класс МойКалькулятор который будет наследоваться от калькулятор'a
//создайте в этом классе метод для умножения* цифр, затем переопределите метод сложения в дочернем классе добавьте вывод сообщения о том,
//что это метод дочернего класса
//* - эти методы должны принимать два числа и пше  результат работы(+,-,*)

public class Main {
    static int number = 5;


    public static void main(String[] args) {
        NoteBook noteBook = new NoteBook();
        //NoteBook pixelBook1= new PixelBook();

        noteBook.name = "NoteBook";
        PixelBook pixelBook = new PixelBook();
        pixelBook.pixelNumber=12;
        pixelBook.name = "TestName";
        pixelBook.test("sasa");
        pixelBook.test();
        System.out.println(pixelBook);
        pixelBook.setAge(1000);
        System.out.println(pixelBook.getAge());




        Phone phone = new Phone("Model#1", 1);
        Phone phone2 = new Phone("Model#2", 2);
        Phone phone3 = new Phone();
        Phone phone4 = new Phone("Model#3", "Group2");
        phone.testMethod();//not static
        Phone.testStatic1();//static
        phone2.testMethod();

//        test(number);


        //3! = 1*2*3
        //5! = 1*2*3*4*5 =
        //10! = 1*2*3*4*5*6*7*8*9*10
        int number = 4;
        int fact1 = fact(number);
        System.out.println("fact = " + fact1);
        //int rez = 1;
        for (int i = number - 1; i > 1; i--) {
            number *= i;
        }
        System.out.println(number);

    }

    static int fact(int number) {
        if (number == 1) {
            return 1;
        }
        number = number * fact(number - 1);

        return number;
    }


    static void test(int x) {
        if (number == 0) {
            return;
        }
        System.out.println("Hello");
        test(number--);
//        System.out.println(number);


    }


}
