package Act4;
import java.util.Scanner;
 
class Add {
    private int a;
    private int b;
    public void setValue(int a, int b) {
        this.a = a;
        this.b = b;
    }
    public int calculate() {
        return this.a+this.b;
    }
}
class Sub {
    private int a;
    private int b;
    public void setValue(int a, int b) {
        this.a = a;
        this.b = b;
    }
    public int calculate() {
        return this.a-this.b;
    }
}
class Mul {
    private int a;
    private int b;
    public void setValue(int a, int b) {
        this.a = a;
        this.b = b;
    }
    public int calculate() {
        return this.a*this.b;
    }
}
class Div {
    private int a;
    private int b;
    public void setValue(int a, int b) {
        this.a = a;
        this.b = b;
    }
    public int calculate() {
        return this.a/this.b;
    }
}
public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("두 정수와 연산자를 입력하시오>> ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        char op = sc.next().charAt(0);
        switch(op) {
        case '+':
            Add ad = new Add();
            ad.setValue(a, b);
            System.out.println(ad.calculate());
            break;
        case '-':
            Sub sb = new Sub();
            sb.setValue(a, b);
            System.out.println(sb.calculate());
            break;
        case '*':
            Mul ml = new Mul();
            ml.setValue(a, b);
            System.out.println(ml.calculate());
            break;
        case '/':
            Div dv = new Div();
            dv.setValue(a, b);
            System.out.println(dv.calculate());
            break;
        }
    }
}