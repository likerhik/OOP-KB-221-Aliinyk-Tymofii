import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {
        // Створення об'єктів фігур
        Triangle triangle = new Triangle(new Point(0, 0), new Point(3, 0), new Point(0, 4));
        Quadrilateral quadrilateral = new Quadrilateral(new Point(0, 0), new Point(5, 0), new Point(5, 4), new Point(0, 4));
        Circle circle = new Circle(new Point(5, 0), 5);

        // Виведення інформації про фігури
        System.out.println(triangle.toString());
        System.out.println("Area: " + triangle.calculateArea());
        System.out.println("Centroid: " + triangle.centroid());

        System.out.println(quadrilateral.toString());
        System.out.println("Area: " + quadrilateral.calculateArea());
        System.out.println("Centroid: " + quadrilateral.centroid());

        System.out.println(circle.toString());
        System.out.println("Area: " + circle.calculateArea());
        System.out.println("Centroid: " + circle.centroid());
    }
}
