package task_6_enun;

import static java.time.DayOfWeek.*;

public class WeekDay {
    public static void checkDay(String dayName) {
        WeekDays day = WeekDays.valueOf(dayName.toUpperCase());
        switch (day) {
            case MONDAY:
                System.out.println("Today is Monday.");
                break;
            case TUESDAY:
                System.out.println("Today is Tuesday.");
                break;
            case WEDNESDAY:
                System.out.println("Today is Wednesday.");
                break;
            case THURSDAY:
                System.out.println("Today is Thursday.");
                break;
            case FRIDAY:
                System.out.println("Today is Friday.");
                break;
            case SATURDAY:
                System.out.println("Today is Saturday.");
                break;
            case SUNDAY:
                System.out.println("Today is Sunday.");
                break;
        }
    }
}


