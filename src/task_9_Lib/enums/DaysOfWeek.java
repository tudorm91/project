package task_9_Lib.enums;

public enum DaysOfWeek {
    MONDAY("Monday"), TUESDAY("Tuesday"), WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;
    private String dayOfWeek;

    DaysOfWeek(String dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
    }

    DaysOfWeek() {
    }

    public String getDay() {
        return dayOfWeek;
    }
}
