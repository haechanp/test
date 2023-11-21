package Act6;

import java.util.Scanner;
import java.util.Calendar;

class Person {
    private Scanner sc = new Scanner(System.in);
    private String name;
    private int sec1, sec2;

    public Person(String name) {
        this.name = name;
    }

    public int game() {
        System.out.print(name + " 시작 <Enter>키  >>");
        sec1 = enter();
        System.out.print("10초 예상 후 <Enter>키  >>");
        sec2 = enter();
        return calculateResult();
    }

    private int enter() {
        String buffer = sc.nextLine();
        Calendar now = Calendar.getInstance();
        System.out.println("\t현재 초 시간 = " + now.get(Calendar.SECOND));
        return now.get(Calendar.SECOND);
    }

    public int calculateResult() {
        if (sec1 < sec2) {
            return sec2 - sec1;
        } else {
            return (60 - sec1) + sec2;
        }
    }

    public void closeScanner() {
        sc.close();
    }
}

public class chap06_prac06 {
    public static void main(String[] args) {
        Person person1 = new Person("황기태");
        Person person2 = new Person("이재문");

        System.out.println("10초에 가까운 사람이 이기는 게임입니다.");
        int result1 = person1.game();
        int result2 = person2.game();

        if (Math.abs(result1 - 10) < Math.abs(result2 - 10)) {
            System.out.println("황기태의 결과 " + result1 + ", 이재문의 결과 " + result2 + ", 승자는 황기태");
        } else {
            System.out.println("황기태의 결과 " + result1 + ", 이재문의 결과 " + result2 + ", 승자는 이재문");
        }

        person1.closeScanner();
        person2.closeScanner();
    }
}


public class chap06_prac06 {
    public static void main(String[] args) {
        Person person1 = new Person("황기태");
        Person person2 = new Person("이재문");

        System.out.println("10초에 가까운 사람이 이기는 게임입니다.");
        int result1 = person1.game();
        int result2 = person2.game();

        if (Math.abs(result1 - 10) < Math.abs(result2 - 10)) {
            System.out.println("황기태의 결과 " + result1 + ", 이재문의 결과 " + result2 + ", 승자는 황기태");
        } else {
            System.out.println("황기태의 결과 " + result1 + ", 이재문의 결과 " + result2 + ", 승자는 이재문");
        }

        person1.closeScanner();
        person2.closeScanner();
    }
}
