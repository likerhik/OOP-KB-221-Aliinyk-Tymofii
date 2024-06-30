import java.text.DecimalFormat;

public class Circle extends Figure {
    private Point center;
    private double radius;

    public Circle(Point center, double radius) {
        this.center = center;
        this.radius = radius;
        // Перевірка на виродженість кола
        if (radius <= 0) {
            throw new IllegalArgumentException("Circle is degenerate.");
        }
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public Point centroid() {
        return center; // Центр кола є його центроїдом
    }

    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("#.##");
        return "Circle[" + center + " " + "Radius: " + df.format(radius) + "]";
    }
}
