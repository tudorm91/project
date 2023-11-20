package task_9_Lib.enums;

public class PrintDayOfWeek {
    public static void main(String[] args) {
        String firstDay = DaysOfWeek.MONDAY.getDay();
        String secondDay = DaysOfWeek.TUESDAY.getDay();
        System.out.print(firstDay + ", " + secondDay);
    }
}
