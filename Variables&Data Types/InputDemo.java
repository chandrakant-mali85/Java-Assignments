import java.util.Scanner; // Import the Scanner class

public class InputDemo {

    public static void main(String[] args) {

        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Taking String input
        System.out.print("Enter your name: ");
        String name = scanner.nextLine(); // reads full line including spaces

        // Taking integer input
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        // Taking double input
        System.out.print("Enter your marks: ");
        double marks = scanner.nextDouble();

        // Output the received input
        System.out.println("\n--- Output ---");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Marks: " + marks);

        // Close the scanner
        scanner.close();
    }
}
