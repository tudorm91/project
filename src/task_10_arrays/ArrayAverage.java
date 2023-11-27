package task_10_arrays;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ArrayAverage {
    public static void main(String[] args) {
      arrayAverage();
    }

    public static void arrayAverage() {
        boolean validInput = false;
        Scanner scanner = new Scanner(System.in);
        do {
            try {
                System.out.print("Enter the size of the array for Average: ");
                int size = scanner.nextInt();
                int[] myArray = new int[size];
                for (int i = 0; i < myArray.length; i++) {
                    System.out.print("Enter int for index " + i + ": ");
                    myArray[i] = scanner.nextInt();
                }
                int sum = 0;
                for (int value : myArray) {
                    sum += value;
                }
                double average = (double) sum / size;
                System.out.println("Average of the elements in the array: " + average);
                validInput = true;
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid integer.");
                scanner.nextLine();
            }
        } while (!validInput);
    }
}
