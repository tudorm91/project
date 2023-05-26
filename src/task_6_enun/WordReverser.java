package task_6_enun;

public class WordReverser {
    public static void reverseWordForLoop(String word) {
        String reversedWord = "";
        for (int i = word.length() - 1; i >= 0; i--) {
            reversedWord += word.charAt(i);
        }
        System.out.println("Reversed word (using for loop): " + reversedWord);
    }

    public static void reverseWordStringBuilder(String word) {
        StringBuilder reversedWord = new StringBuilder(word);
        reversedWord.reverse();
        System.out.println("Reversed word (using StringBuilder): " + reversedWord);
    }
}
