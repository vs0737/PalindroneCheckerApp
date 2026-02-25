public class UseCase4PalindromeCheckerApp {
    
    public static void main(String[] args) {
        // Test cases
        String[] testStrings = {"racecar", "hello", "madam", "java", "noon", "A", "12321"};
        
        for (String str : testStrings) {
            boolean isPalindrome = checkPalindromeWithCharArray(str);
            System.out.println("\"" + str + "\" is " + (isPalindrome ? "a palindrome" : "not a palindrome"));
        }
    }
    
    // UC4: Check palindrome using character array and two-pointer approach
    public static boolean checkPalindromeWithCharArray(String str) {
        // Convert to lowercase for case-insensitive comparison
        str = str.toLowerCase();
        
        // Convert string to character array
        char[] chars = str.toCharArray();
        
        // Two-pointer approach
        int left = 0;                    // Pointer starting from beginning
        int right = chars.length - 1;    // Pointer starting from end
        
        // Compare characters from both ends moving towards center
        while (left < right) {
            // Compare characters at left and right positions
            if (chars[left] != chars[right]) {
                return false;  // Not a palindrome
            }
            left++;    // Move left pointer forward
            right--;   // Move right pointer backward
        }
        
        return true;  // All characters matched, it's a palindrome
    }
}