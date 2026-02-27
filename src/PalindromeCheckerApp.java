public class PalindromeCheckerApp {



        public static void main(String[] args) {


            String text = "madam";

            boolean isPalindrome = true;
            int left = 0;
            int right = text.length() - 1;


            while (left < right) {
                if (text.charAt(left) != text.charAt(right)) {
                    isPalindrome = false;
                    break;
                }
                left++;
                right--;
            }


            System.out.println("========================================");
            System.out.println("Palindrome Checker - Use Case 2");
            System.out.println("Input String: " + text);

            if (isPalindrome) {
                System.out.println("Result: The string is a PALINDROME.");
            } else {
                System.out.println("Result: The string is NOT a palindrome.");
            }
        }
    }