public class Triangle extends Figure {
    private Point a;
    private Point b;
    private Point c;

    public Triangle(Point a, Point b, Point c) {
        this.a = a;
        this.b = b;
        this.c = c;
        // Перевірка на виродженість трикутника
        if (isDegenerate()) {
            throw new IllegalArgumentException("Triangle is degenerate.");
        }
    }

    private boolean isDegenerate() {
        // Трикутник вважається виродженим, якщо всі його вершини лежать на одній прямій
        return ((b.x - a.x) * (c.y - a.y) == (c.x - a.x) * (b.y - a.y));
    }

    @Override
    public double calculateArea() {
        return Math.abs((a.x*(b.y-c.y) + b.x*(c.y-a.y) + c.x*(a.y-b.y)) / 2.0);
    }

    @Override
    public Point centroid() {
        double centroidX = (a.x + b.x + c.x) / 3.0;
        double centroidY = (a.y + b.y + c.y) / 3.0;
        return new Point(centroidX, centroidY);
    }

    @Override
    public String toString() {
        return "Triangle[" + a + " " + b + " " + c + "]";
    }
}
