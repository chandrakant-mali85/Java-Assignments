public class JavaOperators {
    public static void main(String[] args) {
        int a = 10, b = 5;

        // Arithmetic Operators
        System.out.println("Arithmetic Operators:");
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b));
        System.out.println("a % b = " + (a % b));
        System.out.println();

        // Relational Operators
        System.out.println("Relational Operators:");
        System.out.println("a == b: " + (a == b));
        System.out.println("a != b: " + (a != b));
        System.out.println("a > b: " + (a > b));
        System.out.println("a < b: " + (a < b));
        System.out.println("a >= b: " + (a >= b));
        System.out.println("a <= b: " + (a <= b));
        System.out.println();

        // Logical Operators
        boolean x = true, y = false;
        System.out.println("Logical Operators:");
        System.out.println("x && y: " + (x && y));
        System.out.println("x || y: " + (x || y));
        System.out.println("!x: " + (!x));
        System.out.println();

        // Bitwise Operators
        System.out.println("Bitwise Operators:");
        System.out.println("a & b: " + (a & b));
        System.out.println("a | b: " + (a | b));
        System.out.println("a ^ b: " + (a ^ b));
        System.out.println("~a: " + (~a));
        System.out.println("a << 2: " + (a << 2));
        System.out.println("a >> 2: " + (a >> 2));
        System.out.println();

        // Assignment Operators
        System.out.println("Assignment Operators:");
        int c = 10;
        c += 5;
        System.out.println("c += 5: " + c);
        c -= 2;
        System.out.println("c -= 2: " + c);
        c *= 2;
        System.out.println("c *= 2: " + c);
        c /= 2;
        System.out.println("c /= 2: " + c);
        c %= 3;
        System.out.println("c %= 3: " + c);
        System.out.println();

        // Unary Operators
        System.out.println("Unary Operators:");
        int d = +a;
        int e = -b;
        System.out.println("Unary +a: " + d);
        System.out.println("Unary -b: " + e);
        System.out.println("Post-increment a++: " + (a++));
        System.out.println("Post-decrement b--: " + (b--));
        System.out.println("Now a: " + a + ", b: " + b);
        System.out.println("Pre-increment ++a: " + (++a));
        System.out.println("Pre-decrement --b: " + (--b));
        System.out.println();

        // Ternary Operator
        System.out.println("Ternary Operator:");
        int max = (a > b) ? a : b;
        System.out.println("Max of a and b: " + max);
    }
}
