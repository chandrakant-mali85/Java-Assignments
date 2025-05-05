public class PrimitiveDataTypes {

    public static void main(String[] args) {

        // 1. byte - 8-bit signed integer (-128 to 127)
        byte byteValue = 127;
        System.out.println("byte: " + byteValue);

        // 2. short - 16-bit signed integer (-32,768 to 32,767)
        short shortValue = 32000;
        System.out.println("short: " + shortValue);

        // 3. int - 32-bit signed integer (-2^31 to 2^31-1)
        int intValue = 100000;
        System.out.println("int: " + intValue);

        // 4. long - 64-bit signed integer (-2^63 to 2^63-1)
        long longValue = 1234567890123L;  // 'L' is required to denote long literals
        System.out.println("long: " + longValue);

        // 5. float - 32-bit floating-point number
        float floatValue = 3.14f;  // 'f' suffix is required for float literals
        System.out.println("float: " + floatValue);

        // 6. double - 64-bit floating-point number
        double doubleValue = 3.141592653589793;
        System.out.println("double: " + doubleValue);

        // 7. char - 16-bit Unicode character
        char charValue = 'J';
        System.out.println("char: " + charValue);

        // 8. boolean - true or false
        boolean booleanValue = true;
        System.out.println("boolean: " + booleanValue);
    }
}
