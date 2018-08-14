package transport;

import java.util.Random;

public class Main {
    // shortcut type: 'psvm'
    public static void main(String[] args) {
        Car car1 = new Car(30);
        System.out.println("speed " + car1.getSpeed() + " gear " + car1.getGear());

        car1.applyBrake(4);
        car1.speedUp(9);
        System.out.println("speed " + car1.getSpeed() + " gear " + car1.getGear());

        Random rand = new Random();
        Car[] cars = new Car[5];

        for (int i = 0; i < cars.length; i++) {
            int speed = rand.nextInt(70); // 0-69
            Car car = new Car(speed);
            cars[i] = car;
            System.out.println(
                    "Speed " + cars[i].getSpeed()
                            + ", Gear " + cars[i].getGear()
            );
        }

    }
}
