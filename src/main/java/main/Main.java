package main;

import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        new Main().run();
    }

    private void run() {
        Car[] cars = new Car[]{
                new Car(1, "Toyota", 2012, 10000, "AA1111BB"),
                new Car(2, "BMW", 2020, 20000, "AA1233BB"),
                new Car(3, "Ford", 2015, 5000, "AA4411BB"),
                new Car(4, "VAZ", 1990, 1000, "AA9854BB"),
                new Car(5, "Toyota", 2013, 19000, "AA8888BB")
        };

        Scanner in = new Scanner(System.in);
        String model = in.nextLine();

        Car[] found = find(model, cars);
        print(found);
        System.out.println(model);
    }

    public Car[] find(String model, Car[] cars) {
        Car[] result = new Car[cars.length];
        int count = 0;
        for (Car car : cars) {
            if (Objects.equals(model, car.getModel())) {
                result[count++] = car;
            }
        }
        return Arrays.copyOf(result, count);
    }

    public void print(Car[] cars) {
        for (Car car : cars) {
            System.out.println(car);
        }
    }
}
