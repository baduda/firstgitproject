package simple;

class Animal {
    String name;
    int age;
    double mass;
}

class Cat extends Animal {
    void meow() {
        System.out.println("meow");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("bark");
    }
}

class RidingDog extends Dog {
    int speed;
    int stamina;
}

class FightingDog extends Dog {
    void bark() {
        System.out.println("BARK!!!");
    }
}

public class CatDogsApp {
    public static void main(String[] args) {
        Dog dog1 = new RidingDog();
        Dog dog2 = new FightingDog();

        dog1.bark();
        dog2.bark();
    }
}
