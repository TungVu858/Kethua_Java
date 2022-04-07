package baitap;

public class CircleTest {
    public static void main(String[] args) {
        Circle circle = new Circle(5,"đỏ");
        System.out.println(circle);
        System.out.println("Diện tích : "+circle.getArea());
        circle.setColor("vàng");
        circle.setRadius(5.5);
        System.out.println(circle);
        System.out.println(circle.getArea());
    }
}
