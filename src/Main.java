import java.util.Scanner;
public class Main {
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


    public static double addTwoNumbers (int term1, double term2)
    {
        return term1 + term2;

    }}