package task_4_number_sign_and_parity;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        int theNumber;
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose a number: ");
        theNumber = sc.nextInt();
        sc.close();
        SignParityCheck.compare2Int(theNumber);
    }
}
