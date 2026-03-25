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