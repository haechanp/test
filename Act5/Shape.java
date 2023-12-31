package Act5;

import java.util.Scanner;

abstract class Shape {
    private Shape next;

    public Shape() {
        next = null;
    }

    public void setNext(Shape obj) {
        next = obj;
    }

    public Shape getNext() {
        return next;
    }

    public abstract void draw();
}

class Line extends Shape {
    public Line() {
        super();
    }

    public void draw() {
        System.out.println("Line");
    }
}

class Rect extends Shape {
    public Rect() {
        super();
    }

    public void draw() {
        System.out.println("Rect");
    }
}

class Circle extends Shape {
    public Circle() {
        super();
    }

    public void draw() {
        System.out.println("Circle");
    }
}

class GraphicEditor {
    private Shape head, tail;
    private Scanner sc;

    public GraphicEditor() {
        head = null;
        tail = null;
        sc = new Scanner(System.in);
    }

    void runEditor() {
        int choice;
        System.out.println("그래픽 에디터 beauty을 실행합니다.");

        do {
            System.out.print("삽입(1), 삭제(2), 모두 보기(3), 종료(4)>>");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Line(1), Rect(2), Circle(3)>>");
                    int option = sc.nextInt();
                    put(option);
                    break;
                case 2:
                    System.out.print("삭제할 도형의 위치>>");
                    int index = sc.nextInt();
                    delete(index);
                    break;
                case 3:
                    print();
                    break;
                case 4:
                    break;
                default:
                    System.out.println("다시 입력해주세요");
                    break;
            }
        } while (choice != 4);
        System.out.println("beauty을 종료합니다.");
    }

    void put(int num) {
        Shape g;

        switch (num) {
            case 1:
                g = new Line();
                break;
            case 2:
                g = new Rect();
                break;
            case 3:
                g = new Circle();
                break;
            default:
                System.out.println("다시입력해주세요");
                return;
        }

        if (head == null) {
            head = g;
            tail = g;
        } else {
            tail.setNext(g);
            tail = g;
        }
        return;
    }

    void delete(int index) {
        Shape cur = head;
        Shape temp = head;

        if (head == null) {
            System.out.println("삭제할 수 없습니다.");
            return;
        }

        if (index == 1) {
            if (head == tail) {
                tail = head = null;
                return;
            } else {
                head = head.getNext();
                return;
            }
        } else {
            int i;
            for (i = 1; i < index; i++) {
                temp = cur;
                cur = cur.getNext();
                if (cur == null) {
                    System.out.println("삭제할 수 없습니다.");
                    return;
                }
            }
            if (cur == tail) {
                tail = temp;
                tail.setNext(null);
            } else {
                temp.setNext(cur.getNext());
            }
        }
    }

    void print() {
        Shape d = head;
        while (d != null) {
            d.draw();
            d = d.getNext();
        }
    }
}

public class p0512 {

    public static void main(String[] args) {
        GraphicEditor ge = new GraphicEditor();
        ge.runEditor();
    }

}
