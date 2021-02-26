public class CircleTest {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        Circle c2 = new Circle();

        c1.setRadius(2.5);
        c2.setRadius(10);

        System.out.println("-------------");
        System.out.println(c1.findPerimeter());
        System.out.println(c1.findArea());
        System.out.println("-------------");
        System.out.println(c2.findPerimeter());
        System.out.println(c2.findArea());
    }
}

class Circle {
    private double radius;

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double findPerimeter() {
        return (2 * 3.14 * radius);
    }

    public double findArea() {
        return (3.14 * radius * radius);
    }
}
