

public class Dot   {
    public static void main(String[] args) {

        // 1. byte (8-bit signed integer)
        System.out.println("Byte MIN: " + Byte.MIN_VALUE); // -128
        System.out.println("Byte MAX: " + Byte.MAX_VALUE); // 127

        // 2. short (16-bit signed integer)
        System.out.println("Short MIN: " + Short.MIN_VALUE); // -32768
        System.out.println("Short MAX: " + Short.MAX_VALUE); // 32767

        // 3. int (32-bit signed integer)
        System.out.println("Integer MIN: " + Integer.MIN_VALUE); // -2147483648
        System.out.println("Integer MAX: " + Integer.MAX_VALUE); // 2147483647

        // 4. long (64-bit signed integer)
        System.out.println("Long MIN: " + Long.MIN_VALUE); // -9223372036854775808
        System.out.println("Long MAX: " + Long.MAX_VALUE); // 9223372036854775807

        // 5. float (32-bit IEEE 754 floating point)
        System.out.println("Float MIN: " + Float.MIN_VALUE); // 1.4E-45
        System.out.println("Float MAX: " + Float.MAX_VALUE); // 3.4028235E38

        // 6. double (64-bit IEEE 754 floating point)
        System.out.println("Double MIN: " + Double.MIN_VALUE); // 4.9E-324
        System.out.println("Double MAX: " + Double.MAX_VALUE); // 1.7976931348623157E308

        // 7. char (16-bit unsigned Unicode character)
        // Cast to (int) to see numerical range instead of blank/unprintable Unicode characters
        System.out.println("Char MIN: " + (int) Character.MIN_VALUE); // 0
        System.out.println("Char MAX: " + (int) Character.MAX_VALUE); // 65535

        // 8. boolean (true / false)
        System.out.println("Boolean TRUE: " + Boolean.TRUE);   // true
        System.out.println("Boolean FALSE: " + Boolean.FALSE); // false
    }
}