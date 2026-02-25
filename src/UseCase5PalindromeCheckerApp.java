import java.util.Stack;

public class UseCase5PalindromeCheckerApp {

    public static boolean isPalindrome(String str) {
        Stack<Character> stack = new Stack<>();

        // Push all characters of the string onto the stack
        for (char c : str.toCharArray()) {
            stack.push(c);
        }

        // Pop characters from the stack and compare with the original string
        for (char c : str.toCharArray()) {
            if (stack.pop() != c) {
                return false; // Not a palindrome
            }
        }

        return true; // It is a palindrome
    }

    public static void main(String[] args) {
        String testString = "madam";
        boolean result = isPalindrome(testString);
        System.out.println(testString + " is a palindrome: " + result);
    }
}