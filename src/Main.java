import bt1.Circle;
import bt1.Cylinder;
import bt4.Triangle;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    /*
    -------------------------------------
|               Circle              |
-------------------------------------
| - radius: double                  |
| - color: String                   |
-------------------------------------
| + Circle(radius: double, color: String) |
| + getRadius(): double             |
| + setRadius(radius: double): void |
| + getColor(): String              |
| + setColor(color: String): void  |
| + getArea(): double              |
| + toString(): String             |
-------------------------------------

-------------------------------------
|              Cylinder             |
-------------------------------------
| - height: double                  |
-------------------------------------
| + Cylinder(radius: double, color: String, height: double) |
| + getHeight(): double             |
| + setHeight(height: double): void|
| + getVolume(): double            |
| + toString(): String             |
-------------------------------------
     */
        Circle circle = new Circle(5.0, "Red");
        System.out.println(circle);
        System.out.println("Area: " + circle.getArea());

        // Test Cylinder
        Cylinder cylinder = new Cylinder(100.0, "Blue", 7.0);
        System.out.println(cylinder);
        System.out.println("Area: " + cylinder.getArea());
        System.out.println("Volume: " + cylinder.getVolume());



        //test bt4
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter side1: ");
        double side1 = scanner.nextDouble();
        System.out.print("Enter side2: ");
        double side2 = scanner.nextDouble();
        System.out.print("Enter side3: ");
        double side3 = scanner.nextDouble();
        scanner.nextLine();  // Consume newline

        System.out.print("Enter color: ");
        String color = scanner.nextLine();

        Triangle triangle = new Triangle(side1, side2, side3);
        triangle.setColor(color);

        System.out.println("Triangle information:");
        System.out.println("Color: " + triangle.getColor());
        System.out.println("Side1: " + triangle.getSide1());
        System.out.println("Side2: " + triangle.getSide2());
        System.out.println("Side3: " + triangle.getSide3());
        System.out.println("Area: " + triangle.getArea());
        System.out.println("Perimeter: " + triangle.getPerimeter());
    }

}