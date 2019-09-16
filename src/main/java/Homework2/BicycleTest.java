package Homework2;

public class BicycleTest {
    public static void main(String[] args) {
        Bicycle bicycle1 = new Bicycle(5, 5, 6);
        System.out.println(bicycle1);
        bicycle1.speedUp();

        Bicycle bicycle2 = new Bicycle(2, 4, 3);
        System.out.println(bicycle2);
        bicycle2.applyBrake();

    }
}
