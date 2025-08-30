import java.util.Scanner;

public class ExceptionHandling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter two numbers to divide:");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        try {
            // This code may throw an exception
            int result = num1 / num2;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            // This block handles the exception
            System.out.println("Error: Division by zero is not allowed!");
        }

        System.out.println("Program continues after exception handling.");
        sc.close();
    }
}
