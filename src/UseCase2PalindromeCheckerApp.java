public class UseCase2PalindromeCheckerApp {
    public static void main(String[] args) {
        // Hardcoded string to check for palindrome
        String word = "madam";
        
        // Reverse the string
        String reversed = new StringBuilder(word).reverse().toString();
        
        // Check if the word is a palindrome
        if (word.equals(reversed)) {
            System.out.println("================================");
            System.out.println("Palindrome Checker App - UC2");
            System.out.println("================================");
            System.out.println("Input: " + word);
            System.out.println("Reversed: " + reversed);
            System.out.println("Result: \"" + word + "\" is a Palindrome");
            System.out.println("================================");
        } else {
            System.out.println("================================");
            System.out.println("Palindrome Checker App - UC2");
            System.out.println("================================");
            System.out.println("Input: " + word);
            System.out.println("Reversed: " + reversed);
            System.out.println("Result: \"" + word + "\" is NOT a Palindrome");
            System.out.println("================================");
        }
    }
}