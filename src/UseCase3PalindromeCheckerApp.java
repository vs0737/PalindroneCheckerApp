public class UseCase3PalindromeCheckerApp {
    
    public static void main(String[] args) {
        // Test cases
        String[] testStrings = {"racecar", "hello", "madam", "java", "noon", "A"};
        
        for (String str : testStrings) {
            boolean isPalindrome = checkPalindrome(str);
            System.out.println("\"" + str + "\" is " + (isPalindrome ? "a palindrome" : "not a palindrome"));
        }
    }
    
    // UC3: Check palindrome by reversing the string
    public static boolean checkPalindrome(String original) {
        // Convert to lowercase for case-insensitive comparison
        original = original.toLowerCase();
        
        // Reverse the string using a loop
        String reversed = "";
        
        // Loop through the string in reverse order
        for (int i = original.length() - 1; i >= 0; i--) {
            reversed += original.charAt(i);
        }
        
        // Compare original and reversed strings
        return original.equals(reversed);
    }
}