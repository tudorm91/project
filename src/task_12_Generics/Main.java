package task_12_Generics;

import static java.lang.Math.PI;

public class Main {
    public static <T> void displayBoxContents(Box<T> box) {
        T value = box.getValue();
        String type = value.getClass().getSimpleName();
        System.out.println("Type: " + type + ", Value: " + value);
    }


    public static void main(String[] args) {

        Box<Integer> intBox = new Box<>(13);
        displayBoxContents(intBox);

        Box<String> stringBox = new Box<>("41");
        displayBoxContents(stringBox);

        Box<Float> floatBox = new Box<>(87 + 87.8f + (float) PI);
        displayBoxContents(floatBox);

        Box<Double> doubleBox = new Box<>(87 + 0.2 + PI);
        displayBoxContents(doubleBox);
    }
}
