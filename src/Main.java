//Create the Figure interface.
// The interface should contain the methods getPerimeter (returning the perimeter)
// and getArea (returning the area). Then create the Circle, Parallelogram, and Rectangle classes,
// each class implementing the Figure interface.
// Provide an implementation of the interface and classes so that the following code snippet:

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        double radius = 3d;
        Figure circle = new Circle(radius);

        double baseSide = 10d;
        double side = 5d;
        double height = 8d;
        Figure parallelogram = new Parallelogram(baseSide, side, height);

        double sideA = 15d;
        double sideB = 10d;
        Figure rectangle = new Rectangle(sideA, sideB);

        List<Figure> figures = new ArrayList<>(3);
        figures.add(circle);
        figures.add(parallelogram);
        figures.add(rectangle);

        for (Figure figure : figures) {
            System.out.println("Area: " + figure.getArea() + " units.");
            System.out.println("Perimeter: " + figure.getPerimeter() + " units.\n");
        }
    }
}
// if loop for when the value is 1 unit? instead of units?