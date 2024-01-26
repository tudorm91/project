package task_15_word_frequency_counter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WordFrequencyCounter {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();
        fruits.add("Banane");
        fruits.add("Banane");
        fruits.add("Mere");
        fruits.add("Portocale");
        fruits.add("Mere");
        fruits.add("Banane");
        Map<String, Integer> count = countWordFrequency(fruits);
        System.out.println("Fruits in the basket are:" + count);
    }

    public static Map<String, Integer> countWordFrequency(List<String> words) {
        Map<String, Integer> counter = new HashMap<>();
        for (String word : words) {
            counter.put(word, counter.getOrDefault(word, 0) + 1);
        }
        return counter;
    }
}
