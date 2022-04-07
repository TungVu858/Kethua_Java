package hinhhoc;

public class RectangleTest {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        System.out.println(rectangle);
        rectangle = new Rectangle(6,5);
        System.out.println(rectangle);
        rectangle = new Rectangle("yellow",false,12 ,7);
        System.out.println(rectangle);
        rectangle.setDai(10);
        System.out.println(rectangle.getArea());
    }
}
