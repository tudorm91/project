package task_3_variable_types;

import java.util.Scanner;


public class Algebra {

    public static void main(String[] args) {
        int firstNumber;
        double secondNumber;
        Scanner sc = new Scanner(System.in);
        System.out.println("First number : ");
        firstNumber = sc.nextInt();
        System.out.println("Second number : ");
        secondNumber = sc.nextDouble();
        System.out.println("Sum result is: " + sum(firstNumber, secondNumber));
        System.out.println("Division result is : " + divide(firstNumber, secondNumber));
        System.out.println("Multiply result is : " + multiply(firstNumber, secondNumber));
        sc.close();

    }

    public static double sum(int firstValue, Double secondValue) {
        return firstValue + secondValue;
    }

    public static double divide(int firstValue, Double secondValue) {
        return firstValue / secondValue;
    }

    public static double multiply(int firstValue, Double secondValue) {
        return firstValue * secondValue;
    }
}
