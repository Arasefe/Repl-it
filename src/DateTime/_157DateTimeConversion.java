package DateTime;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class _157DateTimeConversion {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the time");
        timeConversion(scan.nextLine().toLowerCase());

    }

    public static void timeConversion(String s) {
        int hour = Integer.parseInt(s.substring(0, 2));
        int minute = Integer.parseInt(s.substring(3, 5));
        int second = Integer.parseInt(s.substring(6, 8));
        String am_pm = s.substring(8, 10);
        if (am_pm.equals("PM")) {
            LocalTime lT = LocalTime.of((hour + 12), minute, second);
            DateTimeFormatter dF = DateTimeFormatter.ofPattern("hh:mm:ss");
            System.out.println(lT.format(dF));

        }
    }
    public static void timeConversion1(){
        LocalTime time=LocalTime.of(18,12,35);
        System.out.println(time);
    }
}
