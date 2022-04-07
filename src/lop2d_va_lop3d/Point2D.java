package lop2d_va_lop3d;

public class Point2D {
    private float x = 0.0f;
    private float y = 0.0f;

    public Point2D(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public Point2D() {

    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public void setXY(float x, float y) {
        this.setX(x);
        this.setY(y);
    }

    public float[] getXY() {
        return new float[]{getX(), getY()};
    }

    @Override
    public String toString() {
        return "{ " + x + " , " + y + " }";
    }
}

class Point3D extends Point2D {
    private float f = 0.0f;

    public Point3D(float x, float y, float f) {
        super(x, y);
        this.f = f;
    }

    public Point3D() {

    }

    public float getF() {
        return f;
    }

    public void setF(float f) {
        this.f = f;
    }

    public void setXYZ(float a, float b, float c) {
        this.setX(a);
        this.setY(b);
        this.setF(c);
    }

    public float[] getXYZ() {
        return new float[]{getX(), getY(), getF()};
    }

    @Override
    public String toString() {
        return "Point3D { " + getX() + " , " + getY() + " , " + f + " }";
    }
}

class Point2DTest {
    public static void main(String[] args) {
        Point2D point2D = new Point2D();
        System.out.println(point2D);
        point2D.setX(4);
        point2D.setY(5);
        System.out.println(point2D);
        point2D.setXY(5,6);
        System.out.println(point2D);
        point2D = new Point2D(6,7);
        System.out.println(point2D);
        System.out.println(point2D.getY());
    }
}

class Point3DTest {
    public static void main(String[] args) {
        Point3D point3D = new Point3D();
        point3D.setX(6);
        point3D.setY(3);
        point3D.setF(8);
        System.out.println(point3D.getF());
        System.out.println(point3D);
        point3D = new Point3D(7,8,9);
        System.out.println(point3D);
    }
}
