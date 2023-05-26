package task_6_enun;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean found = false;
        System.out.println("Enter the day of the week: ");
        String myDay = scanner.nextLine();
        scanner.close();

        for (WeekDays day : WeekDays.values()) {
            if (day.name().equalsIgnoreCase(myDay)) {
                found = true;
                break;
            }
        }

        if (found) {
            WeekDay.checkDay(myDay);
        } else {
            System.out.println(myDay +" is not day of the week.");
        }
        System.out.println(LongestWord.longestWord() + " is longest day of the week!");
        WordReverser.reverseWordForLoop(LongestWord.longestWord());
        WordReverser.reverseWordStringBuilder(LongestWord.longestWord());
    }
}
