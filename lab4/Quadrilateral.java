public class Quadrilateral extends Figure {
    private Point a;
    private Point b;
    private Point c;
    private Point d;

    public Quadrilateral(Point a, Point b, Point c, Point d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }

    @Override
    public double calculateArea() {
        // Тут можно використати формулу Гаусса для обчислення площі чотирикутника
        // Або розбити чотирикутник на два трикутника та обчислити їх площі
        // Якщо чотирикутник ABCD, можна обчислити площу як суму площ трикутників ABC та ACD
        Triangle triangle1 = new Triangle(a, b, c);
        Triangle triangle2 = new Triangle(a, c, d);
        return triangle1.calculateArea() + triangle2.calculateArea();
    }

    @Override
    public Point centroid() {
        double centroidX = (a.x + b.x + c.x + d.x) / 4.0;
        double centroidY = (a.y + b.y + c.y + d.y) / 4.0;
        return new Point(centroidX, centroidY);
    }

    @Override
    public String toString() {
        return "Quadrilateral[" + a + " " + b + " " + c + " " + d + "]";
    }
}
