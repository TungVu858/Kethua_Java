package baitap;

public class CylinderTest {
    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder(5, "xanh", 8);
        System.out.println(cylinder);
        System.out.println("Thể tích : " + cylinder.getTheTich());
        cylinder.setRadius(6);
        cylinder.setChieucao(7);
        cylinder.setColor("tím");
        System.out.println(cylinder);
        System.out.println("Thể tích : " + cylinder.getTheTich());
    }
}
