import java.util.Arrays;


interface Named {
    String name();
}

interface Figure {
    double length();

    double size();
}

abstract class BaseFigure implements Figure, Named, Comparable {

    String name;

    public BaseFigure(String name) {
        this.name = name;
    }

    public BaseFigure() {
        this.name = this.getClass().getName();
    }

    @Override
    public int compareTo(Object o) {
        Figure figure = (Figure) o;
        return (int) (size() - figure.size());
    }

    @Override
    public String name() {
        return name;
    }

    @Override
    public String toString() {
        return "Name: " + name() + " Size: " + size() + " Length: " + length();
    }
}

class Circle extends BaseFigure {

    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double size() {
        return Math.PI * radius * radius;
    }

    @Override
    public double length() {
        return 2 * Math.PI * radius;
    }

    @Override
    public boolean equals(Object obj) {
        Circle anotherCircle = (Circle) obj;
        return this.radius == anotherCircle.radius;
    }
}


class Parallelogram extends BaseFigure {

    double a, b;

    public Parallelogram(double a, double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public double size() {
        return a * b;
    }

    @Override
    public double length() {
        return 2 * (a + b);
    }
}

class Square extends BaseFigure {
    double a;

    public Square(double a) {
        super("Square");
        this.a = a;
    }

    @Override
    public double size() {
        return a * a;
    }

    @Override
    public double length() {
        return 4 * a;
    }
}

public class FigureApp {
    public static void main(String[] args) {
        Circle circle1 = new Circle(1);
        Circle circle2 = new Circle(1);

        System.out.println("== " + (circle1 == circle2));
        System.out.println("equals " + (circle1.equals(circle2)));
    }
}


