package Section9JavaInteroperability.callingkotlinfromjava;

import Section9JavaInteroperability.callingkotlinfromjava.KotlinCar; //These imports are for demonstration
import Section9JavaInteroperability.callingkotlinfromjava.StaticCar; //See the KotlinCar class file

public class Main {

    public static void main(String[] args) {
	    StaticCar.topLevel();
	    StaticCar.print("print this Java string");

	    KotlinCar car = new KotlinCar("blue", "BMW", 2011, true);
	    System.out.println(car.model);
	    System.out.println(car.getColor());
        System.out.println(car.isAutomatic());

    }
}
