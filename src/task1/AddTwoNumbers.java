package task1;

import java.util.Scanner;

public class AddTwoNumbers {
    public static void main(String[] args) {
        int firstNumber;
        double secondNumber, sum;
        Scanner sc = new Scanner(System.in);
        System.out.println("First number : ");
        firstNumber = sc.nextInt();
        System.out.println("Second number : ");
        secondNumber = sc.nextDouble();
        sum = addTwoNumbers(firstNumber, secondNumber);
        System.out.println("Sum : " + sum);
        sc.close();
    }

    public static double addTwoNumbers(int firstNumber, double secondNumber) {
        return  firstNumber + secondNumber;
    }
}
