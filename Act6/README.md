7번 문제의 (2)
import java.util.Scanner;

public class WordCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print(">>");
            String s = scanner.nextLine();
            if (s.equals("그만")) {
                System.out.println("종료합니다...");
                break;
            }
            String[] words = s.split(" ");
            System.out.println("어절 개수는 " + words.length);
        }

        scanner.close();
    }
}

12번 문제 (10번문제 수정버전)

import java.util.Scanner;

class Person {
    private int num1, num2, num3;
    public String name;

    public Person(String name) {
        this.name = name;
    }

    public boolean game() {
        num1 = (int) ((Math.random() * 3) + 1);
        num2 = (int) ((Math.random() * 3) + 1);
        num3 = (int) ((Math.random() * 3) + 1);
        System.out.print("\t" + num1 + "  " + num2 + "  " + num3 + "  ");
        return num1 == num2 && num2 == num3;
    }
}

public class chap06_prac12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("겜블링 게임에 참여할 선수 숫자>>");
        int num = sc.nextInt();
        Person[] person = new Person[num];
        for (int i = 0; i < num; i++) {
            System.out.print((i + 1) + "번째 선수 이름>>");
            String name = sc.next();
            person[i] = new Person(name);
        }
        String buffer = sc.nextLine();
        while (true) {
            for (int i = 0; i < num; i++) {
                System.out.print("[" + person[i].name + "]:<Enter>");
                buffer = sc.nextLine();
                if (person[i].game()) {
                    System.out.println(person[i].name + "님이 이겼습니다!");
                    sc.close();
                    return;
                }
                System.out.println("아쉽군요!");
            }
        }
    }
}


