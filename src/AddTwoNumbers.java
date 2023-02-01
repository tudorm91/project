import java.util.Scanner;

public class AddTwoNumbers {
    public static void main(String[] args) {
        int num1;
        double num2, sum;
        Scanner sc = new Scanner(System.in);
        System.out.println("First number : ");
        num1 = sc.nextInt();
        System.out.println("Second number : ");
        num2 = sc.nextDouble();
        sum = addTwoNumbers(num1, num2);
        System.out.println("Sum : " + sum);
        sc.close();
    }

    public static double addTwoNumbers(int number1, double number2) {
        return number1 + number2;
    }
}
