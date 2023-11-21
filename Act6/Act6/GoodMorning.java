package Act6;

import java.util.Calendar;

public class GoodMorning {
    public static void main(String[] args) {
        Calendar currentTime = Calendar.getInstance();

        int currentHour = currentTime.get(Calendar.HOUR_OF_DAY);
        int currentMinute = currentTime.get(Calendar.MINUTE);
        System.out.println("현재 시간은 " + currentHour + "시 " + currentMinute + "분입니다.");

        if (currentHour > 4 && currentHour < 12) {
            System.out.println("Good Morning");
        } else if (currentHour >= 12 && currentHour < 18) {
            System.out.println("Good Afternoon");
        } else if (currentHour >= 18 && currentHour < 22) {
            System.out.println("Good Evening");
        } else {
            System.out.println("Good Night");
        }
    }
}
