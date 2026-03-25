// UC5
import java.util.Stack;

// UC6
import java.util.LinkedList;
import java.util.Queue;

// UC7
import java.util.ArrayDeque;
import java.util.Deque;


// Base application setup
public class PalindromeCheckerApp {
    public static void main(String[] args){
    }
}


// UC1: Application Entry & Welcome Message
class UseCase1PalindromeCheckerApp {
    public static void main(String[] args) {
        String appName = "Palindrome Checker Management System";
        String appVersion = "1.0";

        System.out.println("Welcome to the " + appName);
        System.out.println("Version: " + appVersion);
        System.out.println("System initialized successfully.");
    }
}


//UC2: Hardcoded Palindrome
class UseCase2PalindromeCheckerApp {
    public static void main(String[] args) {

        String input = "madam";
        boolean isPalindrome = true;

        for (int i = 0; i < input.length() / 2; i++) {
            if (input.charAt(i) != input.charAt(input.length() - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }

        System.out.println("Input text: " + input);
        System.out.println("Is it a Palindrome? : " + isPalindrome);
    }
}


// UC3: Palindrome Check Using String Reverse
class UseCase3PalindromeCheckerApp {
    public static void main(String[] args) {
        String input = "madam";
        String reverseInput = "";

        for (int i = input.length() - 1; i >= 0; i--) {
            reverseInput += input.charAt(i);
        }

        boolean isPalindrome = input.equals(reverseInput);

        System.out.println("Input text: " + input);
        System.out.println("Reversed text: " + reverseInput);
        System.out.println("Is it a Palindrome? : " + isPalindrome);
    }
}


// UC4: Character Array Based Palindrome Check
class UseCase4PalindromeCheckerApp {
    public static void main(String[] args) {
        String input = "radar";

        char[] chars = input.toCharArray();
        int start = 0;
        int end = chars.length - 1;
        boolean isPalindrome = true;

        while (start < end) {
            if (chars[start] != chars[end]) {
                isPalindrome = false;
                break;
            }
            start++;
            end--;
        }

        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + isPalindrome);
    }
}


// UC5: Stack Based Palindrome Checker
class UseCase5PalindromeCheckerApp {
    public static void main(String[] args) {
        String input = "noon";

        Stack<Character> stack = new Stack<>();

        for (char c : input.toCharArray()) {
            stack.push(c);
        }

        boolean isPalindrome = true;

        for (char c : input.toCharArray()) {
            if (c != stack.pop()) {
                isPalindrome = false;
                break;
            }
        }

        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + isPalindrome);
    }
}


// UC6: Queue + Stack Based Palindrome Check
class UseCase6PalindromeCheckerApp {
    public static void main(String[] args) {
        String input = "civic";

        Queue<Character> queue = new LinkedList<>();
        Stack<Character> stack = new Stack<>();

        for (char c : input.toCharArray()) {
            queue.add(c);
            stack.push(c);
        }

        boolean isPalindrome = true;

        while (!queue.isEmpty()) {
            if (!queue.poll().equals(stack.pop())) {
                isPalindrome = false;
                break;
            }
        }

        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + isPalindrome);
    }
}


// UC7: Deque Based Optimized Palindrome Checker
class UseCase7PalindromeCheckerApp {
    public static void main(String[] args) {
        // Define the input string
        String input = "refer";

        Deque<Character> deque = new ArrayDeque<>();

        for (char c : input.toCharArray()) {
            deque.add(c);
        }

        boolean isPalindrome = true;

        while (deque.size() > 1) {
            if (!deque.removeFirst().equals(deque.removeLast())) {
                isPalindrome = false;
                break;
            }
        }

        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + isPalindrome);
    }
}