package lop_point_moveablepoint;

public class Point {
    private float x = 0.0f;
    private float y = 0.0f;

    public Point(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public Point() {

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
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}

class MoveablePoint extends Point {
    private float xspeed = 0.0f;
    private float yspeed = 0.0f;

    public MoveablePoint(float x, float y, float xspeed, float yspeed) {
        super(x, y);
        this.xspeed = xspeed;
        this.yspeed = yspeed;
    }

    public MoveablePoint(float xspeed, float yspeed) {
        this.xspeed = xspeed;
        this.yspeed = yspeed;
    }

    public MoveablePoint() {

    }

    public float getXspeed() {
        return xspeed;
    }

    public void setXspeed(float xspeed) {
        this.xspeed = xspeed;
    }

    public float getYspeed() {
        return yspeed;
    }

    public void setYspeed(float yspeed) {
        this.yspeed = yspeed;
    }

    public void setSpeed(float xspeed, float yspeed) {
        this.setXspeed(xspeed);
        this.setYspeed(yspeed);
    }

    public float[] getSpeed() {
        return new float[]{getXspeed(), getYspeed()};
    }

    @Override
    public String toString() {
        return super.toString() +
                " MoveablePoint{" +
                "xspeed=" + xspeed +
                ", yspeed=" + yspeed +
                '}';
    }

    public MoveablePoint move() {
        super.setX(getX() + xspeed);
        super.setY(getY() + yspeed);
        return this;
    }
}

class PointTest {
    public static void main(String[] args) {
        Point point = new Point();
        point.setX(5.5f);
        point.setY(6.5f);
        System.out.println(point);
        point.setXY(3, 5);
        System.out.println(point);
        point = new Point(7, 8);
        System.out.println(point);
    }
}

class MoveablePointTest {
    public static void main(String[] args) {
        MoveablePoint point = new MoveablePoint();
        point.setX(4.3f);
        point.setY(6.4f);
        point.setXspeed(5.5f);
        point.setYspeed(6.7f);
        System.out.println(point);
        point.setSpeed(6, 8);
        System.out.println(point);
        point = new MoveablePoint(5, 7);
        System.out.println(point);
        point = new MoveablePoint(4, 5, 6, 7);
        System.out.println("Trước khi move : \n" + point);
        point.move();
        System.out.println("Sau khi movve : \n" + point);
    }
}

