package genericexamples;

import java.util.Arrays;
import java.util.Comparator;

class Person {
    private final String name;
    private final int salary;

    private final int age;

    public Person(String name, int salary, int age) {
        this.name = name;
        this.salary = salary;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", age=" + age +
                '}';
    }
}
public class MainApp {
    public static void main(String[] args) {
        Person[] people = {
                new Person("Persion 1", 200, 50),
                new Person("Persion 2", 100, 60),
                new Person("Persion 3", 300, 20),
        };

        Arrays.sort(people, Comparator.comparingInt(Person::getSalary));

        System.out.println("people = " + Arrays.toString(people));

        Arrays.sort(people, Comparator.comparingInt(Person::getAge));
        System.out.println("people = " + Arrays.toString(people));
    }
}
