package Section9JavaInteroperability;

import org.jetbrains.annotations.Nullable;

/*
- This annotations are just documentation
 */
public class JavaCar {

    public static int x = 5;
    private String color;
    private String model;
    private int year;
    private Object anObject;

    public JavaCar(String color, String model, int year) {
        this.color = color;
        this.model = model;
        this.year = year;
    }

    public Object getAnObject() {
        return anObject;
    }

    public static String xString() {
        return "This is x: " + x++;
    }

    public String getColor() {
        return color;
    }

    public void setColor(@Nullable String color) {
        this.color = color;
    }

    public @Nullable String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void variableMethod(int num, String... strings) {
        for (String string: strings) {
            System.out.println(string);
        }
    }

    public void wantsIntArray(int[] theArray) {
        for (int i: theArray) {
            System.out.println("Here's the int: " + i);
        }
    }

    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                '}';
    }

    public void demoMethod(Runnable r) {



        new Thread(r).start();

//        new Thread(() -> System.out.println("I'm in a thread!!!!!")).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("I'm in a thread!!!!!");
            }
        }).start();
    }
}
