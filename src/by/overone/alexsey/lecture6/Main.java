package by.overone.alexsey.lecture6;


public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("red","Car A");
        Car car2 = new Car("blue");
        Car car3 = new Car();

        car1.test();
        car1.test("asasasa");
        car1.test("asasasa","As");


//        System.out.println("car1.name:" +car1.name);
//        System.out.println("car1.color:" +car1.color);
//        System.out.println("car2.color:" +car2.color);
//        System.out.println("car2.name:" +car2.name);


        Car.swap(car1,car2);


//        Car tmp = car1;
//        car1 = car2;
//        car2=tmp;

//        System.out.println("----------");
//
//        System.out.println("car1.name:" +car1.name);
//        System.out.println("car1.color:" +car1.color);
//        System.out.println("car2.color:" +car2.color);
//        System.out.println("car2.name:" +car2.name);

        Car[] array = new Car[10];
        for(int i=0; i<array.length;i++){
            array[i] = new Car();
            array[i].name = "Car#" +i;
            array[i].price = i+1000;
        }

        System.out.println("=====For======");

        for (Car c:array){
            System.out.println(c);
        }

        System.out.println("=====For======");


        for(int i=0; i<array.length;i++){
            System.out.println(array[i]);
        }


        Car car0 = new Car();
        car0.name = "Mazda";
        car0.color = "red";
        car0.price = 16000;

        System.out.println(car0);

    }


}

