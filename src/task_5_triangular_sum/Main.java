package task_5_triangular_sum;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int sum = 0, sumOf;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number for sum 1 to that number: ");
        sumOf = sc.nextInt();
        for (int i = 1; i < (sumOf + 1); i++) {
            sum = sum + i;
        }
        System.out.println("Sum equals to: " + sum);
    }

}
