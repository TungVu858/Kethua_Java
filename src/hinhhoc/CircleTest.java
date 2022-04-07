package hinhhoc;

public class CircleTest {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle);
        circle = new Circle(5.5);
        System.out.println(circle);
        System.out.println(circle.getArea());
        circle = new Circle("blue",false,4.5);
        System.out.println(circle);
        System.out.println(circle.getArea());
    }
}
