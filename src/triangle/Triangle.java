package triangle;

public class Triangle extends Shape {
    private double side1 = 1;
    private double side2 = 1;
    private double side3 = 1;

    public Triangle() {
    }

    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }


    public double getPremeter() {
        return this.side1 + this.side2 + this.side3;
    }

    public double getArea() {
        double a = getPremeter() / 2;
        return Math.pow(a * (a - side1) * (a - side2) * (a - side3), 0.5);
    }

    @Override
    public String toString() {
        return  "A Triangle with color of " + getColor() + " \n" +
                "Triangle { " +
                "side1=" + side1 +
                ", side2=" + side2 +
                ", side3=" + side3 +
                " }" + "\nArea : " + getArea() + "\nPerimeter : " + getPremeter();
    }
}
class Shape{
    private String color = "Red";

    public Shape() {
    }

    public Shape(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public String toString() {
        return "A Shape with color of " + getColor() + " \n";
    }
}
class TriangleTest{
    public static void main(String[] args) {
        Triangle triangle = new Triangle();
        System.out.println(triangle);
        triangle.setColor("Yellow");
        triangle.setSide1(3);
        triangle.setSide2(4);
        triangle.setSide3(5);
        System.out.println(triangle);
        triangle = new Triangle(5,6,7);
        System.out.println(triangle);
    }
}
class ShapeTest{
    public static void main(String[] args) {
        Shape shape = new Shape();
        System.out.println(shape);
        shape.setColor("Blue");
        System.out.println(shape);
        shape = new Shape("Green");
        System.out.println(shape);
    }
}
