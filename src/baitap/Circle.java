package baitap;

public class Circle {
    private double radius;
    private String color;

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getArea() {
        return this.radius * this.radius * Math.PI;
    }

    @Override
    public String toString() {
        return "Bán kính là : " + radius + " Màu " + color;
    }
}

class Cylinder extends Circle {
    private double chieucao;

    public Cylinder(double radius, String color, double chieucao) {
        super(radius, color);
        this.chieucao = chieucao;
    }

    public double getChieucao() {
        return chieucao;
    }

    public void setChieucao(double chieucao) {
        this.chieucao = chieucao;
    }

    public double getTheTich() {
        return chieucao * getRadius() * getRadius() * Math.PI;
    }

    @Override
    public String toString() {
        return "Chiều cao là : " + chieucao + " " + super.toString();
    }
}
