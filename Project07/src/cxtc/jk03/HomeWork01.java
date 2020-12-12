package cxtc.jk03;

class Rectangle {
    double length;
    double width;

    Rectangle() {
    }

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double area() {
        return length * width;
    }
}

class Cuboid extends Rectangle {
    double height;

    Cuboid(){
    }

    Cuboid(double length, double width, double height) {
        super(length, width);
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public double bottomArea() {
        return super.area();
    }

    public double volume() {
        return length * width * height;
    }
}

public class HomeWork01 {
    public static void main(String[] args) {
        Cuboid c1 = new Cuboid(2, 3, 4);
        System.out.println("Bottom area is:" + c1.bottomArea() + ", " + "Cuboid is:" + c1.volume());
    }
}
