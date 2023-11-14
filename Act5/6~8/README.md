7번 문제
class Point {
    private int x, y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    protected void move(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

class Point3D extends Point {
    int z;

    public Point3D(int x, int y, int z) {
        super(x, y);
        this.z = z;
    }

    public void moveUp() {
        z++;
    }

    public void moveDown() {
        z--;
    }

    public String toString() {
        return "(" + getX() + "," + getY() + "," + z + ")의 점";
    }

    public void move(int x, int y) {
        super.move(x, y);
        // Point 클래스의 move 메서드와 중복되므로 사용하지 않음
    }

    public void move(int x, int y, int z) {
        super.move(x, y);
        this.z = z;
    }
}

public class p0507 {

    public static void main(String[] args) {
        Point3D p = new Point3D(1, 2, 3);
        System.out.println(p.toString() + "입니다.");

        p.moveUp();
        System.out.println(p.toString() + "입니다.");

        p.moveDown();
        p.move(10, 10);
        System.out.println(p.toString() + "입니다.");

        p.move(100, 200, 300);
        System.out.println(p.toString() + "입니다.");
    }

}
8번 문제
class Point {
    private int x, y;

    public Point(int x, int y) {
        move(x, y);
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    protected void move(int x, int y) {
        if (x >= 0 && y >= 0) {
            this.x = x;
            this.y = y;
        } else {
            this.x = 0;
            this.y = 0;
        }
    }
}

class PositivePoint extends Point {
    public PositivePoint() {
        super(0, 0);
    }

    public PositivePoint(int x, int y) {
        super(x, y);
    }

    public String toString() {
        return "(" + getX() + "," + getY() + ")" + "의 점";
    }
}

public class p0508 {

    public static void main(String[] args) {
        PositivePoint p = new PositivePoint();
        p.move(10, 10);
        System.out.println(p.toString() + "입니다.");

        p.move(-5, 5);
        System.out.println(p.toString() + "입니다.");

        PositivePoint p2 = new PositivePoint(-10, -10);
        System.out.println(p2.toString() + "입니다.");
    }

}

