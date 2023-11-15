package task_8_word_reversal;

public class WordReversal {

    public static String reverseWord(String word) {
        StringBuilder reversedWord = new StringBuilder();

        for (int i = word.length() - 1; i >= 0; i--) {
            reversedWord.append(word.charAt(i));
        }
        return reversedWord.toString();
    }

  public static String reverseWords(String sentence) {
        String[] words = sentence.split(" ");
        StringBuilder reversedSentence = new StringBuilder();
        for (String word : words) {
            String reversedWord = reverseWord(word);
            reversedSentence.append(reversedWord).append(" ");
        }
        return reversedSentence.toString().trim();
    }
}
