public class Output {

    public static void main(String[] args) {

        // Using println() - prints a line and moves to the next line
        System.out.println("Namaste, Bharat!");

        // Printing variables
        int age = 30;
        String name = "Aarav";
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);

        // Printing multiple types together
        double pi = 3.14159;
        System.out.println("Value of Pi: " + pi);

        // Using print() - stays on the same line
        System.out.print("This is ");
        System.out.print("on the same line.\n");

        // Escape sequences
        System.out.println("Line break using \\n");
        System.out.println("Tabbed\tText");
        System.out.println("Quote: \"Coding is an art\"");

        // Formatted output using printf()
        String studentName = "Priya";
        int score = 92;
        System.out.printf("Student: %s, Score: %d\n", studentName, score);

        // Another example with Indian context
        String city = "Mumbai";
        System.out.printf("Welcome to %s!\n", city);
    }
}
