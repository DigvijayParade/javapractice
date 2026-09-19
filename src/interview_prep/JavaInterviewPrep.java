package interview_prep ;

public class JavaInterviewPrep {
// wtf sis this we going to slove now the  coding round after apti 
    public static void main(String[] args) {
        // Quick tests
        System.out.println("1. Palindrome String ('racecar'): " + isPalindrome("racecar"));
        System.out.println("2. Palindrome Number (121): " + isNumberPalindrome(121));
        System.out.println("3. Reversed String ('hello'): " + reverseString("hello"));
        
        System.out.print("4. Fibonacci (7 terms): ");
        printFibonacci(7);
        System.out.println();
        
        System.out.println("5. Is Prime (17): " + isPrime(17));
        System.out.println("6. Is Anagram ('listen', 'silent'): " + isAnagram("listen", "silent"));
    }

    // =========================================================================
    // 1. PALINDROME CHECK (STRING) - O(n) Time, O(1) Space
    // =========================================================================
    public static boolean isPalindrome(String s) {
        int left = 0, right = s.length() - 1;
        while (left < right) {
            if (s.charAt(left++) != s.charAt(right--)) {
                return false;
            }
        }
        return true;
    }

    // =========================================================================
    // 2. PALINDROME CHECK (NUMBER) - O(log10(n)) Time, O(1) Space
    // =========================================================================
    public static boolean isNumberPalindrome(int num) {
        if (num < 0) return false; // Negatives aren't palindromes (e.g., -121 != 121-)
        int original = num, reversed = 0;
        
        while (num > 0) {
            reversed = (reversed * 10) + (num % 10);
            num /= 10;
        }
        return original == reversed;
    }

    // =========================================================================
    // 3. REVERSE A STRING - O(n) Time, O(n) Space (Char Array Swap)
    // =========================================================================
    public static String reverseString(String s) {
        char[] arr = s.toCharArray();
        int left = 0, right = arr.length - 1;
        while (left < right) {
            char temp = arr[left];
            arr[left++] = arr[right];
            arr[right--] = temp;
        }
        return new String(arr);
    }

    // =========================================================================
    // 4. FIBONACCI SERIES - O(n) Time, O(1) Space (Iterative)
    // =========================================================================
    public static void printFibonacci(int n) {
        int a = 0, b = 1;
        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
        }
    }

    // =========================================================================
    // 5. PRIME NUMBER CHECK - O(sqrt(n)) Time, O(1) Space
    // =========================================================================
    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        // i * i <= n is equivalent to i <= Math.sqrt(n)
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    // =========================================================================
    // 6. VALID ANAGRAM - O(n) Time, O(1) Space (26-character frequency bucket)
    // =========================================================================
    public static boolean isAnagram(String s1, String s2) {
        if (s1.length() != s2.length()) return false;
        
        int[] counts = new int[26]; // Assumes lowercase 'a'-'z'
        for (int i = 0; i < s1.length(); i++) {
            counts[s1.charAt(i) - 'a']++;
            counts[s2.charAt(i) - 'a']--;
        }
        
        for (int count : counts) {
            if (count != 0) return false;
        }
        return true;
    }
}