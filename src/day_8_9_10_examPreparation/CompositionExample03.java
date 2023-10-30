package day_8_9_10_examPreparation;

import java.util.*;

public class CompositionExample03 {
    public static void main(String[] args) {
        Circle circle = new Circle(5.0);
        Rectangle rectangle = new Rectangle(10.0, 2.0);

        AreaCalculator calculator = new AreaCalculator();
        calculator.addShape(circle);
        calculator.addShape(rectangle);

        double totalArea = calculator.getTotalArea();
        System.out.println("Total area: " + totalArea);

    }
}
interface Shape {
    double getArea();
}

class Circle implements Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }
}

class Rectangle implements Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getArea() {
        return length * width;
    }
}

class AreaCalculator {
    private List<Shape> shapes;

    public AreaCalculator() {
        shapes = new ArrayList<>();
    }

    public void addShape(Shape shape) {
        shapes.add(shape);
    }

    public double getTotalArea() {
        double totalArea = 0.0;

        for (Shape shape : shapes) {
            totalArea += shape.getArea();
        }

        return totalArea;
    }
}


