package Act4;
import java.util.Scanner;

class Day{
    private String work;
    public void set(String work) { this.work = work; }
    public String get() { return work; }
    public void show() {
        if(work == null) System.out.println("없습니다.");
        else System.out.println(work +"입니다.");
    }
}
public class MonthSchedule {
    Scanner sc = new Scanner(System.in);
    private Day [] days;
    boolean option = true;
    
    public MonthSchedule(int n) {
        days = new Day[n];
        for(int i = 0; i<days.length; i++) {
            days[i] = new Day();
        }
    }
    
    public void input() {
        System.out.print("날짜(1-30)?");
        int day = sc.nextInt();
        System.out.print("할일(빈칸없이입력)? ");
        String work = sc.next();
        days[day-1].set(work);
    }
    
    public void view() {
        System.out.print("날짜(1-30)?");
        int day = sc.nextInt();
        System.out.print(day+"의 할 일은 ");
        days[day-1].show();
    }
    
    public void finish() {
        System.out.println("프로그램을 종료합니다.");
        option = false;
    }
    
    public void run() {
        System.out.println("이번달 스케쥴 관리 프로그램.");
        while(option) {
            System.out.print("할일(입력:1, 보기:2, 끝내기:3) >>");
            int number = sc.nextInt();
            switch(number) {
                case 1:
                    input();
                    break;
                case 2:
                    view();
                    break;
                case 3:
                    finish();
                    break;
            }
        }
    }
    public static void main(String[] args) {
        MonthSchedule april = new MonthSchedule(30);
        april.run();
    }
}