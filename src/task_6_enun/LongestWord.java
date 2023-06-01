package task_6_enun;

public class LongestWord {
    private static String longestWord = "";

    public static String longestWord() {
        int maxLength = 0;
        for (WeekDays day : WeekDays.values()) {
            String dayName = day.name();
            if (dayName.length() > maxLength) {
                maxLength = dayName.length();
                longestWord = dayName;
            }
        }
        return longestWord;
    }
}
