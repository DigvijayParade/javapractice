package pojo_classes;

public class ReverseWords {

    public static void main(String[] args) {
    
        String input = "i love programming";
      
        System.out.println(reverseWords(input);
        System.out.println(result);
    }

    public static String reverseWords(String s) {
       
        String[] words = s.split(" ");
        
        // 5. Create a StringBuilder to construct the final output string efficiently
        StringBuilder result = new StringBuilder();

        // 6. Iterate through each word in the array from index 0 to last
        for (int i = 0; i < words.length; i++) {
            
            // 7. Load current word into a StringBuilder so we can use its reverse() function
            StringBuilder wordBuilder = new StringBuilder(words[i]);
            
            // 8. Reverse the word (e.g., "love" becomes "evol") and append it to result
            result.append(wordBuilder.reverse());

            // 9. Add a space after the word, EXCEPT for the very last word
            if (i < words.length - 1) {
                result.append(" ");
            }
        }

        // 10. Convert the built sequence back into a regular String and return it
        return result.toString();
    }
}