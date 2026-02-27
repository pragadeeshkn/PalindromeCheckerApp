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





import java.util.Scanner;

public class UseCase3PalindromeCheckerApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String original = scanner.nextLine();
        String reversed = "";
        for (int i = original.length() - 1; i >= 0; i--) {
            reversed += original.charAt(i);
        }
        if (original.equals(reversed)) {
            System.out.println("Result: The string is a Palindrome.");
        } else {
            System.out.println("Result: The string is NOT a Palindrome.");
        }
        scanner.close();
    }
}