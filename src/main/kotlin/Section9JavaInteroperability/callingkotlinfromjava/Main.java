package Section9JavaInteroperability.callingkotlinfromjava;

import Section9JavaInteroperability.callingkotlinfromjava.KotlinCar; //These imports are for demonstration
import Section9JavaInteroperability.callingkotlinfromjava.StaticCar; //See the KotlinCar class file

import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        StaticCar.topLevel();
        StaticCar.print("print this Java string");

        KotlinCar car = new KotlinCar("blue", "BMW", 2011, true);
        System.out.println(car.model);
        System.out.println(car.getColor());
        System.out.println(car.isAutomatic());

        KotlinCar.carComp();// The static kotlin method call
        SingletonObj.doSomething();

//        System.out.println("isAuto = " + KotlinCar.isAuto());
        System.out.println("Constant from kotlin class" + KotlinCar.constant);

//        car.printMe(null);// This will throw an illegal argument exception
//        StaticCar.doIO();// This will throw an IO exception


        //The below won't compile even the kotlin code throws the exception ---> Solution is @Throws(IOException::class)
        try {
            StaticCar.doIO();// This will throw an IO exception
        } catch (IOException e) {
            System.out.println("IOException!!!!! from KotlinCar");
        }

        /*
        - This only works in Java when both parameters are supplied
        - Only one version of the kotlin function exists before using the overloads annotation
         */
        StaticCar.defaultArgs("The number is: ", 40);
        StaticCar.defaultArgs("The number is: "); //This works because of the annotation in the KotlinCar class

    }
}
