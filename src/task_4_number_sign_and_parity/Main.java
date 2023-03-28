package task_4_number_sign_and_parity;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int number;
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose a number: ");
        number = sc.nextInt();
        sc.close();
        SignParityCheck.checkSignParity(number);
    }
}
