package hinhhoc;

public class Shape {
    private String color = "green";
    private boolean filled = true;

    public Shape() {

    }

    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public String toString() {
        return "A Shape with color of " + getColor() + " and " + (isFilled() ? "filled" : "not filled");
    }
}

class Circle extends Shape {
    private double radius = 1.0;

    public Circle() {

    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return this.radius * this.radius * Math.PI;
    }

    public double getPerimeter() {
        return this.radius * 2 * Math.PI;
    }

    @Override
    public String toString() {
        return "A Circle with radius : " + radius + " which is a subclass of " + super.toString();
    }
}

class Rectangle extends Shape {
    private double dai = 1.0, rong = 1.0;

    Rectangle() {

    }

    public Rectangle(double dai, double rong) {
        this.dai = dai;
        this.rong = rong;
    }

    public Rectangle(String color, boolean filled, double dai, double rong) {
        super(color, filled);
        this.dai = dai;
        this.rong = rong;
    }

    public double getDai() {
        return dai;
    }

    public double getRong() {
        return rong;
    }

    public void setDai(double dai) {
        this.dai = dai;
    }

    public void setRong(double rong) {
        this.rong = rong;
    }

    public double getArea() {
        return this.dai * this.rong;
    }

    public double getPerimeter() {
        return 2 * (this.rong + this.dai);
    }

    @Override
    public String toString() {
        return "A Rectangle with width " + getRong() + " and length " + getDai() + " which is a subclass of " + super.toString();
    }
}

class Square extends Rectangle {
    Square() {

    }

    public Square(double side) {
        super(side, side);
    }

    public Square(String color, boolean filled, double side) {
        super(color, filled, side, side);
    }

    public double getSide() {
        return getRong();
    }

    public void setSide(double side) {
        setDai(side);
        setRong(side);
    }

    @Override
    public void setDai(double dai) {
        setSide(dai);
    }

    @Override
    public void setRong(double rong) {
        setSide(rong);
    }

    @Override
    public String toString() {
        return "A Square with side : " + getSide() + " which is a subclass of " + super.toString();
    }
}
