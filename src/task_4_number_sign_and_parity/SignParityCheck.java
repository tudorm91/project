package task_4_number_sign_and_parity;

public class SignParityCheck {
    public static void checkSignParity(int numberToCheck) {

        if (numberToCheck == 0) {
            throw new IllegalArgumentException("You have entered 0");
        }

        if (numberToCheck % 2 == 0) {
            System.out.print("The number you entered is even");
        } else {
            System.out.print("The number you entered is odd");
        }

        if (numberToCheck < 0) {
            System.out.print(" and negative.");
        } else {
            System.out.print(" and positive.");
        }
    }
}
