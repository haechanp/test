package Act6;

class MyPoint {
    private int x, y;

    public MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public String toString() {
        return "Point(" + x + "," + y + ")";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        MyPoint otherPoint = (MyPoint) obj;
        return this.x == otherPoint.x && this.y == otherPoint.y;
    }
}

public class p0601 {

    public static void main(String[] args) {
        MyPoint p = new MyPoint(3, 50);
        MyPoint q = new MyPoint(4, 50);

        System.out.println(p);

        if (p.equals(q)) {
            System.out.println("같은 점");
        } else {
            System.out.println("다른 점");
        }
    }
}

