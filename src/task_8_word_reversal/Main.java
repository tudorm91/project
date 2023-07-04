package task_8_word_reversal;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();
        String reversedSentence = WordReversal.reverseWords(sentence);
        System.out.println("Reversed sentence: " + reversedSentence);
    }
}
