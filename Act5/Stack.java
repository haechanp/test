package Act5;

import java.util.Scanner;

interface Stack {
    int length();
    int capacity();
    String pop();
    boolean push(String val);
}

class StringStack implements Stack {
    String[] arr;
    int len, cap;

    public StringStack(int n) {
        arr = new String[n];
        len = 0;
        cap = n;
    }

    public int length() {
        return len;
    }

    public int capacity() {
        return cap;
    }

    public String pop() {
        if (isEmpty()) {
            System.out.println("스택이 비어서 팝 불가!");
            return null;
        }
        return arr[--len];
    }

    public boolean push(String val) {
        if (len == cap) {
            System.out.println("스택이 꽉 차서 푸시 불가!");
            return false;
        } else {
            arr[len++] = val;
            return true;
        }
    }

    public boolean isEmpty() {
        return len == 0;
    }

    public void print() {
        System.out.print("스택에 저장된 모든 문자열 팝: ");
        while (!isEmpty()) {
            System.out.print(pop() + " ");
        }
        System.out.println();
    }
}

public class p0509 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("총 스택 저장 공간의 크기 입력 >> ");

        int n = sc.nextInt();
        StringStack ss = new StringStack(n);

        String op;
        while (true) {
            System.out.print("문자열 입력 >> ");
            op = sc.next();
            if (op.equals("그만")) {
                break;
            }
            ss.push(op);
        }
        ss.print();
    }

}
