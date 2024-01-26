package task_14_Generics_pair;

public class Main {
    public static void main(String[] args) {
        Pair<Integer, String> intStringPair = new Pair<>();
        intStringPair.setFirst(42);
        intStringPair.setSecond("Is the Number!");

        System.out.println("First pair value: " + intStringPair.getFirst());
        System.out.println("Second pair value: " + intStringPair.getSecond());

        Pair<Float, String> floatStringPair = new Pair<>();
        floatStringPair.setFirst((float) Math.PI);
        floatStringPair.setSecond("A class");

        System.out.println("First pair value: " + floatStringPair.getFirst());
        System.out.println("Second pair value: " + floatStringPair.getSecond());
    }
}
