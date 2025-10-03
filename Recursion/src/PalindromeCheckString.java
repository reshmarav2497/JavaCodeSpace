import java.util.Scanner;

public class PalindromeCheckString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string value : ");
        String str = sc.nextLine();
        sc.close();

        System.out.println(isPalindrome(str, 0, str.length() - 1) ? str + " is a Palindrome. ": str + " is not a Palindrome. ");
    }

    public static boolean isPalindrome(String str, int start, int end) {
        if(start >= end){
            return true;
        }

        return ((str.charAt(start) == str.charAt(end)) && (isPalindrome(str, start + 1, end - 1)));
    }

    //Time Complexity --> O(n)
    //Space Complexity --> O(n)
}
