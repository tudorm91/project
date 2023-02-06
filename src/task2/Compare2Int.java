package task2;

import java.util.Scanner;

public  class Compare2Int {
    public static void compare2Int () {
        int firstNumber,secondNumber;
        Scanner sc = new Scanner(System.in);
        System.out.println("First number : ");
        firstNumber = sc.nextInt();
        System.out.println("Second number : ");
        secondNumber = sc.nextInt();
        sc.close();
        if (firstNumber == secondNumber) {
            System.out.println(firstNumber + " is equal to " + secondNumber);
        } else {
            System.out.println(Math.max(firstNumber, secondNumber) + " is greater than " + Math.min(firstNumber, secondNumber));
        }
    }
}
