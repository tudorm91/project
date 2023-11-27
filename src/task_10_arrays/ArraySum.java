package task_10_arrays;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ArraySum {
    public static void main(String[] args) {
        arraySum();
    }

    public static void arraySum() {
        boolean validInput = false;
        Scanner scanner = new Scanner(System.in);
        do {
            try {
                System.out.print("Enter the size of the array for Sum: ");
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
                System.out.println("Sum of the elements in the array: " + sum);
                validInput = true;
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid integer.");
                scanner.nextLine();
            }

        } while (!validInput);
    }
}
