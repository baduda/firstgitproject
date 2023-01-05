package carsexample;


class Car {
    void start() {
        System.out.println("Engine is started");
    }

    void stop() {
        System.out.println("Engine is stopped");
    }

    void drive() {
        System.out.println("Car is moving");
    }
}

class SportCar extends Car {
    void drive() {
        System.out.println("Car is moving fast");
    }
}

public class CarsExampleApp {

    public static void main(String[] args) {
        SportCar sportCar = new SportCar();

        action(sportCar);
    }

    static void action(Car car) {
        car.start();
        car.drive();
        car.stop();
    }

    static void sportCarAction(Car car) {
        SportCar sportCar = (SportCar) car;
    }
}
